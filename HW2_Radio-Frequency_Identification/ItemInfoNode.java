package cse214hw2;
/**
* The <code>ItemInfoNode</code> class creates ItemInfoNode Objects.
* These ItemInfoNode objects contain the information of the nodes of a particular item.
* Information includes next,prev,info of the type ItemInfoNode.
*  
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
public class ItemInfoNode {

	//DATA****************************************
	  private ItemInfoNode next;
	  private ItemInfoNode prev;
	  private ItemInfo info;
	  
	//CONSTRUCTORS********************************
	  /**
	    * The default constructor that takes no parameters.
	    * It sets the ItemInfoNode object to all null.
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the ItemInfoNode Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new ItemInfoNode object with its very own reference
	    *
	    **/
	  public ItemInfoNode(){
		this.next=null;
		this.prev=null;
		this.info=null;
	}
	  /**
	    * The constructor that takes parameter info which is a ItemInfo object.
	    * It uses this info an creates a new node with the info variable
	    * holding the information about the ItemInfo object
	    *
	    * @param ItemInfo info
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the SongRecord Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new SongRecord object with its very own referrence
	    *
	    **/
	public ItemInfoNode(ItemInfo info){
		this.next=null;
		this.prev=null;
		this.info=info;
	}
		
	//GETTERS*************************************
	/**
	    * Gets the value at variable info
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>An object of type ItemInfoNode must have been created
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private info variable
	    *    and returns whatever ItemInfoNode value is being held
	    *    by the info variable
	    *
	    * @returns ItemInfoNode info
	    * 
	    **/
	public ItemInfo getInfo(){
		return this.info;
	}
	/**
	    * Gets the value at variable next
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>An object of type ItemInfoNode must have been created
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private next variable
	    *    and returns whatever ItemInfoNode value is being held
	    *    by the next variable
	    *
	    * @returns ItemInfoNode next 
	    * 
	    **/
	public ItemInfoNode getNext(){
		return this.next;
	}
	/**
	    * Gets the value at variable prev
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>An object of type ItemInfoNode must have been created
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private prev variable
	    *    and returns whatever ItemInfoNode value is being held
	    *    by the prev variable
	    *
	    * @returns ItemInfoNode prev
	    * 
	    **/
	public ItemInfoNode getPrev(){
		return this.prev;	
	}
		
	//SETTERS*************************************
	/**
	    * Allows the user to access the private data field
	    * of info, and gives them access to changing the value.
	    *
	    * @param ItemInfo info 
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type ItemInfo passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>allows the user to assign a node to the specific ItemInfo object.
	    *
	    * @returns void
	    * 
	    **/
	public void setInfo(ItemInfo info){
		this.info=info;
	}
	/**
	    * Allows the user to access the private data field
	    * of next, and gives them access to changing the value.
	    *
	    * @param ItemInfoNode node
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type ItemInfoNode passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows the user to assign the next node to the specific ItemInfo object.
	    *
	    * @returns void
	    * 
	    **/
	public void setNext(ItemInfoNode node){
		this.next=node;
	}
	/**
	    * Allows the user to access the private data field
	    * of prev, and gives them access to changing the value.
	    *
	    * @param ItemInfoNode node
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type ItemInfoNode passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows the user to assign the previous node to the specific ItemInfo object.
	    *
	    * @returns void
	    * 
	    **/
	public void setPrev(ItemInfoNode node){
		this.prev=node;
	}
		
}

