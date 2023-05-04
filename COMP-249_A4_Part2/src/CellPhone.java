import java.util.Scanner;
/**
 * @author Amin Kadawala - 40200998
 * @author Maxime Arseneau - 40207886
 * 
 * Assignment 4, Part 2 - COMP249
 * 
 * date: April 15, 2022
 * 
 * CellPhone class, where all the cellphone objects are created 
 *
 */
public class CellPhone {
	
	long serialNum;
	String brand;
	int year;
	double price;
	
	/**
	 * @param serialNum, serialnum to be parametrized 
	 * @param brand, new brand for phone
	 * @param year, new year for phone
	 * @param price, new price for phone
	 * 
	 * Parameterized constructor for the cellphone class
	 */
	public CellPhone (long serialNum, String brand, int year, double price) {
		this.serialNum = serialNum;
		this.brand = brand;
		this.year = year;
		this.price = price;
	}
	
	/**
	 * @param cp, cellphone obj that is used to create copy
	 * @param value, new serial number of object
	 * 
	 * Copy constructor for the cellphone class
	 */
	public CellPhone (CellPhone cp, long value) {
		serialNum = value;
		brand = cp.brand;
		year = cp.year;
		price = cp.price;
	}
	
	/**
	 * @return serialNum
	 * 
	 * Getter for serialNum variable 
	 */
	public long getSerialNum() {
		return serialNum;
	}
	/**
	 * @param serialNum, new serialNum to be set
	 * 
	 * Setter for serialNum variable
	 */
	public void setSerialNum(long serialNum) {
		this.serialNum = serialNum;
	}
	
	/**
	 * @return brand
	 * 
	 * Getter for brand variable
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand, new brand to be set
	 * 
	 * Setter for brand variable
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 * @return year
	 * 
	 * Getter for year variable
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year, new year to be set
	 * 
	 * Setter for year variable
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * @return price
	 * 
	 * Getter for price variable
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price, new price to set
	 * 
	 * Setter for price variable 
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * Clone method for the cellphone class
	 * creates a clone cellphone object with a different serial number
	 * inputted by the user
	 */
	public CellPhone clone() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter new serial number: ");
		long value = scanner.nextLong();
		scanner.nextLine();
		scanner.close();
		return new CellPhone(this, value);
	}
	
	/**
	 * toString method that displays the serial number, brand, price and year
	 */
	public String toString() {
		return "[" + serialNum + ": " + brand + " " + price + "$ " + year + "]";
	}
	
	/**
	 * @param obj an object that is passed through that could be a cellphone obj
	 * 
	 * Gives us an output of true or false if two cellphone objects are equal or not
	 */
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || (getClass() != obj.getClass())) {
			return false;
		}
		CellPhone cp = (CellPhone) obj;
		return (brand.equals(cp.brand)) && (price == cp.price) && (year == cp.year);
	}
}
