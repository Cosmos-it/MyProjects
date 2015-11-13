package cwu.edu;

import java.io.*;

public class Student extends Person {

	private String stdid;
	private String major;
	private Double gpa;
	private Person advisor;

	Student() {
		super("");
		stdid = "0000000";
		gpa = new Double(0.0);
	}

	Student(String nm, Double d) {
		super(nm);
		gpa = d;
	}

	static public Student readstud(BufferedReader f) throws IOException {
		
		String[] a;
		String ln = f.readLine();
		Student sd;

		if (ln != null) {
			a = ln.split("  *");
			sd = new Student(a[1], new Double(a[2]));
			sd.stdid = a[0];
		} else {
			sd = null;
			System.out.println("File Read");
		}

		return sd;
	}

	public Double getGpa() {
		return gpa;
	}

	public String toString() {
		String output = stdid + " " + super.name + " " + gpa.toString();
		return output;
	}

}
