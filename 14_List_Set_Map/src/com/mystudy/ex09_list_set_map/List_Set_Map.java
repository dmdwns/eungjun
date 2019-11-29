package com.mystudy.ex09_list_set_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class List_Set_Map {

	public static void main(String[] args) {
		// 1. List 사용
		// - 이름등록 : 홍길동, 강감찬, 박나래, 이순신
		// - 출력 : index : 이름(데이터)
		// - 수정 : 홍길동 -> 을지문덕
		//-------------------------------
		System.out.println("==== List 사용 ====");
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("강감찬");
		list.add("박나래");
		list.add("이순신");
		System.out.println(list);
		
		System.out.println("--- List for문(전체조회) ---");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		System.out.println("--- List 개선된 for문(전체조회) ---");
		// for (변수선언 : 집합객체) { }
		int idx = 0;
		for (String str : list) {
			System.out.println(idx + " : " + str);
			idx++;
		}
		
		// 2. Set 사용
		// - 이름등록 : 홍길동, 강감찬, 박나래, 이순신
		// - 출력 : 이름 (오름차순, 가나다순)
		// - 수정 : 홍길동 -> 을지문덕
		//--------------------------------
		System.out.println("==== Set 사용 ======");
		Set<String> set = new TreeSet<>();
		set.add("홍길동");
		set.add("강감찬");
		set.add("박나래");
		set.add("이순신");
		System.out.println(set);
		
		System.out.println("--- 개선된 for문 사용 ---");
		for (String name : set) {
			System.out.println(name);
		}
		
		System.out.println("--- iterator() for문 사용 ---");
		Iterator<String> ite = set.iterator();
		for (int i = 0; i < set.size(); i++) {
			System.out.println(ite.next());
		}
		
		System.out.println("--- iterator() while문 사용 ---");
		ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		// 2. Map 사용
		// - k-v : 1901-홍길동, 1902-강감찬, 1903-박나래, 1904-이순신
		// - 출력 : 1901-홍길동 (key 오름차순)
		// - 수정 : 홍길동 -> 을지문덕 (key 값 사용)
		//--------------------------------
		System.out.println("===== Map<k,v> 사용 ======");
		Map<String, String> map = new TreeMap<>();
		map.put("1901", "홍길동");
		map.put("1902", "강감찬");
		map.put("1903", "박나래");
		map.put("1904", "이순신");
		
		map.put("1905", "홍길동");
		
		System.out.println(map);
		System.out.println("--- keySet() 개선된 for문 사용 ---");
		//Set<String> keySet = map.keySet();
		for (String id : map.keySet()) {
			System.out.println(id + "-" + map.get(id));
		}
		
		//수정 : 홍길동 -> 을지문덕
//		if (map.containsKey("1901")) {
//			map.put("1901", "을지문덕");
//		}
		
		//map.replace("1901", "을지문덕"); //제공된 메소드 사용
		
		for (String key : map.keySet()) {
			if ("홍길동".equals(map.get(key))) { //value 값이 "홍길동" 이냐?
				map.replace(key, "을지문덕");
				//break;
			}
		}
		
		System.out.println("--- 수정후 ---");
		for (String id : map.keySet()) {
			System.out.println(id + "-" + map.get(id));
		}
		
		
	}

}





