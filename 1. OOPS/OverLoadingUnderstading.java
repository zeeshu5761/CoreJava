package com.corejava.oops;

public class OverLoadingUnderstading {
	public static void main(String[] args) {
		VehicleTest vehicleTest = new VehicleTest();
		vehicleTest.breakSystem(20);
		vehicleTest.breakSystem(20, 30);
	}

}

// Method overloading- can happen in same class
// 1.method name should same
// 2.input arguments can differ
// 3.return type can same or differ
class VehicleTest {
	public void breakSystem(int a, int b) {
		System.out.println("2");
	}
	
	public void acSystem(int a, int b) {
	}

	public void breakSystem(int a) {
		System.out.println("1");
	}
}