package COM.NY.BEGAIN;

public class StringClass {

	public static void main(String[] args) {
		
	// String store in Heap memory -immutable
		String name = "Smarttech";
		name = "Students";
		name = "eirn";
		
		name.concat("Name");
		
		
		
		
		System.out.println(name.charAt(1));
		System.out.println(name);
		
		//-----------------------Slow
		
		
	
		//No heap memory issue - String Buffer - Mmutable
		StringBuffer obj = new StringBuffer("Smart ");
		obj.append("Tech");
		
		
		
		
		//obj.append("Tech");
		System.out.println(obj);
		
		
		
		

		
		
		// The both of String buffer and String builder mutable
		//But 
		//Sycnchonized-  String buffer
		//But nor String Builder 
		
		 
		
/*
 * Why String is a immutable because we can't change the value
 * 
 * 
 * 
 * 
 * 		
 */
		

		
		// we use if else condition for the match 
		//expectation and actual result
		
	}
	
	
	
	
	
	
}
