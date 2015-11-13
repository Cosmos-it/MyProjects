package Lab5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;

public class MainClient {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("wsa-cities.txt"));

		City[] array = new City[200];

		while (reader.ready()) {
			String reading = reader.readLine();
			String [] item = reading.split("  *");
			City cities = new City();
			cities.setCityName(item[0]);
			cities.setProvinceName(item[1]);
			cities.setCountryName(item[2]);
			cities.setPopulation(Integer.parseInt(item[3]));

			for (int i = 0; i< array.length; i ++) {
				array[i] = cities;
			}
		}

		for (int i = 0; i< array.length; i ++) {
			System.out.println(array[i].toString());
		}

	}

}
