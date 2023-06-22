package quiz_HashSet;

import java.util.HashSet;

public class Quiz_23 {

	public static void main(String[] args) {
		
		HashSet <String> prodNames;
		prodNames = new HashSet <String>();
		
		prodNames.add("Tulip");
		prodNames.add("Rose");
		prodNames.add("Daffodil");
		prodNames.add("Sunflower");
		prodNames.add("Bluebell");
		
		System.out.println(prodNames);
		
		for(String s:prodNames) {
			if(s == "Daffodil")
				System.out.println(s + " Found");
		}

	}

}
