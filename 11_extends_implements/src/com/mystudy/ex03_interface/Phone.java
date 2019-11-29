package com.mystudy.ex03_interface;
/* 전화기 
	속성 : 타입(type), 전화번호(phoneNo)
	기능
	- 전화 정보 확인 기능(view)
	- 전화걸기(call)
	- 전화받기(receiveCall)
	- 메시지 보내기
	- 메시지 받기
*/
class Phone {
	//필드(속성) ---------
	private String type; //전화기타입(형태)
	private String phoneNo; //전화번호
	
	//생성자 -------------
	//public Phone() {}
	public Phone(String phoneNo) {
		this.type = "Phone 타입";
		this.phoneNo = phoneNo;
	}

	public Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
	}

	//메소드(기능) ----------
	public String getType() {
		return type;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	//전화걸기 기능
	public void call() {
		System.out.println(">> 전화걸기");
	}
	
	//전화받기 기능
	public void receiveCall() {
		System.out.println(">> 전화받기");
	}
	
	//전화정보 보기
	public void view() {
		System.out.println("타입 : " + type + ", 전화번호 : " + phoneNo);
	}
	
	//- 메시지 보내기
	public void sendSMS() {
		System.out.println(">> 메시지 보냄");
	}
	
	//- 메시지 받기
	public void receiveSMS() {
		System.out.println(">> 메시지 받음");
	}
}





