package practice_ArrayList;

import java.util.ArrayList;

public class ArrayList_GradeExample {

	public static void main(String[] args) {
	
		//Declare an ArrayList of Char
		//and store A B C D E values
		
		ArrayList <Character> letters;
		
		 letters = new 	ArrayList <Character> ();
		 
		 letters.add('A');
		 letters.add('B');
		 letters.add('C');
		 letters.add('D');
		 letters.add('E');
		 
		 for(char letter: letters) {
			 System.out.println(letter);
		 }

	}

}
