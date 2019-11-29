package com.study.ex01_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		//List계열 : ArrayList - 배열 속성과 List 속성을 가짐
		// - List 인터페이스를 상속 구현(implemests)하는 클래스
		// - List 인터페이스를 확장(extends)해서 인터페이스
		
		ArrayList list1=new ArrayList();// 형지정 안하면 모든걸 다룰 수 있음
		System.out.println("list1의 크기 : " + list1.size()); // .size() : 크기
		
		list1.add(new Integer(5));
		list1.add(1);//int -> Integer 자동형변환 되어 입력됨
		list1.add(new Integer(5)); // 값에 대한 중복은 허용
		list1.add(new Integer(6));
		list1.add(new Integer(7));
		System.out.println(list1.toString()); //문자열로 리턴
		System.out.println("list1의 크기 : " + list1.size());
		
		list1.add(0, 100); //인덱스위치, 인덱스위치에 입력한 데이타 추가
		System.out.println("0인덱스에 100 .add후 : " + list1.toString());
		
		list1.set(0, 999); //인덱스위치, 인덱스위치의 데이타를 입력한 데이타로 수정
		System.out.println("0인덱스에 999 .set후 : " + list1.toString());
		
		list1.remove(0); //0번 위치의 데이타 삭제
		System.out.println("0인덱스에 .remove후 : " + list1.toString());
		
		
		//list1.remove(5); //숫자5를 삭제하겠다가 아닌 인덱스 5번 인덱스 삭제로 동작
		list1.remove(new Integer(5)); //새로운 Integer타입을 만들어서 삭제해야함
		System.out.println("숫자 Integer5 삭제후 : " + list1.toString());
		
		Object obj = list1.get(0); //0번 인덱스 값 확인, 형 지정 안했으므로 Object로 해야함
		System.out.println("0번 인덱스 값 : " + obj);
		
		Collections.reverse(list1);//.reverse : 데이타 바꾸기
		System.out.println(".reverse 적용 : " + list1.toString());
		System.out.println("----------------------------");
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // .subList(시작,숫자전까지) list1의 1번인덱스부터 3번 인덱스 까지 가져온다
		System.out.println("list2 : " + list2);
		
		System.out.println("----- Collection.sort() -----");
		System.out.println("list1 : " + list1);
		Collections.sort(list1); //Collections <- 클래스 메소드, .sort()오름차순 정렬
		System.out.println(".sort(list1) 정렬후 : " + list1);
		
		Collections.sort(list2);
		System.out.println(".sort(list2) 정렬후 : " + list2);
		
		System.out.println("----- Collection.reverse() -----");
		//reverse() : 처음과 끝 위치를 서로 바꾸는 형태로 동작(정렬과는 무관)
		Collections.reverse(list1);
		System.out.println(".reverse(list1) 후  list1 : " + list1);
		
		System.out.println("===============================");
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		
		list2.add("B"); //add()맨 뒷쪽에추가
		list2.add("TEST");
		System.out.println("list2 : " + list2);
		System.out.println("첫번째 데이타 조회 : " + list2.get(0));
		System.out.println("마지막 데이타 조회 : " + list2.get(list2.size()-1));
		
		System.out.println("--------------------------");
		for(int i=0; i<list2.size(); i++) {
			System.out.println(i + " - " + list2.get(i));
		}
		
		System.out.println("--------------------------");
		printData(list1);
		printData("list1", list1);
		printData("list2", list2);
		printData(list1,list2);
		System.out.println("=========================");
		//실습 : 반복문(for)을 사용하여 list2에 있는 데이타 전체 삭제
		
		//(문제있음)데이타가 모두 삭제되지 않고 남는 문제
//		list2.remove(0); //0번 위치의 데이타 삭제
//		System.out.println("0인덱스에 .remove후 : " + list2.toString());
//		list2.remove(0); //0번 위치의 데이타 삭제
//		System.out.println("1인덱스에 .remove후 : " + list2.toString());
//		list2.remove(0); //0번 위치의 데이타 삭제
//		System.out.println("2인덱스에 .remove후 : " + list2.toString());
//		list2.remove(0); //0번 위치의 데이타 삭제
//		System.out.println("2인덱스에 .remove후 : " + list2.toString());
//		list2.remove(0); //0번 위치의 데이타 삭제
//		System.out.println("2인덱스에 .remove후 : " + list2.toString());
		
//		for(int i=0; i<list2.size(); i++) {
//			list2.remove(i);
//		}
//		printData(list2);
		
		/*
		System.out.println("------");
		//문제있음
		int list2Cnt=list2.size();
		for(int i=0; i<list2.size(); i++) {
			printData(">>list2",list2);
			list2.remove(i);
		}
		printData("list2",list2);
		*/
		
		/*
		//해결1 : 갯수만큼 0번 인덱스 값 삭제 처리
		int list2Cnt=list2.size();
		for(int i=0; i<list2Cnt; i++) {
			printData("삭제진전>>list2",list2);
			list2.remove(0);
		}
		printData("최종결과>>list2",list2);
		*/
		
		/*
		//해결2 : 갯수만큼 뒤에서부터 삭제 처리
		//맨마지막 데이터 삭제, 뒤에서2번째, 뒤에서 3번째, ... , 뒤에서 0번째
		int lastIdex=list2.size()-1;
		for(int i=lastIdex; i>=0; i--) {
			printData("삭제진전>>list2",list2);
			list2.remove(i);
		}
		printData("최종결과>>list2",list2);
		*/
		
		//해결3: 메소드 존재
		printData("삭제진전>>list2",list2);
		list2.clear();
		
		
		
		
	}
	//매소드 만들기
	static void printData(List list1, List list2) {
		printData("list1", list1);
		printData("list2", list2);
		System.out.println();
	}
	
	//메소드 만들기
	static void printData(List list) {//자바유틸사용(이미 존재하는 명령어 List)
		//null 여부 확인
		if(list==null) return;
		if(list.size() > 0) {//최소 하나이상의 데이타가 있냐
			System.out.print(list.get(0));//하나 이상의 데이타가 있으므로 0번 인덱스 인식
		}
		for(int i=1; i<list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
		
	}
	
	static void printData(String title, List list) {
		//null 여부 확인
		if(list==null) {
			System.out.println(title + " : - null");
			return;
		}
		if(list.size() == 0) {//null 은아니지만 데이타가 하나도 없음(객체만 생성)
			System.out.println(title + " : 데이타건수0");//하나 이상의 데이타가 있으므로 0번 인덱스 인식
			return;
		}
		System.out.print(title + " : " + list.get(0));
		
		for(int i=1; i<list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
		
	}
	
	
	

}






































