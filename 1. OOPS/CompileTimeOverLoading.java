package com.corejava.oops;

//Static Overloading
class OverLoadStatic {
	static int a = 20;
	public static int add(int a, int b) {
		return 2;
	}

	public static int add(int a, int b, int c) {
		return 3;
	}
}
public class CompileTimeOverLoading {
	public static void main(String[] args) {
		// System.out.println(OverLoadStatic.add(10, 29));
		System.out.println(OverLoadStatic.add(10, 29, 30));
		OverLoadStatic.a = 20;
		
	}
}
