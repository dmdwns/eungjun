package com.mystudy.split;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Ex02_StringControls_exam {

	public static void main(String[] args) {
		/* 문자열 다루기
		0.문자열 데이터
		  String str1 = "홍길동 이순신   이순신 Tom 홍길동";
		  String str2 = "    TOM    을지문덕 김유신 연개소문";
		1. 위의 문자열을 StringBuilder 변수 sb를 이용해서 하나의 문자열로 만들고,
		2-1. sb의 문자열을 빈칸(" ")을 구분자로 잘라서(이름만 추출) 화면 출력(데이타확인)
		     (String.split() 또는 StringTokenizer 클래스 사용)
		      예) 홍길동 이순신 이순신 Tom 홍길동 TOM...
		2-2. 문자열을 저장할 수 있는 배열변수(names)에 저장
		3. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		      예) 홍길동,이순신,이순신,Tom,홍길동,TOM...   
		4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
		      예) 홍,이,이,T,홍,T,을... 
		5. 배열의 문자열중 이름의 글자수가 4 이상인 값을 "인덱스번호:이름" 출력
		      예) 인덱스번호:을지문덕
		********************************/
		String str1 = "홍길동 이순신   이순신 Tom 홍길동";
		String str2 = "    TOM    을지문덕 김유신 연개소문";
		String str = str1 + str2;
		System.out.println("str : " + str);
		
		int num = 100;
		StringBuilder sb = new StringBuilder();
		//sb.append(str1);
		//sb.append(str2);
		sb.append(str1).append(str2);
		System.out.println("sb : " + sb.toString());
		
		//2-1. sb의 문자열을 빈칸(" ")을 구분자로 잘라서(이름만 추출) 화면 출력(데이타확인)
	    //   (String.split() 또는 StringTokenizer 클래스 사용)
	    //  예) 홍길동 이순신 이순신 Tom 홍길동 TOM...
		StringTokenizer stk = new StringTokenizer(sb.toString(), " ");
		System.out.println("토큰갯수 : " + stk.countTokens());
		
		while (stk.hasMoreTokens()) {
			//System.out.println("-" + stk.nextToken() + "-");
			System.out.print(stk.nextToken() + " ");
		}
		System.out.println();
		System.out.println("토큰갯수 : " + stk.countTokens());
		
		System.out.println("----------------------------");
		//2-2. 문자열을 저장할 수 있는 배열변수(names)에 저장
		stk = new StringTokenizer(sb.toString(), " ");
		String[] names = new String[stk.countTokens()];
		
		int idx = 0;
		while (stk.hasMoreTokens()) {
			String name = stk.nextToken();
			names[idx] = name;
			idx++;
		}
		System.out.println(Arrays.toString(names));
		
		System.out.println("---- 문제 3 처리 ---------");
		//3. 배열에 있는 값을 구분자 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
	    //   예) 홍길동,이순신,이순신,Tom,홍길동,TOM... 
		StringBuilder sbTemp = new StringBuilder();
		
		for (int i = 0; i < names.length; i++) {
			//System.out.print(names[i] + ",");
			sbTemp.append(names[i]).append(",");
		}
		System.out.println(sbTemp.toString());
		
		//홍길동,이순신,이순신,Tom,홍길동,TOM,을지문덕,김유신,연개소문
		//첫번째기준 : 홍길동 + ",이순신" + ",이순신" + .....+ ",연개소문"
		//마지막기준 : "홍길동," + "이순신," + .... "김유신," + "연개소문" 
		//sbTemp = new StringBuilder();
		sbTemp.setLength(0);
		System.out.println(">>" + sbTemp.toString());
		for (int i = 0; i < names.length; i++) {
			if (i == 0) { //첫번째 데이타?
				sbTemp.append(names[i]);
			} else {
				sbTemp.append(",").append(names[i]);
			}
		}
		System.out.println(">>>" + sbTemp.toString());
		//------------------------
		sbTemp.setLength(0);
		
		boolean isFirst = true;
		for (int i = 0; i < names.length; i++) {
			if (isFirst) { //처음이냐?
				sbTemp.append(names[i]);
				isFirst = false;
			} else {
				sbTemp.append(",").append(names[i]);
			}
		}
		System.out.println(">>>" + sbTemp.toString());
		//===============================================
		//마지막기준 : "홍길동," + "이순신," + .... "김유신," + "연개소문" 
		sbTemp.setLength(0);
		System.out.println(">>" + sbTemp.toString());
		for (int i = 0; i < names.length; i++) {
			if (i == names.length - 1) { //마지막 데이타?
				sbTemp.append(names[i]);
			} else {
				sbTemp.append(names[i]).append(",");
			}
		}
		System.out.println(">>>>" + sbTemp.toString());
		
		//============================
		sbTemp.setLength(0);
		if (names.length > 0) {//데이타가 있으면
			sbTemp.append(names[0]);
		}
		for (int i = 1; i < names.length; i++) {
			sbTemp.append(",").append(names[i]);
		}
		System.out.println(">>>>>" + sbTemp.toString());
		
		System.out.println("\n----- 4번 처리 ------");
		//4. 데이터의 첫글자만 추출해서 콤마(,)로 구분하여 한라인에 출력(StringBuilder 사용)
	    //   예) 홍,이,이,T,홍,T,을... 
		sbTemp.setLength(0);
		if (names.length > 0) {//데이타가 있으면
			sbTemp.append(names[0].charAt(0));
		}
		for (int i = 1; i < names.length; i++) {
			sbTemp.append(",").append(names[i].charAt(0));
		}
		System.out.println("sbTemp : " + sbTemp);
	
		System.out.println("---- 5번 처리 -----");
		//5. 배열의 문자열중 이름의 글자수가 4 이상인 값을 "인덱스번호:이름" 출력
	    //   예) 인덱스번호:을지문덕
		//sbTemp.setLength(0);
		sbTemp.delete(0, sbTemp.length());
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() >= 4) {
				//sbTemp.append(i + ":" + names[i] + "\n");
				sbTemp.append(i).append(":").append(names[i])
						.append("\n");
			}
		}
		System.out.println(sbTemp);
		
		//===========================================
		System.out.println("======= split() 사용시 =======");
		System.out.println("sb.toString() : " + sb.toString());
		String[] names2 = sb.toString().split(" ");
		for (int i = 0; i < names2.length; i++) {
			System.out.println(i + " : -" + names2[i] + "-");
		}
		
		System.out.println("---- 이름만 출력(방법1) ---");
		for (int i = 0; i < names2.length; i++) {
			if (!names2[i].equals("")) {
				System.out.println(i + ">> : -" + names2[i] + "-");
			}
		}
		
		System.out.println("---- 이름만 출력(방법2) ---");
		for (int i = 0; i < names2.length; i++) {
			if (names2[i].length() > 0) {//"" 이 아니면
				System.out.println(i + ">> : -" + names2[i] + "-");
			}
		}
	}

}










