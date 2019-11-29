package com.mystudy.ex03_sungjuk;

//내가 사용할 예외(Exception) 만들기
//SungjukProcessException 예외 클래스를 만들어 예외를 그룹핑해서 사용 가능
public class JumsuOutOfValueException extends SungjukProcessException {
	public JumsuOutOfValueException() {
		super("점수범위(0~100)를 벗어난 값입니다.");
	}
}
