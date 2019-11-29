package com.mystudy;

public class Ex03_method {  

	public static void main(String[] args) {
		Ex03_method ex03 = new Ex03_method();
		int num1 = 200;
		int num2 = 100;
		int sum = 0;
		sum = ex03.add(num1, num2);
		System.out.println("sum : " + sum);
		System.out.println("sub : " + ex03.sub(num1, num2));
		System.out.println("mul : " + ex03.mul(num1, num2));
		System.out.println("div : " + ex03.div(num1, num2));
	}

	int add(int a, int b) {
		return a + b;
	}
	
	int sub(int a, int b) {
		return a - b;
	}
	
	int mul(int a, int b) {
		return a * b;
	}
	
	int div(int a, int b) {
		return a / b;
	}
}





