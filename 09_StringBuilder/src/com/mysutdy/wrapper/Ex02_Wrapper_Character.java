package com.mysutdy.wrapper;

public class Ex02_Wrapper_Character {

	public static void main(String[] args) {
		// Character 클래스
		char ch='a';
		System.out.println(Character.isAlphabetic(ch));//한글 영문만 true 처리됨
		System.out.println("Character.isAlphabetic('한') : " + Character.isAlphabetic('한'));
		System.out.println("Character.isAlphabetic('0') : " + Character.isAlphabetic('0'));
		System.out.println("Character.isAlphabetic('+') : " + Character.isAlphabetic('+'));
		System.out.println("----------------------------");
		System.out.println(Character.isLetter('0'));//문자냐 따라서 false
		System.out.println(Character.isDigit('0'));//숫자냐 따라서 true
		System.out.println(Character.isUpperCase('A'));//대문자냐
		System.out.println(Character.isLowerCase('A'));//소문자냐
		System.out.println(Character.isWhitespace(' '));//isWhitespace : 안보이는값
		System.out.println(Character.isWhitespace('\t'));//탭위치로 이동하기때문에 빈공간
		
		System.out.println("===============================");
		char[] chs = {'한','a',' ','A','+','0'};
		for(int i=0; i<chs.length; i++) {
			System.out.print(chs[i] + " : ");
			if(Character.isDigit(chs[i])) {
				System.out.print(" 숫자");	
			}
			if(Character.isWhitespace(chs[i])) {
				System.out.print(" 공백");
			}
			if(Character.isUpperCase(chs[i])) {
				System.out.print(" 대문자");
			}
			if(Character.isLowerCase(chs[i])) {
				System.out.print(" 소문자");
			}
			if(Character.isLetter(chs[i])) {
				System.out.print(" 문자");
			}
			if(Character.isDefined(chs[i])) {
				System.out.print(" 유니코드입니다");
			}
			System.out.println();
		}
		
	}
	
}











