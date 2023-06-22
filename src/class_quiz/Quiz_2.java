package class_quiz;

import java.util.ArrayList;

public class Quiz_2 {

	public static void main(String[] args) {
		
		/*
		Quiz:write a java programe to remove 
		duplicate elements from ArrayList..
		Input like: 2,5,5,7,8,9
		Output: 2,5,7,8,9
	*/

		ArrayList<Integer> num;
		num = new ArrayList<Integer>();
		
		num.add(2);
		num.add(5);
		num.add(5);
		num.add(7);
		num.add(8);
		num.add(9);
		
		System.out.println(num);
		
		num.remove(1);
		System.out.println(num);
	}

}
