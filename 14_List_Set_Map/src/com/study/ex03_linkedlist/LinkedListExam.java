package com.study.ex03_linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		// LinkedList : List계열
		LinkedList<String> list=new LinkedList();
		list.add("길동이");
		//list.add("길동이");
		//list.add("유신이");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println("--------------------------");
		
		String str="길동이,유신이,감찬이,을지문덕,홍경래";
		String[] strs=str.split(",");
		System.out.println("strs : " + Arrays.deepToString(strs));//데이타확인용
		
		//배열에 있는 데이터를 리스트에 추가
		for(int i=0; i<strs.length; i++) {
			list.add(strs[i]);
		}
		System.out.println("list : " + list);
		
		System.out.println("------------------------------");
		Collections.reverse(list);
		System.out.println(list); // 처음과 마지막, 두번째와 마지막전 맞교환
		
		Collections.sort(list); // 가나다 순서대로 정렬
		System.out.println(list);
		
		//유신이 삭제
		list.remove("유신이");
		System.out.println("유신이 삭제후 : " + list);
		
		//--------------------------------------
		//[실습] 을지문덕 -> 을지문덕2로 변경
		//1."을지문덕"이 어디에 있는지 찾는다
		//2.찾은 위치에 "을지문덕2"로 수정
		
		
		System.out.println("----- 이름바꾸기 실습 -----");
		System.out.println("list 바꾸기전 : " + list);
		//을지문덕 위치찾기
//		list.indexOf("을지문덕");
//		System.out.println(list.indexOf("을지문덕"));
		
//		//set을 사용한 수정
//		list.set(3, "을지문덕2");
//		System.out.println(list);
		
		//위아래 합쳐서
		list.set(list.indexOf("을지문덕"), "을지문덕2");
		System.out.println("list 바꾼후 : " + list);
		
		//VO타입일때는 indexOf 안먹는다. for문 getname()써서 찾아야함
		
		
	}

}


























