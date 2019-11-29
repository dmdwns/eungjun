package com.mystudy.string;

import java.util.Arrays;

public class Ex02_String_method {

	public static void main(String[] args) {
		// charAt()
		System.out.println("--- charAt() ---");
		String str = "Java World";
		System.out.println("str : " + str);
		System.out.println("str : " + str.toString());
		
		char ch = str.charAt(0);
		System.out.println("str.charAt(0) : " + ch);
		System.out.println("-------");
		
		//char[] ch2 = {str.charAt(0), str.charAt(1), str.charAt(2), str.charAt(3)};
		char[] ch2 = new char[4];
		for (int i = 0; i < ch2.length; i++) {
			ch2[i] = str.charAt(i);
		}
		System.out.println(Arrays.toString(ch2)); //[J, a, v, a]
		
		System.out.println("--- compareTo() ----");
		System.out.println("java vs java : " + "java".compareTo("java"));
		System.out.println("\"a\".compareTo(\"b\") : " + "a".compareTo("b"));
		System.out.println("\"a\".compareTo(\"a\") : " + "a".compareTo("a"));
		System.out.println("\"b\".compareTo(\"a\") : " + "b".compareTo("a"));
		System.out.println("\"c\".compareTo(\"a\") : " + "c".compareTo("a"));
		System.out.println("d".compareTo("a"));
		
		System.out.println("--- copyValueOf() ---");
		char[] ch3 = {'a', 'b', 'c', 'd'};
		System.out.println("ch3 : " + Arrays.toString(ch3));
		String str3 = String.copyValueOf(ch3);
		System.out.println("String.copyValueOf(ch3) : " + str3);
		
		// ���� ���ڿ� ���� Ȯ��
		System.out.println("--- startsWith() ----");
		System.out.println("str3 : " + str3);
		System.out.println("str3.startsWith(\"ab\") : " + str3.startsWith("ab"));
		System.out.println("str3.startsWith(\"ac\") : " + str3.startsWith("ac"));
		
		System.out.println("--- indexOf() ---");
		String str4 = "Java";
		System.out.println("str4 : " + str4);
		System.out.println(str4.indexOf("a"));
		
		System.out.println("--- isEmpty() ---");
		//str4 = "";
		System.out.println(str4.isEmpty());
		
		System.out.println("--- replace() ---");
		System.out.println("str4 : " + str4);
		System.out.println(str4.replace('a', 'b'));
		System.out.println("str4 : " + str4); //str4 ����Ÿ�� �״�� ����
		
		System.out.println("--- replaceAll() ---");
		str4 = "java java";
		System.out.println("str4 : " + str4);
		System.out.println("ja -> JA : " + str4.replaceAll("ja", "JA"));
		System.out.println("str4 : " + str4);
		
		System.out.println("ja -> JA : " + str4.replaceFirst("ja", "JA"));
		
		System.out.println("===== substring() =======");
		//     012345
		str = "Java World";
		System.out.println("str : " + str);
		System.out.println(str.substring(0)); //0���ε������� ������ ����
		System.out.println("str.substring(5) : " + str.substring(5)); //5���ε������� ������ ����
		
		//beginIndex : ������ġ �� ����(����)
		//endIndex : end ��������(������)
		System.out.println(str.substring(1, 3)); //�ε��� 1���� 3��������
		System.out.println("str.length() : " + str.length());
		System.out.println(str.substring(0, str.length()));
		
		//�ڿ��� 2�� ���� ���� �ϰ�
		System.out.println(str.substring(0, str.length() - 2));
		
		//���ڿ� -> char[] 
		System.out.println("--- toCharArray() ---");
		System.out.println("str : " + str);
		char[] ch4 = str.toCharArray();
		System.out.println(ch4);
		System.out.println("ch4 : " + Arrays.toString(ch4));
		System.out.println(Arrays.toString(ch4));
		System.out.println(ch4[0]);
		System.out.println(ch4[1]);
		
		System.out.println("--- toUpperCase(), toLowerCase(), trim() ---");
		str = "   Java  World   ";
		System.out.println("str: -" + str + "-");
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println("trim() : -" + str.trim() + "-");
		
		System.out.println("--- String.valueOf() ----");
		int num = 100;
		System.out.println(num + 1);
		System.out.println("" + num + 1);
		System.out.println(String.valueOf(num) + 1);
		
		String snum = String.valueOf(100); //"100" ���ڿ� ����
		String bstr = String.valueOf(true); //"true" ���ڿ� ����
		if ("true".equals(bstr)) {
			System.out.println("���ڿ� \"true\"�� bstr�� �ִ� ���ڿ��� ���� ���ڿ� \"true\"�Դϴ�.");
		}
	}

}















