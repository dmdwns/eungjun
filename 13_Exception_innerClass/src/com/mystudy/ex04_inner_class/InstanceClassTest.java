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
	
	//����Ŭ���� : �ν��Ͻ� ����Ŭ����
	class Inner {
		int in = 100;
		void printData() {
			System.out.println(">>> ����Ŭ������ printData() ���� ---");
			System.out.println("int a : " + a);
			System.out.println("private int b : " + b);
			System.out.println("static int c : " + c);
			sum();
			System.out.println("sum : " + sum);
			
			System.out.println("����Ŭ���� �ʵ� in : " + in);
			
		}
	}

	public static void main(String[] args) {
		InstanceClassTest out = new InstanceClassTest();
		System.out.println("�ʵ庯�� a : " + out.a);
		
		System.out.println("---- ����Ŭ����(�ν��Ͻ�Ŭ����) ��� ---");
		//����Ŭ������ �ִ� printData() ����
		//Inner Ŭ������ ��ü ����
		//����Ŭ���� Ÿ�� : �ܺ�Ŭ������.����Ŭ������
		//���� Ŭ���� ��ü ���� : new InstanceClassTest().new Inner();
		//   - �ܺ�Ŭ���� ��ü ���� �� ���� Ŭ���� ��ü ����
		InstanceClassTest.Inner inner
				= new InstanceClassTest().new Inner();
		inner.printData();
	}

}




