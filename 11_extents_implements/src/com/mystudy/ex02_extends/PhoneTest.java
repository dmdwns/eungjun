package com.mystudy.ex02_extends;



class PhoneTest {

	public static void main(String[] args) {
		//Phone, Mp3Phone 객체 생성후 기능 테스트
		System.out.println("===== phone =====");
		Phone ph1 = new Phone("010-1111-1111");
		ph1.view();
		ph1.call();
		ph1.receivecall();
		
		System.out.println();
		
		Phone ph2 = new Phone("삼성갤럭시","010-2222-2222");
		ph2.view();
		ph2.call();
		ph2.receivecall();
		
		System.out.println();
		
		System.out.println("===== mp3 =====");
		Mp3Phone mp3ph = new Mp3Phone("아이폰","010-3333-3333");
		mp3ph.view();
		mp3ph.call();
		mp3ph.receivecall();
		mp3ph.palyMusic();
		
		System.out.println("===== webPhone =====");
		WebPhone webph = new WebPhone("010-4444-4444");
		webph.view();
		webph.call();
		webph.receivecall();
		mp3ph.palyMusic();
		webph.Webphone();

	}

}










