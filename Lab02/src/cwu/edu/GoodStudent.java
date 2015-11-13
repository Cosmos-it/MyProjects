package cwu.edu;

import java.io.BufferedReader;
import java.io.IOException;

public class GoodStudent extends Person implements Comparable<GoodStudent> {

	// methods must be added to this based on the line above

	private String stdid;
	private String major;
	private Double gpa;
	private Person advisor;

	GoodStudent() {
		super("");
		stdid = "0000000";
		gpa = new Double(0.0);
	}

	GoodStudent(String nm, Double d) {
		super(nm);
		gpa = d;
	}

	static public GoodStudent readstud(BufferedReader f) throws IOException {
		String[] a;
		String ln = f.readLine();
		GoodStudent sd;

		if (ln != null) {
			a = ln.split("  *");
			sd = new GoodStudent(a[1], new Double(a[2]));
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

	@Override
	public int compareTo(GoodStudent o) {
		return this.stdid.compareTo(o.stdid);
		
	}
}















