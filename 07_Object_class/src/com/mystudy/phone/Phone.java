package com.mystudy.phone;

public class Phone {
	//필드변수 선언(인스턴스 변수)
	String name; //모델명
	String phoneNo; //전화번호
	int hsize; //가로크기
	int vsize; //세로크기
	boolean hasLCD; //LCD유무
	
	//생성자
	Phone() {} //기본생성자
	Phone(String name, String phoneNo) {
		this.name = name; //this 현재객체(인스턴스)
		this.phoneNo = phoneNo;
	}
	
	Phone(String name, String phoneNo, boolean hasLCD) {
		this.name = name; //this 현재객체(인스턴스)
		this.phoneNo = phoneNo;
		this.hasLCD = hasLCD;
	}
	
	//메소드 작성
	void view() {
		System.out.println("--- 전화기 정보 ---");
		System.out.println("모델명 : " + name);
		System.out.println("전화번호 : " + phoneNo);
		System.out.println("가로크기 : " + hsize);
		System.out.println("세로크기 : " + vsize);
		System.out.println("LCD유무 : " + hasLCD);
	}
	//전화걸기
	void call() {
		System.out.println(">> 전화걸기");
	}
	//전화받기
	void receiveCall() {
		System.out.println(">> 전화받기");
	}
	//메시지 보내기(전송)
	void sendSms(String msg) {
		System.out.println("[메시지전송] " + msg);
	}
	//메시지 받기(수신)
	String receiveSms(String msg) {
		//System.out.println("[메시지수신] " + msg);
		return "[메시지수신] " + msg;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", phoneNo=" + phoneNo + ", hsize=" + hsize + ", vsize=" + vsize + ", hasLCD="
				+ hasLCD + "]";
	}
	
	
}






