package quiz_ArrayList;

import java.util.ArrayList;

public class Quiz_21 {

	public static void main(String[] args) {
		/*
		Write a Java program to replace the 
		second element and remove the second element 
		of a ArrayList with the specified element.
		And remove second element.
		*/
		
		ArrayList <String> names;
		
		names = new ArrayList <String> ();
		
		names.add("Maria");
		names.add("Rahim");
		names.add("Joe");
		System.out.println("ArrayList: " +names);
		
		names.set(2 ,"Belal");
		System.out.println("Modified ArrayList: " + names);
		String removeName = names.remove(2);
		System.out.println("After Remove, ArrayList: "+names);
		System.out.println("Remove Element: "+ removeName );
		
		}

	}


