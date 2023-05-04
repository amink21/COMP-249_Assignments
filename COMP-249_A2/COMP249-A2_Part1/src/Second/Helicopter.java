package Second;

import First.Airplane;
/**
 * @author Amin Kadawala
 * Date: March 4, 2022
 * Student ID: 40200998
 * Assignment 2, Part 2
 * Helicopter class
 */
public class Helicopter extends Airplane {
	
	int numCylinders;
	int creationYear;
	int passCapacity;
	
	/**
	 * default constructor
	 */
	public Helicopter() {
	}

	/**
	 * @param brand
	 * @param price
	 * @param horsepower
	 * @param numCylinders
	 * @param creationYear
	 * @param passCapacity
	 * 
	 * Desc: constructor two
	 */
	public Helicopter(String brand, double price, int horsepower, int numCylinders, int creationYear, int passCapacity) {
		super(brand, price, horsepower);
		this.numCylinders = numCylinders;
		this.creationYear = creationYear;
		this.passCapacity = passCapacity;
	}
	
	/**
	 * @param h
	 * @param brand
	 * @param price
	 * @param horsepower
	 * 
	 * Desc: constructor three
	 */
	public Helicopter(Helicopter h, String brand, double price, int horsepower) {
		super(brand, price, horsepower);
		this.numCylinders = h.numCylinders;
		this.creationYear = h.creationYear;
		this.passCapacity = h.passCapacity;
	}
	
	/**
	 * @return numCylinders
	 * 
	 * Desc: getter for var numCylinders
	 */
	public int getNumCylinders() {
		return numCylinders;
	}
	/**
	 * @param numCylinders
	 * 
	 * Desc: setter for var numCylinders
	 */
	public void setNumCylinders(int numCylinders) {
		this.numCylinders = numCylinders;
	}
	/**
	 * @return creationYear
	 * 
	 * Desc: getter for var creationYear
	 */
	public int getCreationYear() {
		return creationYear;
	}
	/**
	 * @param creationYear
	 * 
	 * Desc: setter for var creationYear
	 */
	public void setCreationYear(int creationYear) {
		this.creationYear = creationYear;
	}
	/**
	 * @return passCapacity
	 * 
	 * Desc: getter for var passCapacity
	 */
	public int getPassCapacity() {
		return passCapacity;
	}
	/**
	 * @param passCapacity
	 * 
	 * Desc: setter for var passCapacity
	 */
	public void setPassCapacity(int passCapacity) {
		this.passCapacity = passCapacity;
	}
	/**
	 * Desc: toString method, prints out the information needed
	 */
	@Override
	public String toString() {
		return  "This helicopter is manufactured by " + getBrand() + ", costing $" + getPrice() +
				" with " + getHorsepower() + " horsepower. It has " + numCylinders
				+ " cylinders, it can carry up to " + passCapacity + " passsengers and made in " 
				+ creationYear +".";
	}
	/**
	 * @param object obj
	 * 
	 * Desc: method for equals, determines whether two objects are equal or not 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(super.equals(obj))) {
			return false;
		}
		if (obj instanceof Helicopter) {
			Helicopter h = (Helicopter) obj;
			return (this.numCylinders == h.numCylinders) &&
					(this.creationYear == h.creationYear) &&
					(this.passCapacity == h.passCapacity);
		}
		return false;
	}
}
