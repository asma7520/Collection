package quiz_HashSet;

import java.util.HashSet;

public class Quiz_8 {

	public static void main(String[] args) {
		
		//Write the missing code to find books from this list
		
		HashSet <String> prodNames;
		prodNames = new HashSet <String> ();
		
		prodNames.add("pencil");
		prodNames.add("pen");
		prodNames.add("book");
		prodNames.add("staple");
		prodNames.add("book");
		System.out.println(	prodNames.size());
		System.out.println(prodNames);
		
		if(prodNames.contains(prodNames)) {
			System.out.println("book Found");
		}
		

	}

}
