import java.util.NoSuchElementException;
/**
 * @author Amin Kadawala - 40200998
 * @author Maxime Arseneau - 40207886
 * 
 * Assignment 4, Part 2 - COMP249
 * 
 * date: April 15, 2022
 * 
 * CellList class where the lists are created with the help of nodes and lists
 *
 */
public class CellList {
	
	/**
	 * Private CellNode inner class which stores each phone to a node
	 *
	 */
	private class CellNode{
		
		private CellPhone cellPhone;
		private CellNode pointer;
		
		/**
		 * Default constructor for our cellnode class
		 */
		private CellNode(){
			cellPhone = null;
			pointer = null;
		}
		/**
		 * @param cellPhone, cellphone obj new
		 * @param pointer2, pointer obj new
		 * 
		 * Paramaterized constructor for our cellnode class
		 */
		private CellNode(CellPhone cellPhone, CellNode pointer2) {
			this.cellPhone = cellPhone;
			pointer = pointer2;
		}
		/**
		 * @param node, used to copy 
		 * 
		 * Copy constructor for our cellnode class
		 */
		private CellNode(CellNode node) {
			CellNode cn = new CellNode(node.cellPhone, node.pointer);
			this.cellPhone = cn.cellPhone;
			this.pointer = cn.pointer;
		}
		
		/**
		 * @return object that is a copy of CellNode
		 * Clone method for our cellnode class which returns copy calling copy constructor
		 */
		public CellNode clone() {
			return new CellNode(this);
		}
		
		/**
		 * @return pointer
		 * 
		 * Getter for CellNode pointer
		 */
		public CellNode getPointer() {
			return pointer;
		}
		/**
		 * @param pointer2, new pointer
		 * 
		 * Setter for our CellNode pointer
		 */
		public void setPointer(CellNode pointer2) {
			pointer = pointer2;
		}
		/**
		 * @return cellPhone 
		 * 
		 * Getter for Cellphone
		 */
		public CellPhone getCellPhone() {
			return cellPhone;
		}
		/**
		 * @param cellPhone, new phone
		 * 
		 * Setter for our CellPhone
		 */
		public void setCellPhone(CellPhone cellPhone) {
			this.cellPhone = cellPhone;
		}
	} //CellNode class ends 
	
	//CellList class
	
	private CellNode head;
	private int size;
	
	/**
	 * Default constructor 
	 */
	public CellList() {
		head = null;
		size = 0;
	}
	/**
	 * @param cl, used to copy 
	 * 
	 * Copy constructor
	 */
	public CellList(CellList cl) {
		this.head = cl.head;
		this.size = cl.size;
	}
	
	/**
	 * @return size
	 * 
	 * Getter for variable size of the list
	 */
	public int getSize() {
		return size;
	}
	/**
	 * @param size, new size 
	 * 
	 * Setter for our size variable
	 */
	public void setSize(int size) {
		this.size = size;
	}
	
	/**
	 * @param cellPhone obj to know which phone to add
	 * 
	 * AddtoStart method, creates a node at the first index of our given list
	 */
	public void addToStart(CellPhone cellPhone) {
		CellNode cellNode = new CellNode (cellPhone, head);
		head = cellNode;
		size++;
	}       
	
	/**
	 * @param cp, which cellphone obj is getting inserted
	 * @param index given by user to provide us where the insertion occurs
	 * 
	 * Creates a cellphone and inserts it at the given index
	 */
	public void insertAtIndex(CellPhone cp, int index) {
		if (cp == null) {
			System.out.println("\nCellphone is null, nothing to add here.");
			return;
		}
		if (index < 0 || index > (size-1)) {
			throw new NoSuchElementException("Index is out of bounds.");
		}
		else {
			if (index == 0) {
				addToStart(cp);
			}
			else {
				CellNode cn = head;
				CellNode cn2 = cn.pointer;
				CellNode cellNode;
				
				for(int i = (index-1); i > 0; i--) {
					cn = cn.pointer;
					cn2 = cn.pointer;
				}
				cellNode = new CellNode(cp, cn2);
				cn.pointer = cellNode;
				size++;
				System.out.println("Cellnode was succesfully added at index " + index + ". Size of list is " + size);
			}
		}
	}
	
	
	/**
	 * @param index, to know where the deletion is happening
	 * 
	 * Method that deletes a cellNode at the given index
	 */
	public void deleteFromIndex(int index) {
		if (index < 0 || index > (size - 1)) {
			throw new NoSuchElementException("Index is out of bounds.");
		}
		if (index == 0) {
			deleteFromStart();
		}
		else {
			CellNode cn = head;
			CellNode cn2 = cn.pointer;
			
			for (int i = (index-1); i > 0; i--) {
				cn = cn.pointer;
				cn2 = cn.pointer;
			}
			cn.pointer = cn2.pointer;
			cn2.pointer = null;
			cn2 = null;
			size--;
			System.out.println("Cellnode was successfully deleted at index " + index + ". Size of list is " + size);
			
		}
	}
	
