package edu.cwu;

/**
 *
 * @authors Jeremy and Taban
 * 
 */
import java.util.Random;

public class Violation {

	// number of violations
	private int numMajor;
	private int numRegular;
	private int numMinor;
	private int offenceCode;

	// Date variables
	private int month;
	private int day;
	private int year;
	private Date date;

	public Violation() {
		// assign random values
		this.numMajor = randInt(0, 3);
		this.numRegular = randInt(0, 5);
		this.numMinor = randInt(0, 1);
		this.offenceCode = randInt(3000, 3010);

		// Define dates here
		this.month = randInt(1, 12);
		this.day = randInt(1, 31);
		this.year = randInt(2013, 2014);
		date = new Date(month, this.day, this.year);
	}

	public int getNumMajor() {
		return numMajor;
	}

	public int getNumMinor() {

		return numMinor;
	}

	public int getNumRegular() {
		return numRegular;
	}

	public int getOffenceCode() {
		return offenceCode;
	}

	public Date getViolationDate() {
		return date;
	}

	private int randInt(int min, int max) {
		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
		return randomNum;
	}

	@Override
	public String toString() {
		return this.offenceCode + "  " + this.numMajor + " " + this.numRegular
				+ " " + numMinor + " " + this.date;
	}
}
