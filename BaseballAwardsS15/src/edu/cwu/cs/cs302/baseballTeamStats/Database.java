package edu.cwu.cs.cs302.baseballTeamStats;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Database {

	private final List<Record> data;
	private final String filename;

	public Database(String filename) {
		this.filename = filename;
		this.data = new ArrayList<Record>();
	}

	private void createDatabase() {

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			reader.readLine(); // ignore header line
			for (String line = reader.readLine(); line != null; line = reader
					.readLine()) {
				Record stats = Record.create(line);
				data.add(stats);
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

	public List<Record> getData() {
		if (data.isEmpty())
			createDatabase();
		return data;
	}
}
