package com.mystudy.ex02_overriding;

class Animal {
	String name = "����"; //�̸�, ��Ī
	int legCnt; //�ٸ�����
	
	void eat() {
		System.out.println(">> �Դ´�");
	}
	void sleep() {
		System.out.println(">> ���� �ܴ�");
	}
	
	void sound() {
		System.out.println(">> ��������");
	}
	
	String getName() {
		return name;
	}
}




