package cse214hw3;
/**
* The <code>BooleanSource</code> class creates BooleanSource Objects.
* These BooleanSource objects contain a randomly generated chance of
* giving back a true value based on the probability passed to it.
* Information includes the variables probability which is a double type.
*  
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
public class BooleanSource {
	//DATA****************************************
	private double probability;

	//CONSTRUCTORS********************************
	/**
	    * The default constructor that takes no parameters.
	    * It is coded for so that we can error check and ensure that it isnt used
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the BooleanSource  Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new BooleanSource object with its very own reference
	    *
	    **/
	public BooleanSource (){
		System.out.printf("ERROR YOU WERENT SUPPOSE TO USE THIS \"BooleanSource\" NO PARAMETER CONSTRUCTOR\n");
	}
	/**
	    * This is a constructor that takes data parameter.
	    * It gets a probaility parameter of type double passed in so 
	    * that it can accurately return a statistical accurate ratio of
	    * TRUE values, the ratio is similar to the probability passed to it.
	    *
	    * @param double probability
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the BooleanSource Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new BooleanSource object with its very own referrence
	    *
	    **/
	public BooleanSource (double probability){
		setProbability(probability);
	}
	
	//GETTERS*************************************
	/**
	    * Gets the value at variable probability
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type BooleanSource 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private probability variable
	    *    and returns whatever double value is being held
	    *    by the double variable
	    *
	    * @returns double probability
	    * 
	    **/
	public double getProbability() {
		return probability;
	}
	
	//SETTERS*************************************
	/**
	    * Allows the user to access the private data field
	    * of probability, and gives them access to changing the value.
	    *
	    * @param double probability
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type double passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable probability for whatever user inputs.
	    *
	    * @returns void
	    * 
	    **/
	public void setProbability(double probability) {
		this.probability = probability;
	}
	
	//OTHER***************************************
	/**
	    * Returns true a percentage of the time equal to
	    * probability (and otherwise it returns false).
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must have an object type BooleanSource
	    *
	    * <dt>Postconditions:
	    *    <dd>Returns true a percentage of the time equal to
	    * probability (and otherwise it returns false).
	    *
	    * @returns boolean
	    * 
	    **/
	public boolean requestArrived(){
		if(Math.random()<this.probability){
			return true;
		}else
			return false;
	}
	
	/*//HARDCODE******************************************vvvvvvvvvvvvvvvv	
	public static void main(String[] args){
		BooleanSource x= new BooleanSource (.19);
		int y = 0;
		for(int i =0;i<1000;i++){
			if(x.requestArrived()==true)
				y++;
		}
		System.out.println(y);
	}
	*///HARDCODE******************************************^^^^^^^^^^^^^^^^^
}