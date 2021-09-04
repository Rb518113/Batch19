package walmart.ny.inhertance;

import java.util.Scanner;

public class ClassB extends ClassA{ // Child class, Sub Class

	
	
	public static void main(String[] args) {
		String userName, password;
		
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter Your USERNAME");
		userName = kb.next();
		System.out.println("ENTER YOUR PASSWORD");
		password = kb.next();
		

		ClassB obj = new ClassB();
		obj.getInfo(userName, password);
		
		
		
		
		
	
		
		
	
}
	
}
