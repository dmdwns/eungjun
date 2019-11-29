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
		
		System.out.println("----- sound() 호출 -----");
		sound(an);
		sound(cat);
		sound(dog);
		sound(pig);
		
	}
	
	private static void sound(Animal animal) {
		animal.sound();//부모클래스에 sound 정의되면 사용가능
	}

	
	

/*
	//메소드 오버로딩(over loading) 새로운게 나올때마다 메소드 갱신해야함	
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
	//상위클래스 타입으로 전달받아 저장객체 찾은후 동작(instanceof 사용)
	static void sound(Animal animal) {
		System.out.println(">>>>>sound(Animal) 실행");
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

















