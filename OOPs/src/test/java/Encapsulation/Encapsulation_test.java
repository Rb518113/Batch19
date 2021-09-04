package Encapsulation;

/*

No you can't make class private.

Raping the code from outside the world,
only showing the out come is Encapsulation


use private access modifier 
use getter and setter method



Finish within the class


*/
public class Encapsulation_test {


	private String jobName = "Automation Engineer";
	private int salary = 12000;
	
	
	public String getJobName() {
		
		return jobName;
		
	}
	
	
	public int getSalary() {
		
		return salary;
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		
		 Encapsulation_test obj = new  Encapsulation_test();
		
		 System.out.println("Rifat Bhuiyan: "+ obj.getJobName());
		 System.out.println("Salary: "+obj.getSalary());
		 
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
