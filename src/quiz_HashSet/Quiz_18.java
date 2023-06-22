package quiz_HashSet;

import java.util.HashSet;

public class Quiz_18 {

	public static void main(String[] args) {
		
		HashSet <String> prodNames;
		prodNames = new HashSet <String> ();
		
		prodNames.add("Tulip");
		prodNames.add("Rose");
		prodNames.add("Daffodil");
		prodNames.add("Sunflower");
		prodNames.add("Bluebell");
		System.out.println(prodNames.size());
		System.out.println(prodNames);
		
		if(prodNames.contains("Bluebell")) {
			System.out.println("Bluebell Found");
		}
		for(String s:prodNames) {
			if(s == "Daffodil")
				System.out.println(s + " Found");
		}
		
	}

}
