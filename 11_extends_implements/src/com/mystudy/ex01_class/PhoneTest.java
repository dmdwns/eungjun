package com.mystudy.ex01_class;

public class PhoneTest {

	public static void main(String[] args) {
		// Phone ��ü ������ ��� �׽�Ʈ
		System.out.println("=== Phone ===");
		Phone ph1 = new Phone("010-1111-1111");
		ph1.view();
		ph1.call();
		ph1.receiveCall();
		
		Phone ph2 = new Phone("�Ｚ������", "010-2222-2222");
		ph2.view();
		ph2.call();
		ph2.receiveCall();
		
		System.out.println("==== MP3Phone ====");
		Mp3Phone mp3ph = new Mp3Phone("010-3333-3333");
		mp3ph.view();
		mp3ph.call();
		mp3ph.receiveCall();
		mp3ph.playMusic(); //Mp3Phone �������

	}

}
