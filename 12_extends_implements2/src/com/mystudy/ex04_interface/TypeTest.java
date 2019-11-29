package com.mystudy.ex04_interface;

public class TypeTest {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		cat.sound(); //Cat 타입
		
		//eat(cat);
		sound(cat);
		sound(dog);
		
		//Animal an = new Cat();
		Animal an = cat; // Animal <- Cat
		an.sound(); //Animal.sound()
		
		sound(an); 

	}
	
	//인터페이스(I_Animal) 타입으로 데이타를 전달받아서 처리
	static void sound(I_Animal animal) {//I_Animal <- Animal
		//I_Animal.sound() 호출
		//(실제동작은 cat.sound() 호출 - 메소드 오버라이딩 처리에 의해)
		animal.sound(); 
	}
	
	static void eat(Animal animal) {
		animal.eat();
	}
}




