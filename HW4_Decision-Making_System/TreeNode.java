/**
* The <code>TreeNode</code> class creates TreeNode Objects.
* These TreeNode objects contain the information of a particular node in the tree.
* Information includes the String variables label, message,prompt; the TreeNode
* variables left, middle, right, parent; int  nextChild; boolean isLeft, isRight, isMiddle
* 
*  
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
package cse214hw4;
public class TreeNode {

	//DATA****************************************
	private String label;//The "name" of this TreeNode.
	private String message;// a question		==>> if this is a leaf then the answer is held here
	// when starting at the root of the tree, there will be a question (message) to ask, 
	//and as possible answers the root will traverse one level downwards each child TreeNode to display prompt
	private String prompt;// a possible answer
	private TreeNode left;
	private TreeNode middle;
	private TreeNode right;
	private TreeNode parent;
	private int nextChild;
	private boolean isLeft;
	private boolean isRight;
	private boolean isMiddle;

	//CONSTRUCTORS********************************
	/**
	    * The default constructor that takes no parameters.
	    * It is coded so that we can error check and ensure that it isn't used
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the TreeNode Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new TreeNode object with its very own referrence
	    *
	    **/
	public TreeNode(){//default constructor
		label=null;
		message=null;
		prompt=null;
		left=null;
		middle=null;
		right=null;
		nextChild=0;
		isLeft=false;
		isRight=false;
		isMiddle=false;
		parent =null;
	}
	/**
	    * This is a constructor that takes String label, String message, String prompt data parameter.
	    *This is used to set the label of a node, the message and the prompt
	    *
	    * @param String label, String message, String prompt
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the TreeNode Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new TreeNode object with its very own referrence
	    *
	    **/
	public TreeNode(String label, String message, String prompt){//constructor for root
		this.setLabel(label);
		this.setMessage(message);
		this.setPrompt(prompt);
		
		left=null;
		middle=null;
		right=null;
		nextChild=0;
		isLeft=false;
		isRight=false;
		isMiddle=false;
		parent =null;
	}
	
	//GETTERS*************************************
	/**
	    * Gets the modulus value of next child so it loops around the 
	    * nodes when it reaches the max of 3
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type TreeNode 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the modulus value of 
	    *    next child so it loops around the 
	    * nodes when it reaches the max of 3
	    *
	    * @returns int nextChild%3
	    * 
	    **/
	public int getNextChild() {
		return nextChild%3;
	}
	/**
	    * Gets the value of TreeNode left 
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type TreeNode 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the value of left 
	    *
	    * @returns TreeNode left
	    * 
	    **/
	public TreeNode getLeft() {
		return left;
	}
	/**
	    * Gets the value of TreeNode middle 
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type TreeNode 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the value of middle 
	    *
	    * @returns TreeNode middle
	    * 
	    **/
	public TreeNode getMiddle() {
		return middle;
	}
	/**
	    * Gets the value of TreeNode right 
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type TreeNode 
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the value of right
	    *
	    * @returns TreeNode right
	    * 
	    **/
	public TreeNode getRight() {
		return right;
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
	    *    <dd>Allows programmer to get the value of parent
	    *
	    * @returns TreeNode parent
	    * 
	    **/
	public TreeNode getParent() {
		return parent;
	}
	/**
	    * Gets the value of String label
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type String
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the value of label
	    *
	    * @returns String label
	    * 
	    **/
	public String getLabel() {
		return label;
	}
	/**
	    * Gets the value of String message
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type String
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the value of message
	    *
	    * @returns String message
	    * 
	    **/
	public String getMessage() {
		return message;
	}
	/**
	    * Gets the value of String prompt
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type String
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the value of prompt
	    *
	    * @returns String prompt
	    * 
	    **/
	public String getPrompt() {
		return prompt;
	}
	/**
	    * Gets the value of boolean isLeft
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type boolean
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the value of isLeft
	    *
	    * @returns boolean isLeft
	    * 
	    **/
	public boolean getIsLeft() {
		return isLeft;
	}
	/**
	    * Gets the value of boolean isRight
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type boolean
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the value of isRight
	    *
	    * @returns boolean isRight
	    * 
	    **/
	public boolean getIsRight() {
		return isRight;
	}
	/**
	    * Gets the value of boolean isMiddle
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>The Object must be of type boolean
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to get the value of isMiddle
	    *
	    * @returns boolean isMiddle
	    * 
	    **/
	public boolean getIsMiddle() {
		return isMiddle;
	}
	
	//SETTERS*************************************
	/**
	    * Allows the user to access the private data field
	    * of nextChild, and gives them access to changing the value.
	    *
	    * @param int nextChild
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type int passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable nextChild for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setNextChild(int nextChild){
		this.nextChild=nextChild;
	}
	/**
	    * Allows the user to access the private data field
	    * of left, and gives them access to changing the value.
	    *
	    * @param TreeNode left
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type TreeNode passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable left for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	/**
	    * Allows the user to access the private data field
	    * of middle, and gives them access to changing the value.
	    *
	    * @param TreeNode middle
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type TreeNode passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable middle for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setMiddle(TreeNode middle) {
		this.middle = middle;
	}
	/**
	    * Allows the user to access the private data field
	    * of right, and gives them access to changing the value.
	    *
	    * @param TreeNode right
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type TreeNode passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable right for whatever user inputs.
	    *
	    * @returns void
	    * 
	    * 
	    **/
	public void setRight(TreeNode right) {
		this.right = right;
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
	    * of label, and gives them access to changing the value.
	    *
	    * @param String label
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable label for whatever user inputs.
	    *
	    * @returns void
	    * 
	    **/
	public void setLabel(String label) {
		this.label = label;
	}
	/**
	    * Allows the user to access the private data field
	    * of message, and gives them access to changing the value.
	    *
	    * @param String message
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable message for whatever user inputs.
	    *
	    * @returns void
	    * 
	    **/
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	    * Allows the user to access the private data field
	    * of prompt, and gives them access to changing the value.
	    *
	    * @param String prompt
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type String passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable prompt for whatever user inputs.
	    *
	    * @returns void
	    * 
	    **/
	public void setPrompt(String prompt) {
		this.prompt = prompt;
	}
	/**
	    * Allows the user to access the private data field
	    * of isLeft, and gives them access to changing the value.
	    *
	    * @param boolean isLeft
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type boolean passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable isLeft for whatever user inputs.
	    *
	    * @returns void
	    * 
	    **/
	public void setIsLeft(boolean isLeft) {
		this.isLeft = isLeft;
	}
	/**
	    * Allows the user to access the private data field
	    * of isRight, and gives them access to changing the value.
	    *
	    * @param boolean isRight
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type boolean passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable isRight for whatever user inputs.
	    *
	    * @returns void
	    * 
	    **/
	public void setIsRight(boolean isRight) {
		this.isRight = isRight;
	}
	/**
	    * Allows the user to access the private data field
	    * of isMiddle, and gives them access to changing the value.
	    *
	    * @param boolean isMiddle
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type boolean passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Changes the value at variable isMiddle for whatever user inputs.
	    *
	    * @returns void
	    * 
	    **/
	public void setIsMiddle(boolean isMiddle) {
		this.isMiddle = isMiddle;
	}
	
	//OVERRIDE************************************
	/**
	    * Overrides the toString from the Object Class
	    * creates a custom String that has gives Node information in a since organized fashion
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
	@Override
	public String toString(){
		return "Label: "+this.getLabel()+"\nPrompt: "+ this.getPrompt()+"\nMessage: "+this.getMessage();
		
	}

	//OTHER***************************************
	/**
	    * Allows the user to check if a node is a leaf or not
	    *
	    * @param boolean isMiddle
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in TreeNode object
	    *
	    * <dt>Postconditions:
	    *    <dd>None
	    *
	    * @returns boolean
	    * 
	    **/
	public boolean isLeaf(){
		if(getMiddle()==null && getLeft()==null && getRight()== null){
			return true;
		}else return false;
	}
}