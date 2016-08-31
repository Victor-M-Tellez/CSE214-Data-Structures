/**
* The <code>Mailbox</code> class creates Mailbox Objects.
* These mailbox objects contain the information of all the Folders a user might want.
* Information includes the variables index type int. pEmail type Email. pFolder, inbox, trash type Folder.
* folders type ArrayList<Folder>, mailbox type MailBox;
*  
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
*    
**/
package cse214hw5;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;
public class Mailbox implements Serializable{
	static Scanner in = new Scanner(System.in);
	//DATA****************************************
	private static int index;
	private static Email pEmail;
	private Folder inbox;
	private Folder trash;
	private static Folder pFolder;
	private ArrayList<Folder> folders;
	public static Mailbox mailbox;
	
	//CONSTRUCTORS********************************
	/**
	    * Constructor that takes no parameters.
	    * It creates a new Mailbox that has both a trash and inbox
	    * to being with.
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the Folder Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new Folder object with its very own reference
	    *
	    **/
	public Mailbox(){
		inbox= new Folder("Inbox");
		trash= new Folder("Trash");
		this.folders= new ArrayList<Folder>();
		this.folders.add(inbox);
		this.folders.add(trash);
	}
	
	//GETTERS*************************************
	/**
	    * Gets the value at variable Index
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Mailbox
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private Index variable
	    *    and returns whatever int value is being held
	    *    by the Index variable
	    *
	    * @returns int Index
	    * 
	    **/
	public int getIndex() {
		return index;
	}
	/**
	    * Gets the value at variable pEmail
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Mailbox
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private pEmail variable
	    *    and returns whatever Email value is being held
	    *    by the pEmail variable
	    *
	    * @returns Email pEmail
	    * 
	    **/
	public Email getpEmail() {
		return pEmail;
	}
	/**
	    * Gets the value at variable pFolder
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Mailbox
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private pFolder variable
	    *    and returns whatever Folder value is being held
	    *    by the pFolder variable
	    *
	    * @returns Folder pFolder
	    * 
	    **/
	public Folder getpFolder() {
		return pFolder;
	}
	/**
	    * Gets the value at variable Inbox
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Mailbox
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private Inbox variable
	    *    and returns whatever Folder value is being held
	    *    by the Inbox variable
	    *
	    * @returns Folder Inbox
	    * 
	    **/
	public Folder getInbox() {
		return inbox;
	}
	/**
	    * Gets the value at variable Trash
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Mailbox
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private Trash variable
	    *    and returns whatever Folder value is being held
	    *    by the Trash variable
	    *
	    * @returns Folder Trash
	    * 
	    **/
	public Folder getTrash() {
		return trash;
	}
	/**
	    * Gets the value at variable Folders
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Mailbox
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private Folders variable
	    *    and returns whatever ArrayList<Folder> value is being held
	    *    by the Folders variable
	    *
	    * @returns ArrayList<Folder> Folders
	    * 
	    **/
	public ArrayList<Folder> getFolders() {
		return folders;
	}
	/**
	    * Gets the value at variable Mailbox
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Mailbox
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private Mailbox variable
	    *    and returns whatever Mailbox value is being held
	    *    by the Mailbox variable
	    *
	    * @returns Mailbox Mailbox
	    * 
	    **/
	public static Mailbox getMailbox() {
		return mailbox;
	}

