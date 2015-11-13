package edu.cwu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Database {
	private final BinarySearchTree<DriverLicense> records;
	private final String fileName;


	public Database(String fileName) {
		this.fileName = fileName;
		this.records = new BinarySearchTree<DriverLicense>();
	}

	public void createData() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(fileName));
			reader.readLine(); // ignore header line
			for (String line = reader.readLine(); line != null; line = reader
					.readLine()) {
				DriverLicense stats = DriverLicense.createRecord(line);
				records.add(stats);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public BinarySearchTree<DriverLicense> getData() {
		if (records.isEmpty() )
			createData();
		return records;
	}
}

