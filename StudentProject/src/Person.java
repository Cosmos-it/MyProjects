public class Person {
	protected String name;
	Date dob;

	public Person() {
		setname("");
	}

	public Person(String name) {
		this.name = name;
		dob = new Date();
	}

	public Person(String name, String d) {
		this.name = name;
		dob = new Date(d);
	}

	public String toString() {
		return name;
	}

	protected void setname(String str) {
		name = str;
	}

}
