package com.mystudy.ex01_random;

import java.util.Calendar;
import java.util.Random;

public class RandomExam3 {

	public static void main(String[] args) {
		//(실습)오늘 당신의 행운지수 알아보기(0~100
		//Math.random(), Random 사용해서 행운지수 값 만들기
		//실행결과
		//2019년 10월 23일 당신의 행운지수(0~100)는 77입니다.
		//------------------------------------------
		
		int result=0;
		System.out.println("오늘 나의 행운지수는?");
		Random ran=new Random();
		
		//년,월,일 구하기
		Calendar calendar=Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;//0부터 시작
		int date=calendar.get(Calendar.DATE);
		//System.out.println(year + "년 " + month + "월 " + date + "일");
		String yyyymmdd=year + "년 " + month + "월 " + date + "일";
		
		
		
		//실습1-Random nextInt(숫자)
		int lucky1=ran.nextInt(101);//0~100 : (int)(Math.random()*101)
		System.out.println(yyyymmdd + " 당신의 행운지수는 " + lucky1 + "입니다");
		
		//실습2-Math.random()
		int lucky2 = (int) (Math.random() * 101);
		System.out.println(yyyymmdd + " 당신의 행운지수는 " + lucky2 + "입니다");
		
		//실습3-Random nextInt()사용
//		int lucky3=ran.nextInt();//양수, 음수 무한히 큰 숫자 생성
//		lucky3 %= 101;//101로 나누는 이유는 100까지 나누면 한자리에서 두자리 양음수 나머지만 생성한다
//		if(lucky3<0) {//음수는 필요없으므로
//			lucky3 *=-1;//-1을 곱해줘서 음수값을 양수로 처리한다
//		}
//		System.out.println(yyyymmdd + " 당신의 행운지수는 " + lucky3 + "입니다");
		
		
		int su=ran.nextInt();
		int lucky4 =Math.abs(su)%101; //Math.abs() : 절대값
		System.out.println(yyyymmdd + " 당신의 행운지수는 " + lucky4 + "입니다");
	
		
			
	}

}














