package cse214hw3;
import java.util.LinkedList;
/**
* The <code>RequestQueue</code> class which extends LinkedList creates RequestQueue Objects.
* These RequestQueue objects are a queue which gets Request objects enqueue or dequeue.
* Information includes the variables size which is a type int but also has a queue that is
* is type LinkedList.
*  
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
public class RequestQueue extends LinkedList<Request>{
	//DATA****************************************
	private LinkedList<Request> queue = new LinkedList<>();
	private int size;
	
	//CONSTRUCTORS********************************
	/**
	    * The default constructor that takes no parameters.
	    * It automatically creates a queue that is empty and has a size of 0.
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the RequestQueue Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new RequestQueue object with its very own referrence
	    *
	    **/
	public RequestQueue(){
		queue=null;
		size=0;
	}
	
	//GETTERS*************************************
	/**
	    * Gets the request value that has been the longest time in the queue
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type RequestQueue 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read get the request value
	    *    that has been in the queue for the longest time. Also
	    *    decreases the size variable by 1.
	    *
	    * @returns Request request
	    * 
	    **/
	public Request dequeue(){
		size--;
		return this.removeFirst();
	}
	/**
	    *  Gets the request value that has been the longest time in the queue
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type RequestQueue 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read get the request value
	    *    that has been in the queue for the longest time.
	    *
	    * @returns Request request
	    * 
	    * @exception IllegalArgumentException
	    * Indicates that <code>queue</code> is empty and can't pop out any request
	    * 
	    **/
	public Request pop()throws IllegalArgumentException{
		if(isEmpty()==false)
			return dequeue();
		else
			throw new IllegalArgumentException("\nTHERE IS NOTHING IN THE QUEUE TO DEQUEUE: \n");		
	}
	/**
	    * Checks to see if the Queue is empty
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type RequestQueue
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to check if their queue is empty or not
	    *
	    * @returns boolean
	    * 
	    **/
	public  boolean isEmpty(){
		if(this.size()<=0){
			return true;
		}else{
			return false;
		}
	}
	/**
	    * Gets the value at variable size, this is the number
	    * of request in the queue
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type RequestQueue 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private size variable
	    *    and returns whatever int value is being held
	    *    by the size variable
	    *
	    * @returns int size
	    * 
	    **/
	public int size(){
		return this.size;
	}
	
	//SETTERS*************************************
	/**
	    * Allows the user to access the queue and llows them to insert a request into it
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
	public void enqueue(Request request){
		size++;
		this.addLast(request);
	}
	/**
	    * Allows the user to access the queue and llows them to insert a request into it
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
	public void push(Request request){
			this.enqueue(request);
	}
	
	//OTHER***************************************
	/*//HARDCODE******************************************vvvvvvvvvvvvvvvv
		public static void main(String[] args){
		Request x ;
		RequestQueue y = new RequestQueue();
	for(int i =0;i<6;i++){
		x = new Request(5);
		y.push(x);
	}
	System.out.println(y+"1");
	System.out.println();
	System.out.println();System.out.println();
	for(int i =0;i<6;i++){
		y.pop();
		System.out.println(y+" "+i);
		System.out.println();
		System.out.println();
	}
	}
		*///HARDCODE******************************************^^^^^^^^^^^^^^^^	
}