import java.io.*;
import java.util.Scanner;

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
 * This class is the main class, this program is to convert CSV files to html table file
 *
 */
public class Main {
	
	
	/**
	 * @param sc, scanner to read the input of the file 
	 * @param pw, printwriter to write to the file and convert
	 * @param log, log file so we can write to the exceptions file
	 * @throws CSVAttributeMissing
	 * 
	 * This method is the method where the conversion happens from CSV to a html table
	 */
	public static void ConvertCSVtoHTML(Scanner sc, PrintWriter pw, PrintWriter log) throws CSVAttributeMissing {
		
		pw.println("<html>");
		pw.println("<style>");
		pw.println("table {font-family: arial, sans-serif; border-collapse: collapse;}");
		pw.println("td, th {border: 1px solid #000000; text-align: left; padding: 8px;}");
		pw.println("tr:nth-child(even) {background-color: #dddddd;}");
		pw.println("span{font-size: small");
		pw.println("</style>");
		pw.println("<body>");
		pw.println("<table>");
		
		String title = sc.nextLine();
		String[] titleArray = title.split(",");
		
		pw.println("<caption>" + titleArray[0] + "</caption>");
		
		String attributes = sc.nextLine();
		String[] attributesArray = attributes.split(",");
		for(int i = 0; i < attributesArray.length; i++) {
			if (attributesArray[i] == "") {
				throw new CSVAttributeMissing();
			}
		}
		pw.println("<tr>");
		for(int i = 0; i < attributesArray.length; i++) {
			pw.println("<td>" + attributesArray[i] + "</td>");
		}
		pw.println("</tr>");
		
		
		int line = 3;
		int index = 0;
		
		while(sc.hasNextLine()) {
			try {
				String data = sc.nextLine();
				String[] dataArray = data.split(",");
				if(sc.hasNextLine() == false) {
					pw.println("</table>");
					pw.println("<span>" + dataArray[0] + "</span>");
					break;
				}
				for(int i = 0; i < dataArray.length; i++) {
					if (dataArray[i] == "") {
						index = i;
						throw new CSVDataMissing();
						
					}
				}
				pw.println("<tr>");
				for (int i = 0; i < dataArray.length; i++) {
					pw.println("<td>" + dataArray[i] + "</td>");
				}
				pw.println("</tr>");
			}
			catch(CSVDataMissing e) {
				System.out.println("WARNING: In  the file line  " + Integer.toString(line) + " is not converted to HTML: missing data: " + attributesArray[index]);
				log.write(e.getMessage());
			}
			line++;
		}
		pw.println("</body>");
		pw.println("</html>");
		
	}
	
	
	/**
	 * @param args
	 * 
	 * This method is the main/driver method. Welcomes the user, this method checks the input file in the file container and converts them
	 * using the method above into the folder called output.
	 * This method has many exceptions which will occur if the files are not placed properly, cannot open the files, etc.
	 */
	public static void main(String[] args) {

		System.out.println("-------------------------------------------------------");
		System.out.println("\t    Welcome To CSVtoHtml Converter!");
		System.out.println("-------------------------------------------------------");
		System.out.println("\nStarting scanning documents");
		
		File directoryPath = null;
		File filesList[] = null;
		
		try {
		directoryPath= new File("input");
		filesList=directoryPath.listFiles();
		
		if(filesList==null) {
			throw new Exception();
		}
		
		}catch(Exception e) {
			System.out.println("Could not find input files, please make sure CSV files are in a input folder in the project directory");
			System.exit(0);
		}
		
	
		Scanner[] ins= new Scanner[filesList.length];
		String[] name= new String[filesList.length];
		PrintWriter log =null;
		PrintWriter[] outs=new PrintWriter[filesList.length];
		
		
		//creating ins 
		try {
		int x=0;
		for(File file : filesList) {		
			System.out.println("Scanning for Document....");
				
				
				System.out.println("File name: "+file.getName());
				
				String fileName = file.getName();
				int pos = fileName.lastIndexOf(".");
				if (pos > 0 && pos < (fileName.length() - 1)) { // If '.' is not the first or last character.
				    fileName = fileName.substring(0, pos);
				}
				
				name[x]=fileName;

				
				ins[x] = new Scanner(new File(file.getAbsolutePath()));
				
				
				
			
				//sets the delimiter pattern
				x++;
		}
		} catch (Exception e) {
			System.out.println("Could not open input file for reading");
			System.out.println("Please check that the file exists and is readable. This program will terminate after closing any opened files.");
			e.printStackTrace();
		}
		finally {
			System.out.println("Sucessfully created Scanners for input files! Creating Documents in output folder.");
		}
		
	
		//creating outs
		try {
			System.out.println("Creating Exception.log Document");
			
			log=new PrintWriter(new File("output\\Exception.log"));
			
			for(int i=0; i<ins.length;i++) {
			System.out.println("Creating "+(i+1)+"st html Documents");
			outs[i] = new PrintWriter (new FileOutputStream("output\\"+name[i]+".html"));
			
			}
			
		
		}catch(Exception e) {
			
			System.out.println(e);
		}
		
		
		try {
			
			for(int i=0; i<outs.length;i++) {
			ConvertCSVtoHTML(ins[i],outs[i],log);
			ins[i].close();
			outs[i].flush();
			outs[i].close();
			
			}
			log.flush();
			log.close();
			
		} catch (CSVAttributeMissing e) {
			log.write(e.getMessage());
			e.printStackTrace();
		}

		
	}
}

