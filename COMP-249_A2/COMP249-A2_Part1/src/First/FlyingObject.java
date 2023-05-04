package First;
/**
 * @author Amin Kadawala
 * Date: March 4, 2022
 * Student ID: 40200998
 * Assignment 2, Part 2
 * Main Class
 */
public class FlyingObject {
	
	
	double price;
	
	/**
	 * defualt constructor
	 */
	public FlyingObject() {
	}
	/**
	 * @param price
	 * 
	 * default constructor 2
	 */
	public FlyingObject(double price) {
		this.price = price;
	}
	
	/**
	 * @return price
	 * 
	 * getter for price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price
	 * 
	 * setter for price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
