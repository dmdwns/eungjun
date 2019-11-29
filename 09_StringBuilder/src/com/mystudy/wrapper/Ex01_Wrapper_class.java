package com.mystudy.wrapper;

public class Ex01_Wrapper_class {

	public static void main(String[] args) {
		// Wrapper class : �⺻ ����Ÿ Ÿ���� Ŭ���� Ÿ�Ե��� ��Ī
		// �⺻����Ÿ Ÿ�� : ��ü �ҹ���, char, int...
		//   boolean, char, byte, short, int, long, float, double
		// Wrapper class : �⺻����Ÿ Ÿ���� ù���ڸ� �빮�ڷ� �ۼ�
		//    ���� : char -> Character, int -> Integer
		//   Boolean, Character, Byte, Short, Integer, Long, Float, Double
		int num = 100;
		//num = "100"; //Type mismatch: cannot convert from String to int
		System.out.println("num : " + num); 
		
		//Integer intNum = 100; //��밡��
		Integer intNum = new Integer(100);
		System.out.println("intNum : " + intNum);
		//intNum = "100"; //Type mismatch: cannot convert from String to Integer
		intNum = new Integer("123");
		System.out.println("intNum : " + intNum);
		
		intNum = 900; //Integer <- int : �ڵ�����ȯ
		num = intNum; //int <- Integer : �ڵ�����ȯ
		
		System.out.println("���� int �ִ밪 : " + Integer.MAX_VALUE);
		System.out.println("���� int �ּҰ� : " + Integer.MIN_VALUE);
		
		num = Integer.parseInt("999"); //int <- String
		intNum = Integer.valueOf("999"); //Integer <- String
		System.out.println("num + 1 : " + (num + 1));
		System.out.println("intNum + 1 : " + (intNum + 1));
		
		System.out.println("---- Boolean ----");
		Boolean bool = true;
		bool = new Boolean(true);
		bool = new Boolean("true"); //true <- "true"
		System.out.println("bool : " + true);
		if (bool) {
			System.out.println("bool ���� boolean true");
		}
		bool = new Boolean("true1");
		System.out.println("bool : " + bool);
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		
		System.out.println("----- String -> Boolean ----");
		bool = Boolean.valueOf("true");
		System.out.println("Boolean.valueOf(\"true\") : " + bool);
		
		bool = Boolean.valueOf("TRUE");
		System.out.println("Boolean.valueOf(\"TRUE\") : " + bool);
		
		bool = Boolean.valueOf("TRue");
		System.out.println("Boolean.valueOf(\"TRue\") : " + bool);
		
		bool = Boolean.valueOf("ture1"); //��ҹ��� ���о��� true�� �ƴϸ� false
		System.out.println("Boolean.valueOf(\"ture1\") : " + bool);
		
		System.out.println("------ Float, Double ���� -----");
		Float f = 10.5f; //Float <- float
		f = new Float(12.5f);
		f = new Float("12.5f");
		System.out.println("new Float(\"12.5f\") : " + f);
		
		String str = String.valueOf(10.5f); //String <- float
		str = String.valueOf(f); //String <- Float
		System.out.println("str : " + str);
		
		f = Float.valueOf(str); //Float <- String
		System.out.println("f : " + f);
	}

}







