package class_quiz;

import java.util.ArrayList;

public class Quiz_1 {

	public static void main(String[] args) {
	
		//Write a Java program to replace the 4th
		//element of a ArrayList with the specified element .
		//and remove second element.
		
		ArrayList<Integer> num;
		num = new ArrayList<Integer>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		
		System.out.println(num);
		
		num.set(3, 50);
		System.out.println(num);
		
		num.remove(1);
		System.out.println(num);
		
		

	}

}
