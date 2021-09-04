package walmart.ny.inhertance;

import java.util.Scanner;

public class ClassA { 


	
	String userName = "RifatBhuiyan"
	,
	password = "RifatBhuiyan0";
	
	  Scanner kb = new Scanner(System.in);
	

 
  
  //non-static return type one  parameterize method
  public  void getInfo(String name , String password ) {
	
	  
	  while(!userName.contentEquals(name)|| !password.contentEquals(password)) {
		  
			System.out.println("Enter Your USERNAME");
			userName = kb.next();
			System.out.println("ENTER YOUR PASSWORD");
			password = kb.next();
	  }
	  
	  
	  
	  
	  
	 if(userName.contentEquals(name)&& password.contentEquals(password)) {
		 String firstName, lastName, adreess;
		 int id;
		 
		
		
		System.out.println("Please Enter your First Name:");
	
		firstName = kb.next();
		System.out.println("Please Enter your Last Name:");
		lastName =kb.next();
		System.out.println("Please Enter your Adress:");
		adreess = kb.nextLine();
		System.out.println("Please Enter your ID:");
		id = kb.nextInt();
		 
		 
		 
		 
		
		 
		 ClassC obj = new ClassC(firstName,lastName,adreess,id);
		 obj.information();
		 
		 
	 }
	 
	 else
		 System.out.println("Wrong Password!");
	  
	  
  }
    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
