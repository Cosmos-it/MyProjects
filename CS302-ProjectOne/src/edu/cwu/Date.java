package edu.cwu;


/*** 
 * 
 * @author Taban Cosmos
 * 
 * */
public class Date {

	private int day;
	private int month;
	private int year;

	public Date() {
		day = 0;
		month = 0;
		year = 0;
	}

	public Date(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return  this.getMonth() + "/"  + this.getDay() + "/" +  this.year;
	}

}
