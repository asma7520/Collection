package practice_ArrayList;

import java.util.ArrayList;

public class ArrayList_Example {

	public static void main(String[] args) {

		//Angle brackets <>
		
		ArrayList<Integer> ages;
		ages = new ArrayList<Integer>();
		
		ages.add(45);
		ages.add(38);   // for add I have to use add method
		//  62
		ages.add(51);
		
		System.out.println(ages.get(0));
		System.out.println(ages.get(1));   // for print I have to use get method
		System.out.println(ages.get(2));
		
		for(int age : ages) {       //this is called For Each Loop
			System.out.println(age);
		}
		System.out.println("============");
		
		//ages.add(62);
		
		ages.add(2, 62);
		
		for(int age : ages) {
			System.out.println(age);
		}
		//ages.remove(1);
		ages.remove(ages.get(1));
		
		System.out.println("==========");
		
		ages.sort(null);  // for sorting number I have to use sort method
		
		for(int age : ages) {
			System.out.println(age);
		}
		
	
		
		
		
		
		
	}
}