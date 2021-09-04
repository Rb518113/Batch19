package Constructor;

public class ConstructorB extends ConstructorA {

	public static void main(String[] args) {
		ConstructorB obj = new ConstructorB(100);
		
		
		
		
	
	}
	
	ConstructorB(){
		 
		System.out.println("I am from class B 0 par");
	}
	
	ConstructorB(int grade){
     super(100);
		System.out.println("I am from class B 1 par");
	}
	

	
}
