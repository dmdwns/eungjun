package com.mystudy.ex03_abstract_class;

public class TypeTest {

	public static void main(String[] args) {
		//Animal an = new Animal(); //�߻�Ŭ���� ��ü���� ����
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		sound(cat);
		sound(dog);
	}

	static void sound(Animal animal) {
		animal.sound(); //�޼ҵ� �������̵� ��� ���
	}
}






