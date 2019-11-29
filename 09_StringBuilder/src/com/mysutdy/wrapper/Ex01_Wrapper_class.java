package com.mysutdy.wrapper;

public class Ex01_Wrapper_class {

	public static void main(String[] args) {
		// Wrapper_class : 기본 데이타 타입의 클래스 타입들의 총칭
		// 기본데이타 타입 : 전체 소문자, char, int, ...
		// boolean, char, byte, short, int, long, float, double
		// Wrapper class : 기본데이타 타입의 첫글자를 대문자로 작성
		// 예외 : char->Character int->Integer
		// Boolean, Byte, Short,Long, Float, Double
		int num=100;
		System.out.println("num : " + num);
		
		//Integer inNum = 100; //예외 특이한 경우, 100지정
		Integer intNum=new Integer(100);// 정석, 객체가 하나 생성된다
		System.out.println("intNum : " + intNum);
		intNum = new Integer("100");//숫자인 경우에 한해 가능, String을 받는 생성자가 있기때문
		System.out.println("intNum : " + intNum);
		
		intNum = 900;//Integer <- int : 자동형변환
		num = intNum;//int <- Integer : 자동형변환
		
		System.out.println("정수형 int 최댓값 : " + Integer.MAX_VALUE);
		System.out.println("정수형 int 최댓값 : " + Integer.MIN_VALUE);
		
		num = Integer.parseInt("999");//Integer.parseInt : String 타입을 int 타입으로 변환
		intNum = Integer.valueOf("999");//Integer.valueOf : Interger타입을 String 타입으로 변환
		System.out.println("num+1 : " + (num+1));
		System.out.println("intNum+1 : " + (intNum+1));
		
		System.out.println("----- Boolean -----");
		Boolean bool = true;
		bool = new Boolean(true);
		bool = new Boolean("true"); //문자열 true 가 블린 true로 바뀐다
		System.out.println("bool : " + true);
		if(bool) {
			System.out.println("bool 값은 boolean true");
		}
		
		bool = new Boolean("true1");
		System.out.println("bool : " + bool);//true 아닌경우 모두 false
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		System.out.println("----- String -> Boolean -----"); //대소문자 관계없다
		bool = Boolean.valueOf("true");
		System.out.println("Boolean.valueOf(\"true\") : " + bool);
		
		bool = Boolean.valueOf("TRUE");
		System.out.println("Boolean.valueOf(\"TRUE\") : " + bool);
		
		bool = Boolean.valueOf("TRue");
		System.out.println("Boolean.valueOf(\"TRue\") : " + bool);
		
		System.out.println("----- Float, Double 동일 -----");
		Float f = 10.5f; // Float  <- float
		f=new Float(12.5f);
		f=new Float("12.5f");
		System.out.println("new Float(\"12.5f\") : " + f);
		
		String str = String.valueOf(10.5f);//String <- Float
		str=String.valueOf(f);//String <- Float
		System.out.println("str : " + str);
		
		f=Float.valueOf(str);
		System.out.println("f : " + f);
		
	}

}

















