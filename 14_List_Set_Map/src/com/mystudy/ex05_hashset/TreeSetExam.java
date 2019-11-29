package com.mystudy.ex05_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {
		/* Set을 이용한 로또 만들기 : 1~ 45 랜덤숫자 6개를 Set에 저장
		로또번호 6개를 추첨하고, 작은 숫자부터 순서대로 화면출력
		- Math.random() 사용해서 랜덤한 숫자 만들기 
		  (int)(Math.random() * 45 + 1)
		- 출력은 작은 숫자부터 큰숫자 형태로
		    출력예) 금주의 로또번호 : 5, 8, 10, 25, 33, 41
		*/
		Set<Integer> lottoSet = new TreeSet();
		System.out.println("lottoSet.size() : " +lottoSet.size());
		for (int i = 0; lottoSet.size() < 6; i++) {
			int lottoNum = (int)(Math.random() * 45 + 1);
			System.out.println(lottoNum);
			lottoSet.add(lottoNum);
		}
		System.out.println("로또번호 : " + lottoSet);
		
		System.out.println("-------------");
		lottoSet.clear();
		for (; lottoSet.size() < 6; ) {
			int lottoNum = (int)(Math.random() * 45 + 1);
			System.out.println(lottoNum);
			lottoSet.add(lottoNum);
		}
		System.out.println("로또번호 : " + lottoSet);
		
		System.out.println("-------------");
		lottoSet.clear();
		while (lottoSet.size() < 6) {
			lottoSet.add((int)(Math.random() * 45 + 1));
		}
		System.out.println("로또번호 : " + lottoSet);
		
		System.out.println("==== 정렬 작업 ====");
		ArrayList<Integer> list = new ArrayList<>(lottoSet);
		System.out.println("로또 list : " + list);
		
		Collections.sort(list);
		System.out.println("금주의 로또번호 : " + list);
	}

}
