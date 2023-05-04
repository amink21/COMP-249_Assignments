package Second;
/**
 * @author Amin Kadawala
 * Date: March 4, 2022
 * Student ID: 40200998
 * Assignment 2, Part 2
 * Quadcopter class
 */
public class Quadcopter extends Helicopter{
	
	int maxFlyingSpeed;
	
	/**
	 * default constructor
	 */
	public Quadcopter() {
	}
	
	/**
	 * @param brand
	 * @param price
	 * @param horsepower
	 * @param numCylinders
	 * @param creationYear
	 * @param passCapacity
	 * @param maxFlyingSpeed
	 * 
	 * Desc: constructor two
	 */
	public Quadcopter(String brand, double price, int horsepower, int numCylinders, int creationYear, int passCapacity, int maxFlyingSpeed) {
		super(brand, price, horsepower, numCylinders, creationYear, passCapacity);
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
	/**
	 * @param q
	 * @param brand
	 * @param price
	 * @param horsepower
	 * @param numCylinders
	 * @param creationYear
	 * @param passCapacity
	 * @param maxFlyingSpeed
	 * 
	 * Desc: constructor three
	 */
	public Quadcopter(Quadcopter q, String brand, double price, int horsepower, int numCylinders, int creationYear, int passCapacity, int maxFlyingSpeed) {
		super(brand, price, horsepower, numCylinders, creationYear, passCapacity);
		this.maxFlyingSpeed = q.maxFlyingSpeed;
	}
	
	/**
	 * @return maxFlyingSpeed
	 * 
	 * Desc: getter for var maxFlyingSpeed
	 */
	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}
	/**
	 * @param maxFlyingSpeed
	 * 
	 * Desc: setter for var maxFlyingSpeed
	 */
	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	/**
	 * Desc: toString method, prints out the information needed
	 */
	@Override
	public String toString() {
		return  "This quadcopter is manufactured by " + getBrand() + ", costing $" + getPrice() +
				" with " + getHorsepower() + " horsepower. It has " + numCylinders
				+ " cylinders, it can carry up to " + passCapacity + 
				" passsengers with a max flying speed of " + maxFlyingSpeed + " and made in " + 
				creationYear +".";
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
		if (obj instanceof Quadcopter) {
			Quadcopter q = (Quadcopter) obj;
			return (this.maxFlyingSpeed == q.maxFlyingSpeed);
		}
		return false;
	}
}

