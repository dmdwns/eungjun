package com.study.ex08_list_set_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class List_Set_Map {

	public static void main(String[] args) {
		// 1. List 사용
		//	- 이름등록 : 홍길동, 강감찬, 박나래, 이순신
		//	- 출력 : index : 이름(데이터)
		//	- 수정 : 홍길동 -> 을지문덕
		//------------------------------------
		System.out.println("문제1");
		List<String> list=new ArrayList();
		//이름등록
		list.add("홍길동");
		list.add("강감찬");
		list.add("박나래");
		list.add("이순신");
		//출력
		//for문
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(i + ":" +list.get(i));
//		}
		
		//개선된 for문
		//for(변수선언 : 집합객체){}
		int idx=0;
		for(String str : list) {
			System.out.println(idx + " : " + str);
			idx++;
		}
		
		//수정
		list.indexOf("홍길동");
		list.set(0, "을지문덕");
		System.out.println(list);
		
		
		
		
		System.out.println();
		// 2. Set 사용
		//	- 이름등록 : 홍길동, 강감찬, 박나래, 이순신
		//	- 출력 : 이름(오름차순, 가나다순)
		//	- 수정 : 홍길동 -> 을지문덕
		System.out.println("문제2");
		Set<String> set=new TreeSet<>();
		//이름등록
		set.add("홍길동");
		set.add("강감찬");
		set.add("박나래");
		set.add("이순신");
//		//출력
//		List<String> list1=new LinkedList<>(set);
//		Collections.sort(list1);
//		System.out.println(list1);
//		//수정
//		set.contains("홍길동");
//		set.remove("홍길동");
//		set.add("을지문덕");
//		System.out.println(set);
		
		System.out.println("----- 개선된 for문 사용 -----");
		for(String name : set) {
			System.out.println(name);
		}
		
		System.out.println("----- iterator() for문 사용 -----");
		Iterator<String> ite =set.iterator();
		for(int i=0; i<set.size(); i++) {
			System.out.println(ite.next());
		}
		
		System.out.println("----- iterator() while문 사용 -----");
		ite=set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		
		System.out.println();
		// 3. Map 사용
		//	- key-value : 1901-홍길동, 1902-강감찬, 1903-박나래, 1904-이순신
		//	- 출력 : 1901-홍길동(key 오름차순)
		//	- 수정 : 홍길동 -> 을지문덕(key 값 사용)
		System.out.println("문제3");
		Map<Integer, String> map=new TreeMap<>();
		// - key-value 데이터 입력
		map.put(1901, "홍길동");
		map.put(1902, "강감찬");
		map.put(1903, "박나래");
		map.put(1904, "이순신");
		map.put(1905, "홍길동");
		//출력
//		Set<Integer> set1=map.keySet();
//		Iterator<Integer>ite1=set1.iterator();
//		while(ite.hasNext()) {
//			Integer key=ite1.next();
//			String value=map.get(key);
//			System.out.println(key + "-" + value);
//		}
		
		for(Integer id : map.keySet()) {
			System.out.println(id + "-" + map.get(id));
		}
		
		System.out.println();
		//수정
//		System.out.println();
//		map.put(1901,"을지문덕");
//		Set<Integer> set2=map.keySet();
//		Iterator<Integer>ite2=set2.iterator();
//		while(ite2.hasNext()) {
//			Integer key=ite2.next();
//			String value=map.get(key);
//			System.out.println(key + "/t" +value);
//		}
		for(Integer key : map.keySet()) {
			if("홍길동".equals(map.get(key)))
				map.replace(key,"을지문덕");
		}
		
		for(Integer id : map.keySet()) {
			System.out.println(id + "-" + map.get(id));
		}
	

	}

}















