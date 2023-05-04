import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 * @author Amin Kadawala - 40200998
 * @author Maxime Arseneau - 40207886
 * 
 * Assignment 4, Part 2 - COMP249
 * 
 * date: April 15, 2022
 *
 */
public  class CellListUtilization {

  /**
 * @param args
 * 
 * Main/driver method where all the methods are tested and checked if they are working properly
 */
public static void main(String[] args) {
	  
	  //Welcome banner
	  System.out.println("-------------------------------------------------------"); 
	  System.out.println("\tWelcome to Cell Phones Records Program!");
	  System.out.println("-------------------------------------------------------"); 
	  
	  System.out.println("\nCreated two empty CellList lists, now testing the program...\n");
	  
	  CellList l1 = new CellList();
	  CellList l2 = new CellList();
	  
	  long searchSerial;
	  long serialNum;
	  String brand;
	  double price;
	  int year;
	  
	  CellPhone cp;
	  
	  Scanner sc = null;
	  Scanner scanner = new Scanner(System.in);
	  
	  //try catch to copy all the elements from the txt file to cellList number 1
	  try {
		  sc = new Scanner(new FileInputStream("C:\\Users\\Amin\\OneDrive\\Desktop\\Cell_Info.txt"));
	  }
	  catch (FileNotFoundException e){
		  System.out.println("File not found.");		  
	  }
	  while(sc.hasNextLine()) {
		  serialNum = sc.nextLong();
		  brand = sc.next();
		  price = sc.nextDouble();
		  year = sc.nextInt();
		  cp = new CellPhone(serialNum, brand, year, price);
		  
		  if(!l1.contains(serialNum)) {
			  l1.addToStart(cp);
			  
		  }
		  else {
			  System.out.println("Phone duplication with serial number: " + serialNum);
		  }
		  
	  }
	  System.out.println("\nList 1 created, showing list: ");
	  l1.showContents(); //shows the content once the list is finished copied from txt
	  
	  for (int i = 0; i < 2; i++) {
		  System.out.print("\nInput serial number " + (i+1) + " you wish to search for: ");
		  searchSerial = scanner.nextLong();
		  l1.find(searchSerial); //if serialnumber is inside the list
	  }
	  
	  System.out.println("\nCopying list1 to list2");
	  l2 = new CellList(l1); //copying list1 to list2
	  
	  System.out.println("\nList 2 created, showing list: ");
	  l2.showContents(); //showing content
	  
	  System.out.println("\nReplacing nodes in list1: ");
	  
	  //three cellphones to use for our testing
	  CellPhone test = new CellPhone(123456, "test", 2021, 1223.55);
	  CellPhone test2 = new CellPhone(672513, "test2", 2017, 515.56);
	  CellPhone test3 = new CellPhone(726261, "test3", 2005, 6166.77);
	  
	  l1.replaceAtIndex(test, 5); //replaces
	  l1.replaceAtIndex(test2, 7); //replaces
	  l1.replaceAtIndex(test3, 45); //doesnt replace, index is out of bounds
	  System.out.println("\nList 1, showing list after 3 replaces: ");
	  l1.showContents();
	  
	  System.out.println("\nInserting at index 3 in list1: ");
	  l1.insertAtIndex(test3, 3);
	  System.out.println("List 1, showing list after inserting at index 3: ");
	  l1.showContents();
	  
	  System.out.println("\nDeleting node from the start: ");
	  l1.deleteFromStart();
	  System.out.println("List 1, showing list after deletion of first node: ");
	  l1.showContents();
	  
	  System.out.println("\nDeleting node at index 10");
	  l1.deleteFromIndex(10);
	  System.out.println("List 1, showing list after deletion at index 10: ");
	  l1.showContents();
	  
	  System.out.println("\nAdding node at the start: ");
	  l1.addToStart(test);
	  System.out.println("List 1, showing list after adding node at start: ");
	  l1.showContents();
	  
	  System.out.println("\nTesting the clone method: ");
	  CellPhone clone1 = new CellPhone(819052, "clone1", 2025, 1583.62);
	  CellPhone clone2 = clone1.clone();
	  System.out.println(clone1.toString());
	  System.out.println(clone2.toString());
	  System.out.println(clone1.equals(clone2)); //output true
	  
	  
	  System.out.println("\nAre list 1 and list 2 equal?");
	  System.out.println(l1.equals(l2)); //output false
	  
	  
	  CellList l3 = new CellList(l1); //new cellList which is copy of list1
	  System.out.println("\nCreated list 3 and copied list 1");
	  System.out.println("Are list 1 and list 3 equal?");
	  System.out.println(l1.equals(l3)); //output true 
	  
	  scanner.close(); //close scanner
	  
	  //closing banner
	  System.out.println("-------------------------------------------------------"); 
	  System.out.println("\tProgram has been terminated, thank you!");
	  System.out.println("-------------------------------------------------------"); 
  }
}