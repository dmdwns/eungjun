package com.mystudy.ex02_overriding;

class Pig extends Animal {
	String name = "����";
	void sound() {
		System.out.println(">> ��~~ ��~~~");
	}
	
	@Override
	String getName() {
		//return super.getName(); //�θ�Ÿ���� getName() ȣ��
		return name;
	}
}







