package practice_ArrayList;

import java.util.ArrayList;

public class ArrayList_String {

	public static void main(String[] args) {
		
		//interview question
				//can you declare an ArrayList of String 
				//and Store Dhaka, Dallas, Tampa values
				
				ArrayList<String> cities;
				cities = new ArrayList<String> ();
				
				cities.add("Dhaka");
				cities.add("Dallas");
				cities.add("Tampa ");
				cities.add(1, "Khulna");
				
				for(String city : cities ) {
					System.out.println(city );
				}
				System.out.println("---------------");
				
				//cities.remove(1);
				cities.remove("Dallas");
				
				for(String city : cities) {
					System.out.println( city);
				}
				
				

	}//main

}//class
		  //When we try to put a Key and Value
		  //within HashMap, first the equals method will check 
		 //whether both objects are equal and then it hashes 
		  //and find the bucket where to insert this Key and Value. 
		 //If both the objects are equal, it will override the already 
		 //existing Object in Bucket.In Short,  equals() will help us to
		//identify if the object is unique and HashCode helps 
		//us to identify the bucket in which the values has to be Stored.



	


