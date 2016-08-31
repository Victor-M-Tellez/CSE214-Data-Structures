package cse214hw3;

public class ElevatorException extends Exception{

	/**
	    * ElevatorException() creates a constructor 
	    * with no parameters. This then calls its super
	    * from the exception class.
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> must be in the ElevatorException class
	    *
	    * <dt>Postconditions:
	    *    <dd>creates a ElevatorException object
	    *
	    **/
	public ElevatorException(){
		super();
	}
	/**
	    * Creates a constructor  with a string parameter.
	    * This then calls its super from the exception class,
	    * and passes it the String which explains why the user input
	    * is wrong.
	    *
	    * @param String
	    *    
	    * <dt>Preconditions:
	    *    <dd> must be in the ElevatorException class
	    *
	    * <dt>Postconditions:
	    *    <dd>creates a ElevatorException object
	    *
	    **/
	public ElevatorException(String x){
		super(x);
	}
	/**
	    * This method creates a String that tells the user why
	    * their input was wrong
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> must be in the ElevatorException class
	    *
	    * <dt>Postconditions:
	    *    <dd>returns a string that explains why the user input is wrong
	    *    
	    * @returns String
	    *
	    **/
	public String getMessage(){
		return super.getMessage();
	}
	
	
}