	//SETTERS*************************************
	/**
	    * Allows the user to access the private data field
	    * of index, and gives them access to changing the value.
	    *
	    * @param int index
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type int passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable index for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setIndex(int index) {
		Mailbox.index = index;
	}
	/**
	    * Allows the user to access the private data field
	    * of pEmail, and gives them access to changing the value.
	    *
	    * @param Email pEmail 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Email passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable pEmail for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setpEmail(Email pEmail) {
		Mailbox.pEmail = pEmail;
	}		
	/**
	    * Allows the user to access the private data field
	    * of pFolder, and gives them access to changing the value.
	    *
	    * @param Folder pFolder 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Folder passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable pFolder for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setpFolder(Folder pFolder) {
		Mailbox.pFolder = pFolder;
	}
	/**
	    * Allows the user to access the private data field
	    * of inbox, and gives them access to changing the value.
	    *
	    * @param Folder inbox 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Folder passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable inbox for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setInbox(Folder inbox) {
		this.inbox = inbox;
	}
	/**
	    * Allows the user to access the private data field
	    * of trash, and gives them access to changing the value.
	    *
	    * @param Folder trash
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Folder passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable trash for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setTrash(Folder trash) {
		this.trash = trash;
	}
	/**
	    * Allows the user to access the private data field
	    * of folders, and gives them access to changing the value.
	    *
	    * @param ArrayList<Folder> folders 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type ArrayList<Folder> passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable folders for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setFolders(ArrayList<Folder> folders) {
		this.folders = folders;
	}
	/**
	    * Allows the user to access the private data field
	    * of mailbox, and gives them access to changing the value.
	    *
	    * @param Mailbox mailbox 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Mailbox passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable mailbox for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public static void setMailbox(Mailbox mailbox) {
		Mailbox.mailbox = mailbox;
	}
	
	//OTHER****************************************
	/**
	    * Allows the user to add to folders.
	    *
	    * @param Folder folder
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Folder.
	    *
	    * <dt>Postconditions:
	    *    <dd>Adds to the ArrayList folders.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void addFolder(Folder folder){
		boolean sameName=false;
		for(int i= 0;i<folders.size() ;i++){
			if(folders.get(i).getName().equals(folder.getName()))	sameName=true;
		}
		if(sameName==false)folders.add(folder);
		else System.out.println("\nA folder with this same name already exist! "
				+ "Please use a different name\n");
	}	
	/**
	    * Allows the user to delete from folders.
	    *
	    * @param String name
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String.
	    *
	    * <dt>Postconditions:
	    *    <dd>deletes from the ArrayList folders.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void deleteFolder(String name){
		if(name.equals("Inbox") || (name.equals("Trash"))){
			System.out.println("\nError! cannot delete "+ name+" folder\n");
		}else{	
			boolean sameName=false;
			int atIndex=0;
			for(int i= 0;i<folders.size() ;i++){
				if(folders.get(i).getName().equals(name)){	
					sameName=true;
					atIndex=i;
				}
			}
			if(sameName==true){folders.remove(atIndex);
			System.out.println("Folder successfully deleted!");
			}
			else System.out.println("\nA folder with this name does not exist!\n");
		}
	}
	/**
	    * Allows the user to move email from one folder to  another folder.
	    *
	    * @param Email email, Folder target
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Folder and Email.
	    *
	    * <dt>Postconditions:
	    *    <dd> move email from one folder to another.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void moveEmail(Email email, Folder target){
		if(null==mailbox.getFolder(target.getName())){
			System.out.println("Email will be moved to Inbox");
			inbox.getEmails().add(email);
		}else{
			target.getEmails().add(email);
		}
	}
	/**
	    * Allows the user to delete from emails.
	    *
	    * @param Email email
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Email.
	    *
	    * <dt>Postconditions:
	    *    <dd>deletes from the ArrayList emails of a specific folder.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void deleteEmail(Email email){
		trash.addEmail(email);	
	}
	/**
	    * Allows the user to clear all emails from trash.
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be called by type Mailbox.
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows the user to clear all emails from trash..
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void clearTrash(){
		int trash=getFolder("Trash").getEmails().size();
		getFolder("Trash").getEmails().clear();
		System.out.print(trash+" item(s) successfully deleted.");
	}
	/**
	    * Allows the user to create a new Email object and compose it.
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> None
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows the user to add an Email to Inbox folder
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void composeEmail(){
		Email pEmail;
		pEmail=new Email();
		System.out.printf("\nEnter recipient (To): ");
		pEmail.setTo(in.nextLine());
		System.out.printf("\nEnter carbon copy recipients (CC): ");
		pEmail.setCc(in.nextLine());
		System.out.printf("\nEnter blind carbon copy recipients (BCC): ");
		pEmail.setBcc(in.nextLine());
		System.out.printf("\nEnter subject line: ");
		pEmail.setSubject(in.nextLine());
		System.out.printf("\nEnter body: ");
		pEmail.setBody(in.nextLine());
		pEmail.setTimestamp(new GregorianCalendar());
		mailbox.inbox.addEmail(pEmail);
		System.out.println("\nEmail successfully added to Inbox.\n\n");
		
		}
	/**
	    * Prints the folders of a Mailbox
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be a type Mailbox.
	    *
	    * <dt>Postconditions:
	    *    <dd>None
	    *
	    * @returns None	    * 
	    * 
	    **/
	public static void printMailbox(){
		System.out.println("\n");
		System.out.println("MAILBOX");
		System.out.println("---------");
		for(int i = 0;i<mailbox.folders.size() ;i++){
			System.out.println(mailbox.folders.get(i).getName());
		}
		System.out.println("\n");
	}
	/**
	    * Prints the folders of a Mailbox
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be a type Mailbox.
	    *
	    * <dt>Postconditions:
	    *    <dd>None
	    *
	    * @returns None	    
	    * 
	    **/
	public static void printFolders(){
		System.out.println("Folders:");
		for(int i = 0;i<mailbox.folders.size() ;i++){
			System.out.println(mailbox.folders.get(i).getName());
		}
		System.out.println("\n");
	}
	/**
	    * Runs the Sub Menu of a Folder
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be a type Folder.
	    *
	    * <dt>Postconditions:
	    *    <dd>Acts on what the user wants to do.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public static void subMenu(Folder folder){
		boolean exitSub=false;
		String subChoice;
		int emailIndex;
		while(exitSub==false){
			folder.printFolderContent();
			subChoice=folder.subMenuOptions();
			switch(subChoice){
			case "M":
				System.out.println("Enter email index:==>> ");
				emailIndex=in.nextInt();
				emailIndex--;
				String folderName;
				if(emailIndex<folder.getEmails().size()&&emailIndex>=0){
					pEmail=folder.getEmails().get(emailIndex);
					printFolders();
					System.out.println("Select a folder to move \""+pEmail.getSubject()+"\" to:==>> ");
					in= new Scanner(System.in);
					folderName=in.nextLine();
					pFolder=mailbox.getFolder(folderName);
					mailbox.moveEmail(folder.removeEmail(emailIndex), pFolder);
					System.out.println("\""+pEmail.getSubject()+"\" successfully moved to \""+pFolder.getName()+"\"");
				}else{
					System.out.println("Error you Entered an incorrect Email..."
							+ "\nYou are now back to folder sub menu\n\n");
				}
				break;
			case "D":
				System.out.println("Enter email index:==>> ");
				index=in.nextInt();
				index--;
				if(index<folder.getEmails().size()&&index>=0){
					pEmail = pFolder.removeEmail(index);
					mailbox.deleteEmail(pEmail);
					System.out.println("\""+pEmail.getSubject()+"\"has successfully been moved to the Trash.");
				}else{
					System.out.println("Error you Entered an incorrect Email..."
							+ "\nYou are now back to folder sub menu\n\n");
				}
				break;
			case "V":
				if(index<folder.getEmails().size()&&index>=0){
					System.out.println("Enter email index:==>> ");
					emailIndex=in.nextInt();
					emailIndex--;
					pEmail = folder.getEmails().get(emailIndex);
					System.out.println("To: "+pEmail.getTo());
					System.out.println("CC: "+pEmail.getCc());
					System.out.println("BCC: "+pEmail.getBcc());
					System.out.println("Subject: "+pEmail.getSubject());
					System.out.println(pEmail.getBody());
				}else{
					System.out.println("Error you Entered an incorrect Email..."
							+ "\nYou are now back to folder sub menu\n\n");
				}
				break;
			case "SA":
				folder.sortBySubjectAscending();
				break;
			case "SD":
				folder.sortBySubjectDescending();
				break;
			case "DA":
				folder.sortByDateAscending();
				break;
			case "DD":
				folder.sortByDateDescending();
				break;
			case "R":
				exitSub=true;
				System.out.println("You have Exited "+folder.getName());
				break;
			default:
				System.out.println("ERROR you didnt enter a valid option please try again\n\n");
				break;
			}
		}
	}	
	/**
	    * Prints the Main Menu of a Mailbox
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be a type Mailbox.
	    *
	    * <dt>Postconditions:
	    *    <dd>Sends back users choice.
	    *
	    * @returns String
	    * 
	    * 
	    **/
	public static String mainMenuOptions(){
		System.out.println("MAIN MENU ");
		System.out.println("---------");
		System.out.println("A – Add folder");
		System.out.println("R – Remove folder");
		System.out.println("C – Compose email");
		System.out.println("F – View Folder");
		System.out.println("I – View Inbox");
		System.out.println("T – View Trash");
		System.out.println("E – Empty Trash");
		System.out.println("Q - Quit the program");
		System.out.println("\nEnter you choice here: ");
		return in.nextLine().toUpperCase();
	}
	/**
	    * Gets the index of a particular email in a particular folder.
	    *
	    * @param Email email, Folder folder
	    *    
	    * <dt>Preconditions:
	    *    <dd>Must get a Email object and Folder Obeject 
	    *
	    * <dt>Postconditions:
	    *    <dd>None
	    *
	    * @returns int index
	    * 
	    * 
	    **/
	public int findIndex (Email email, Folder folder){
		boolean found =false;
		for(int i= 0;i<folder.getEmails().size() ;i++){
			if(folder.getEmails().get(i).equals(email)){
				found=true;
				index=i;
			}
		}
		if(found ==true)return index;
		else return -1;
	}
	/**
	    * Returns a particular Folder based on a particular String.
	    *
	    * @param String name
	    *    
	    * <dt>Preconditions:
	    *    <dd>Must get a String Obejct 
	    *
	    * <dt>Postconditions:
	    *    <dd>None
	    *
	    * @returns Folder
	    * 
	    * 
	    **/
	public Folder getFolder(String name){
		boolean sameName=false;
		for(int i= 0;i<folders.size() ;i++){
			if(folders.get(i).getName().equals(name)){	
				sameName=true;
				return folders.get(i);
			}
		}
		if(sameName==false){
			System.out.println("\nA folder with this name does not exist!\n");
		}
		return mailbox.inbox;	
	}


//***************************************************************************************************************
//***************************************!!!!MAIN FUNCTION!!!****************************************************
//***************************************************************************************************************
	  /**
	    * Runs the program that acts as an email application
	    * It allows the user to create a new folder and new emails. 
	    * It also allows the user to control their files and emails 
	    * and move then around and even delete them.
	    *  
	    * @param String[] args 
	    *  
	    * <dt>Preconditions:
	    *    <dd> None
	    *
	    * <dt>Postconditions:
	    *    <dd>Ask user for various inputs to update and create new objects
	    *
	    * @returns void
	    * 
	    * @exception 
	    * Trhows an exception if there is no mailbox.obj or if there is an error outputing
	    * a newly made mailbox.obj
	    *  
	    **/
	public static void main(String[] args){	
		try{
		FileInputStream fis = new FileInputStream("mailbox.obj");
		ObjectInputStream ois = new ObjectInputStream(fis);
		mailbox=(Mailbox)ois.readObject();
		}catch(Exception e){
			System.out.println("Previous save not found, starting with an empty mailbox.");
			mailbox=new Mailbox();
		}
		boolean exitMain=false;
		String mainChoice;
		while(exitMain==false){
			Mailbox.printMailbox();
			mainChoice=mainMenuOptions();
			switch(mainChoice){
			case "A":
				System.out.println("Enter folder name: ");
				pFolder= new Folder(in.nextLine());
				mailbox.addFolder(pFolder);
				break;
			case "C":
				mailbox.composeEmail();
				break;
			case "E":
				mailbox.clearTrash();
				break;
			case "R":
				System.out.println("Enter the name of the folder you wish to delete: ");
				mailbox.deleteFolder(in.nextLine());
				
				break;
			case "Q":
				exitMain=true;
				System.out.println("You have QUIT the application\nProgram successfully exited and mailbox saved.");
				break;
			case "I":
				pFolder=mailbox.getFolder("Inbox");
				subMenu(pFolder);
				break;
			case "F":
				String folderName;
				System.out.println("Enter folder name:==>> ");
				folderName=in.nextLine();
				pFolder=mailbox.getFolder(folderName);
				subMenu(pFolder);
				break;
			case "T":
				subMenu(mailbox.getFolder("Trash"));
				break;
			default:
				System.out.println("ERROR you didnt enter a valid option please try again\n\n");
				break;
			}	
		}
		try{
			FileOutputStream fos = new FileOutputStream("mailbox.obj");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
		}catch(Exception e){
			System.out.println("ERROR ");
		}
			
	}			
	
	 
}


