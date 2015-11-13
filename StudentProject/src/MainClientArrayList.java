import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Taban on 10/8/15.
 */
public class MainClientArrayList {

	public static void main(String[] args) throws IOException {

		ArrayList<Student> students = new ArrayList<>();

		FileReader fileReader = new FileReader("student.txt");
		BufferedReader br = new BufferedReader(fileReader);

		while (br.ready()) {
			Student student = Student.readstud(br);
			students.add(student);
		}

		System.out.print("All students\n");// Header
		System.out.println("ID         Name      GPA ");// Header
		System.out.println(""); // Space between the outputs
		for (Student student : students) {
			System.out.print(student);
		}

		System.out.println(""); // Space between the outputs

		System.out.print("GPA 3.20 Above\n");
		System.out.println("ID         Name      GPA ");// Header
		System.out.print("");
		for (Student student : students) {
			if (student.getGpa() > 3.20) {
				System.out.print(student);
			}
		}

		System.out.println(""); // Space between the outputs

		System.out.print("GPA 3.7 Above\n");
		System.out.println("ID         Name      GPA ");// Header
		System.out.print("");
		for (Student student : students) {
			if (student.getGpa() > 3.7) {
				System.out.print(student);
			}
		}
	}
}
