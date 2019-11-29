package com.mystudy.ex04_interface;

public class TypeTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.sound(); //Cat Ÿ��
		
		//eat(cat);
		sound(cat);
		sound(dog);
		
		//Animal an = new Cat();
		Animal an = cat; // Animal <- Cat
		an.sound(); //Animal.sound()
		
		sound(an); 

	}
	
	//�������̽�(I_Animal) Ÿ������ ����Ÿ�� ���޹޾Ƽ� ó��
	static void sound(I_Animal animal) {//I_Animal <- Animal
		//I_Animal.sound() ȣ��
		//(���������� cat.sound() ȣ�� - �޼ҵ� �������̵� ó���� ����)
		animal.sound(); 
	}
	
	static void eat(Animal animal) {
		animal.eat();
	}
}




