package com.mystudy.ex04_inner_class;

interface TestInter {
	int DATA = 100; //상수
	void printData(); //추상메소드
}

class TestInterImpl implements TestInter {
	@Override
	public void printData() {
		System.out.println("printData()>>> 구현한 메소드");
	}
}

public class AnonymousClassTest {
	void test() {
		//익명클래스 : 이름이 없어서 한 번 사용되고 재상 안됨
		(new TestInter() {
			@Override
			public void printData() {
				System.out.println("익명클래스 printData() DATA : " + DATA);
			}
		}).printData();
	}
	
	public static void main(String[] args) {
		TestInter imp = new TestInterImpl();
		imp.printData();
		imp.printData();
		System.out.println("-----------");
		new TestInterImpl().printData();
		
		System.out.println("==========");
		AnonymousClassTest test = new AnonymousClassTest();
		test.test();
	}
}





