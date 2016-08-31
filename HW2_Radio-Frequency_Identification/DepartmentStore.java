package cse214hw2;
import java.util.Scanner;
/**
* The <code>DepartmentStore</code> class creates DepartmentStore Objects.
* These DepartmentStore objects contain the information of all the items that are in the store.
* Information include name, rfidTag, initPosition, source, dest of the type String.
*  
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
public class DepartmentStore {
	static Scanner in = new Scanner(System.in);
	  /**
	    * Creates a program that keeps track of the items a store has.
	    *
	    * @param String[] args 
	    *  
	    * <dt>Preconditions:
	    *    <dd> None
	    *
	    * <dt>Postconditions:
	    *    <dd>Displays a menu for the user to interact with
	    *    the classes ItemInfo, ItemInfoNode, ItemList, and StoreException.
	    *    User can add items to a List of the style linked list, user can
	    *    also remove them, print all Items,
	    *    get Items based on a particular location, get Items based on a particular rfidtag number,
	    *    check out items in ther cart, clean the store, and update store items.
	    *
	    * @returns void
	    * 
	    **/	
	public static void main(String[] args){
		ItemList x=new ItemList();
		int exit=0;
		String name;
		String rfidTag;
		String initPosition;
		String source;
		String dest;
		String N,R,O,C,L,P;
		N="Item Name";
		R="RFID";
		O="Original";
		C="Current";
		L="Location";
		P="Price";
		double price;
		/*
		//HARDCODE******************************************VVVVVVVVVVVVVVVVVVVVVVVVV
		x.insertInfo("Dress Shirt", 	"00A5532FF",	30.00, 	"s12345");
		x.insertInfo("Red Towel", 		"0F999FABC",	18.00, 	"s00347");
		x.insertInfo("Silverware Set", 	"A1111DDFF",	50.00, 	"s90210");
		x.insertInfo("Dress Shirt", 	"00A5532FF",	30.00,	"s12345");
		x.insertInfo("Blue Towel", 		"0F999FCBA", 	18.00,	"s00347");
		x.insertInfo("Dress Shirt", 	"00A5532FF", 	30.00,	"s12345");
		x.moveItem("00A5532FF", "s12345", "c109");
		x.moveItem("A1111DDFF", "s90210", "s54321");
		x.moveItem("0F999FCBA", "s00347", "s54321");
		
		//HARDCODE******************************************^^^^^^^^^^^^^^^^^^^^^^^^^^^
		 * 
		 */
		while(exit==0){
			System.out.println("\n"
					+"I (Insert an item into the list)"+"\n"
					+"M (Move an item in the store)\"out\" wont be considered a valid entry for the source or destination" +"\n"
					+"L (List by location)"+"\n"
					+"P (Print all items in store)"+"\n"
					+"O (Checkout)"+"\n"
					+"C (Clean store)does not affect items in carts or items that are \"out\"."+"\n"
					+"U (Update inventory system)Items that are in carts or on shelves are not affected by this command"+"\n"
					+"R (Print by RFID tag number) (Optional)"+"\n"
					+"Q (Exit the program.)"+"\n");
			System.out.printf("\nSelect a menu option: ");
			
			String menu = in.nextLine();
			switch(menu){
				case "p" :
				case "P" :
					System.out.printf("\t\t\t\t%s\t%s\n",O,C);
					System.out.printf("%s\t%s\t\t%s\t%s\t%s\n",N,R,L,L,P);
					System.out.println("-----------------------------------------------------------------------");
					x.printAll();
					break; 
				case "u" :
				case "U" :
					System.out.println("The following item(s) have removed from the system: ");
					System.out.printf("\t\t\t\t%s\t%s\n",O,C);
					System.out.printf("%s\t%s\t\t%s\t%s\t%s\n",N,R,L,L,P);
					System.out.println("-----------------------------------------------------------------------");
					x.removeAllPurchased();
					break;
				case "c" :
				case "C" :
					System.out.println("The following item(s) have been moved back to their original locations: ");
					System.out.printf("\t\t\t\t%s\t%s\n",O,C);
					System.out.printf("%s\t%s\t\t%s\t%s\t%s\n",N,R,L,L,P);
					System.out.println("-----------------------------------------------------------------------");
					x.cleanStore();
					break;
				case "q" :
				case "Q" :
					exit++;
					System.out.printf("APPLICATION ENDED");
					break;
					
					
					
					
					
					
					
					
					
				case "m" :
				case "M" :
					try{
							System.out.println("Enter the RFID: ");
							rfidTag=in.next();
							rfidTag+=in.nextLine();
							
							System.out.println("Enter the current location: ");
							source=in.nextLine();
							System.out.println("Enter the desired location: ");
							dest=in.nextLine();
							x.moveItem(rfidTag, source, dest); 
					}catch(Exception e){
						System.out.printf(e.getMessage());
					}
					break;
					
					
				case "l" :
				case "L" :
					try{
						System.out.printf("Enter the location: ");
						source=in.next();
						source+=in.nextLine();
						System.out.printf("\t\t\t\t%s\t%s\n",O,C);
						System.out.printf("%s\t%s\t\t%s\t%s\t%s\n",N,R,L,L,P);
						System.out.println("-----------------------------------------------------------------------");
						x.printByLocation(source);
					}catch(Exception e){
						System.out.printf(e.getMessage());
					}
					break; 
					
					
					
					
					
				case "o" :	
				case "O" :
					try{	
							System.out.println("Enter the cart number: ");
							source=in.nextLine();
							System.out.printf("\t\t\t\t%s\t%s\n",O,C);
							System.out.printf("%s\t%s\t\t%s\t%s\t%s\n",N,R,L,L,P);
							System.out.println("-----------------------------------------------------------------------");
							System.out.println("The total cost for all merchandise in cart "+source
							+ " was $" + x.checkOut(source));
							
					}catch(Exception e){
						System.out.printf(e.getMessage());
					}
					break; 
					
			
				
				case "r" :
				case "R" :
					try{
							System.out.println("Enter the rfid Tag Number of the items you want to see: ");
							rfidTag=in.nextLine();
							System.out.printf("\t\t\t\t%s\t%s\n",O,C);
							System.out.printf("%s\t%s\t\t%s\t%s\t%s\n",N,R,L,L,P);
							System.out.println("-----------------------------------------------------------------------");
							x.printRfid(rfidTag);
					}catch(Exception e){
						System.out.printf(e.getMessage());
					}
					break;
				
					
				case "i" :
				case "I" :
					try{
							System.out.println("Enter the name: ");
							name= in.next();
							name+=in.nextLine();
							System.out.println("Enter the RFID: ");
							rfidTag=in.nextLine();
							System.out.println("Enter the original location: ");
							initPosition=in.nextLine();
							System.out.println("Enter the price: ");
							price=in.nextDouble();
							in.nextLine();
							x.insertInfo(name, rfidTag, price, initPosition);
					}catch(Exception e){
						System.out.printf(e.getMessage());
					}
					break;
					
				default : 
					System.out.printf("You chose an INVALID option try again\n");
			}
		}
	}

}


