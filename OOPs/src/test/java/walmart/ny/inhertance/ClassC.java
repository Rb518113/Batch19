package walmart.ny.inhertance;

public class ClassC { 

	String firstName, lastName, adrees;
	int id;
	
	
	ClassC(String firstName, String lastName, String adrees , int id){
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.adrees= adrees;
		this.id = id;
		
		
		
	}
	
	
	void information() {
		
		System.out.println("First Name:" + firstName +"\n"+ "Last Name" + lastName);
		
		
	}
	
	
	
	
	
	
	
	
	
}

