package quiz_HashMap;

import java.util.HashMap;

public class Quiz_26 {

	public static void main(String[] args) {
	
		HashMap <String, String> courseRecord;
		courseRecord = new HashMap <String, String> ();
		
		courseRecord.put("name1", "c++");
		System.out.println("name1: "+ courseRecord.get("name1"));
		courseRecord.put(null, "2313");
		System.out.println(courseRecord.size());
		
		System.out.println("name2: "+ courseRecord.get("name2"));
		courseRecord.put("name3", "java");
		System.out.println("name3: "+ courseRecord.get("name3"));
		
		System.out.println(courseRecord.size());
		
		System.out.println("name2: "+ courseRecord.get("name2"));
		
		courseRecord .put("name2", "python");
		System.out.println("name2: "+ courseRecord.get("name2"));
		
		System.out.println("name1: "+ courseRecord.get("name1"));
		System.out.println("name2: "+ courseRecord.get(null));
		System.out.println("name3: "+ courseRecord.get(null));
		System.out.println(courseRecord.get("invalidkey"));
		
		System.out.println(courseRecord.size());
		System.out.println(courseRecord);
		
		//to get key + value
		
		for(String k: courseRecord.keySet()) {
			System.out.println("keys of courseRecord: " + k);
			System.out.println("value of courseRecord: " +courseRecord.get(k));
		}
		
		//to get value
		for(String v: courseRecord.values()) {
			System.out.println("value ONLY of courseRecord: " + v);
		}

	}

}
