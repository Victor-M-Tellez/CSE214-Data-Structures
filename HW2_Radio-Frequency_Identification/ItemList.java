package cse214hw2;
/**
* The <code>ItemList</code> class creates ItemList Objects.
* These ItemList objects contain the information of the nodes and how they interact.
* Information includes hd,tl,pNode of the type ItemInfoNode and also a size variable type int.
*  
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
public class ItemList {

	//DATA****************************************
    private ItemInfoNode hd;//Item list head
    private ItemInfoNode tl;//Item list tail
    private ItemInfoNode pNode;// pointer to any node
    private int size;
			
	//CONSTRUCTORS********************************
    /**
	    * The default constructor that takes no parameters.
	    * It sets the tl, hd and pNode pointers to null and essentially
	    * starts a list on a clean slate.
	    *
	    * @param none
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must be in the ItemList Class
	    *
	    * <dt>Postconditions:
	    *    <dd>Creates a new ItemList object with its very own pointers that
	    *    allow it to link up with other objects do to the nodes it points to.
	    *
	    **/
    public ItemList(){
		this.hd=null;
		this.tl=null;
		this.size=0;
		this.pNode=null;
	}

	//GETTERS*************************************
    /**
	    * Gets the value at variable hd
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>An object of type ItemList must have been created
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private hd variable
	    *    and returns whatever ItemInfoNode value is being held
	    *    by the hd variable
	    *
	    * @returns ItemInfoNode hd
	    * 
	    **/
	public ItemInfoNode getHd(){
		return this.hd;
	}
	 /**
	    * Gets the value at variable tl
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>An object of type ItemList must have been created
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private tl variable
	    *    and returns whatever ItemInfoNode value is being held
	    *    by the tl variable
	    *
	    * @returns ItemInfoNode tl
	    * 
	    **/
	public ItemInfoNode getTl(){
		return this.tl;
	}
	 /**
	    * Gets the value at variable pNode
	    *
	    * @param None  
	    *  
	    * <dt>Preconditions:
	    *    <dd>An object of type ItemList must have been created
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows programmer to read the private pNode variable
	    *    and returns whatever ItemInfoNode value is being held
	    *    by the pNode variable
	    *
	    * @returns ItemInfoNode pNode
	    * 
	    **/
	public ItemInfoNode getPNode(){
		return this.pNode;
	}
	
	/**
	    * Prints all the items at a particular location in a nice chart.
	    *
	    * @param String location  
	    *  
	    * <dt>Preconditions:
	    *    <dd>It must get a valid location entry
	    *
	    * <dt>Postconditions:
	    *    <dd>Prints all the items at a particular location
	    *
	    * @returns void
	    * 
	    **/
	public void printByLocation(String location){	
       	pNode= this.hd;
       	for(int i=0;i<size;i++){
       		if(location.equals(pNode.getInfo().getCurrentLocation())){
       			System.out.println(pNode.getInfo().toString());
       		}
       		pNode = pNode.getNext();	
       	}
	}
	 
	
	/**
	    * Prints all the items at in a store in a nice chart.
	    *
	    * @param NONE  
	    *  
	    * <dt>Preconditions:
	    *    <dd>there msut be a list to print
	    *
	    * <dt>Postconditions:
	    *    <dd>Prints all the items at a store
	    *
	    * @returns void
	    * 
	    **/
	public void printAll(){
		pNode= this.hd;
       	for(int i=0;i<size;i++){
       			System.out.println(pNode.getInfo().toString());
       		pNode = pNode.getNext();	
       	}
	}
	 
	
	/**
	    * Prints all the items with a particular rfidTag Number in a nice chart.
	    *
	    * @param String rfidTag  
	    *  
	    * <dt>Preconditions:
	    *    <dd>It must get a valid rfidTag entry
	    *
	    * <dt>Postconditions:
	    *    <dd>Prints all the items with a particular rfidTag number
	    *
	    * @returns void
	    * 
	    **/
	public void printRfid( String rfidTag){
		pNode= this.hd;
		for(int i=0;i<size;i++){
       		if(rfidTag.equals(pNode.getInfo().getRfidTagNumber())){
       			System.out.println(pNode.getInfo().toString());
       		}
       		pNode = pNode.getNext();	
       	}
	}
	
	
	//SETTERS*************************************
	/**
	    * Allows the user to access the private data field
	    * of hd, and gives them access to changing the value.
	    *
	    * @param ItemInfoNode hd
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type ItemInfoNode passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows the user to assign the hd node to the specific ItemInfoNode object.
	    *
	    * @returns void
	    * 
	    **/
	public void setHd(ItemInfoNode hd){
		this.hd=hd;
	}
	/**
	    * Allows the user to access the private data field
	    * of tl, and gives them access to changing the value.
	    *
	    * @param ItemInfoNode tl
	    *    
	    * <dt>Preconditions:
	    *    <dd> Must get a type ItemInfoNode passed into the function.
	    *
	    * <dt>Postconditions:
	    *    <dd>Allows the user to assign the tl node to the specific ItemInfoNode object.
	    *
	    * @returns void
	    * 
	    **/
	public void setTl(ItemInfoNode tl){
		this.tl=tl;
	}
	/**
	    *Take every item that is currently in the store and on the 
	    *wrong shelf and places it back where it belongs (its original location). 
	    *Items that are "out" or currently in a cart are not affected by this command.
	    *Display a table for all out of place items moved in this fashion, including each 
	    *item's name, rfidTagNumber, current location(before the move), original location and price. 
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> There must be a ItemList Object
	    *
	    * <dt>Postconditions:
	    *    <dd> puts all objects that are on shelfs back into their original shelf.
	    *    Also it prints any object that has been moved back to its place.
	    *
	    * @returns void
	    * 
	    **/
	public void cleanStore(){
		pNode = this.hd;
        for(int i=0;i<size;i++){
        	if(pNode.getInfo().getCurrentLocation().charAt(0)=='s'||pNode.getInfo().getCurrentLocation().charAt(0)=='S'){
        		if(pNode.getInfo().getCurrentLocation().equals(pNode.getInfo().getOriginalLocation())){
        		}else{
        			System.out.println(pNode.getInfo().toString());
        		}
        		pNode.getInfo().setCurrentLocation(pNode.getInfo().getOriginalLocation());	
        	}
        	pNode = pNode.getNext();
        }
	}
	/**
	    *Removes all nodes in the list that have current location 
	    *listed as "out" and displays a list of all items that 
	    *have been removed in this fashion.
	    *
	    * @param None
	    *    
	    * <dt>Preconditions:
	    *    <dd> There must be a ItemList Object
	    *
	    * <dt>Postconditions:
	    *    <dd> removes all purchased items from the stores inventory.
	    *
	    * @returns void
	    * 
	    **/
	public void removeAllPurchased(){
		if (hd.getInfo().getCurrentLocation().equals("OUT")) {  
			System.out.println(hd.getInfo().toString());
			pNode= hd.getNext();
			pNode.setPrev(null);
			hd = pNode;
    		this.size--;
    		System.out.println("\nSUCCESSFULLY REMOVED ALL PURCHASED ITEMS ON THE LIST\n");
        }else if(tl.getInfo().getCurrentLocation().equals("OUT")){
        	System.out.println(tl.getInfo().toString());
        	pNode= tl.getPrev();
        	pNode.setNext(null);
        	tl= pNode;
        	this.size--;
            System.out.println("\nSUCCESSFULLY REMOVED ALL PURCHASED ITEMS ON THE LIST\n");
        }else{
        	pNode= hd;
        	int sizeHolder=size;
        	for(int i=1;i<sizeHolder;i++){
        		pNode = pNode.getNext();
        		if(pNode.getInfo().getCurrentLocation().equals("OUT")){
        			System.out.println(pNode.getInfo().toString());
        			pNode.getNext().setPrev(pNode.getPrev());
        			pNode.getPrev().setNext(pNode.getNext());
        			pNode = null;	
        			this.size--;
                    System.out.println("\nSUCCESSFULLY REMOVED ALL PURCHASED ITEMS ON THE LIST\n");
        		}	
        	}
        }
	}
	
	//VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV//VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVV
	/**
	    *Moves an item with a given rfidTagNumber from a source location 
	    *to a dest location. The return value indicates whether or not an 
	    *item of the given rfidTagNumber was found at the given source location.
	    *
	    * @param String rfidTag, String source, String dest
	    *    
	    * <dt>Preconditions:
	    *    <dd> There must be a ItemList Object and an item must already exist.
	    *
	    * <dt>Postconditions:
	    *    <dd> moves specific item to specific new location, returns true if it was successful
	    *
	    * @returns boolean
	    * 
	    * @exception IllegalArgumentException
	    * Indicates that either the destination was invalid 
	    * i.e. the destination wasnt a cart or shelf or out) or the source was invalid
	    * i.e. OUT
	    * 
	    **/
	public boolean moveItem(String rfidTag, String source, String dest){
		if(source.equals("OUT")){
			System.out.println("THE ITEM CANNOT BE MOVED FROM THE OUT LOCATION");
			return false;
		}else if(dest.charAt(0) =='s'||dest.charAt(0) =='S'||dest.charAt(0) =='c'||dest.charAt(0) =='C'){
				pNode= this.hd;
		       	for(int i=0;i<size;i++){
		       		if(rfidTag.equals(pNode.getInfo().getRfidTagNumber())){
		       			if(source.equals(pNode.getInfo().getCurrentLocation())){
		       				pNode.getInfo().setCurrentLocation(dest);
		       				return true;
		       			}
		       		}
		       		pNode = pNode.getNext();	
		       	}
				return false;
			}else{
				System.out.println("INVALID DESTINATION ENTRY");
				return false;
			}
		
	}
	
	
	/**
	    *Goes through a given cart and checks out each item (changes its location to 
	    *"out"). A neatly formatted list of the items checked out is to be printed 
	    *and it must be sorted in order of rfidTagNumber, although duplicate rfidTagNumber 
	    *entries may be printed in any order. The return value is the total cost for the 
	    *items that were in the cart. 
	    *
	    * @param String cartNumber
	    *    
	    * <dt>Preconditions:
	    *    <dd> There must be a ItemList Object
	    *
	    * <dt>Postconditions:
	    *    <dd> prints out receipt for shopping and places all objects in cart to location
	    *    "out".
	    *
	    * @returns double
	    * 
	    * @exception IllegalArgumentException
	    * Indicates that the cart number entry was invalid 
	    **/
	public double checkOut(String cartNumber){
		double total =0.0;
		boolean validCart=false;
			if(cartNumber.charAt(0) =='c'||cartNumber.charAt(0) =='C'){
				pNode= this.hd;
					
		       	for(int i=0;i<size;i++){
			       	if(cartNumber.equals(pNode.getInfo().getCurrentLocation())){
			       		pNode.getInfo().setCurrentLocation("OUT");
			       		System.out.println(pNode.getInfo().toString());
			       		total+=pNode.getInfo().getPrice();
			       		validCart=true;
			   		}
			       	
			       	
		    		pNode = pNode.getNext();	
		       	}
			}else{
				throw new IllegalArgumentException("ERROR IN CART ENTRY"
						+" THE CART NUMBER DOESNT EXIST\n\n");
			}
			if(validCart==false){
				throw new IllegalArgumentException("ERROR IN CART ENTRY"
						+" THE CART NUMBER DOESNT EXIST\n\n");
			}
			return total;
		
	}
	
	
	
	/**
	    *Inserts the info into the list in its correct position based on its rfidTagNumber.
	    *
	    * @param String name, String rfidTag, double price, String initPosition
	    *    
	    * <dt>Preconditions:
	    *    <dd> There must be a ItemList Object
	    *
	    * <dt>Postconditions:
	    *    <dd> Adds an info off an item to the ItemList.
	    *
	    * @returns void
	    * 
	    **/
	public void insertInfo(String name, String rfidTag, double price, String initPosition){
		ItemInfo newInfo = new ItemInfo(name, rfidTag, initPosition,price);
		ItemInfoNode newNode = new ItemInfoNode(newInfo);
		if (hd == null) {   // There is no itemnode, this is the first item on the list.
            hd = newNode;
            tl = newNode;
            pNode = newNode;
            size++;
            System.out.println("\nSUCCESSFULLY ADDED THE ITEM TO THE LIST\n");
        }else if(newNode.getInfo().getTagNum()<=hd.getInfo().getTagNum()){
        	pNode = hd;
        	newNode.setNext(pNode);
        	pNode.setPrev(newNode);
            hd = newNode;   
            size++;
            System.out.println("\nSUCCESSFULLY ADDED THE ITEM TO THE LIST###\n");
        }else if(newNode.getInfo().getTagNum()>=tl.getInfo().getTagNum()){
        	pNode = tl;
        	newNode.setPrev(pNode);
        	pNode.setNext(newNode);
            tl=newNode;
            newNode.setNext(null);
            size++;
            System.out.println("\nSUCCESSFULLY ADDED THE ITEM TO THE LIST@@\n");
        }else if(newNode.getInfo().getTagNum()> hd.getInfo().getTagNum()){
            pNode= this.hd;
            int exit= 0;
           	for(int i=0;i<size;i++){
           		if(newNode.getInfo().getTagNum()<= pNode.getInfo().getTagNum()&& exit==0){
           			newNode.setPrev(pNode.getPrev());
           			newNode.setNext(pNode);
           			newNode.getPrev().setNext(newNode);
           			pNode.setPrev(newNode);
           			System.out.println("\nSUCCESSFULLY ADDED THE ITEM TO THE LIST&&&&\n");
           			exit++;
           		}
           		if (pNode.getNext() == null)   // Cursor is referencing the tail.
	                tl = pNode;
           		else pNode = pNode.getNext();
           	}
           	size++;
        }else{
        	System.out.println("Why  ISNT THIS WORKING");
        }	
	}		
}

