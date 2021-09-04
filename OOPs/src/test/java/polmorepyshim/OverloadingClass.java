package polmorepyshim;

public class OverloadingClass {
    String userName,firstName,lastName;
//
    
    
    
    
	
	public void getName() {
		
		System.out.println("Enter your name!");
	}
	public void getName(String name) {
		userName = name;
		System.out.println(userName);
		
		
	}
		
		
		
    public void getName(String firstName, String lastName) {
		userName=firstName +" "+ lastName;
		
		System.out.println(userName);
    	
	}
	
	
	
	
	
	
	
	
	
}
