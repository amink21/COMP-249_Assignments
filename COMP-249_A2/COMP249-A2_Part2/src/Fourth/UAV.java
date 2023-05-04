package Fourth;

import First.FlyingObject;
/**
 * @author Amin Kadawala
 * Date: March 4, 2022
 * Student ID: 40200998
 * Assignment 2, Part 2
 * UAV class
 */
public class UAV extends FlyingObject{
	
	double weight;
	double price;
	
	/**
	 * default constructor
	 */
	public UAV() {
		super();
	}
	
	/**
	 * @param weight
	 * @param price
	 * 
	 * Desc: constructor two
	 */
	public UAV(double weight, double price) {
		super (price);
		this.weight = weight;
		this.price = price;
	}
	/**
	 * @param u
	 * @param weight
	 * @param price
	 * 
	 * Desc: constructor three
	 */
	public UAV(UAV u, double weight, double price) {
		this.weight = u.weight;
		this.price = u.price;
	}
	
	/**
	 * @return weight
	 * 
	 * Desc: getter for var weight
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * @param weight
	 * 
	 * Desc: setter for var weight
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * @return price
	 * 
	 * Desc: getter for var price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price
	 * 
	 * Desc: setter for var price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * Desc: toString method, prints out the information needed
	 */
	@Override
	public String toString() {
		return "This UAV has a weight of " + weight + " pounds, and costs $" + price + ".";
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
		if (obj instanceof UAV) {
			UAV uav = (UAV) obj;
			return (this.weight == uav.weight) &&
					(this.price == uav.price);
		}
		return false;
	}
}

