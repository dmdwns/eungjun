package com.mystudy.phone;

public class PhoneMain {

	public static void main(String[] args) {
		Phone ph1 = new Phone("������S10", "010-1111-1111");
		ph1.view();
		ph1.call();
		ph1.receiveCall();
		ph1.sendSms("�ȳ��ϼ���~~~");
		ph1.receiveSms("�ڹ� ���µ� ����� ����� ���뽺������ �Ф�");
		
		String msg = ph1.receiveSms("�ڹ� ���µ� ��ճ�~~ ^^");
		System.out.println("return�� : " + msg);

		System.out.println("=================");
		Phone ph2 = new Phone();
		ph2.view();
		ph2.call();
		ph2.receiveCall();
		ph2.sendSms("Hello~~");
		
		System.out.println(ph2);
		
	}

}





