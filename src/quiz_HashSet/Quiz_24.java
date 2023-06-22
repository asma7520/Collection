package quiz_HashSet;

import java.util.HashSet;

public class Quiz_24 {

	public static void main(String[] args) {
		
		//Write a Java program to compare two sets
		//and retain elements which are same on both sets.
		
		HashSet <String> animals;
		animals = new HashSet <String>();
		
		animals.add("Cow");
		animals.add("Dog");
		animals.add("Parrot");
		animals.add("Cat");
		animals.add("Horse");
		animals.add("Tiger");
		animals.add("Eagle");
		System.out.println(animals);
		
		
		HashSet <String> animals1;
		 animals1 = new HashSet <String>();
		
		animals1.add("Parrot");
		animals1.add("Cat");
		animals1.add("Eagle");
		
		System.out.println("HashSet content:");
		animals.retainAll(animals1);
		System.out.println(animals);
		
		

	}

}
