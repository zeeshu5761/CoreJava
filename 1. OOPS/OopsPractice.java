package com.corejava.oops;

public class OopsPractice{
	
}

 interface AbstractionTest {
	public int add();
	public int sub();
	public int mult();
}


abstract class AbstractionTestImpl1 implements AbstractionTest{ //33% Absatraction
	public int add() {
		return 0;
	}
	public int sub() {
		return 0;
	}
	abstract public int mult();
}

class AbstractionTestImpl2 implements AbstractionTest{  //Concrete Class-0% Abstraction
	public int add() {
		return 0;
	}
	public int sub() {
		return 0;
	}
	public int mult() {
		return 0;
	}
}

//IQ. WHat is diffenrect between interface, abstract class and concrete class.
