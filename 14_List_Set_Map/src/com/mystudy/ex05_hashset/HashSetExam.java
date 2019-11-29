package com.mystudy.ex05_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		// HashSet : Set 인터페이스를 구현한 구현체(클래스)
		//HashSet<String> set = new HashSet<>(); //클래스타입변수 <- 클래스객체

		//인터페이스 타입변수 <- 인터페이스를 구현한 클래스의 객체(인스턴스)
		Set<String> set = new HashSet<>();
		
		set.add("1");
		//set.add(100); //제너릭 타입 설정에 따라 문자열(String)만 사용가능
		set.add("홍길동");
		set.add("홍길동");
		set.add(new String("홍길동"));
		System.out.println(set);
		
		set.remove("1");
		System.out.println(set);
		
		System.out.println("set.contains(\"홍길동\") : " 
				+ set.contains("홍길동"));
		System.out.println("set.size() : " + set.size());
		
		set.add("김유신");
		set.add("을지문덕");
		set.add("홍경래");
		System.out.println(set);
		
		System.out.println("----- Set 전체 데이타 조회(Iterator) ---");
		Iterator<String> ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("----------");
		
		//실습(수정) : 김유신 -> 강감찬 (변경처리)
		//김유신 삭제하고 강감찬 입력
		//강감찬 입력하고 김유신 삭제
		System.out.println("---- 김유신 ==> 강감찬(수정) ---");
		if (set.contains("김유신")) {
			set.remove("김유신");
			set.add("강감찬");
		} else {
			System.out.println("데이타 없음");
		}
		System.out.println(set);
	}

}








