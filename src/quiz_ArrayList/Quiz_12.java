package quiz_ArrayList;

import java.util.ArrayList;

public class Quiz_12 {

	public static void main(String[] args) {
		
		ArrayList <String> empNames;
		empNames = new ArrayList <String> ();
		
		empNames.add("joe");
		empNames.add("maria");
		empNames.add("karim");
		empNames.add("john");
		empNames.add("maria");
		System.out.println("employee are : "+ empNames);
		System.out.println("size are: " + empNames.size());

	}

}
