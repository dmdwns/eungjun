package com.mystudy.ex04_interface2;

//인터페이스 간에는 여러개를 상속확장(extends)해서 사용할 수 있다.
public interface I_WebPhone extends I_Phone, I_Mp3Phone {
	//I_Phone 정의된 메소드(상속확장 사용 extends)
	
	//I_Mp3Phone 메소드(상속확장 사용 extends)
	
	//web 검색
	void webSearch();
}








