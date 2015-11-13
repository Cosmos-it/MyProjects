package cwu.edu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class MainClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BinarySearchTree<GoodStudent> bst = new BinarySearchTree<GoodStudent>();

		FileReader fileReader = new FileReader("goodst.csv");
		BufferedReader br = new BufferedReader(fileReader);


		while (br.ready()) {
			bst.add(GoodStudent.readstud(br));
		}
		
		for (GoodStudent read : bst) {
			System.out.println(read);
			
		}
	}
}

