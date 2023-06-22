package quiz_ArrayList;

import java.util.ArrayList;

public class Quiz_17 {

	public static void main(String[] args) {
		//add elements in the ArrayList
		
		ArrayList <String> animals ;
		
		animals = new ArrayList <String>();
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Horse");
		System.out.println("ArrayList: "+animals);
		
		//remove element from index 2
		
		String str = animals.remove(2);
		System.out.println("Updated ArrayList: " + animals);
		System.out.println("Remove Element: " + str);		

		
	}

}
