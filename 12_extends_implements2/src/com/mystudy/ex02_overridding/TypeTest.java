package com.mystudy.ex02_overridding;

public class TypeTest {

	public static void main(String[] args) {
		Animal an=new Animal();
		Cat cat=new Cat();
		Dog dog=new Dog();
		Pig pig=new Pig();
		
		an.eat();
		an.sleep();
		
		cat.sound();
		
		dog.sound();
		
		pig.sound();
		
		System.out.println("----- sound() ȣ�� -----");
		sound(an);
		sound(cat);
		sound(dog);
		sound(pig);
		
	}
	
	private static void sound(Animal animal) {
		animal.sound();//�θ�Ŭ������ sound ���ǵǸ� ��밡��
	}

	
	

/*
	//�޼ҵ� �����ε�(over loading) ���ο�� ���ö����� �޼ҵ� �����ؾ���	
	private static void sound(Cat cat) {
		cat.sound();
	}
	
	private static void sound(Dog dog) {
		dog.sound();
	}
	
	private static void sound(Pig pig) {
		pig.sound();
	}
*/
	
/*
	//����Ŭ���� Ÿ������ ���޹޾� ���尴ü ã���� ����(instanceof ���)
	static void sound(Animal animal) {
		System.out.println(">>>>>sound(Animal) ����");
		if(animal instanceof Cat) {
			((Cat) animal).sound();
		}else if(animal instanceof Dog) {
			((Dog) animal).sound();
		}else if(animal instanceof Pig) {
			((Pig) animal).sound();
		}
	}
*/

}

















