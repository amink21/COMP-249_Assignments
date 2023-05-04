/**
 * @author Amin Kadawala - 40200998
 * @author puturname = stuID
 * 
 * Assignment 3 - COMP 249
 * 
 * @date March 25, 2022
 *
 */

/**
 * Data missing class extending the exception so we can create our own with the use of constructors.
 *
 */
public class CSVDataMissing extends Exception{
	
	
	/**
	 * Default constructor containing the default message for missing data  
	 */
	public CSVDataMissing() {
		super("ERROR: Input row cannot be parsed due to missing information.");
	}
	
	
	/**
	 * @param str, string to input message
	 * 
	 * Parameterized constructor with string for user exception
	 */
	public CSVDataMissing(String str) {
		super(str);
	}

}
