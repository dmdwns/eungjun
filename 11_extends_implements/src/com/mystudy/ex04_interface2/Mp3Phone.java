package com.mystudy.ex04_interface2;

//전화기 정보확인, 전화걸고, 전화받고, 문자주고, 문자받고, 음악플레이기능
//Phone 클래스를 상속 확장해서 사용하고 I_Mp3Phone 인터페이스를 구현해서 만듬 
public class Mp3Phone extends Phone implements I_Mp3Phone {
	
	public Mp3Phone(String phoneNo) {
		super("Mp3Phone타입", phoneNo);
	}

	public Mp3Phone(String type, String phoneNo) {
		super(type, phoneNo);
	}

	@Override
	public void playMusic() {
		System.out.println(">> Mp3Phone - 음악플레이");
	}

	
}





