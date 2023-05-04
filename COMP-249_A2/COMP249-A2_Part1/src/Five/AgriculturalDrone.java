package Five;

import Fourth.UAV;
/**
 * @author Amin Kadawala
 * Date: March 4, 2022
 * Student ID: 40200998
 * Assignment 2, Part 2
 * AgriculturalDrone class
 */
public class AgriculturalDrone extends UAV{
	
	String brand;
	int carryCap;
	
	/**
	 * default constructor
	 */
	public AgriculturalDrone() {
	}

	/**
	 * @param weight
	 * @param price
	 * @param brand
	 * @param carryCap
	 * 
	 * Desc: constructor two
	 */
	public AgriculturalDrone(double weight, double price, String brand, int carryCap) {
		super(weight, price);
		this.brand = brand;
		this.carryCap = carryCap;
	}
	/**
	 * @param ad
	 * @param type
	 * @param price
	 * @param brand
	 * @param carryCap
	 * 
	 * Desc: constructor three
	 */
	public AgriculturalDrone(AgriculturalDrone ad, double type, double price, String brand, int carryCap) {
		super(type, price);
		this.brand = ad.brand;
		this.carryCap = ad.carryCap;
	}
	
	/**
	 * @return brand
	 * 
	 * Desc: getter for var brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand
	 * 
	 * Desc: setter for var brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return carryCap
	 * 
	 * Desc: getter for var carryCap
	 */
	public int getCarryCap() {
		return carryCap;
	}
	/**
	 * @param carryCap
	 * 
	 * Desc: setter for var carryCap
	 */
	public void setCarryCap(int carryCap) {
		this.carryCap = carryCap;
	}
	/**
	 * Desc: toString method, prints out the information needed
	 */
	@Override
	public String toString() {
		return "This agricultural drone is manufactured by " + brand + ". It weighs " + getWeight() 
		+ " pounds, and costs $" + getPrice() + ". It can carry up to " + carryCap + "kg.";
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
		if (obj instanceof AgriculturalDrone) {
			AgriculturalDrone ag = (AgriculturalDrone) obj;
			return (this.carryCap == ag.carryCap) &&
					(this.brand.equals(ag.brand));
		}
		return false;
	}

}

