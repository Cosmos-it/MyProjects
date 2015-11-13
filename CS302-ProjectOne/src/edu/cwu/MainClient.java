package edu.cwu;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Taban Cosmos
 * */


/**
 * Tasks to complete
 * Ask a user to enter a file path.
 * Is the file path is not correct return an error and let the user 
 * enter the correct file path. 
 * 
 * Save violation data in an external file. 
 * Chose name.
 * 
 * Chose location for your data. 
 * 
 * Return an error. 
 * 
 * Reading a file with all its duplicates. 
 * Then figuring out what to do next with the read 
 * file. 
 *  Create bash file to run the program 
 *  
 *  
 * Finally comment all the code. 
 * Explain what each line is doing for clarity. 
 * 
 * */

public class MainClient {

	/** 
	 * This method displays the driver license records
	 * 
	 * */
	private static void displayData(BinarySearchTree<DriverLicense> bst) {

		for (DriverLicense a : bst) {
			System.out.println(a.getDriverLicNum()  
					+ " " +  a.getDate()  + " " + a.getExp() 
					+ " " +  a.getSsnId() + " " +  a.getLname() 
					+ " " + a.getFname() + " " +  a.getMiddleI());
		}

	}//displayData


	//	Test file
	private static Violation getViolationDetails() {
		Violation violation = new Violation();
		violation.getOffenceCode();
		violation.getNumMajor();
		violation.getNumRegular();
		violation.getNumMinor();
		violation.getViolationDate();
		return violation;
	}

	public static void main(String[] args) throws IOException {

		/** Main client. To-do
		 * 	- This class consist of methods that perform
		 *  - Reading of file and error validation.
		 *  - Menu with choice of things to do. 
		 * */
		userInputAnderrorCheck();//file input
	}//main

	//menu
	private static void menu() {

		System.out.println("___________________________________________");
		System.out.println("| Welcome to Driver License records program ");
		System.out.println("___________________________________________");
		System.out.println("| Please use guide below to choose   ");
		System.out.println("| To chosoe (0-2) for an actions     ");
		System.out.println("___________________________________________");
		System.out.println("(1):Enter 1, then wait for prompt to type either data.txt or data.csv ");
		System.out.println("(2):Enter 2 to view violations, type either data.txt or data.csv");
		System.out.println("(0):Enter 0 to exit the application? (0) ");
		System.out.println("_______________________________________________________________________");
	}//menu

	/**
	 * program shutting down timer
	 * 
	 **/
	private static void programShuttingDown() {
		for(int i = 0; i< 3; i++) {
			try {
				Thread.sleep(700);
			} catch(InterruptedException ie) {}
			System.out.println("Application is shutting down...");
		}
		System.out.println(" ");
		System.out.println("Goodbye zzzzip...");
	}


	/**
	 * program start up timer
	 * 
	 * */
	private static void programStartingUp() {
		for(int i = 0; i< 3; i++) {
			try {
				//sending the actual Thread of execution to sleep X milliseconds
				Thread.sleep(700);
			} catch(InterruptedException ie) {}
			System.out.println("Application is booting up...");
		}	
		System.out.println("___________________________________________");
		System.out.println("Application is ready... ");
	}

	/**
	 *  The private method reads a file passed to it and 
	 *  then saves the data into BinarySearcTree
	 *  @param bst - Type: BinarySerchTree
	 *  @param reader - Type: BufferedReader
	 *  
	 *  
	 * */
	private static void readFile(BinarySearchTree<DriverLicense> bst,
			BufferedReader reader) throws IOException {
		for (String line = reader.readLine(); line != null; line = reader.readLine()) {
			DriverLicense stats = DriverLicense.createRecord(line);
			bst.add(stats);
		}
		displayData(bst);

	}

	/**
	 * This method reads data and has the violation appended to it
	 * before validations is made to the whole data.
	 * The method prints out the number of driver lic
	 * with all the information that comes with it.
	 * */
	private static void removeViolation(BufferedReader reader) throws IOException {
		TreeMap<DriverLicense, Violation> map = new TreeMap<DriverLicense, Violation>();

		DriverLicense driverLic = null;
		Violation violation = null;
		for (String line = reader.readLine(); line != null; line = reader
				.readLine()) {
			violation = getViolationDetails();
			driverLic = DriverLicense.createRecord(line);
			map.put(driverLic, violation);
			violation = null;
		}

		System.out.println("Size before deletion: " + map.size());

		Iterator<Map.Entry<DriverLicense,Violation>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry<DriverLicense,Violation> entry = iter.next();
			if(entry.getValue().getNumMajor()  > 1 ||  entry.getValue().getNumRegular() > 3 ){
				iter.remove();
			}else if (entry.getKey().getDriverLicNum() == 99999999) {
				iter.remove();
			}
		}
		System.out.println("Size after deletion: " + map.size());

		//Print the result out.		
		Set<DriverLicense> keys = map.keySet();
		for (Iterator<DriverLicense> i = keys.iterator(); i.hasNext(); ){
			DriverLicense key = i.next();
			Violation value = map.get(key);

			//DOB : date of bath 
			System.out.println("Lic#: " + key.getDriverLicNum() +  " |D.O.B: " + key.getDate() + " |Expires: " + key.getExp()
					+ " |SSN:" + key.getSsnId() + " |L.name " + key.getLname() +  "F.name " + key.getFname() 
					+ " M.I: " +key.getMiddleI() + "|Major.V: " + value.getNumMajor() + " |Minor.V: "
					+ value.getNumMinor() +  " |Regular.V "+ value.getNumRegular() + " |D.O.V: "
					+  value.getViolationDate() + " |Offence Code:" + value.getOffenceCode());
		}

