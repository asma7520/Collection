package quiz_HashMap;

import java.util.HashMap;

public class Quiz_29 {

	public static void main(String[] args) {
		HashMap <String, String> empRecord;
		empRecord = new HashMap <String, String>();
		
		empRecord.put("name", "joe");
		
		empRecord.put("phone", "9999");
		
		empRecord.put("email", "abc.m.com");
		
		//to get + value
		
		for(String k: empRecord.keySet()) {
			System.out.println("keys of empRecord: "+ k);
			System.out.println("value of empRecord: " + empRecord.get(k));
		}

	}

}
