package lab2;

import java.util.ArrayList;
import java.util.Vector;
import java.util.HashSet;

public class CollectionClass {

	public static void main(String[] args) {
		System.out.println("ArrayList");
		ArrayList<String> city = new ArrayList<>();//syntax to create array list
		city.add("City1");
		city.add("City1");
		city.add("City2");
		System.out.println("values of arraylist" + city);
		System.out.println("values of arraylist" + city.get(2));
		
		Vector<Integer> vectors = new Vector();
		vectors.add(1);
		vectors.add(23);
		vectors.add(15);
		System.out.println("vlues of vector" + vectors);
		System.out.println("vlues of vector" + vectors.get(2));
		
		System.out.println("HashSet");
		HashSet<String> sets = new HashSet<>();
		sets.add("City1");
		sets.add("City17");
		sets.add("City51");
		sets.add("City12");
		sets.add("City2");
		
		System.out.println("Values of cities" + sets);
		

	}

}
