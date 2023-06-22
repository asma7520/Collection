package quiz_HashSet;

import java.util.HashSet;

public class Quiz_19 {

	public static void main(String[] args) {
		
		HashSet <String> courseNames;
		courseNames = new HashSet <String> ();
		
		courseNames.add("java");
		courseNames.add("python");
		courseNames.add("c++");
		courseNames.add("c");
		courseNames.add("Advance programming");
		System.out.println(courseNames.size());
		System.out.println(courseNames);
		
		courseNames.remove("Advance programming");
		System.out.println(courseNames.size());
		System.out.println(courseNames);
	
		courseNames.add("CSE");
		System.out.println(courseNames.size());
		System.out.println(courseNames);

	}

}
