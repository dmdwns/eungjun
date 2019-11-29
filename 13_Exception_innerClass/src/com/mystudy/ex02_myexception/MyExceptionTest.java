package com.mystudy.ex02_myexception;

public class MyExceptionTest {

	public static void main(String[] args) {
		System.out.println("--- main() ���� ---");
		//throw new MyException();
		try {
			firstMethod();
		} catch (MyException e) {
			//e.printStackTrace();
			System.out.println(">> main catch �� ����");
			System.out.println(">> �����޽��� : " + e.getMessage());
		}
		System.out.println("--- main() ���� ---");
	}

	static void firstMethod() throws MyException {
		System.out.println("--- firstMethod() ����");
		//throw new MyException(); //���� �߻�
		secondMethod();
		System.out.println("--- firstMethod() ��");
	}
	static void secondMethod() throws MyException {
		System.out.println("--- secondMethod() ����");
		throw new MyException(); //���� �߻�
	}
}





