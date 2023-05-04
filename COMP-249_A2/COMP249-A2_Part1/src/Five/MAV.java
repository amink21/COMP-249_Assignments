package Five;

import Fourth.UAV;
/**
 * @author Amin Kadawala
 * Date: March 4, 2022
 * Student ID: 40200998
 * Assignment 2, Part 2
 * MAV class
 */
public class MAV extends UAV{
	
	String model;
	double size;
	
	/**
	 * default constructor
	 */
	public MAV() {
	}
	
	/**
	 * @param weight
	 * @param price
	 * @param model
	 * @param size
	 * 
	 * Desc: constructor two
	 */
	public MAV(double weight, double price, String model, double size) {
		super(weight, price);
		this.model = model;
		this.size = size;
	}
	/**
	 * @param mav
	 * @param weight
	 * @param price
	 * @param model
	 * @param size
	 * 
	 * Desc: constructor three
	 */
	public MAV(MAV mav, double weight, double price, String model, double size) {
		super();
		this.model = mav.model;
		this.size = mav.size;
	}
	
	/**
	 * @return model
	 * 
	 * Desc: getter for var model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model
	 * 
	 * Desc: setter for var model
	 */
	public void setModel(String model) {
		this.model = model;
	}
	/**
	 * @return size
	 * 
	 * Desc: getter for var size
	 */
	public double getSize() {
		return size;
	}
	/**
	 * @param size
	 * 
	 * Desc: setter for var size
	 */
	public void setSize(double size) {
		this.size = size;
	}
	/**
	 * Desc: toString method, prints out the information needed
	 */
	@Override
	public String toString() {
		return "The model of this MAV is " + model + " which has a weight of "
	+ getWeight() + " pounds, and size of " + size + "cm. It costs $" + getPrice();
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
		if (obj instanceof MAV) {
			MAV mav = (MAV) obj;
			return (this.size == mav.size) &&
					(this.model.equals(mav.model));
		}
		return false;
	}
}

