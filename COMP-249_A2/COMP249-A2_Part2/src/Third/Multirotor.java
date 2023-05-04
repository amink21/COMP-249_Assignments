package Third;

import Second.Helicopter;
import Second.Quadcopter;
/**
 * @author Amin Kadawala
 * Date: March 4, 2022
 * Student ID: 40200998
 * Assignment 2, Part 2
 * Multirotor class
 */
public class Multirotor extends Helicopter{
	
	int numRotors;
	
	/**
	 * default constructor
	 */
	public Multirotor() {
	}
	
	/**
	 * @param brand
	 * @param price
	 * @param horsepower
	 * @param numCylinders
	 * @param creationYear
	 * @param passCapacity
	 * @param numRotors
	 * 
	 * Desc: constructor two
	 */
	public Multirotor(String brand, double price, int horsepower, int numCylinders, int creationYear, int passCapacity, int numRotors) {
		super(brand, price, horsepower, numCylinders, creationYear, passCapacity);
		this.numRotors = numRotors;
	}
	
	/**
	 * @param m
	 * @param brand
	 * @param price
	 * @param horsepower
	 * @param numCylinders
	 * @param creationYear
	 * @param passCapacity
	 * @param numRotors
	 * 
	 * Desc: constructor three
	 */
	public Multirotor(Multirotor m, String brand, double price, int horsepower, int numCylinders, int creationYear, int passCapacity, int numRotors) {
		super(brand, price, horsepower, numCylinders, creationYear, passCapacity);
		this.numRotors = m.numRotors;
	}
	
	/**
	 * @return numRotors
	 * 
	 * Desc: getter for var numRotors
	 */
	public int getRotors() {
		return numRotors;
	}
	/**
	 * @param numRotors
	 * 
	 * Desc: setter for var numRotors
	 */
	public void setRotors(int numRotors) {
		this.numRotors = numRotors;
	}
	/**
	 * Desc: toString method, prints out the information needed
	 */
	@Override
	public String toString() {
		return  "This multirotor is manufactured by " + getBrand() + ", costing $" + getPrice() +
				" with " + getHorsepower() + " horsepower. It has " + getNumCylinders()
				+ " cylinders, it can carry up to " + getPassCapacity() + " passsengers with " 
				+ numRotors + " rotors, and made in " + getCreationYear() +".";
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
		if (obj instanceof Multirotor) {
			Multirotor m = (Multirotor) obj;
			return (this.numRotors == m.numRotors);
		}
		return false;
	}
	
}

