package quiz_HashMap;

import java.util.HashMap;

public class Quiz_27 {

	public static void main(String[] args) {
	
		HashMap <String, Integer> map;
		map = new HashMap <>();
		
		map.put("vishal", 10);
		map.put("sachin", 20);
		map.put("vaibhav", 20);
		
		System.out.println("Size of map is:- "+map.size());
		System.out.println("Size of map is:- "+map);

	}

}
