package com.mystudy.ex05_interface3;

//인터페이스 구성요소
// - 상수변수 : public static final 변수
// - 추상메소드 : public abstract 메소드

//자바8(JDK8)에서 추가된 요소
// - public default 메소드 : 기능구현 가능
// - public static 메소드 : 기능구현 가능
interface I_Phone {
	//상수화된 변수 : 인터페이스에 정의된 모든 변수는 public static final 변수임
	public static final boolean SUCCESS_CALL = true;
	boolean FAIL_CALL = true; //public static final 생략가능
	
	//public abstract : 추상메소드(abstract method)
	public abstract String getType();
	public String getPhoneNo(); //abstract 생략가능
	
	void call(); //public abstract 생략가능
	void receiveCall(); //public abstract 생략가능
	void view(); //public abstract 생략가능
	
	void sendMsg();
	void receiveMsg();
	
	//---------------------
	//public default 메소드
	public default void changNo(String PhoneNo) {
		//구현이 필요없으면 구현안해도 됨
	}
	
	//public static 메소드
	static void staticMethod() {
		System.out.println("I_Phone 인터페이스의 static 메소드~~~");
	}
}






