/**
* The <code>Tree</code> class creates Tree Objects.
* These Tree objects contain the information of all the TreeNode.
* Information includes the variables TreeNode root, pNode, parent;
* Boolean found, success, helpExit
* 
*  
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
package cse214hw4;
import java.util.Scanner;

/*

public boolean addNode(String label, String prompt, String message, String parentLabel)
A method to add a TreeNode to the tree. The location will be a child of parentLabel. 
The child node should be left justified meaning that it should first be placed in the 
left most TreeNode reference, then the middle, then the right.
More info on the label is in the input file format. 
Note: You can use a different method signature if you need to, or define a separate method 
for adding each child (i.e. addNodeLeft, addNodeMiddle, addNodeRight).

public TreeNode getNodeReference(String label)
Returns a reference to the TreeNode that has the given label. The return value is null if 
the label is not found. This may be helpful to implement the above method.
Note: This method can also be in the TreeNode class.

public void preOrder()
Traverses the tree in preorder, and prints the contents of the tree to the screen. 
Note: This method can also be in the TreeNode class.

public void beginSession()
This method will be used to start the question and answer session.
 */
public class Tree {
Scanner in=new Scanner(System.in);

	//DATA****************************************
	private TreeNode root;
	private TreeNode pNode;
	private TreeNode parent;
	private boolean found;
	private boolean success;
	private boolean helpExit;
	
	//CONSTRUCTORS********************************
	/**
	    * The default constructor that takes no parameters.
	    * It is coded so that we can error check and ensure that it isn't used
	    * and allows us to create a tree object
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the Tree Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new Tree object with its very own referrence
	    *    prints line that notifies user that they created a tree object
	    *
	    **/
	public Tree(){// create tree start with root
		pNode=null;
		parent=null;
		found= false;
		success=false;
		helpExit=false;
		root = new TreeNode();
		System.out.println("Tree created successfully!");
	}

	//GETTERS*************************************
	/**
	    * Prints out all the prompts of a nodes children
	    *
	    * @param None 
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type TreeNode 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to prints out all the prompts of a nodes children
	    *
	    * @returns void
	    * 
	    **/
	public void getAllChildPrompts(TreeNode node){
		int i;
		boolean exit=node.isLeaf();
		while(exit==false){
			for(i=0;i<3;i++){
				switch(i){
					case 0:
						if(node.getLeft()!=null){
							System.out.println("1) "+node.getLeft().getPrompt());
						}
						break;
					case 1:
						if(node.getMiddle()!=null){
							System.out.println("2) "+node.getMiddle().getPrompt());	
						}
						break;
					case 2:
						if(node.getRight()!=null){
							System.out.println("3) "+node.getRight().getPrompt());
						}else if (node.getRight()==null){
							exit =true;
							break;
						}
						exit =true;
						break;
				}
			}
		}
	}
	/**
	    * Gets the value of TreeNode root 
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type TreeNode 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the node that is the trees root
	    *
	    * @returns TreeNode root
	    * 
	    **/
	public TreeNode getRoot(){
		return root;
	}
	/**
	    * Gets the value of TreeNode pNode 
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type TreeNode 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the node that is the trees pNode which is a pointer
	    *
	    * @returns TreeNode  pNode
	    * 
	    **/
	public TreeNode getPNode(){
		return pNode;
	}
	/**
	    * Gets the value of TreeNode parent 
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type TreeNode 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the node that is the nodes parent
	    *
	    * @returns TreeNode parent
	    * 
	    **/
	public TreeNode getParent(){
		return parent;
	}
	/**
	    * Gets the value of TreeNode node that has the same label as the String labelll 
	    *calls on a helper method
	    * @param String labelll
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type TreeNode 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to find if a node with the labelll exist
	    *
	    * @returns TreeNode pNode
	    * 
	    **/
	public TreeNode getNodeReference(String labelll){
		if(getRoot().getLabel().equals(labelll)){
			return getRoot();
		}else{ 
		pNode=getNodeReference(root,labelll);
		this.setFound(false);
		return pNode;
		}
	}
	/**
	    * Helper method of getNodeReference(String labelll)
	    *
	    * @param TreeNode node,String labelll 
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type TreeNode 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the node that is the trees root
	    *
	    * @returns TreeNode root
	    * 
	    **/
	public TreeNode getNodeReference(TreeNode node,String labelll){
		if(node.getLeft()!=null)getNodeReference(node.getLeft(),labelll);
		if(found==true)return pNode;
		if(node.getMiddle()!=null)getNodeReference(node.getMiddle(),labelll);
		if(found==true)return pNode;
		if(found==false)if(node.getRight()!=null)getNodeReference(node.getRight(),labelll);
		if(found==true)return pNode;
		if(node.getLabel().equals(labelll)){
			found=true;
			pNode=node;
			return pNode;
		}else return null;
	}
	/**
	    * Gets the value of boolean helpExit
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type boolean
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the value of helpExit
	    *
	    * @returns boolean helpExit
	    * 
	    **/
	public boolean getHelpExit() {
		return helpExit;
	}
	/**
	    * Gets the value of boolean success
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type boolean
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the value of success
	    *
	    * @returns boolean success
	    * 
	    **/
	public boolean getSuccess() {
		return success;
	}
	/**
	    * Gets the value of boolean found
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type boolean
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the value of found
	    *
	    * @returns boolean found
	    * 
	    **/
	public boolean getFound() {
		return found;
	}
	
