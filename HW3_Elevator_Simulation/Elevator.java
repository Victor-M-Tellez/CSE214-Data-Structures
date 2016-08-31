package cse214hw3;
/**
* The <code>Elevator</code> class creates Elevator Objects.
* These Elevator objects contain the information of where a 
* specific elevator is and where its going.
* Information includes the variables currentFloor, elevatorState 
* which are type int and IDLE, TO_SOURCE, TO_DESTINATION which are 
* all int types but they are also final variables. Lastly there is 
* a request variable that is type Request.
*  
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
public class Elevator{
	//DATA****************************************
	private int currentFloor;
	private int elevatorState;
	private final int IDLE =-1;
	private final int TO_SOURCE=0;
	private final int TO_DESTINATION =1;
	private Request request;
	
	//CONSTRUCTORS********************************
	/**
	    * The default constructor that takes no parameters.
	    * It creates a new elevator that starts at floor 1 and is
	    * in the IDLE state bc it has no request.
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the Elevator Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new Elevator object with its very own referrence
	    *
	    **/
	public Elevator (){
		request=null;
		elevatorState = IDLE;
		currentFloor =1;
	}
	
	//GETTERS*************************************
	/**
	    * Gets the value at variable currentFloor
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Elevator
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private currentFloor variable
	    *    and returns whatever int value is being held
	    *    by the currentFloor variable
	    *
	    * @returns int currentFloor
	    * 
	    **/
	public int getCurrentFloor() {
		return currentFloor;
	}
	/**
	    * Gets the value at variable elevatorState
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Elevator 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private elevatorState variable
	    *    and returns whatever int value is being held
	    *    by the elevatorState variable
	    *
	    * @returns int elevatorState
	    * 
	    **/
	public int getElevatorState() {
		return elevatorState;
	}
	/**
	    * Gets the value at variable request
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type Elevator 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private request variable
	    *    and returns whatever Request value is being held
	    *    by the Request variable
	    *
	    * @returns Request request
	    * 
	    **/
	public Request getRequest() {
		return request;
	}
	
	//SETTERS*************************************
	/**
	    * Allows the user to access the private data field
	    * of currentFloor, and gives them access to changing the value.
	    *
	    * @param int currentFloor 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type int passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable currentFloor for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * @exception IllegalArgumentException
	    * Indicates that <code>currentFloor</code> isnt int the proper range
	    * 
	    **/
	public void setCurrentFloor(int currentFloor) throws IllegalArgumentException{
		if(currentFloor>0 && currentFloor<=this.getRequest().getMaxFloors())
			this.currentFloor = currentFloor;
		else{
			throw new IllegalArgumentException("\nCURRENT FLOOR IS ABSURD...TRY AGAIN WITH A NUMBER WITHIN THE RANGE: 1 TO "
					+this.request.getMaxFloors()+" \n");
		}
	}
	/**
	    * Allows the user to access the private data field
	    * of elevatorState, and gives them access to changing the value.
	    *
	    * @param int elevatorState
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type int passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable elevatorState for whatever user inputs.
	    *
	    * @returns void
	    * 
	    **/
	public void setElevatorState(int elevatorState) {
		this.elevatorState = elevatorState;
	}
	/**
	    * Allows the user to access the queue and allows them to insert a request into it
	    *
	    * @param Request request
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type Request passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Adds a request to the queue, and increments the size variable
	    *
	    * @returns void
	    * 
	    **/
	public void setRequest(Request request) {
		if(this.getElevatorState()==IDLE) this.request = null;
		else this.request = request;
	}
	
	//OTHER***************************************
	/**
	    * Overrides the toString from the Object Class
	    * creates a custom String with the specific information
	    * of the source floor and the destination that an elevator is going to.
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> Elevator Object
	    *
	    * <dt>Postconditions:
	    *    <dd>Returns custom made string 
	    *
	    * @returns Returns custom made string 
	    * 
	    **/
	public String toString(){
		if(this.getRequest()==(null))
			return "There is no request currently available\n";
		else
		return "souRCe: "+this.getRequest().getSourceFloor()+" destINAtion: "+this.getRequest().getDestinationFloor()+"\n";	
	}
	
}