package cse214hw1;
/**
* The <code>FullPlaylistExceptions</code> class is where all the 
* exceptions for the PLAYLIST application can be found
*     
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
public class FullPlaylistException extends Exception{

	/**
	    * FullPlaylistException() creates a constructor 
	    * with no parameters. This then calls its super
	    * from the exception class.
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> must be in the FullPlaylistException class
	    *
	    * <dt>Postconditions:
	    *    <dd>creates a FullPlaylistException object
	    *
	    **/
	public FullPlaylistException(){
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
	    *    <dd> must be in the FullPlaylistException class
	    *
	    * <dt>Postconditions:
	    *    <dd>creates a FullPlaylistException object
	    *
	    **/
	public FullPlaylistException(String x){
		super(x);
	}
	/**
	    * This method creates a String that tells the user why
	    * their input was wrong
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> must be in the FullPlaylistException class
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
