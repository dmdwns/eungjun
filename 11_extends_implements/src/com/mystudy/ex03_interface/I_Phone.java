package com.mystudy.ex03_interface;

//인터페이스 : 추상체
public interface I_Phone {
	//{} 없음 : 추상메소드(abstract method)
	//public abstract 메소드임
	public abstract String getType();
	public String getPhoneNo(); //abstract 생략가능
	
	void call(); //public abstract 생략가능
	void receiveCall(); //public abstract 생략가능
	void view(); //public abstract 생략가능
	
	void sendMsg();
	void receiveMsg();
}






