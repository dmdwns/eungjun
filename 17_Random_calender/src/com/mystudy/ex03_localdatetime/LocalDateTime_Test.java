package com.mystudy.ex03_localdatetime;

import java.time.LocalDateTime;

public class LocalDateTime_Test {

	public static void main(String[] args) {
		// LocalDateTime : Java8 지원(데이터 불변)
		LocalDateTime nowDT=LocalDateTime.now();
		System.out.println("LocalDateTime.now() : " + nowDT);
		System.out.println(nowDT.getYear());
		System.out.println(nowDT.getMonthValue());
		System.out.println(nowDT.getDayOfMonth());
		System.out.println(nowDT.getHour());
		System.out.println(nowDT.getMinute());
		System.out.println(nowDT.getSecond());
		System.out.println(nowDT.getNano());
		
		LocalDateTime newDateTime=nowDT.plusYears(3);//3년뒤
		System.out.println("nowDT : " + nowDT);//변하지 않는다 현재시간
		System.out.println("newDateTime(3년후) : " + newDateTime);//새로운 객체를 만들어야 변경됨
		
		newDateTime=newDateTime.minusMonths(5);
		System.out.println("newDateTime(5개원전) : " + newDateTime);

	}

}
















