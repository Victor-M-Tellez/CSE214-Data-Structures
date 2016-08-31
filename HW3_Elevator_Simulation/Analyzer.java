package cse214hw3;
import java.util.Scanner;
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
public class Analyzer {
/*
 * Analyzer containing a main method which prompts the user,
 *  on separate lines, for each of the 4 parameters required 
 *  for the simulate method of the Simulator class. Make sure 
 *  to check that each of the values for these parameters are 
 *  within the valid range and then run the actual simulation.
 *  
The probability of a request being introduced per time unit (a double between 0.0 and 1.0, inclusive)
The number of floors in the building (an int greater than 1)
The number of elevators in the building (an int greater than 0)
The length of the simulation in time units (an int greater than 0)
 */

	static Scanner in = new Scanner(System.in);
	  /**
	    * Analyzer containing a main method which prompts the user,
	    *  on separate lines, for each of the 4 parameters required 
	    *  for the simulate method of the Simulator class. Make sure 
	    *  to check that each of the values for these parameters are 
	    *  within the valid range and then run the actual simulation.
	    *  
	    * @param String[] args 
	    *  
	    * <dt>Preconditions:
	    *    <dd> None
	    *
	    * <dt>Postconditions:
	    *    <dd>ask user to input probability, maxFloors, totalElevators, and simulationLength.
	    *
	    * @returns void
	    * 
	    * @exception IllegalArgumentException
	    * Indicates that <code>probability</code> isnt a double between 0.0 and 1.0, inclusive
	    * Indicates that <code>maxFloors</code> isnt an int greater than 1
	    * Indicates that <code>totalElevators</code> isnt an int greater than 0)
	    * Indicates that <code>simulationLength</code> isnt an int greater than 0
	    * 
	    **/
	public static void main(String[] args) throws IllegalArgumentException{
	//HARDCODE******************************************vvvvvvvvvvvvvvvv
		double probability;
		int maxFloors;
		int totalElevators;
		int simulationLength;
		try{
			System.out.println("Please enter the probability of arrival for Requests: ");
			probability =in.nextDouble();
			if(probability>=0 && probability<=1){
				System.out.println("Please enter the number of floors: ");
				maxFloors=in.nextInt();
				if(maxFloors>1){
					System.out.println("Please enter the number of elevators: ");
					totalElevators=in.nextInt();
					if(totalElevators>0){
						System.out.println("Please enter the length of the simulation (in time units): ");
						simulationLength=in.nextInt();
						if(simulationLength>0){
							System.out.println("The results are as follow: ");
							Simulator.simulate(probability, maxFloors, totalElevators, simulationLength);
						}else{
							throw new IllegalArgumentException("\nSIMULATION LENGTH IS ABSURD...TRY AGAIN WITH A NUMBER THAT IS IN GREATER THAN 0\n");
						}
					}else{
						throw new IllegalArgumentException("\nNUMBBER OF ELEVATORS IS ABSURD...TRY AGAIN WITH A NUMBER THAT IS IN GREATER THAN 0\n");
					}
				}else{
					throw new IllegalArgumentException("\nMAX FLOORS IS ABSURD...TRY AGAIN WITH A NUMBER THAT IS IN GREATER THAN 1\n");
				}
			}else{
				throw new IllegalArgumentException("\nPROBABILITY IS ABSURD...TRY AGAIN WITH A NUMBER THAT IS IN PROPER RANGE\n");
			}
		}catch(Exception e){
			System.out.printf(e.getMessage());
		}
	}
	
	
}

