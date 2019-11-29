package com.mystudy.ex03_abstract_class;

public class TypeTest {

	public static void main(String[] args) {
		//Animal an = new Animal(); //추상클래스 객체생성 못함
		Cat cat = new Cat();
		Dog dog = new Dog();
		
		sound(cat);
		sound(dog);
	}

	static void sound(Animal animal) {
		animal.sound(); //메소드 오버라이딩 기능 사용
	}
}






