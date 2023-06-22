package practice_HashSet;

import java.util.HashSet;

public class HashSet_Example {

	public static void main(String[] args) {
		
		//Declare a HashSet of String
		//and Store Dhaka Athens Tampa  values in it
		
		HashSet <String> cities;
		cities = new HashSet <String> ();
		
		//in HashSet ,index number is not required
		
		cities.add("Dhaka");
		cities.add("Athens");
		cities.add("Tampa");
		
		
		boolean b = cities.contains("Tampa");
		System.out.println(b);
		
		for(String city : cities) {
			System.out.println( city );
		}
		
		/*HashSet
		 * Dhaka
		 * Athens
		 * Tampa
		 */

		cities.remove("Athens");
		
		
		
	}

}
