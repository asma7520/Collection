package quiz_ArrayList;

import java.util.ArrayList;

public class Quiz_22 {

	public static void main(String[] args) {
		
		ArrayList <String> colors;
		colors = new ArrayList <String> ();
		
		colors .add("Red");
		colors .add("Green");
		colors .add("Black");
		colors .add("White");
		colors .add("Pink");
		
		System.out.println("Original ArrayList: " + colors);
		System.out.println("Is the ArrayList is empty? "+ colors.isEmpty()+ " and not empty");
 
		colors.remove("Red");
		colors.remove("Green");
		colors.remove("Black");
		colors.remove("White");
		colors.remove("Pink");
		System.out.println("Is the ArrayList is empty? "+ colors.isEmpty() + " and empty");
		
		
	}

}
