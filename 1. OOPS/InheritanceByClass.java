package com.corejava.oops;


//inheritance in form of class 
abstract class Parent {
	public int add(int a, int b) {
		System.out.println("Parent.adding");
		return a + b;
	}

	abstract public int mult(int a, int b);
}

//vendor1
class Child1 extends Parent{
	/*@Override
	public int add(int a, int b) {
		System.out.println("Child.adding");
		return a +a+ b;
	}*/

	@Override
	public int mult(int a, int b) {
		System.out.println("Vendor1.multiply");
		return a *a* b;
	}
}


//vendor2
class Child2 extends Parent{
	/*@Override
	public int add(int a, int b) {
		System.out.println("Child.adding");
		return a +a+ b;
	}*/

	@Override
	public int mult(int a, int b) {
		System.out.println("Vendor2.multiply");
		return a *a* b*b;
	}
}

public class InheritanceByClass{
	public static void main(String[] args) {
		//type casting
		// downcasting
		//upcasting
		//type safety
		//class cast expcetion
		//method over riding(ovewr riding) -- runtime pollymorphism
		// method over loading(overloading) - pollymorphism
		//pollymorphism
		//multiple inheritance--interfaces
		//single inheritance--classes and interfaces
		
		
		//IIQ: In Java, Multiple inheritance not supported through classes.
		//java supports multiple inheritance through interfaces.
		
		//Parent parent = new Parent();
		Parent parent1 = new Child1();
		System.out.println(parent1.mult(10, 20));//overirding,method overriding,runtime polymorphism
		
		Parent parent2 = new Child2();
		System.out.println(parent2.mult(10, 20));
		
		
		///Example-2 for Type  Casting Understanding
		/*parent1 = parent2;//since both of them same behaviour because extended same classess
		
		Parent parent = new Parent() {
			@Override
			public int mult(int a, int b) {
				System.out.println("Parent.mult");
				return 0;
			}
		};
		
		
		Child1 child1 = (Child1) parent;//type safety problem
		//down casting--parent to child class
		System.out.println(child1.mult(10, 20));//IIQ
		
		//up casting--child to parent
		Parent parent3 = new Child1();//inheritance by default supports upcasting
*/		
			
		
		
	}
}
