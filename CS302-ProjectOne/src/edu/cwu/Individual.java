package edu.cwu;

/***
 * 
 * @author Jeremy and Taban
 * 
 * */

public class Individual {
	private Date date;
	private String fname;
	private String lname;
	private String middleI;
	private String ssnId;

	/* Default constructor */
	public Individual() {
		this.fname = "";
		this.lname = "";
		this.middleI = "";
		this.ssnId = "0000000";
	}

	public Date getDate() {
		return date;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getMiddleI() {
		return middleI;
	}

	public String getSsnId() {
		return ssnId;
	}

	public void setDate(int month, int day, int year) {
		this.date = new Date(month, day, year);
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setMiddleI(String middleI) {
		this.middleI = middleI;
	}

	public void setSsnId(String ssnId) {
		this.ssnId = ssnId;
	}

	public String users() {
		return this.ssnId + " " + this.lname + " " + this.middleI;
	}
}