		if (map.size() == 0) {
			System.out.println("Congratulations Linux erased the data...");
		}

		System.out.println("Size after deletion: " + map.size());
		System.out.println(" ");


		//Chooses new name for file to be saved. 
		String[] names = { "SavedData1", "SavedData2",
				"SavedData3", "SavedData4", "SavedData5", 
				"SavedData6" ,"SavedData7","SavedData8","SavedData9","SavedData10"};

		String name = names[(int) (Math.random() * names.length)];
		SaveFile(name, map);
		System.out.println("For clear view, a copy was saved on this file: (" + name + ")");
	}

	/** Save file to external directory called savedFiles */
	public static void SaveFile(String name, TreeMap<DriverLicense, Violation> message) {

		String path = "/Users/Taban/OneDrive/cs302/CS302-ProjectOne/savedData/" + name + ".txt";
		File file1 = new File(path);

		try {

			if (!file1.exists()) {
				file1.createNewFile();	
			}

			FileWriter fw = new FileWriter(file1, true);
			//			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter writer = new PrintWriter(fw);
			for (Map.Entry<DriverLicense, Violation> entry : message.entrySet()) {
				writer.append("Lic#: " + entry.getKey().getDriverLicNum() +  " |D.O.B: " + entry.getKey().getDate() 
						+ " |Expires: " + entry.getKey().getExp() + " |SSN:" + entry.getKey().getSsnId() + " |L.name "
						+ entry.getKey().getLname() +  "F.name " + entry.getKey().getFname() + " M.I: " + entry.getKey().getMiddleI() 
						+ "|Major.V: " + entry.getValue().getNumMajor() + " |Minor.V: " + entry.getValue().getNumMinor() 
						+  " |Regular.V "+ entry.getValue().getNumRegular() + " |D.O.V: " +  entry.getValue().getViolationDate()
						+ " |Offence Code:" + entry.getValue().getOffenceCode() + "\n");

				writer.flush();   // Flush the buffer and write all changes to the disk
			}
			writer.close();    // Close the file

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	/**Gets user input and throws any error*/
	private static void userInputAnderrorCheck() throws FileNotFoundException, IOException {
		BinarySearchTree<DriverLicense> bst = new BinarySearchTree<DriverLicense>();

		programStartingUp();//Starting application indicator
		Scanner input = new Scanner(System.in);		
		String fileName = null;
		int choice = 1;
		do {
			menu();//Show menu

			//Handle input type errors here before doing anything. 
			while(!input.hasNextInt()) {
				input.next();
				System.out.println(" ");
				System.out.println("Please choose carefully...!");
			}

			choice = input.nextInt();
			if (choice == 1 || choice == 2 ) {
				System.out.println("Enter File with extensions (e.g: example.txt or example.csv)");
			} 
			//Choice values. 
			switch(choice) {
			case 1:
				//Handle errors file name errors here

				fileName = input.next();
				BufferedReader reader;

				if (fileName.contains(".csv") || fileName.contains(".txt")) {
					try {
						reader = new BufferedReader(new FileReader(fileName));
						readFile(bst, reader);
					} catch (Exception e) {
						System.out.println("Correct file name please");
					}

				} else {

					System.out.println("Error: File must have extensions (e.g: example.txt or example.csv)");
					fileName = input.next();

					//This try catch handles the last trial of the file name error
					try {
						if (fileName.contains(".csv") || fileName.contains(".txt")) {
							reader = new BufferedReader(new FileReader(fileName));
							readFile(bst, reader);
						}
					} catch (Exception e) {
						System.out.println("Correct file name please");

					}//End of try catch

					break;
				}//end of the whole statement

				break;

				/**
				 * Violation manipulations happens here
				 * */	
			case 2: 

				fileName = input.next();
				BufferedReader read;

				if (fileName.contains(".csv") || fileName.contains(".txt") || fileName.contains("individuals")) {
					try {
						read = new BufferedReader(new FileReader(fileName));
						removeViolation(read);
					} catch (Exception e) {

					}
				} else {
					System.out.println("Error: File must have extensions (e.g: example.txt or example.csv)");
					//This try catch handles the last trial of the file name error
					try {
						fileName = input.next();
						if (fileName.contains(".csv") || fileName.contains(".txt")) {
							reader = new BufferedReader(new FileReader(fileName));
							removeViolation(reader);
						}
					} catch (Exception e) {
						System.out.println("Correct file name please");

					}
				}
				break;

			default:
				if (choice == 0) {
					System.out.println("Please wait for program to shut in few seconds...");
				}
				if (choice > 2){
					System.out.println("Input selection are 0 to 2 ");
					System.out.println("Please follow instructions...");
				} 
			}
		} while (choice !=0 );
			input.close();
		if (choice == 0) {
			programShuttingDown();//Shutdown method
		}
	}//userInputAnderrorCheck
}









