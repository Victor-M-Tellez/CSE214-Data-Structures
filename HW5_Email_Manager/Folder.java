 /**
* The <code>Folder</code> class creates a Folder Object.
* These Folder objects contain the information of all the Email objects a person decides to store
* in the folder.
* Information includes the variables name, currentSortingMetho of type String.
* Also emails of type ArrayList<Email>.
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
package cse214hw5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
public class Folder implements Serializable{
	static Scanner in = new Scanner(System.in);
	//DATA****************************************
	private ArrayList<Email> emails;//Stores all of the email object contained in this folder
	private String name;//name of the folder
	private String currentSortingMethod;// Default is date descending.
	private final int ascending=-1;
	private final int descending=1;
	private int sortType=ascending; //1= descending 		-1=ascending
	private Email pEmail;
	//CONSTRUCTOR*********************************
	//CONSTRUCTORS********************************

	/**
	    * Constructor that takes no parameters.
	    * It creates a new Folder that sets
	    * currentSortingMethod to date descending.
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the Folder Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new Folder object with its very own referrence
	    *
	    **/
	public Folder(){
		emails= new ArrayList<Email>();
		System.out.println("Enter folder name: ");
		name= in.nextLine();
		currentSortingMethod= "DD";
	}
	/**
	    * Constructor that takes a String parameter.
	    * It creates a new Folder that sets name to user entered String and
	    * currentSortingMethod to date descending.
	    *
	    * @param String name
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the Folder Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new Folder object with its very own referrence
	    *
	    **/
 	public Folder(String name){
		emails=new ArrayList<Email>();
		this.name=name;
		currentSortingMethod= "DD";
	}
	
 	//GETTERS*************************************
 	/**
	    * Gets the value at variable name
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Folder
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private name variable
	    *    and returns whatever String value is being held
	    *    by the name variable
	    *
	    * @returns String name
	    * 
	    **/
 	//GETTERS*************************************
 		
 	public String getName() {
		return name;
	}
 	/**
	    * Gets the value at variable CurrentSortingMethod
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Folder
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private CurrentSortingMethod variable
	    *    and returns whatever String value is being held
	    *    by the CurrentSortingMethod variable
	    *
	    * @returns String CurrentSortingMethod
	    * 
	    **/
	public String getCurrentSortingMethod() {
		return currentSortingMethod;
	}
	/**
	    * Gets the value at variable SortType
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Folder
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private SortType variable
	    *    and returns whatever int value is being held
	    *    by the SortType variable
	    *
	    * @returns int SortType
	    * 
	    **/
	public int getSortType() {
		return sortType;
	}
	/**
	    * Gets the value at variable Emails
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Folder
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private Emails variable
	    *    and returns whatever ArrayList<Email> value is being held
	    *    by the Emails variable
	    *
	    * @returns ArrayList<Email> Emails
	    * 
	    **/
	public ArrayList<Email> getEmails() {
		return emails;
	}
	
	//SETTERS*************************************
	/**
	    * Allows the user to access the private data field
	    * of name, and gives them access to changing the value.
	    *
	    * @param String name
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable name for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
 	//SETTERS*************************************
 		
	public void setName(String name) {
		this.name = name;
	}
	/**
	    * Allows the user to access the private data field
	    * of currentSortingMethod, and gives them access to changing the value.
	    *
	    * @param String currentSortingMethod 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable currentSortingMethod for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setCurrentSortingMethod(String currentSortingMethod) {
		this.currentSortingMethod = currentSortingMethod;
	}
	/**
	    * Allows the user to access the private data field
	    * of sortType, and gives them access to changing the value.
	    *
	    * @param String sortType 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable sortType for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setSortType(int sortType) {
		this.sortType = sortType;
	}
	/**
	    * Allows the user to access the private data field
	    * of emails, and gives them access to changing the value.
	    *
	    * @param ArrayList<Email> emails 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type ArrayList<Email> passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable emails for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setEmails(ArrayList<Email> emails) {
		this.emails = emails;
	}
	
	//OTHER*************************************
	/**
	    * Allows the user to organize their emails.
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type ArrayList<Email>.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable emails into DateAscending order.
	    *
	    * @returns void
	    * 
	    * 
	    **/
 	//OTHER****************************************
	
	public void sortByDateAscending(){
		this.setSortType(ascending);
		numSelectionSort (emails,sortType);
	}
	/**
	    * Allows the user to organize their emails.
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type ArrayList<Email>.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable emails into DateDescending order.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void sortByDateDescending(){
		this.setSortType(descending);
		numSelectionSort(emails,sortType);
	}
	/**
	    * Allows the user to organize their emails.
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type ArrayList<Email>.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable emails into SubjectAscending order.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void sortBySubjectAscending(){
		this.setSortType(ascending);
		alpSelectionSort (emails,sortType);
	}
	/**
	    * Allows the user to organize their emails.
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type ArrayList<Email>.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable emails into SubjectAscending order.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void sortBySubjectDescending(){
		this.setSortType(descending);
		alpSelectionSort (emails,sortType);
	}
	/**
	    * Allows the user to add to emails.
	    *
	    * @param Email pEmail
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Email.
	    *
	    * <dt>Postconditions:
	    *    <dd>Adds to the ArrayList Emails.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void addEmail(Email pEmail){
		 String sortingType= this.getCurrentSortingMethod();
		 switch (sortingType) {
	     case "SA"://Sort by subject ascending
	    	 if(emails.add(pEmail))
	    	 this.sortBySubjectAscending();
	    	 else System.out.println("Error! failed to add Email: SA");
	    	 break;
	    	 
	     case "SD"://Sort by subject descending
	    	 if(emails.add(pEmail))
	    	 this.sortBySubjectDescending();
	    	 else System.out.println("Error! failed to add Email:SD ");
	    	 break;
	    	 
	     case "DA"://Sort by date ascending
	    	 if(emails.add(pEmail))
	    	 this.sortByDateAscending();
	    	 else System.out.println("Error! failed to add Email: DA");
	    	 break;
	     
	     case "DD"://Sort by date descending
	    	 if(emails.add(pEmail))
	    	 this.sortByDateDescending();
	    	 else System.out.println("Error! failed to add Email:DD");
	    	 break;
		 
	     default:
	    	System.out.println("Error! failed to add Email");
			return; 
		 }	
	 }
	/**
	    * Allows the user to add to print emails.
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Folder.
	    *
	    * <dt>Postconditions:
	    *    <dd>Prints a folders ArrayList Emails.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	//EXTRA*********************************************************************	

	public void printFolderContent(){
		System.out.println("\n"+this.getName()+"\n");
		if(this.getEmails().size()==0){
			System.out.println(this.getName()+" is empty.");
		}else{
			System.out.println("Index |        Time       | Subject");
			System.out.println("-----------------------------------");
			for(int i =0; i<emails.size();i++){
				System.out.println((i+1)+"     |"+emails.get(i).toString());
			}	
		}
		System.out.println("\n\n");
	}
	/**
	    * Allows the user to compare two objects based on the variable
	    * Subject and tells the user which objects has a lower ranking
	    * letter than the other
	    *
	    * @param Object o1, Object o2
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Object passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>None
	    *
	    * @returns int
	    * 
	    * 
	    **/
	public static int compareSubject(Object o1, Object o2) {
	    Email e1 = (Email) o1;
	    Email e2 = (Email) o2;
	    if(e1.getSubject().equals(e2.getSubject())) return 0;
	    else if (e1.getSubject().compareTo(e2.getSubject())>=1) return 1;
	    else return -1;
	}
	/**
	    * Prints the Sub Menu of a Folder
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be a type Folder.
	    *
	    * <dt>Postconditions:
	    *    <dd>Sends back users choice.
	    *
	    * @returns String
	    * 
	    * 
	    **/
	public String subMenuOptions(){
		System.out.println("FOLDER SUBMENU:");
		System.out.println("M – Move email");
		System.out.println("D – Delete email");
		System.out.println("V – View email contents");
		System.out.println("SA – Sort by subject ascending");
		System.out.println("SD – Sort by subject descending");
		System.out.println("DA – Sort by date ascending");
		System.out.println("DD – Sort by date descending");
		System.out.println("R – Return to main menu");
		System.out.println("Enter you choice here:");
		return in.nextLine().toUpperCase();
		}
	/**
	    * Allows the user to remove from emails.
	    *
	    * @param Email pEmail
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Email.
	    *
	    * <dt>Postconditions:
	    *    <dd>removes from the ArrayList Emails.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public Email removeEmail(int index){
		pEmail=getEmails().remove(index);
		return pEmail;		
	}
	/**
	    * Allows the user to sort emails.
	    *
	    * @param ArrayList<Email> emails,int sortType
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type ArrayList and int.
	    *
	    * <dt>Postconditions:
	    *    <dd>Sorts the ArrayList Emails based on date.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public ArrayList<Email> numSelectionSort (ArrayList<Email> emails, int sortType){//1--->>100 ascending
		int minIndex,i, j;
		Email minValue, temp = null;
		for (i = 0; i < emails.size(); i++) {
			minValue = emails.get(i);
			minIndex = i;
			for (j = i; j < emails.size(); j++) {
				if (emails.get(j).compareTo(minValue)==sortType){//sortType==		1= descending 		-1=ascending
					minValue = emails.get(j);
					minIndex = j;//
				}
			}
			if (minValue.compareTo(emails.get(i))==sortType) {//sortType==			1= descending 		-1=ascending
				temp = emails.get(i);
				emails.set(i, emails.get(minIndex));
				emails.set(minIndex, temp);
			}
		}
		return emails;
	}
	/**
	    * Allows the user to sort emails.
	    *
	    * @param ArrayList<Email> emails,int sortType
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type ArrayList and int.
	    *
	    * <dt>Postconditions:
	    *    <dd>Sorts the ArrayList Emails Alphabetically.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public ArrayList<Email> alpSelectionSort (ArrayList<Email> emails,int sortType){//a----->>> z ascending
 		int minIndex, i, j;
 		Email minValue, temp = null;
 		for (i = 0; i < emails.size(); i++) {
				 			minValue = emails.get(i);
				 			minIndex = i;
				 			for (j = i; j < emails.size(); j++) {
				 				//returns 1 if this > other
				 				//returns -1 if this <other 
				 				
				 				//returns 1 if this > other b > a return 1
				 				//returns -1 if this <other a < b return -1
				 				
				 				//compareSubject(Object o1, Object o2)
				 				//compareSubject(emails.get(j), minValue)
				 				
				 				if (compareSubject(emails.get(j), minValue)==sortType){//sortType==		1= descending 		-1=ascending
				 					minValue = emails.get(j);
				 					minIndex = j;
				 				}
				 			}
				 			if (compareSubject(minValue,emails.get(i))==sortType){//sortType==		1= descending 		-1=ascending
				 				temp = emails.get(i);
				 				emails.set(i, emails.get(minIndex));
				 				emails.set(minIndex, temp);
				 			}
 		}
 		return emails;
 	}
	
	//***************************************************************************************************************
	//*************************************!!!!UNFINISHED CODE!!!****************************************************
	//***************************************************************************************************************
/*
 * 
	public static void main(String[] args){
	Folder a=new Folder("victor");
	String x,y;
	x="0";
	y="i";
	x=in.nextLine();
	Email b=new Email(x,x,x,y,x);
	x="1";
	y="h";
	x=in.nextLine();
	Email c=new Email(x,x,x,y,x);
	x="2";
	y="g";
	x=in.nextLine();
	Email d=new Email(x,x,x,y,x);
	x="3";
	y="f";
	x=in.nextLine();
	Email e=new Email(x,x,x,y,x);
	x="4";
	y="e";
	x=in.nextLine();
	Email f=new Email(x,x,x,y,x);
	System.out.println("folder name:"+a.getName());
	System.out.println("Folder size: "+a.emails.size());
	a.emails.add(b);
	System.out.println("Folder size: "+a.emails.size());
	
	a.emails.add(c);
	System.out.println("Folder size: "+a.emails.size());
	
	a.emails.add(d);
	System.out.println("Folder size: "+a.emails.size());
	a.emails.add(e);
	System.out.println("Folder size: "+a.emails.size());
	a.emails.add(f);
	System.out.println("Folder size: "+a.emails.size());
	
	
	a.printFolderContent();
	System.out.println("\nSUCCESS1");
	a.sortByDateAscending();
	a.printFolderContent();
	System.out.println("\nSUCCESS2");
	a.sortByDateDescending();
	a.printFolderContent();
	System.out.println("\nSUCCESS3");
	a.sortBySubjectAscending();
	a.printFolderContent();
	System.out.println("\nSUCCESS4");
	a.sortBySubjectDescending();
	a.printFolderContent();
	
	a.printFolderContent();
	System.out.println("\nSUCCESS0");
	System.out.println("SUCCESS5  "+a.removeEmail(0));
	//a.removeEmail(1);
	a.printFolderContent();
	System.out.println("SUCCESS");
	
	System.out.println("\n\n\nSUCCESS");
	}
*/
}


