package com.mystudy.ex02_extends;

//Phone Ŭ������ ��ҹ޾�(extends: Ȯ���ؼ�) Mp3Phone �����
class Mp3Phone extends Phone {

	Mp3Phone(String phoneNo) {
		super("Mp3Phone Ÿ��", phoneNo);
	}
	
	public void playMusic() {
		System.out.println(">> Mp3Phone - �����÷���");
	}
}
