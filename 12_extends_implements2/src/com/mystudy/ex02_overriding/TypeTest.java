package com.mystudy.ex02_overriding;

public class TypeTest {

	public static void main(String[] args) {
		Animal an = new Animal();
		Cat cat = new Cat();
		Dog dog = new Dog();
		Pig pig = new Pig();
		
		an.eat();
		an.sleep();
		
		cat.sound();
		dog.sound();
		pig.sound();
		
		System.out.println("---- sound() �޼ҵ� ȣ�� ----");
		sound(an);
		sound(cat);
		sound(dog);
		sound(pig);
		
		System.out.println("===============");
		System.out.println("pig.name : " + pig.name);
		an = pig;
		System.out.println("an.name : " + an.name);
		
		System.out.println("==== Animal an <- Animal ==");
		an = new Animal();
		System.out.println("an.name : " + an.name);
		System.out.println("an.getName() : " + an.getName());
		
		System.out.println("==== Animal an <- Pig ==");
		an = new Pig();
		System.out.println("an.name : " + an.name
				+ " <- Animal Ÿ�Կ� �ִ� �ʵ� �� ����");
		System.out.println("an.getName() : " + an.getName()
				+ " <- Pig�� �ִ� �޼ҵ尡 �����");
	}

	private static void sound(Animal animal) {
		animal.sound();
	}

/*	
	//����Ŭ���� Ÿ������ ���޹޾� ���尴ü ã���� ��
	static void sound(Animal animal) {
		System.out.println(">>> sound(Animal) ����");
		//instanceof ��� - Ÿ��Ȯ�� �� �ش�Ÿ���� sound() �޼ҵ� ȣ��
		//Cat, Dog Ÿ�Կ� ���� Ÿ��üũ �� sound() ȣ��
		if (animal instanceof Cat) {
			((Cat)animal).sound();
		} else if (animal instanceof Dog) {
			((Dog) animal).sound();
		} else if (animal instanceof Pig) {
			((Pig) animal).sound();
		}
	}
*/

	/*	
	//�޼ҵ� �����ε�(overloading)
	private static void sound(Cat cat) {
		cat.sound();
	}
	private static void sound(Dog dog) {
		dog.sound();
	}
	private static void sound(Pih pig) {
		pig.sound();
	}
*/		
}








