package quiz_HashMap;

import java.util.HashMap;

public class Quiz_28 {

	public static void main(String[] args) {
		
		HashMap <String, String> empRecord;
		empRecord = new HashMap <String, String>();
		
		empRecord.put("name", "joe");
		System.out.println("name: " + empRecord.get("name"));
		
		empRecord.put("phone", "9999");
		System.out.println("phone: " + empRecord.get("phone"));

		empRecord.put("email", "abc.m.com");
		System.out.println("email: " + empRecord.get("email"));
		
		boolean r = empRecord.containsKey("id");
		if(r == true) {
			System.out.println("phone key exists in this MAP");
		}
		else
			System.out.println("Does not exist");
	}

}
