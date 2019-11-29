package com.mystudy.stringbuilder;

public class Ex01_StringBuffer {

	public static void main(String[] args) {
		// StringBuffer Ŭ����
		String str1 = "Hello";
		String str = new String("Hello Java!!!");
		System.out.println(str);
		
		//StringBuffer sb1 = "Hello"; //������
		StringBuffer sb1 = new StringBuffer();
		System.out.println("sb1.length() : " + sb1.length());
		System.out.println("sb1.capacity() : " + sb1.capacity());
		
		StringBuffer sb = new StringBuffer("Hello Java!!!");
		System.out.println(sb);
		System.out.println(sb.toString());
		
		String sbValue = sb.toString();
		System.out.println("sb.toString() : " + sbValue);
		
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity());

		System.out.println("----- append() ----");
		sb.append(" �ݰ����ϴ�").append("~~~~");
		System.out.println(sb.toString());
		
		sb.reverse(); //���ڿ� ������
		System.out.println(sb);
		System.out.println(sb.reverse()); //����Ÿ ������
		System.out.println(sb);
		
		System.out.println("=== delete(), insert(), replace() ===");
		//Hello Java!!! �ݰ����ϴ�~~~~
		System.out.println("sb.delete(0, 6) : " + sb.delete(0, 6));
		System.out.println(sb);
		
		sb.insert(0, "Hello ");
		System.out.println("sb.insert(0, \"Hello \") : " + sb);
		
		sb.replace(0, 5, "Hi,");
		System.out.println("sb.replace(0, 5, \"Hi,\") : " + sb);
		
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity());
		sb.append(" �ڹٰ��� ��ճ׿�~~ ���� ��������?");
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity());
		
		//======================================
		System.out.println("---- trimToSize() -------");
		sb.trimToSize();
		System.out.println("sb.length() : " + sb.length());
		System.out.println("sb.capacity() : " + sb.capacity());
		
		System.out.println("==========================");
		StringBuffer sb2 = new StringBuffer(100);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		System.out.println("----");
		
		//sb2.append("�ȳ��ϼ���");
		//sb2.append(" �ݰ����ϴ�!!");
		sb2.append("�ȳ��ϼ���").append(" �ݰ����ϴ�!!");
		System.out.println("sb2 : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println(">> trimToSize() ---------");
		sb2.trimToSize();
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println(">> append() ������");
		sb2.append(" �ڹٰ�����~~");
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
		
		System.out.println(">> setLength() ����ó�� ---");
		System.out.println("sb2(������) : " + sb2);
		sb2.setLength(5); //
		System.out.println("sb2(������) : " + sb2);
		System.out.println("sb2.length() : " + sb2.length());
		System.out.println("sb2.capacity() : " + sb2.capacity());
	}

}