	//SETTERS*************************************
	/**
	    * Allows the user to access the private data field
	    * of root, and gives them access to changing the value.
	    *
	    * @param TreeNode root
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type TreeNode passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable root for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setRoot(TreeNode root) {
		this.root = root;
	}
	/**
	    * Allows the user to access the private data field
	    * of pNode, and gives them access to changing the value.
	    *
	    * @param TreeNode pNode
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type TreeNode passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable pNode for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setPNode(TreeNode pNode) {
		this.pNode = pNode;
	}
	/**
	    * Allows the user to access the private data field
	    * of parent, and gives them access to changing the value.
	    *
	    * @param TreeNode parent
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type TreeNode passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable parent for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setParent(TreeNode parent) {
		this.parent = parent;
	}
	/**
	    * Allows the user to access the private data field
	    * of found, and gives them access to changing the value.
	    *
	    * @param boolean found
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type boolean passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable found for whatever user inputs.
	    *
	    * @returns void
	    * 
	    **/
	public  void setFound(boolean found) {
		this.found = found;
	}
	/**
	    * Allows the user to access the private data field
	    * of success, and gives them access to changing the value.
	    *
	    * @param boolean success
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type boolean passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable success for whatever user inputs.
	    *
	    * @returns void
	    * 
	    **/
	public void setSuccess(boolean success) {
		this.success = success;
	}
	/**
	    * Allows the user to access the private data field
	    * of helpExit, and gives them access to changing the value.
	    *
	    * @param boolean helpExit
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type boolean passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable helpExit for whatever user inputs.
	    *
	    * @returns void
	    * 
	    **/
	public void setHelpExit(boolean helpExit) {
		this.helpExit = helpExit;
	}

	
	//GETTERS*************************************
	
	
	
	//SETTERS*************************************
	
	
	
