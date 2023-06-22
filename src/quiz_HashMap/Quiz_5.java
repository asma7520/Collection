package quiz_HashMap;

import java.util.HashMap;

public class Quiz_5 {

	public static void main(String[] args) {
		
		HashMap<String,String> empInfos;
		
        empInfos = new HashMap<String,String>();
		
		empInfos.put("id", "123");
		empInfos.put("name", "joe");
		empInfos.put("roll", "12");
		
		System.out.println("id: "+empInfos.get("id"));
		System.out.println("name: "+empInfos.get("name"));
		System.out.println("roll: "+empInfos.get("roll"));
		
	}

}

	


