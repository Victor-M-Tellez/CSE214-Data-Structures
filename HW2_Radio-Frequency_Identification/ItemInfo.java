package cse214hw2;
import java.util.Scanner;
import java.lang.String;
/**
* The <code>ItemInfo</code> class creates ItemInfo Objects.
* The ItemInfo objects have the information on a user inputed item ex. dress shirt
* Information includes price type double and tagNum of the type long
* ,name,rfidTagNumber,originalLocation,currentLocation of the type String.
*  
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
public class ItemInfo {
	Scanner in = new Scanner(System.in);
	//DATA****************************************
	private double price;
	private String name;
	private String rfidTagNumber;
	//Shelf: s#####
	//Cart: c###
	private String originalLocation;
	private String currentLocation;
	private long tagNum;
	
	//CONSTRUCTORS********************************
	/**
	    * The default constructor that takes no parameters.
	    * It asks the user to input the information to fill out
	    * the information for the particular ItemInfo object.
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the ItemInfo Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new ItemInfo object with its very own reference
	    *
	    **/
	public ItemInfo(){
		
		System.out.println("Enter the name: ");
		setName(in.nextLine());
		
		System.out.println("Enter the RFID: ");
		setRfidTagNumber(in.nextLine());
		setTagNum(rfidTagNumber);
		System.out.println("Enter the original location: ");
		setOriginalLocation(in.nextLine());
		setCurrentLocation(getOriginalLocation());
		System.out.println("Enter the price: ");
		setPrice(in.nextDouble());
	}
	/**
	    * A constructor that takes parameters.
	    * It gets information passed into it to build the
	    * particular ItemInfo object.
	    *
	    * @param String name, String rfidTagNumber,String originalLocation,double price
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the ItemInfo Class and must have parameters passed into it
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new ItemInfo object with its very own reference
	    *
	    **/
	public ItemInfo(String name, String rfidTagNumber,String originalLocation,double price){
		
		setName(name);
		setRfidTagNumber(rfidTagNumber);
		setTagNum(rfidTagNumber);
		setOriginalLocation(originalLocation);
		setCurrentLocation(originalLocation);
		setPrice( price);
		
	}
	
	//GETTERS*************************************
	/**
	    * Gets the value at variable price
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>An object of type ItemInfo must have been created
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private price variable
	    *    and returns whatever double value is being held
	    *    by the price variable
	    *
	    * @returns double price
	    * 
	    **/
	public double getPrice(){
		return  this.price;
	}
	/**
	    * Gets the value at variable name
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>An object of type ItemInfo must have been created
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private name variable
	    *    and returns whatever String value is being held
	    *    by the name variable
	    *
	    * @returns String name
	    * 
	    **/
	public String getName(){
		return  this.name;
	}
	/**
	    * Gets the value at variable rfidTagNumber
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>An object of type ItemInfo must have been created
	    *    
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private rfidTagNumber variable
	    *    and returns whatever String value is being held
	    *    by the rfidTagNumber variable
	    *
	    * @returns String rfidTagNumber
	    * 
	    **/
	public String getRfidTagNumber(){
		return this.rfidTagNumber;
	}
	/**
	    * Gets the value at variable originalLocation
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>An object of type ItemInfo must have been created
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private originalLocation variable
	    *    and returns whatever String value is being held
	    *    by the originalLocation variable
	    *
	    * @returns String originalLocation
	    * 
	    **/
	public String getOriginalLocation(){
		return  this.originalLocation;
	}
	/**
	    * Gets the value at variable currentLocation
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>An object of type ItemInfo must have been created 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private currentLocation variable
	    *    and returns whatever String value is being held
	    *    by the currentLocation variable
	    *
	    * @returns String currentLocation
	    * 
	    **/
	public String getCurrentLocation(){
		return  this.currentLocation;
	}
	/**
	    * Gets the value at variable tagNum
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>An object of type ItemInfo must have been created
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private tagNum variable
	    *    and returns whatever long value is being held
	    *    by the tagNum variable
	    *
	    * @returns long tagNum
	    * 
	    **/
	public long getTagNum(){
		return this.tagNum;
	}
	
	
	//SETTERS*************************************
	/**
	    * Allows the user to access the private data field
	    * of price, and gives them access to changing the value.
	    *
	    * @param double price 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type double passed into the function
	    *    and double must be greater than or equal to 0.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable price for users input.
	    *
	    * @returns void
	    * 
	    *
	    * @exception IllegalArgumentException
	    * Indicates that <code>price</code> is less than zero
	    * 
	    **/
	public void setPrice(double price){
		if(price>=0){
			this.price=price;
		}else{
			throw new IllegalArgumentException("UNREAL PRICE FOR PRODUCT: " +this.getName());
		}
	}
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
	    *    <dd>Changes the value at variable name for users input.
	    *
	    * @returns void
	    * 
	    **/
	public void setName(String name){
		this.name=name;
	}
	/**
	    * Allows the user to access the private data field
	    * of rfidTagNumber, and gives them access to changing the value.
	    *
	    * @param String rfidTagNumber
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable rfidTagNumber for users input.
	    *
	    * @returns void
	    * 
	    * @exception IllegalArgumentException
	    * Indicates that <code>rfidTagNumber</code> incorrect in either
	    * lenght or Hex notation
	    * 
	    * 
	    **/
	public void setRfidTagNumber(String rfidTagNumber){
		if(rfidTagNumber.length()==9){
			if(checkHex(rfidTagNumber)){
				this.rfidTagNumber=rfidTagNumber;	
			}else{
				throw new IllegalArgumentException("ERROR IN NAME ENTRY"
				+" THE TAG NUMBER MUST BE IN HEX NOTATION");
			}
		}else{
			throw new IllegalArgumentException("ERROR IN NAME ENTRY"
			+" THE TAG NUMBER MUST BE 9 CHARACTERS LONG");
		}
	}
	/**
	    * Allows the user to access the private data field
	    * of originalLocation, and gives them access to changing the value.
	    *
	    * @param String originalLocation 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable originalLocation for users input.
	    *
	    * @returns void
	    * 
	    * @exception IllegalArgumentException
	    * Indicates that <code>originalLocation</code> input is wrong since
	    * original location can only be a on a shelf
	    * 
	    **/
	public void setOriginalLocation(String originalLocation){
		if (originalLocation.length()==6){
			if(originalLocation.charAt(0)=='s'||originalLocation.charAt(0)=='S'){
				if(checkStringIsNum(originalLocation.substring(1))){
					this.originalLocation=originalLocation;
				}else{
					throw new IllegalArgumentException("LOCATION ENTRY IS INVALID FOR "+this.getName()
					+"... LOCATION MUST BE IN FORMAT \"S#####\"");
				}
			}else{
				throw new IllegalArgumentException("LOCATION ENTRY IS INVALID FOR "+this.getName()
				+" ... MUST GO ON THE SHELF");
			}
		}else{
			throw new IllegalArgumentException("ERROR...THE LOCATION FOR "+this.getName()
			+" MUST BE 6 CHARACTERS LONG");
		}
	}
	/**
	    * Allows the user to access the private data field
	    * of currentLocation, and gives them access to changing the value.
	    *
	    * @param String currentLocation 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable currentLocation for users input.
	    *
	    * @returns void
	    * @exception IllegalArgumentException
	    * Indicates that <code>currentLocation</code> input is wrong, a proper
	    * location can be on a cart or a shelf or OUT the shelf must be in the
	    * format  S##### and the cart in the format c###
	    * 
	    **/
	public void setCurrentLocation(String currentLocation){
		if (currentLocation.length()==6||currentLocation.length()==4
				|| (currentLocation.toUpperCase()).equals("OUT")){
			if(currentLocation.length()==6){
				if(currentLocation.charAt(0)=='s'||currentLocation.charAt(0)=='S'){
					if(checkStringIsNum(currentLocation.substring(1))){
						this.currentLocation=currentLocation;
					}else{
						throw new IllegalArgumentException("LOCATION ENTRY IS INVALID FOR "+this.getName()
						+" ... LOCATION MUST BE IN FORMAT \"S#####\"");
					}
				}else{
					throw new IllegalArgumentException("LOCATION ENTRY OF THIS SIZE IS INVALID FOR "+this.getName()
					+" ... MUST GO ON THE SHELF");
				}
			}
			if(currentLocation.length()==4){
				if(currentLocation.charAt(0)=='C'||currentLocation.charAt(0)=='c'){
					if(checkStringIsNum(currentLocation.substring(1))){
						this.currentLocation=currentLocation;
					}else{
						throw new IllegalArgumentException("LOCATION ENTRY IS INVALID FOR "+this.getName()
						+" ... LOCATION MUST BE IN FORMAT \"C###\"");
					}
				}else{
					throw new IllegalArgumentException("LOCATION ENTRY OF THIS SIZE IS INVALID FOR "+this.getName()
					+" ... MUST GO IN THE CART");
				}
			}
			if((currentLocation.toUpperCase()).equals("OUT")){
				this.currentLocation=currentLocation;
			}
		}else{
			throw new IllegalArgumentException("ERROR...THE LOCATION FOR "+this.getName()
			+" IS INVALID");
		}
		
	}
	/**
	    * Allows the user to access the private data field
	    * of tagNum, and gives them access to changing the value.
	    *
	    * @param String tagNum 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable tagNum for users input.
	    *
	    * @returns void
	    * 
	    **/
	public void setTagNum(String hex){
		this.tagNum= hexConverter(hex);
	}
	
	//OVERRIDE************************************
	/**
	    * Overrides the toString from the Object Class
	    * creates a custom String that is later used in the ItemList Class
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> ItemInfo Object
	    *
	    * <dt>Postconditions:
	    *    <dd>Returns custom made string 
	    *
	    * @returns Returns custom made string 
	    * 
	    **/
	@Override
	public String toString(){
		return this.getName()+"\t"
				+this.getRfidTagNumber()+"\t"
				+this.getOriginalLocation()+"\t\t"
				+this.getCurrentLocation()+"\t\t"
				+this.getPrice();
	}
	
	//OTHER***************************************
	/**
	    * This method checks to see if the string inputed is a number or letters,
	    * if it is a number it outputs true else false
	    *
	    * @param String x 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Checks every character in the string to see if its a number.
	    *
	    * @returns boolean
	    * 
	    **/
	public static boolean checkStringIsNum(String x){
		int a=0;
		for(int i=0;i<x.length();i++){
			if((int)x.charAt(i)<=57 && (int)x.charAt(i)>=48){
				a++;
			}
		}
		if(a==x.length()){
			return true;
		}else{
			return false;
		}			
	}
	/**
	    * This method checks if the string inputed is  hex number.
	    * If it is a hex numebr then it outputs true else false.
	    *
	    * @param String x
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Checks every character in string to see if its a hex number.
	    *
	    * @returns boolean
	    * 
	    **/
	public static boolean checkHex(String x){
		int a=0;
		for(int i=0;i<x.length();i++){
			if ((int)x.charAt(i)<=70 && (int)x.charAt(i)>=65){
				a++;
			}else if((int)x.charAt(i)<=102 && (int)x.charAt(i)>=97){
				a++;
			}else if((int)x.charAt(i)<=57 && (int)x.charAt(i)>=48){
				a++;
			}
		}
		if(a==x.length()){
			return true;
		}else{
			return false;
		}	
	}
	/**
	    * Allows the user to convert a string that is a hex number
	    * into a number of type long
	    *
	    * @param String hex 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Converts hex number to decimal number.
	    *
	    * @returns long
	    * 
	    **/
	public static long hexConverter (String hex){
		return Long.parseLong(hex, 16);
	}
		
}