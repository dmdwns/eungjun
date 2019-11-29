package com.mystudy.ex01_class;

class Mp3Phone {
	private String type;
	private String phoneNo;
	
	//생성자
	public Mp3Phone(String phoneNo) {
		type = "Mp3phone 타입";
		this.phoneNo=phoneNo;
	}
	
	public Mp3Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
	}



	//매소드
	public String getType() {
		return type;
	}

	public String getPhoneNo() {
		return phoneNo;
	}
	
	//전화걸기 기능
	public void call() {
		System.out.println(">>전화걸기");
	}
		
	//전화받기 기능
	public void receivecall() {
		System.out.println(">>전화받기");
	}
		
	//전화정보 보기
	public void view() {
		System.out.println("타입 : " + type + " , 전화번호 : " + phoneNo);
	}
	
	//음악플레이 기능--------------------
	public void playmusic() {
		System.out.println(">>음악플레이~~");
	}
	

	

}







