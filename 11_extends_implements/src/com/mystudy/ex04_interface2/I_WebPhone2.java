package com.mystudy.ex04_interface2;

//인터페이스에 모든 메소드를 직접 정의해서 만드는 방식
public interface I_WebPhone2 {
	//I_Phone 정의된 메소드 --------------------
	public abstract String getType();
	public String getPhoneNo(); //abstract 생략가능
	
	void call(); //public abstract 생략가능
	void receiveCall(); //public abstract 생략가능
	void view(); //public abstract 생략가능
	
	void sendMsg();
	void receiveMsg();
	
	//I_Mp3Phone 메소드 ---------------------------
	void playMusic(); //public abstract 메소드
	
	//web 검색
	void webSearch();
}








