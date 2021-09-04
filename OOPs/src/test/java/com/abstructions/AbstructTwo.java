package com.abstructions;

public class AbstructTwo extends AbstructClass {

	public void AmazonCom() {
		System.out.println("Hello Java");
	}

	@Override
	public void getName() {
		System.out.println("I am complete");
		
	}
	
	
	
	public static void main(String[] args) {
		AbstructTwo obj = new AbstructTwo();
		obj.AmazonCom();
		obj.getName();
		
	}
	
	
	
}
