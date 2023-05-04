import First.Airplane;
import First.FlyingObject;
import Five.AgriculturalDrone;
import Five.MAV;
import Fourth.UAV;
import Second.Helicopter;
import Second.Quadcopter;
import Third.Multirotor;
/**
 * @author Amin Kadawala
 * Date: March 4, 2022
 * Student ID: 40200998
 * Assignment 2, Part 2
 * Main Class
 */
public class Main {
	
	/**
	 * @param flyingObj
	 * 
	 * Desc: finds the leaast and most expensive UAv available in the array that is passing through
	 */
	public static void findLeastAndMostExpensiveUAV(FlyingObject[] flyingObj) {
		double min = 0, max = 0;
		boolean bool = false;
		for (int i = 0; i < flyingObj.length; i++) {
			if (flyingObj[i] instanceof UAV) {
				bool = true;
				max = flyingObj[i].getPrice();
				min = flyingObj[i].getPrice();
			}
		}
		if (bool == false || flyingObj == null) {
			System.out.println("No UAVs found to display. :(");
		}
		else{
			int most = 0, least = 0;
			for (int i = 0; i < flyingObj.length; i++) {
				if (flyingObj[i] instanceof UAV) {
					if(flyingObj[i].getPrice() > max) {
						max = flyingObj[i].getPrice();
						most = i;
					}
					if(flyingObj[i].getPrice() < min) {
						min = flyingObj[i].getPrice();
						least = i;
					}
				}
			}
			System.out.println("Most Expensive: " + most + "th position of the array\nDescription: " +flyingObj[most].toString());
			System.out.println("\nLeast Expensive: " + least + "th position of the array\nDescription: " +flyingObj[least].toString() + "\n");
		}
	}

