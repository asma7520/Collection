package quiz_HashSet;

import java.util.HashSet;

public class Quiz_17 {

	public static void main(String[] args) {
		
		//What is the output of this code?
		
		HashSet <String> prodNames;
		prodNames = new HashSet <String> ();
		
		prodNames.add("Tulip");
		prodNames.add("Rose");
		prodNames.add("Daffodil");
		prodNames.add("Sunflower");
		prodNames.add("Bluebell");
		
		System.out.println("Elements are "+prodNames);
		prodNames.clear();
		System.out.println("Elements after clear "+prodNames);

	}

}
