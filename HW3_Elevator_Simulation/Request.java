package cse214hw3;
/**
* The <code>Request</code> class creates Request Objects.
* These Request objects contain the information of all the peoples requests for the elevator.
* Information includes the variables sourceFloor, destinationFloor, timeEntered, maxFloors,
* and timeArrived which are all int types.
*  
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
public class Request {
	//DATA****************************************
	private int sourceFloor;
	private int destinationFloor;
	private int timeEntered;// (int - the time that this request was placed on the queue)
	private int maxFloors;
	private int timeArrived;// (int - the time that elevator got to the passanger)
	
	//CONSTRUCTORS********************************
	/**
	    * The default constructor that takes no parameters.
	    * It is coded so that we can error check and ensure that it isnt used
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the Request  Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new Request object with its very own referrence
	    *
	    **/
	public Request(){
		System.out.printf("ERROR YOU WERENT SUPPOSE TO USE THIS \"REQUEST\" NO PARAMETER CONSTRUCTOR\n");
	}
	/**
	    * This is a constructor that takes int maxFloor data parameter.
	    *This is used to set the Max number of floors in the given building,
	    *it also sets the sourceFloor and destinationFloor to random floors
	    *
	    * @param int maxFloors
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the Request Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new Request object with its very own referrence
	    *
	    **/
	public Request(int maxFloors){
		this.sourceFloor=4;//(int) (1+Math.random()*maxFloors);
		this.destinationFloor=2;//(int) (1+Math.random()*maxFloors);
		this.maxFloors=maxFloors;
	}
	
	//GETTERS*************************************
	/**
	    * Gets the value at variable sourceFloor
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Request 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private sourceFloor variable
	    *    and returns whatever int value is being held
	    *    by the sourceFloor variable
	    *
	    * @returns int sourceFloor
	    * 
	    **/
	public int getSourceFloor(){
		return sourceFloor;
	}
	/**
	    * Gets the value at variable destinationFloor
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Request 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private destinationFloor variable
	    *    and returns whatever int value is being held
	    *    by the destinationFloor variable
	    *
	    * @returns int destinationFloor
	    * 
	    **/
	public int getDestinationFloor(){
		return destinationFloor;
	}
	/**
	    * Gets the value at variable timeEntered
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Request 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private timeEntered variable
	    *    and returns whatever int value is being held
	    *    by the timeEntered variable
	    *
	    * @returns int timeEntered
	    * 
	    **/
	public int getTimeEntered(){
		return timeEntered;
	}
	/**
	    * Gets the value at variable maxFloors
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Request 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private maxFloors variable
	    *    and returns whatever int value is being held
	    *    by the maxFloors variable
	    *
	    * @returns int maxFloors
	    * 
	    **/
	public int getMaxFloors() {
		return maxFloors;
	}
	/**
	    * Gets the value at variable timeArrived
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Request 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private timeArrived variable
	    *    and returns whatever int value is being held
	    *    by the timeArrived variable
	    *
	    * @returns int timeArrived
	    * 
	    **/
	public int getTimeArrived(){
		return timeArrived;
	}
	
	//SETTERS*************************************
	/**
	    * Allows the user to access the private data field
	    * of maxFloors, and gives them access to changing the value.
	    *
	    * @param int maxFloors 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type int passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable maxFloorsfor whatever user inputs.
	    *
	    * @returns void
	    * 
	    * @exception IllegalArgumentException
	    * Indicates that <code>maxFloors</code> isnt a positive number
	    * 
	    **/
	public void setMaxFloors(int maxFloors)throws IllegalArgumentException {
		if(maxFloors>=1)	
			this.maxFloors = maxFloors;
		else{
			throw new IllegalArgumentException("\nMAX FLOOR IS ABSURD...TRY AGAIN WITH A NUMBER THAT IS POSITIVE\n: ");
		}
	}
	/**
	    * Allows the user to access the private data field
	    * of sourceFloor, and gives them access to changing the value.
	    *
	    * @param int sourceFloor
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type int passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable sourceFloor for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * @exception IllegalArgumentException
	    * Indicates that <code>sourceFloor</code> is outside the proper range
	    * 
	    * 
	    **/
	public void setSourceFloor(int sourceFloor) throws IllegalArgumentException{
		if(sourceFloor>=1 && sourceFloor<=this.getMaxFloors())
			this.sourceFloor = sourceFloor;
		else{
			throw new IllegalArgumentException("\nSOURCE FLOOR IS ABSURD...TRY AGAIN WITH A NUMBER WITHIN THE RANGE: 1 TO "
					+this.getMaxFloors()+" \n:");
		}
	}
	/**
	    * Allows the user to access the private data field
	    * of destinationFloor, and gives them access to changing the value.
	    *
	    * @param int destinationFloor 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type int passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable destinationFloor for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * @exception IllegalArgumentException
	    * Indicates that <code>destinationFloor</code> is eout of the proper range
	    * 
	    * 
	    **/
	public void setDestinationFloor(int destinationFloor) throws IllegalArgumentException{
		if(destinationFloor>=1 && destinationFloor<=this.getMaxFloors())
			this.destinationFloor = destinationFloor;
		else{
			throw new IllegalArgumentException("\nDESTINATION FLOOR IS ABSURD...TRY AGAIN WITH A NUMBER WITHIN THE RANGE: 1 TO "
					+this.getMaxFloors()+" \n:");
		}
	}
	/**
	    * Allows the user to access the private data field
	    * of timeEntered, and gives them access to changing the value.
	    *
	    * @param int timeEntered 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type int passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable timeEntered for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * @exception IllegalArgumentException
	    * Indicates that <code>timeEntered</code> isnt greater than or equal to 0
	    * 
	    * 
	    **/
	public void setTimeEntered(int timeEntered) throws IllegalArgumentException{
		if(timeEntered>=0)
			this.timeEntered = timeEntered;
		else{
			throw new IllegalArgumentException("\nTIME ENTERED IS ABSURD...TRY AGAIN WITH A NUMBER THAT IS POSITIVE\n: ");
		}
	}
	/**
	    * Allows the user to access the private data field
	    * of timeArrived, and gives them access to changing the value.
	    *
	    * @param int timeArrived 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type int passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable timeArrived for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * @exception IllegalArgumentException
	    * Indicates that <code>timeArrived</code> isnt greater than or equal to 0
	    * 
	    * 
	    **/
	public void setTimeArrived(int timeArrived) throws IllegalArgumentException{
		if(timeArrived>=0)
			this.timeArrived = timeArrived;
		else{
			throw new IllegalArgumentException("\nTIME ENTERED IS ABSURD...TRY AGAIN: "+timeArrived+" \n: ");
		}
	}
	
	//OVERRIDE************************************
	/**
	    * Overrides the toString from the Object Class
	    * creates a custom String that has gives the Source floor and the Destination floor
	    * that an elevator is going to 
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> Request Object
	    *
	    * <dt>Postconditions:
	    *    <dd>Returns custom made string 
	    *
	    * @returns Returns custom made string 
	    * 
	    **/
	public String toString(){
		return "Source: "+getSourceFloor()+" Destination: "+getDestinationFloor()+"\n";
	}
	
	//OTHER***************************************
	/*//HARDCODE******************************************vvvvvvvvvvvvvvvv
	public static void main(String[] args){
		for(int i =0;i<10;i++){
			double x= Math.random();
			System.out.println(x);
		}
	}
	*///HARDCODE******************************************^^^^^^^^^^^^^^^^^	
}