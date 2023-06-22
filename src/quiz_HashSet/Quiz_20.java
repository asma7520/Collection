package quiz_HashSet;

import java.util.HashSet;

public class Quiz_20 {

	public static void main(String[] args) {
		
		HashSet <String> set;
		set = new HashSet <String> ();
		
		set.add("chair");
		set.add("table");
		set.add("board");
		set.add("pen");
		System.out.println("1st list of elements: "+set);
		set.remove("chair");
		System.out.println("After remove one elements: "+set);
		
		HashSet <String> set1;
		set1 = new HashSet <String> ();
		
		set1.add("laptop");
		set1.add("notebook");
		set.addAll(set1);
		System.out.println("Updated list: "+set);
		set.removeAll(set1);
		System.out.println("After use removeAll() method: "+set);
		set.removeIf(str->str.contains("table"));
		System.out.println("After use removeIf() method: "+set);
		

	}

}
