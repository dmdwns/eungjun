package com.mystudy.ex03_vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		// Vector 클래스 : List 계열
		Vector<String> v = new Vector<String>(5); //저장용량 5
		v.add("1"); //index : 0
		v.add("2"); //index : 1
		v.add("3"); //index : 2
		System.out.println(v);
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		String temp = v.toString();
		System.out.println(temp);
		
		System.out.println("--- v.remove(2) 실행 후 ---");
		v.remove(2);//삭제(delete)
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		System.out.println("--- v.trimToSize() 실행 후 ---");
		v.trimToSize();
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		v.addElement("4");
		System.out.println(v);
		
		v.add("AA");//추가입력(맨 뒤에 insert)
		System.out.println(v);
		
		v.remove("2");
		System.out.println(v); //[1, 4, AA]
		
		v.add(2, "BB"); //삽입, 특정 위치에 입력(insert)
		System.out.println(v);
		
		v.set(2, "CCC"); //수정(update)
		System.out.println(v);
		
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());
		
		System.out.println("---- 객체복사 clone() ----");
		Vector<String> v2 = (Vector<String>) v.clone();
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2);
		
		System.out.println("--- v2.clear() 실행 후 ---");
		v2.clear();
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2);
		
		System.out.println("===== Enumeration 객체 사용 조회 ====");
		Enumeration<String> enu = v.elements();
		while (enu.hasMoreElements()) {
			String str = enu.nextElement();
			System.out.println("enu.nextElement() : " + str);
		}
		System.out.println(v);
		
		System.out.println("==== Iterator 활용 조회 ======");
		Iterator<String> ite = v.iterator();
		System.out.println("ite.hasNext() : " + ite.hasNext());
		while (ite.hasNext()) {
			String str = ite.next();
			System.out.println("ite.next() : " + str);
		}
		System.out.println("ite.hasNext() : " + ite.hasNext());
		
	}

}





