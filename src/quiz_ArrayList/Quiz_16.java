package quiz_ArrayList;

import java.util.ArrayList;

public class Quiz_16 {

	public static void main(String[] args) {
		/*
		Write a code that  create ArrayList which can print:
			ArrayList: [ Java, Python, C++]
			Modified ArrayList: [ Java, Python, JavaScript]
  */
		
		ArrayList <String> languages;
		
		languages = new ArrayList <String> ();
		
		languages.add("Java");
		languages.add("Python");
		languages.add("C++");
		System.out.println("ArrayList: " + languages);
		
		languages.remove(2);
		
		languages.add("JavaScript");
		System.out.println("Modified ArrayList: " + languages);
		
		
		
		
		
	}

}
