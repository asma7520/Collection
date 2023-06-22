package practice_HashMap;

import java.util.HashMap;
import java.util.HashSet;



public class HashMap_Example2 {

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
		 HashSet<String >  emp;
	       emp = new  HashSet<String>  ();
	       
		emp.add(null);
		
       HashMap <String , String> empInfos;
       empInfos = new  HashMap <String , String> ();
       
       //No index required in HashMap
       //HashMap required key and value pairs
       
       empInfos.put("firstName","Maria");
       empInfos.put("lastName ","Rahman");
       empInfos.put("dob","10/10/1990");
       empInfos.put("phone","765432189");
       empInfos.put(null, "900000.99");
     
       
      
       int a = empInfos.size();
       System.out.println(a);
       
       for(String key : empInfos.keySet()) {
    	   System.out.println(key +  " " +empInfos.get(key));//key and value both
       }
       
      
       
		
	}

}
