package com.mystudy.ex04_inner_class;

class A { }

public class InstanceClassTest {
	int a = 100;
	private int b = 10;
	static int c = 200;
	int sum = 0;
	
	void sum() {
		sum = a + b;
	}
	
	//내부클래스 : 인스턴스 내부클래스
	class Inner {
		int in = 100;
		void printData() {
			System.out.println(">>> 내부클래스의 printData() 실행 ---");
			System.out.println("int a : " + a);
			System.out.println("private int b : " + b);
			System.out.println("static int c : " + c);
			sum();
			System.out.println("sum : " + sum);
			
			System.out.println("내부클래스 필드 in : " + in);
			
		}
	}

	public static void main(String[] args) {
		InstanceClassTest out = new InstanceClassTest();
		System.out.println("필드변수 a : " + out.a);
		
		System.out.println("---- 내부클래스(인스턴스클래스) 사용 ---");
		//내부클래스에 있는 printData() 실행
		//Inner 클래스의 객체 생성
		//내부클래스 타입 : 외부클래스명.내부클래스명
		//내부 클래스 객체 생성 : new InstanceClassTest().new Inner();
		//   - 외부클래스 객체 생성 후 내부 클래스 객체 생성
		InstanceClassTest.Inner inner
				= new InstanceClassTest().new Inner();
		inner.printData();
	}

}




