package com.study.ex04_hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class HashSetLotto {

	public static void main(String[] args) {
		/* Set을 이용한 로또 만들기 : 1~45 랜덤숫자 6개를 Set에 저장
		     로또번호 6개를 추첨하고, 작은 숫자부터 순서대로 화면출력
		   -Math.random()사용해서 랜덤한 숫자 만들기
		   -출력은 작은 숫자부터 큰숫자 형태
		       예)1,2,3,4,5,6 
		 */
		
		//무작위 뽑기
		//Set은 순서X, 중복허용X
		Set<Integer> set=new HashSet<>();
		System.out.println("로또의 사이즈 : " + set.size());
		while(set.size()<6) {//크기가 6미만까지 돌림
			int num=(int)(Math.random()*45+1);//+1 하면 0부터 시작하지 않는다
			set.add(num);//.add() num에서 추출한 6개 숫자만 들어감
			System.out.print(num + " ");
		}
		System.out.println();
		
		//내림차순 정렬
		//Collections쓰려면 무조건 List선언 해야함
		List<Integer> list=new LinkedList<>(set);//LinkedList 사용
		Collections.sort(list); //내림차순 정렬
		System.out.println("이번주 당첨 : " + list); //번호 출력
		
		
		
	}

}












