package First;
/**
 * @author Amin Kadawala
 * Date: March 4, 2022
 * Student ID: 40200998
 * Assignment 2, Part 2
 * FlyingObject class
 */
public class FlyingObject {
	
	
	double price;
	FlyingObject flyingObject;
	
	/**
	 * default constructor
	 */
	public FlyingObject() {
	}
	/**
	 * @param price
	 * 
	 * constructor twe
	 */
	public FlyingObject(double price) {
		this.price = price;
	}
	
	/**
	 * @param flyingObject
	 * 
	 * constructor three
	 */
	public FlyingObject(FlyingObject flyingObject) {
		this.price = flyingObject.price;
	}
	/**
	 * @return price
	 * 
	 * Desc: getter for price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price
	 * 
	 * Desc: setter for price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * Desc: toString method, prints out the information needed
	 */
	@Override
	public String toString() {
		return "The price of this flying object is " + price;
		
	}
	
	
}