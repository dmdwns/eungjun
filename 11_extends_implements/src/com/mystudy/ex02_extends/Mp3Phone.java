package com.mystudy.ex02_extends;

//Phone 클래스를 상소받아(extends: 확장해서) Mp3Phone 만들기
class Mp3Phone extends Phone {

	Mp3Phone(String phoneNo) {
		super("Mp3Phone 타입", phoneNo);
	}
	
	public void playMusic() {
		System.out.println(">> Mp3Phone - 음악플레이");
	}
}
