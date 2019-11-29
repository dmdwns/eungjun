package com.mystudy.ex03_localdatetime;

import java.time.LocalDateTime;

public class LocalDateTime_Test {

	public static void main(String[] args) {
		// LocalDateTime : Java8 ����(������ �Һ�)
		LocalDateTime nowDT = LocalDateTime.now();
		System.out.println("LocalDateTime.now() : "
				+ nowDT);
		System.out.println(nowDT.getYear());
		System.out.println(nowDT.getMonthValue());
		System.out.println(nowDT.getDayOfMonth());
		System.out.println(nowDT.getHour());
		System.out.println(nowDT.getMinute());
		System.out.println(nowDT.getSecond());
		System.out.println(nowDT.getNano());
		
		LocalDateTime newDateTime = nowDT.plusYears(3); //3�� ��
		System.out.println("nowDT : " + nowDT);
		System.out.println("newDateTime(3����) : " + newDateTime);
		
		newDateTime = newDateTime.minusMonths(5);
		System.out.println("newDateTime(5������) : " + newDateTime);
	}

}