	/**
	 * Method that deletes CellNode at the start of the list
	 */
	public void deleteFromStart() {
		head = head.getPointer();
		size--;
	}
	
	/**
	 * @param cp, which cellphone obj is replacing
	 * @param index which provides the index of replacing obj
	 * 
	 * Method that replaces a cellNode with the given index
	 */
	public void replaceAtIndex(CellPhone cp, int index) {
		if (cp == null) {
			System.out.println("Cellphone is null, nothing to add here.");
		}
		else if(index < 0 || index > (size-1)) {
			System.out.println(index + " index is out of bounds. Sorry :(");
		}
		else {
			CellNode cn = head;
			for (int i = index; i > 0; i--) {
				cn = cn.pointer;
			}
			cn.cellPhone = cp;
			System.out.println("Cellphone at index " + index + " was sucessfully changed.");
		}
	}
	
	
	/**
	 * @param serialNum provided by user to see if list has same one
	 * @return pointer which contains the cellPhone to the gievn serial number
	 * 
	 * Method that finds out whether the serial number given by the user is inside the list
	 */
	public CellNode find(long serialNum) {
		CellNode cn = head;
		int i = 0;
		while (cn != null) {
			i++;
			if (cn.cellPhone.getSerialNum() == serialNum) {
				System.out.println("Took " + i + " iterations to find.");
				return cn;
			}
			cn = cn.pointer;
		}
		System.out.println("Took " + i + " iterations to find.");
		return null;
	}
	
	/**
	 * @param serialNum to see if list contains same serial number
	 * @return boolean which if serial number had a match or not
	 * 
	 * Method where gives us boolean if the serial number given by user matches serial number 
	 * in the list
	 */
	public boolean contains(long serialNum) {
		if (head == null) {
			return false;
		}
		else {
			CellNode cn = head;
			for (int i = 0; i < size; i++) {
				if(cn.cellPhone.getSerialNum() == serialNum) {
					return true;
				}
				cn = cn.pointer;
			}
		}
		return false;
	}
	
	/**
	 * Method where the list is printed out, all of its information
	 */
	public void showContents() {
		System.out.println("Size of list is " + size + ". Here are its contents.");
		System.out.println("===================================================");
		CellNode cn = head;
		int i = 0;
		while (cn != null) {
			if (i<3) {
				System.out.print(cn.cellPhone + " ---> ");
				i++;
				if(i%3==0) {
					System.out.println();
				}
			}
			else {
				System.out.print(cn.cellPhone + " ---> ");
				i=1;
			}
			if(cn.pointer == null) {
				System.out.println( "X");
			}
			cn = cn.pointer;
		}
	}
	
	/**
	 * @param cl obj to provide equality of the two objects
	 * @return boolean which gives the result of the equality 
	 * 
	 * Equals method where it will check for equality between two CellList objects 
	 */
	public boolean equals(CellList cl) {
		if (this == cl) {
			return true;
		}
		if (cl == null) {
			System.out.println("List is null. Not equal.");
			return false;
		}
		else if(size != cl.size) {
			System.out.println("Not equal. Sizes are different.");
			return false;
		}
		else if(head == cl.head) {
			System.out.println("Both lists are equal.");
			return true;
		}
		else {
			CellNode first = head;
			CellNode second = cl.head;
			
			for (int i = 0; i < size; i++) {
				if (!(first.cellPhone.equals(second.cellPhone))) {
					System.out.println("Not equal.");
					return false;
				}
				if (first.pointer == second.pointer) {
					System.out.println("Both lists are equal.");
					return true;
				}
				else {
					first = first.pointer;
					second = second.pointer;
				}
			}
		}
		return false;
	}

}
