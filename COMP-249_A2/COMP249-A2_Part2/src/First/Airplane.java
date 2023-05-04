package First;

/**
 * @author Amin Kadawala
 * Date: March 4, 2022
 * Student ID: 40200998
 * Assignment 2, Part 2
 * Airplane class
 */
public class Airplane extends FlyingObject{
	
	String brand;
	double price;
	int horsepower;
	
	/**
	 * default constructor
	 */
	public Airplane() {
		super();
	}
	
	/**
	 * @param brand
	 * @param price
	 * @param horsepower
	 * 
	 * Desc: constructor two
	 */
	public Airplane(String brand, double price, int horsepower) {
		super (price);
		this.brand = brand;
		this.price = price;
		this.horsepower = horsepower;
	}
	
	/**
	 * @param a
	 * 
	 * Desc: constructor three
	 */
	public Airplane(Airplane a) {
		this.brand = a.brand;
		this.price = a.price;
		this.horsepower = a.horsepower;
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
	 * @return horsepower
	 * 
	 * Desc: getter for horsepower
	 */
	public int getHorsepower() {
		return horsepower;
	}
	/**
	 * @param horsepower
	 * 
	 * Desc: setter for horsepower
	 */
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	/**
	 * Desc: toString method, prints out the information needed
	 */
	@Override
	public String toString() {
		return  "This airplane is manufactured by " + brand + ", costing $" + price +
				" with " + horsepower + " horsepower.";
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
		if (obj instanceof Airplane) {
			Airplane a = (Airplane) obj;
			return (this.price == a.price) &&
					(this.horsepower == a.horsepower) &&
					(this.brand.equals(a.brand));
		}
		return false;
	}
	
}

