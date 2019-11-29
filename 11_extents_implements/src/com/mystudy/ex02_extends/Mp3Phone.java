package com.mystudy.ex02_extends;

//Phone 클래스 상속받아(extends : 확장해서) Mp3Phone 만들기
class Mp3Phone extends Phone {
	
	Mp3Phone(String type, String phoneNo){
		super("Mp3Phone 타입", phoneNo);//부모클래스 생성자 호출
		
	}
	
	public void palyMusic() {
		System.out.println(">>Mp3phone-음악플레이");
	}

}
