package com.mystudy.ex01_class;

public class PhoneTest {

	public static void main(String[] args) {
		//Phone°´Ã¼ »ý¼ºÈÄ ±â´É Å×½ºÆ®
		System.out.println("===== phone =====");
		Phone ph1 = new Phone("010-1111-1111");
		ph1.view();
		ph1.call();
		ph1.receivecall();
		
		Phone ph2 = new Phone("»ï¼º°¶·°½Ã","010-2222-2222");
		ph2.view();
		ph2.call();
		ph2.receivecall();
		
		System.out.println("===== mp3 =====");
		Mp3Phone mp3ph = new Mp3Phone("010-3333-3333");
		mp3ph.view();
		mp3ph.call();
		mp3ph.receivecall();
		mp3ph.playmusic();

	}

}
