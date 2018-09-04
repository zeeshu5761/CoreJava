package com.corejava.oops;


//inheritance in form of class 
class Parent {
	public int add(int a, int b) {
		System.out.println("Parent.adding");
		return a + b;
	}

	public int mult(int a, int b) {
		System.out.println("Parent.multiply");
		return a * b;
	}
}

class Child1 extends Parent{
	@Override
	public int add(int a, int b) {
		System.out.println("Parent.adding");
		return a + b;
	}

	@Override
	public int mult(int a, int b) {
		System.out.println("Parent.multiply");
		return a * b;
	}
}

public class InheritanceByClass{
	public static void main(String[] args) {
		//type casting
		// downcasting
		//upcasting
		//type safety
		//class cast expcetion
		//method over riding(ovewr riding)
		//method over loading(overloading)
		//pollymorphism
		//compile time polly morphism
		//runtime pollymorphism
		
	}
}
