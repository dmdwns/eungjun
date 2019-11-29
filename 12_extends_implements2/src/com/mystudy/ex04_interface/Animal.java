package com.mystudy.ex04_interface;

public abstract class Animal implements I_Animal {

	@Override
	public void eat() {
		System.out.println(">> 먹는다");
	}
	@Override
	public void sleep() {
		System.out.println(">> 잠을 잔다");
	}
	@Override
	public abstract void sound(); //선언만 하고 구현은 하지 않는 추상메소드
}






