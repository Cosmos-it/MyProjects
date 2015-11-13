import java.util.*;
import java.io.*;

public class AnewTree {  

	static Individual [] personOfInterest = new Individual[500];
	

	public static void main (String[] argv) throws IOException{ 
		readIndividuals(); 
	} 
 
	/**
	 * reading a file of individuals
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * */
	private static void  readIndividuals() throws IOException {

		RandomIntGenerator ran = new RandomIntGenerator(0, 365);
		int date = 0;
		
		TreeMap<Individual, Integer> individulas = new TreeMap<Individual, Integer>();

		File ff =  new File("indiv.txt");
		Scanner  sfile = new Scanner( ff );
		
		

		String line;
		int l=0;
		while(sfile.hasNextLine() ) {
			line = sfile.nextLine();
			Individual ind = new Individual(line);
			date = ran.draw();
			individulas.put(ind, date);
		}

		Set<Individual> keys = individulas.keySet();
		for (Iterator<Individual> ind = keys.iterator(); ind.hasNext(); ){
			Individual key = ind.next();
			Integer value = individulas.get(key);
			System.out.println(key.name + key.ss + " Schedule " + value.intValue());
		}	
	}
} 


//  Individual class
class  Individual implements Comparable<Individual> {
	String ss;  //  idfield
	String name; // fullname

	Individual(){
	}

	Individual( String s, String n){
		ss = s;
		name =n;
	}

	//   Constructor 
	Individual( String line){
		String nm,ln;
		Scanner ms = new Scanner (line +"\n" );
		ss = ms.next();
		for (int i =0; i < 5 ; ++i) ms.next();
		name = ms.nextLine();
		//  System.out.println(name);

	}

	@Override
	public String toString() {
		return this.name + this.ss;
	}

	@Override
	public int compareTo(Individual o) {
		return this.ss.compareTo(o.ss);
	}

}
