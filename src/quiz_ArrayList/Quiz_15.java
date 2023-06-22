package quiz_ArrayList;

import java.util.ArrayList;

public class Quiz_15 {

	public static void main(String[] args) {
		/*
		Write a code that  create ArrayList which 
		element are: A+, A,A-,B,C,F and R.
		print “80 to 100” for grade A+
		print “70 to 79”for grade A
		print “60 to 69”for grade A-
		print “50 to 59”for grade B
		print “40 to 49”for grade C
		print”0 to 39”for grade F
		unless “invalid”
		
*/
		
		ArrayList <String> grades;
		grades = new ArrayList <String> ();
		
		grades.add("A+");
		grades.add("A");
		grades.add("A-");
		grades.add("B");
		grades.add("C");
		grades.add("F");
		grades.add("R");
		
		System.out.println(grades);
		System.out.println("Size now : " + grades.size());
		
		for(String grade : grades) {
			if(grade == "A+") {
			System.out.println("80 to 100 for "+ grades.get(0));
			}
		else if(grade == "A") {
			System.out.println("70 to 79 for "+ grades.get(1));
		}
		else if(grade == "A-") {
			System.out.println("60 to 69 for "+ grades.get(2));
		}
			
		else if(grade == "B") {
			System.out.println("50 to 59 for "+ grades.get(3));
		}
		else if(grade == "C") {
			System.out.println("40 to 49 for "+ grades.get(4));
		}
		
		else if(grade == "F") {
			System.out.println("0 to 39 for "+ grades.get(5));
		}
		else
			System.out.println("Invalid "+ grades.get(6));
		}
	
	}//main
	
}//class
		
	


