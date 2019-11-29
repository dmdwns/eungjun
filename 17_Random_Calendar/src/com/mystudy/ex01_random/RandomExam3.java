package com.mystudy.ex01_random;

import java.util.Calendar;
import java.util.Random;

public class RandomExam3 {

	public static void main(String[] args) {
		// (실습) 오늘 당신의 행운지수 알아보기(0~100)
		// Math.random(), Random 사용해서 행운지수 값 만들기
		// 실행결과
		// 2019년 10월 23일 당신의 행운지수(0~100)는 77입니다.
		//---------------------------------
		int result = 0;
		System.out.println("오늘 나의 행운지수는 얼마일까요?");
		
		//년, 월, 일 구하기
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;//(0~11) + 1
		int date = calendar.get(Calendar.DATE);
		
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("date : " + date);
		System.out.println(year +"년 "+ month +"월 "+ date +"일");
		String yyyymmdd = year +"년 "+ month +"월 "+ date +"일";
		System.out.println("-------------");
		
		//실습1 - Random nextInt(숫자)
		Random ran = new Random();
		result = ran.nextInt(101); //0~100 : (int)(Math.random() * 101)
		System.out.println(yyyymmdd + " 당신의 행운지수(0~100)는 "
				+ result + "입니다.");
		
		//실습2 - Math.random()
		result = (int) (Math.random() * 101);
		System.out.print(yyyymmdd);
		System.out.println(" 당신의 행운지수(0~100)는 "+ result + "입니다.");
		
		//실습3 - Random nextInt() 사용해서
		int su = ran.nextInt();
		result = Math.abs(su) % 101;
		System.out.println(yyyymmdd + " 당신의 행운지수(0~100)는 "
				+ result + "입니다.");
	}

}






