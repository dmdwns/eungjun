package com.mystudy.ex02_overridding;

class Dog extends Animal{
	@Override //부모클래스에서 사운드가 정의 됐으므로 오버라이드 가능
	void sound() {
		System.out.println(">>멍멍");
	}
}