	//OVERRIDE************************************
	
	
	//OTHER***************************************
	/**
	    * Allows the user to print out the info of every node in the tree
	    * this is printed in a nice format and the nodes are traversed in preorder
	    * uses a helper method
	    *
	    * @param
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Tree that uses the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>none
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void preorder(){
		preorder(this.getRoot());
	}
	/**
	    * Helper method to preorder()
	    *
	    * @param TreeNode node
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Tree that uses the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>None
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void preorder(TreeNode node){
		System.out.println(node.toString()+"\n");
		
		if(node.getLeft()!=null)preorder(node.getLeft());
		//System.out.println("passed LEFT statement");
		if(node.getMiddle()!=null)preorder(node.getMiddle());
		//System.out.println("passed Middle statement");
		if(node.getRight()!=null)preorder(node.getRight());
		//System.out.println("passed RIGHT statement");
	}			

	
	
	
	public boolean isFound() {
		return found;
	}

	public boolean isSuccess() {
		return success;
	}

	
	public boolean addNodeLeft(TreeNode node,TreeNode parent){
		if(parent!=null){
		parent.setLeft(node);
		parent.setIsLeft(true);
		node.setParent(parent);
		return true;
		}else return false;
	} 
	
	public boolean addNodeMiddle(TreeNode node,TreeNode parent){
		if(parent!=null){
		parent.setMiddle(node);
		parent.setIsMiddle(true);
		node.setParent(parent);
		return true;
		}else return false;	
	}
	
	public boolean addNodeRight(TreeNode node,TreeNode parent){
		if(parent!=null){
		parent.setRight(node);
		parent.setIsRight(true);
		node.setParent(parent);
		return true;
		}else return false;
	}
	
	
	
	
	//OTHER***************************************
	/**
	    * Allows the user to begin question and answer session
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be a type Tree to use the function.
	    *
	    * <dt>Postconditions:
	    *    <<dd>prints new node info recursively based on users input.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void beginSession(){
		System.out.println("Help Session Starting...");
		helpSession(this.getRoot());
	}
	/**
	    * beginSession() helper method
	    *
	    * @param TreeNode node
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be a type Tree to use the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>prints new node info recursively based on users input
	    *
	    * @returns void
	    * 
	    **/
	public void helpSession(TreeNode node){
		while(helpExit==false){
			if(node.isLeaf()==true){
				System.out.println(node.getMessage()+"\n\n");
				helpExit=true;
			}else{
				System.out.println(node.getMessage());
				getAllChildPrompts(node);
				if(node!=getRoot())System.out.println("4) Back");
				if(node!=getRoot())System.out.println("5) Restart Help Session");
				System.out.println("0) exit");
				
				System.out.println("choice> ");
			
				int option=in.nextInt();
				
				switch(option){
					case 0:
						helpExit=true;
						System.out.println("EXITED HELP SESSION\n\n");
						break;
					case 1:
						helpSession(node.getLeft());
						break;
					case 2:
						helpSession(node.getMiddle());
							break;
					case 3:
						helpSession(node.getRight());
						break;
					case 4:
						helpSession(node.getParent());
						break;
					case 5:
						beginSession();
						break;
					default:
						System.out.println("ERROR INVALID CHOICE TRY AGAIN\n");
						break;
				}
			}
		}	
	}
	/**
	    * Allows the user to add a node to the tree, based 
	    * on who the parent is and if it can find the parent
	    *
	    * @param String label, String prompt, String message, String parentLabel
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be a type Tree to use the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Adds node to tree as a child of the parentLabel
	    *
	    * @returns boolean
	    * 
	    * 
	    **/
	public boolean addNode(String label, String prompt, String message, String parentLabel){
		parent= getNodeReference(parentLabel);
		pNode = new TreeNode(label, message, prompt);
		
		if(parent.getIsLeft()==false){
			success=addNodeLeft(pNode,parent);
		}else if(parent.getIsMiddle()==false){
			success=addNodeMiddle(pNode,parent);
		}else if(parent.getIsRight()==false){
			success=addNodeRight(pNode,parent);
		}
		return success;
	}
	
	
	//MAIN***************************************
	
	
	public int beginSession(TreeNode node){
		if(node.isLeaf()==true){
			System.out.println(node.getMessage());
			System.out.println("\n Thank you for using this automated help service!");
			return 1;
		}else{
			System.out.println(node.getMessage());
			getAllChildPrompts(node);
			System.out.println("0 Quit");
			return 0;
		}
	
	}

	
	public static void main(String[] args){
		System.out.println("hi");
		Tree tree = new Tree();
		 tree.getRoot().setLabel("root");
		 tree.getRoot().setPrompt("P0");
		 tree.getRoot().setMessage("m0");
		
		String label;
		String prompt;
		String message; 
		String parentLabel;
		label="1";
		prompt="p1";
		message="m1"; 
		parentLabel="root";
		//TreeNode a = new TreeNode(label, message, prompt);
		if(tree.addNode(label, prompt, message, parentLabel)==true)System.out.println("node1COMPLETE");
		label="2";
		prompt="p2";
		message="m2"; 
		parentLabel="root";
		//TreeNode b = new TreeNode(label, message, prompt);
		if(tree.addNode(label, prompt, message, parentLabel)==true)System.out.println("node2COMPLETE");
		label="3";
		prompt="p3";
		message="m3"; 
		parentLabel="root";
		//TreeNode c = new TreeNode(label, message, prompt);
		if(tree.addNode(label, prompt, message, parentLabel)==true)System.out.println("node3COMPLETE");
		label="11";
		prompt="p11";
		message="m11"; 
		parentLabel="1";
		//TreeNode d = new TreeNode(label, message, prompt);
		if(tree.addNode(label, prompt, message, parentLabel)==true)System.out.println("node4COMPLETE");
		label="12";
		prompt="p12";
		message="m12"; 
		parentLabel="1";
		//TreeNode e = new TreeNode(label, message, prompt);
		if(tree.addNode(label, prompt, message, parentLabel)==true)System.out.println("node5COMPLETE");
		label="13";
		prompt="p13";
		message="m13"; 
		parentLabel="1";
		//TreeNode f = new TreeNode(label, message, prompt);
		if(tree.addNode(label, prompt, message, parentLabel)==true)System.out.println("node6COMPLETE");
		label="21";
		prompt="p21";
		message="m21"; 
		parentLabel="2";
		//TreeNode g = new TreeNode(label, message, prompt);
		if(tree.addNode(label, prompt, message, parentLabel)==true)System.out.println("node7COMPLETE");
		label="22";
		prompt="p22";
		message="m22"; 
		parentLabel="2";
		//TreeNode h = new TreeNode(label, message, prompt);
		if(tree.addNode(label, prompt, message, parentLabel)==true)System.out.println("node8COMPLETE");
		
		
		/*
		
		tree.getRoot().setLeft(a);
		tree.getRoot().setMiddle(b);
		tree.getRoot().setRight(c);
		
		tree.getRoot().getLeft().setLeft(d);
		tree.getRoot().getLeft().setMiddle(e);
		tree.getRoot().getLeft().setRight(f);
		
		tree.getRoot().getMiddle().setLeft(g);
		tree.getRoot().getMiddle().setMiddle(h);
		*/
		label="31";
		prompt="p31";
		message="m31"; 
		parentLabel="3";
		if(tree.addNode(label, prompt, message, parentLabel)==true)System.out.println("node9COMPLETE");
		
		tree.preorder();
		//System.out.println(tree.getNodeReference("22").toString());
	
	}


	
	
}


