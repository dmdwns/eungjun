package com.mystudy.ex02_overridding;

class Cat extends Animal{
	/* 메소드 오버라이딩(method overriding) - 재정의(마지막)
	 상속관계(확장, extends)에 있는 클래스에서
	 수퍼(부모)타입에 있는 매소드를 서브(자녀타입) 클래스에서 재정의
	 -선언은 동일하고, 기능만 다르게 구현
	 -선언동일 : 리턴타입, 메소드명, 파라미터가 동일(타입, 갯수, 순서 일치)
	 접근제한자는 수퍼타입에서 지정한 것보다 작게 지정 못함
	 (예: 부모클래스 public - 자녀 public만 가능
	 	부모클래스 protected - 자녀 public, protected가능
	 	부모클래스 default - 자녀 public, protected, default 가능
	 	부모클래스 private - 자녀 private 만 가능)
	 */
	@Override
	void sound() {
		System.out.println(">>냐옹냐옹");
	}
}


