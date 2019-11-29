package com.study.ex02_Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExam {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		//Vector클래스 : List계열
		Vector<String> v=new Vector<>(5); //저장용량 5
		v.add("1"); //인덱스 : 0
		v.add("2"); //인덱스 : 1
		v.add("3"); //인덱스 : 2
		System.out.println(v); //저장공간은 5이지만 3개만 저장함
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());//저장할수 있는 용량, 용량지정 안하면 기본적으로 10제공
		
		String temp = v.toString(); //.toString() : 통상적으로는 문자열을 리턴
		System.out.println(temp);
		
		System.out.println("----- v.remove(2) -----");
		v.remove(2); //마지막 인덱스 삭제
		System.out.println("v.size() : " + v.size()); //사이즈는 하나줄고
		System.out.println("v.capacity() : " + v.capacity()); //용량은 그대로
		
		System.out.println("----- v.trimToSize() -----");
		v.trimToSize();//남은용량에 맞춰준다
		System.out.println("v.size() : " + v.size()); 
		System.out.println("v.capacity() : " + v.capacity());
		
		System.out.println("----- v.addElement() <- add랑 같다 -----");
		v.addElement("4");//add랑 같다 둘다 맨 뒤에 추가해준다
		System.out.println(v);
		
		v.add("AA"); //인터페이스에서는 add만 사용가능
		System.out.println(v);
		
		System.out.println("----- remove(), add(), set() -----");
		v.remove("2");// " "쓰면 2를 찾아서 지워줌
		System.out.println(v);
		
		v.add(2, "BB"); //2번인덱스에 BB를 삽입, 조회 : get
		System.out.println(v);
		
		v.set(2 , "CCC"); //2번 인덱스를 CCC로 수정/업데이트 한다
		System.out.println(v);
		
		System.out.println("v.size() : " + v.size()); 
		System.out.println("v.capacity() : " + v.capacity());
		
		System.out.println("----- 객체복사 clone() -----");
		Vector<String> v2=(Vector<String>)v.clone();
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2);
		
		System.out.println("----- v2.clear() 실행후 -----");
		v2.clear(); // 전체데이타 삭제
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2); //결론 : 벡터에서 클론은 새로운걸 만들어서 복사한다
		
		System.out.println("====== Enumeration 객체 사용 조회 ======");//전체데이터 조회
		Enumeration<String> enu = v.elements(); //
		while(enu.hasMoreElements()) {
			String str=(String)enu.nextElement();//타입지정 안하면 object타입,우리는 강제 String타입지정
			System.out.println("enu.nextElement() : " + str);
		}
		System.out.println(v);
		
		System.out.println("===== Iterator 활용 조회 =====");//하나씩 뽑아서 조회
		Iterator<String> ite = v.iterator();
		System.out.println("ite.hasNext() : " +ite.hasNext());
		while(ite.hasNext()) {
			String str=ite.next();
			System.out.println("ite.next() : " + str);
		}
		System.out.println("ite.hasNext() : " +ite.hasNext());
	}
}


