	/**
	 * @param args
	 * 
	 * Desc: main method, that displays everything we as our output
	 */
	public static void main(String[] args) {
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("			PRINTING 15 OBJECTS ARRAY ONE");
		System.out.println("----------------------------------------------------------------------------");

		FlyingObject[] flyingObj1 =new FlyingObject[15];
		flyingObj1[0] = new Airplane("Indigo", 56974.73, 800);
		flyingObj1[1] = new Helicopter("heli-234", 112000, 1175, 2, 2003, 15);
	    flyingObj1[2] = new Quadcopter ("quad-459", 36000, 1250, 4, 1995, 10, 1100);
	    flyingObj1[3] = new Multirotor ("multi-12", 45834.75, 1500, 7, 2015, 12, 7);
	    flyingObj1[4] = new UAV (500, 50500);
	    flyingObj1[5] = new AgriculturalDrone (670, 55999.124, "drone-35", 2);
	    flyingObj1[6] = new MAV (567, 75810.63, "model-L450", 73);
	    flyingObj1[7] = new Airplane ("Boeing", 250999.99, 600);
	    flyingObj1[8] = new Helicopter("Bell-Heli", 27000, 500, 5, 2018, 12);
	    flyingObj1[9] = new Quadcopter ("c-fly", 3000, 400, 2, 2020, 11, 600);
	    flyingObj1[10] = new Multirotor("multi-02", 112000, 578, 2, 2013, 15, 5);
	    flyingObj1[11] = new UAV(30, 1250);
	    flyingObj1[12] = new UAV(345, 25999);
	    flyingObj1[13] = new AgriculturalDrone(123, 6246, "b234", 1);
	    flyingObj1[14] = new MAV(7246, 16135, "13515", 724);
	    for(Object object: flyingObj1){
	    	System.out.println(object+"\n");
	    	}

	    System.out.println("----------------------------------------------------------------------------");
		System.out.println("               PRINTING 15 OBJECTS ARRAY TWO WITH NO UAVS");
		System.out.println("----------------------------------------------------------------------------");
		
		FlyingObject[] flyingObj2 =new FlyingObject[15];
		flyingObj2[0] = new Airplane("Indigo51", 91248.73, 1282);
		flyingObj2[1] = new Helicopter("heli-234", 112000, 1175, 2, 2003, 15);
	    flyingObj2[2] = new Quadcopter ("quad-459", 36000, 1250, 4, 1995, 10, 1100);
	    flyingObj2[3] = new Multirotor ("multi-12", 45834.75, 1500, 7, 2015, 12, 7);
	    flyingObj2[4] = new Airplane ("Airbus", 135985, 1234);
	    flyingObj2[5] = new Helicopter("Sikorsky", 19238, 346, 3, 2022, 7);
	    flyingObj2[6] = new Quadcopter ("Syma", 12945, 324, 6, 2010, 72, 314);
	    flyingObj2[7] = new Airplane ("Tupoloev", 12983.99, 981);
	    flyingObj2[8] = new Helicopter("Bell-Heli", 27000, 500, 5, 2018, 12);
	    flyingObj2[9] = new Quadcopter ("C-Fly", 10239, 400, 2, 2020, 11, 600);
	    flyingObj2[10] = new Multirotor("multi-02", 112000, 578, 2, 2013, 15, 5);
	    flyingObj2[11] = new Airplane ("Leonardo", 100000, 1341);
	    flyingObj2[12] = new Helicopter("M1000", 500000, 245, 16, 2022, 5);
	    flyingObj2[13] = new Quadcopter ("IFlight", 1000.50, 100, 4, 2007, 1, 314);
	    flyingObj2[14] = new Multirotor("FFV-100", 25420.99, 99, 2, 2009, 3, 4);
	    for(Object object: flyingObj2){
	    	System.out.println(object+"\n");
	    	}
	    
	    
	    System.out.println("----------------------------------------------------------------------------");
		System.out.println("                    PRINTING 5 CASES OF EQUALS METHOD");
		System.out.println("----------------------------------------------------------------------------");
		
		Helicopter helicopter3 = new Helicopter ("Helicopter", 36000, 1250, 4, 1998, 10);
		Helicopter helicopter4 = new Helicopter ("brand34", 25999, 1159, 5, 1998, 10);
		System.out.println(helicopter3.equals(helicopter4)
				? "Helicopter and brand34 are equal.\n" 
						: "Helicopter and brand34 are not equal.\n");
			
		Airplane airplane3 = new Airplane ("Air Canada", 150000, 975);
		Airplane airplane4 = new Airplane ("Air Canada", 150000, 975);
		System.out.println(airplane3.equals(airplane4)
				? "Both of these Air Canada airplanes are equal.\n"
						: "Both of these Air Canada airplanes are not equal.\n");
			
		MAV mav3 = new MAV (146, 200000, "model-3567", 10);
		Multirotor multirotor3 = new Multirotor ("Multirotor3", 75000, 875, 3, 2014, 16, 7);
		System.out.println(mav3.equals(multirotor3)
				? "MAV model-3567 and multirotor are equal.\n"
						: "MAV model-3657 and multirotor3 are not equal.\n");
	       
		Quadcopter quadcopter3 = new Quadcopter ("quadplane", 30000, 754, 8, 2018, 24, 987);
		Airplane airplane5 = new Airplane ("Air", 30000, 335);
		System.out.println(quadcopter3.equals(airplane5)
				? "quadplane and Air are equal.\n"
						: "quadplane and Air are not equal.\n");
			
		AgriculturalDrone AG3 = new AgriculturalDrone (670, 55999, "br762", 2);
		AgriculturalDrone AG4 = new AgriculturalDrone (670, 55999, "br762", 2);
		System.out.println(AG3.equals(AG4)
				? "Both of these Agricultural Drones branded br762 are equal.\n"
						: "Both of these Agricultural Drones branded br762 are not equal.\n");
		
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("		FINDING THE LEAST AND MOST EXPENSIVE UAV ARRAY ONE");
		System.out.println("----------------------------------------------------------------------------");
		findLeastAndMostExpensiveUAV(flyingObj1);
		
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("		FINDING THE LEAST AND MOST EXPENSIVE UAV ARRAY TWO");
		System.out.println("----------------------------------------------------------------------------");
		findLeastAndMostExpensiveUAV(flyingObj2);
		
		
		System.out.println("\n----------------------------------------------------------------------------");
		System.out.println("		PROGRAM HAS TERMINATED, SEE YOU AGAIN NEXT TIME. :)");
		System.out.println("----------------------------------------------------------------------------");
	}
	
	
}