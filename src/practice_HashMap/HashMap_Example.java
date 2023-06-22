package practice_HashMap;

import java.util.HashMap;

public class HashMap_Example {

	public static void main(String[] args) {
	
		/*
		 * Key            :Value
		 * 
		 * String         :String
		 * firstName     :Maria
		 * lastName      :Rahman
		 * dob            10/10/1990
		 * phone          765432189
		 * salary         "900000.99"
		 * 
		 */
		 
       HashMap <String , String> empInfos;
       empInfos = new  HashMap <String , String> ();
       
       //No index required in HashMap
       //HashMap required key and value pairs
       
       empInfos.put("firstName","Maria");
       empInfos.put("lastName ","Rahman");
       empInfos.put("dob","10/10/1990");
       empInfos.put("phone","765432189");
       empInfos.put("salary", "900000.99");
       
       System.out.println(empInfos.get("salary"));
       
       for(String key : empInfos.keySet()) {
    	   System.out.println(key +  " " +empInfos.get(key));//key and value both
       }
       
       empInfos.remove("salary" ,"900000.99");
       
       for(String empInfo :  empInfos.values()) {
    	   System.out.println(empInfo);  //only value
    	   
       }
       
		
	}

}
