package quiz_ArrayList;

import java.util.ArrayList;

public class Quiz_8 {

	public static void main(String[] args) {
		/*
		Write a code that  create ArrayList which
		 elements are:{34,56,801,670,5600, 150,142,2390,76}
		print “small number” for 0<number<=100
		print “medium number” for   100<number<=1000
		print “large number” 1000<number
		*/

		ArrayList <Integer> numbers;
		numbers = new ArrayList <Integer> ();
		
		numbers.add(34);
		numbers.add(56);
		numbers.add(801);
		numbers.add(670);
		numbers.add(5600);
		numbers.add(150);
		numbers.add(142);
		numbers.add(2390);
		numbers.add(76);
		
		System.out.println(numbers);
		
		System.out.println("size: "+numbers.size());
		
		for(int number : numbers) {
			if(number > 0 && number <= 100) {
				System.out.println(number + " small number");
			}
			else if(number > 100 && number <= 1000) {
				System.out.println(number + " medium number");
			}
			else if(number > 1000) {
				System.out.println(number + " large number");
			}
		}
		
	}

}
