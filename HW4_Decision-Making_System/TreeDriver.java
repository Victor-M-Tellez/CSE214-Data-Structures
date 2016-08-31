/**
* The <code>TreeDriver</code> class creates TreeDriver Object.
* These TreeDriver object contain the information of the Tree object
* This class allows the user to operate with the tree and the nodes
*  
*  
*  @extraCredit has a choice in the help menu that allows user to restart 
*  it regardless of what node in the tree they are at, so that if a user accidently 
*  clicks the wrong pathway in a tree they dont have to hit back so often and can just restart
*  
*  
*  
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
package cse214hw4;
import java.io.*;
import java.util.Scanner;

public class TreeDriver {
private Tree tree=null;
static Scanner in=new Scanner(System.in);
static Scanner fin=new Scanner(System.in);
	/**
	 * The default constructor that takes no parameters.
	 * It is coded so that we can error check and ensure that it isn't used
	 *
	 * @param none
	 *    
	 * <dt>Preconditions:
	 *    <dd> Must be in the TreeNode Class
	 *
	 * <dt>Postconditions:
	 *    <dd>Creates a new TreeDriver object with its very own referrence
	 *
	 **/
	public TreeDriver(){
	tree=null;
}
	/**
    * Gets the Tree tree value of the TreeDriver object
    *
    * @param None  
    *  
    * <dt>Preconditions:
    *    <dd>The Object must be of type TreeDriver 
    *
    * <dt>Postconditions:
    *    <dd>Allows programmer to get the Tree tree value
    *
    * @returns Tree tree
    * 
    **/
	public Tree getTree() {
	return tree;
}
	/**
	    * Sets the Tree tree value of the TreeDriver object
	    *
	    * @param Tree tree  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type TreeDriver 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to set the Tree tree value
	    *
	    * @returns None
	    * 
	    **/
	public void setTree(Tree tree) {
	this.tree = tree;
}
	  /**
	    * Prints the main menu for the user and allows them to press
	    * a letter to indicate their choice
	    *  
	    * @param None
	    *  
	    * <dt>Preconditions:
	    *    <dd> None
	    *
	    * <dt>Postconditions:
	    *    <dd>ask user to input a letter that represents its menu option.
	    *
	    * @returns String
	    * */
	public static String mainMenu() throws IllegalArgumentException{
		System.out.println("L - Load a Tree.");
		System.out.println("H - Begin a Help Session.");
		System.out.println("T - Traverse the Tree in preorder.");
		System.out.println("Q - Quit");
		System.out.println("Choice> ");
		String choice= in.nextLine();
		if(choice.equals("L") || choice.equals("l")){
			return "L";
		}else if(choice.equals("H") || choice.equals("h")){
			return "H";
		}else if(choice.equals("T") || choice.equals("t")){
			return "T";
		}else if(choice.equals("Q") || choice.equals("q")){
			return "Q";
		} else{
			throw new IllegalArgumentException("YOU DIDNT ENTER AN ACTUAL LETTER CHOICE FROM THE MENU\n\n");
		}
	}
	  /**
	    * TreeDriver containing a main method which prompts the user,
	    *  on separate lines, for a letter that decides what they want
	    *  the program to do.
	    *  
	    * @param String[] args 
	    *  
	    * <dt>Preconditions:
	    *    <dd> None
	    *
	    * <dt>Postconditions:
	    *    <dd>May add nodes or look through nodes depending on user choice.
	    *
	    * @returns void
	    * */
	public static void main(String [] args){
		int exitMenu=0;
		boolean loadedtree=false;
		TreeDriver driver= new TreeDriver();
		String choice = "";
		while(exitMenu<1){
			try{
				choice = mainMenu();
			}catch(Exception e){
				System.out.printf(e.getMessage());
			}
			if(choice.equals("Q")){/////////////////////////////////////////////////////////////////Quit
				System.out.println("Thank you for using our automated help services!");
				exitMenu++;
					
			}else if (choice.equals("L")){/////////////////////////////////////////////////////////////////LOAD
				int exitLoading=0;
				String label;
				String message;
				String parentLabel;
				String prompt;
				String totalChildForNode;
				String line;
		           
				System.out.println("Enter the file name> ");
				String fileName =in.nextLine();
				try {
					File file= new File(fileName);
					fin = new Scanner(file);
		            if(fin.hasNextLine()){
		            	driver.setTree(new Tree());
		            	line = fin.nextLine();
		            	line.trim();
		            	driver.getTree().getRoot().setLabel(line);
		            	line = fin.nextLine();
		            	line.trim();
		            	driver.getTree().getRoot().setPrompt(line);
		            	line = fin.nextLine();
		            	line.trim();
		            	driver.getTree().getRoot().setMessage(line);
		            }else{
		            	exitLoading++;
		            }
		            while(exitLoading<1 && fin.hasNextLine()){
		            	parentLabel = fin.next();
		            	totalChildForNode= fin.nextLine();
		            	//totalChildForNode.trim();
		            	totalChildForNode=totalChildForNode.substring(1,2);
		            	int x = Integer.parseInt(totalChildForNode);
		            	for(int i = 1; i<=x; i++){
		            		label= fin.nextLine();
		            		prompt = fin.nextLine();
			            	message= fin.nextLine();
			            	driver.getTree().addNode(label, prompt, message, parentLabel);
		            	}
		            }    
		            loadedtree=true;
			    }catch(FileNotFoundException ex) {
		            System.out.println("Unable to open file '" + fileName + "'");                
			    }
				
			}else if(choice.equals("T")){/////////////////////////////////////////////////////////////////Traverse
				if(loadedtree==true){	
					System.out.println("Traversing the tree in preorder:");
					driver.getTree().preorder();
				}else System.out.println("ERROR PLEASE LOAD TREE FIRST\n");
				
			}else if(choice.equals("H")){/////////////////////////////////////////////////////////////////Help
				if(loadedtree==true){
					driver.getTree().beginSession();
					driver.getTree().setHelpExit(false);
					System.out.println("Thank you for using this automated help service!");
				}else System.out.println("ERROR PLEASE LOAD TREE FIRST\n");
			}
		}
	}
}