package com.study.ex06_treemap;

import java.util.TreeMap;

public class TreeMapExam {

	public static void main(String[] args) {
		// TreeMap : 키(key)값 기준으로 오름차순 정렬해서 저장
		TreeMap<String, Integer> map = new TreeMap<>();
		map.put("홍길동",100);
		map.put("김유신",new Integer(95));
		map.put("강감찬",88);
		map.put("100",93);
		map.put("20",93);
		map.put("a",93);
		map.put("A",93);
		map.put("*",93);
		System.out.println(map); //저장한 순서 관계없이 특수문자>숫자(100이20보다 앞 1이 2보다 앞쪽에 있어서)>영문대문자>소문자>가나다순으로 저장
		
		System.out.println("========================");
		System.out.println("map.isEmpty() : " + map.isEmpty());//map.isEmpty()->비었냐
		System.out.println("map.get(\"홍길동\") : " + map.get("홍길동"));//.get() -> 괄호안 조회
		System.out.println("map.containsKey(\"을지문덕\") : " + map.containsKey("을지문덕"));//.containsKey() -> 키 값에 을지문덕이 있냐
		System.out.println("map.containsValue(88) : " + map.containsValue(88));//.containsKey() -> 88점이 있냐
		
		System.out.println("----- 데이터 조회 _ 개선된  for문 -----");
		
		for(String key : map.keySet()) {
			System.out.println(key + "-" + map.get(key));
		}
	}

}


































