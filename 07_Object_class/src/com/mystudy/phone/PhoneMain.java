package com.mystudy.phone;

public class PhoneMain {

	public static void main(String[] args) {
		Phone ph1 = new Phone("갤럭시S10", "010-1111-1111");
		ph1.view();
		ph1.call();
		ph1.receiveCall();
		ph1.sendSms("안녕하세요~~~");
		ph1.receiveSms("자바 배우는데 힘들고 지겹고 고통스러워요 ㅠㅠ");
		
		String msg = ph1.receiveSms("자바 배우는데 재밌네~~ ^^");
		System.out.println("return값 : " + msg);

		System.out.println("=================");
		Phone ph2 = new Phone();
		ph2.view();
		ph2.call();
		ph2.receiveCall();
		ph2.sendSms("Hello~~");
		
		System.out.println(ph2);
		
	}

}





