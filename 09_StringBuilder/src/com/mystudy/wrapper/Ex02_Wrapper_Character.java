package com.mystudy.wrapper;

public class Ex02_Wrapper_Character {

	public static void main(String[] args) {
		// Character Ŭ����
		char ch = 'a'; //'a' ���� ���� "a": String
		System.out.println(Character.isAlphabetic(ch)); //true
		System.out.println("Character.isAlphabetic('��') : " 
				+ Character.isAlphabetic('��')); //true
		System.out.println("Character.isAlphabetic('0') : " 
				+ Character.isAlphabetic('0')); //false
		System.out.println("Character.isAlphabetic('+') : " 
				+ Character.isAlphabetic('+')); //false
		System.out.println("----------------------");
		System.out.println(Character.isLetter('0')); //false
		System.out.println(Character.isDigit('0')); //true
		System.out.println(Character.isUpperCase('A')); //true
		System.out.println(Character.isLowerCase('A')); //false
		System.out.println(Character.isLowerCase('a')); //true
		System.out.println(Character.isWhitespace(' ')); //true
		System.out.println(Character.isWhitespace('\t')); //true
		System.out.println(Character.isWhitespace('A')); //false
		
		System.out.println("===========================");
		char[] chs = {'��', 'a', ' ', 'A', '+', '0'};
		for (int i = 0; i < chs.length; i++) {
			System.out.print(chs[i] + " : ");
			if (Character.isDigit(chs[i])) {
				System.out.print(" ����");
			}
			if (Character.isWhitespace(chs[i])) {
				System.out.print(" ����");
			}
			if (Character.isUpperCase(chs[i])) {
				System.out.print(" ��");
			}
			if (Character.isLowerCase(chs[i])) {
				System.out.print(" ��");
			}
			if (Character.isLetter(chs[i])) {
				System.out.print(" ����");
			}
			if (Character.isDefined(chs[i])) {
				System.out.print(" �����ڵ��Դϴ�.");
			}
			System.out.println();
		}
	}

}








