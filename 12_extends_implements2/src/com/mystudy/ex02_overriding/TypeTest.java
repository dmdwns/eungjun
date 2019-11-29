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
		
		System.out.println("---- sound() 메소드 호출 ----");
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
				+ " <- Animal 타입에 있는 필드 값 읽음");
		System.out.println("an.getName() : " + an.getName()
				+ " <- Pig에 있는 메소드가 실행됨");
	}

	private static void sound(Animal animal) {
		animal.sound();
	}

/*	
	//상위클래스 타입으로 전달받아 저장객체 찾은후 동
	static void sound(Animal animal) {
		System.out.println(">>> sound(Animal) 실행");
		//instanceof 사용 - 타입확인 후 해당타입의 sound() 메소드 호출
		//Cat, Dog 타입에 대한 타입체크 후 sound() 호출
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
	//메소드 오버로딩(overloading)
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








