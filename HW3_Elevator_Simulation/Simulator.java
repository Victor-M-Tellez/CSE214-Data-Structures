package cse214hw3;
/**
* The <code>Simulator</code> class has a static simulate function.
* 
*  
* @version 1.0
* @author Victor Tellez
*    e-mail: Victor.tellez@stonybrook.edu
*    Stony Brook ID:109547158
**/
public class Simulator {
	private static boolean debug = false; 
	private static int totalWait=0;
	private static int succesfulElevators=0;
	
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
	public static void simulate(double probability, int maxFloors, int totalElevators, int simulationLength){
		Request request1;
		RequestQueue queue1 = new RequestQueue();
		BooleanSource booleanSource1 = new BooleanSource (probability);
		Elevator elevator1 ;
		Elevator[] elevatorArray = new Elevator[totalElevators];
	
		for(int a=0; a<totalElevators;a++){
			elevator1 =new Elevator();
			elevatorArray[a]= elevator1;
			if(debug==true)System.out.println("Elevator state"+elevatorArray[a].getElevatorState());
			if(debug==true)System.out.println("Elevator"+a);
		}
		if(debug==true)System.out.println("All Elevators were set up");
		
																						//Simulation truly startsVVVVVVVV
		for(int time =0;time<simulationLength;time++){					//simulation time
			if(debug==true)System.out.println("\n\nTIME UNIT: "+(time+1));
																//decide to allow request to go into the queue or not
			if(booleanSource1.requestArrived()==true){
				request1 = new Request(maxFloors);//create new request
				if(debug==true)System.out.println("Maxfloors: "+request1.getMaxFloors());
				request1.setTimeEntered(time);//set time entered
				if(debug==true)System.out.println("is queue empty? "+queue1.isEmpty());
				queue1.push(request1);
				if(debug==true)System.out.println("Request "+time+" was created");
			}	
		
			
			//check status of all elevators
			for(int a=0;a<totalElevators;a++){
				if(elevatorArray[a].getElevatorState()==-1 && queue1.isEmpty()==false){//IDLE
					if(debug==true)System.out.println("C1A elevator is IDLE at floor: "+elevatorArray[a].getCurrentFloor());
					if(debug==true)System.out.println("C2A elevator mode is : "+elevatorArray[a].getElevatorState());
					elevatorArray[a].setElevatorState(0);
					if(debug==true)System.out.println("C3A elevator mode is : "+elevatorArray[a].getElevatorState());
					if(debug==true)System.out.println("C4A elevator current request (past) : "+elevatorArray[a].toString());
					elevatorArray[a].setRequest(queue1.pop());
					if(debug==true)System.out.println("C5A elevator current request (future) : "+elevatorArray[a].toString());
	//###########################################
				}
				
				
//WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW		
				if(elevatorArray[a].getElevatorState()==0){													//elevator is going to SOURCE
//###########################################################################################################################################################
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@		
					if(elevatorArray[a].getRequest().getSourceFloor() > elevatorArray[a].getCurrentFloor()){ //source >current
						if(debug==true)System.out.println("A1elevator is at floor(past): "+elevatorArray[a].getCurrentFloor());
						
						elevatorArray[a].setCurrentFloor(elevatorArray[a].getCurrentFloor() +1); //current++
						
						if(debug==true)System.out.println("A1elevator is going to floor(future): "+elevatorArray[a].getCurrentFloor());
						//UUUUUUUU
						if(elevatorArray[a].getRequest().getSourceFloor() == elevatorArray[a].getCurrentFloor()){//source = current
							elevatorArray[a].getRequest().setTimeArrived(time);
							if(debug==true)System.out.println("A3time Entered: "+elevatorArray[a].getRequest().getTimeEntered());
							if(debug==true)System.out.println("A3time Arrived: "+elevatorArray[a].getRequest().getTimeArrived());
								totalWait +=elevatorArray[a].getRequest().getTimeArrived()-elevatorArray[a].getRequest().getTimeEntered();
								succesfulElevators++;
								if(debug==true)System.out.println("A3total wait time: "+totalWait);
								elevatorArray[a].setElevatorState(1);
							}
						
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@					
						
					}else if(elevatorArray[a].getRequest().getSourceFloor() < elevatorArray[a].getCurrentFloor()){//source < current
						if(debug==true)System.out.println("A2elevator is at floor(past): "+elevatorArray[a].getCurrentFloor());
						
						elevatorArray[a].setCurrentFloor(elevatorArray[a].getCurrentFloor() -1); //current--
						
						if(debug==true)System.out.println("A2elevator is going to floor(future): "+elevatorArray[a].getCurrentFloor());
						//UUUUUUU
						if(elevatorArray[a].getRequest().getSourceFloor() == elevatorArray[a].getCurrentFloor()){//source = current
							elevatorArray[a].getRequest().setTimeArrived(time);
							if(debug==true)System.out.println("A3time Entered: "+elevatorArray[a].getRequest().getTimeEntered());
							if(debug==true)System.out.println("A3time Arrived: "+elevatorArray[a].getRequest().getTimeArrived());
								totalWait +=elevatorArray[a].getRequest().getTimeArrived()-elevatorArray[a].getRequest().getTimeEntered();
								succesfulElevators++;
								if(debug==true)System.out.println("A3total wait time: "+totalWait);
								elevatorArray[a].setElevatorState(1);
							}	

	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@				
					}else{
						
						//System.out.println("1234");
			//&&&&&&&&&&&&&&&&&&&
						if(elevatorArray[a].getRequest().getSourceFloor() == elevatorArray[a].getCurrentFloor()){//source = current
							elevatorArray[a].getRequest().setTimeArrived(time);
							if(debug==true)System.out.println("A3time Entered: "+elevatorArray[a].getRequest().getTimeEntered());
							if(debug==true)System.out.println("A3time Arrived: "+elevatorArray[a].getRequest().getTimeArrived());
							totalWait +=elevatorArray[a].getRequest().getTimeArrived()-elevatorArray[a].getRequest().getTimeEntered();
							succesfulElevators++;
							if(debug==true)System.out.println("A3total wait time: "+totalWait);
							elevatorArray[a].setElevatorState(1);
						}else{
							System.out.println("ERROR IN SIMULATOR PART A DEFAULT CLAUSE");
						}	
			//&&&&&&&&&&&&&&&&&&&		
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@					
					}
//###########################################################################################################################################################
				}else if(elevatorArray[a].getElevatorState()==1){//to DESTINATION
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
					if(elevatorArray[a].getRequest().getDestinationFloor() > elevatorArray[a].getCurrentFloor()){ //destination>current
						if(debug==true)System.out.println("B1elevator is at floor(past): "+elevatorArray[a].getCurrentFloor());
						elevatorArray[a].setCurrentFloor(elevatorArray[a].getCurrentFloor() +1); //current floor++
						if(debug==true)System.out.println("B1elevator is going to floor(future): "+elevatorArray[a].getCurrentFloor());
						if(elevatorArray[a].getRequest().getDestinationFloor() == elevatorArray[a].getCurrentFloor()){//destination = current
							elevatorArray[a].setElevatorState(-1);	
		//&&&&&&&&&&&&&&&&&&&
						}
						
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@					
					}else if(elevatorArray[a].getRequest().getDestinationFloor() < elevatorArray[a].getCurrentFloor()){//destination < current
						if(debug==true)System.out.println("B2elevator is at floor(past): "+elevatorArray[a].getCurrentFloor());
						elevatorArray[a].setCurrentFloor(elevatorArray[a].getCurrentFloor() -1); //current floor--
						if(debug==true)System.out.println("B2elevator is going to floor(future): "+elevatorArray[a].getCurrentFloor());
						if(elevatorArray[a].getRequest().getDestinationFloor() == elevatorArray[a].getCurrentFloor()){//destination = current
							elevatorArray[a].setElevatorState(-1);	
		//&&&&&&&&&&&&&&&&&&&
						}
						
	//@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@				
					}else{
		//&&&&&&&&&&&&&&&&&&&
						if(elevatorArray[a].getRequest().getDestinationFloor() == elevatorArray[a].getCurrentFloor()){//destination = current
							elevatorArray[a].setElevatorState(-1);	
		//&&&&&&&&&&&&&&&&&&&
						}else{
							System.out.println("ERROR IN SIMULATOR PART B DEFAULT CLAUSE");
							}	
		//&&&&&&&&&&&&&&&&&&&
					}
							
					
//###########################################################################################################################################################	

				}else if(elevatorArray[a].getElevatorState()==-1 && queue1.isEmpty()==false){//IDLE
						if(debug==true)System.out.println("C1 elevator is IDLE at floor: "+elevatorArray[a].getCurrentFloor());
						if(debug==true)System.out.println("C2 elevator mode is : "+elevatorArray[a].getElevatorState());
						elevatorArray[a].setElevatorState(0);
						if(debug==true)System.out.println("C3 elevator mode is : "+elevatorArray[a].getElevatorState());
						if(debug==true)System.out.println("C4 elevator current request (past) : "+elevatorArray[a].toString());
						elevatorArray[a].setRequest(queue1.pop());
						if(debug==true)System.out.println("C5 elevator current request (future) : "+elevatorArray[a].toString());
		//###########################################
				}else{
					//System.out.println("ELEVATOR IS IDLE AND QUEUE IS EMPTY SO NO TASK IS PERFORMED");
				}
//###################################################################################################################################################
			}
	//WWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWWW		
				
			
				
		}	
		//Simulation ends^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
		
		//System.out.println("END OF PROGRAM");
		//System.out.println("END OF PROGRAM");
		//System.out.println("END OF PROGRAM");
		//System.out.println(queue1);
		
		
		System.out.println("Total Wait Time:"+totalWait);
		System.out.println("Total Requests:"+succesfulElevators);
		System.out.printf("Average Wait Time: %.2f \n",(double)totalWait/succesfulElevators);
	}
	

	
	public static void main(String[] args){
	//HARDCODE******************************************vvvvvvvvvvvvvvvv
	
	Simulator.simulate(1, 6, 1, 12);
		
	}
	
	
}

