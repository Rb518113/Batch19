package com.Inheritance.test;

public class ClassB  extends ClassA{

	
	public void getName() {
		
		System.out.println("I am the child class property!");
	}
	
	public static void main(String[] args) {
		
		
		ClassB par = new ClassB();
		par.getName();
		par.getSalary();
		
		
	}
	
}