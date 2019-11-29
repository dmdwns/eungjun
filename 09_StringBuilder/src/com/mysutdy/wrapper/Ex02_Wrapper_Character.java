package com.mysutdy.wrapper;

public class Ex02_Wrapper_Character {

	public static void main(String[] args) {
		// Character Ŭ����
		char ch='a';
		System.out.println(Character.isAlphabetic(ch));//�ѱ� ������ true ó����
		System.out.println("Character.isAlphabetic('��') : " + Character.isAlphabetic('��'));
		System.out.println("Character.isAlphabetic('0') : " + Character.isAlphabetic('0'));
		System.out.println("Character.isAlphabetic('+') : " + Character.isAlphabetic('+'));
		System.out.println("----------------------------");
		System.out.println(Character.isLetter('0'));//���ڳ� ���� false
		System.out.println(Character.isDigit('0'));//���ڳ� ���� true
		System.out.println(Character.isUpperCase('A'));//�빮�ڳ�
		System.out.println(Character.isLowerCase('A'));//�ҹ��ڳ�
		System.out.println(Character.isWhitespace(' '));//isWhitespace : �Ⱥ��̴°�
		System.out.println(Character.isWhitespace('\t'));//����ġ�� �̵��ϱ⶧���� �����
		
		System.out.println("===============================");
		char[] chs = {'��','a',' ','A','+','0'};
		for(int i=0; i<chs.length; i++) {
			System.out.print(chs[i] + " : ");
			if(Character.isDigit(chs[i])) {
				System.out.print(" ����");	
			}
			if(Character.isWhitespace(chs[i])) {
				System.out.print(" ����");
			}
			if(Character.isUpperCase(chs[i])) {
				System.out.print(" �빮��");
			}
			if(Character.isLowerCase(chs[i])) {
				System.out.print(" �ҹ���");
			}
			if(Character.isLetter(chs[i])) {
				System.out.print(" ����");
			}
			if(Character.isDefined(chs[i])) {
				System.out.print(" �����ڵ��Դϴ�");
			}
			System.out.println();
		}
		
	}
	
}











