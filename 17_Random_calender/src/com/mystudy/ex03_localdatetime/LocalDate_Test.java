package com.mystudy.ex03_localdatetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class LocalDate_Test {

	public static void main(String[] args) {
		// Calendar : ��ü�� ����� �����Ͱ� �����(Muttble)
		Calendar now=Calendar.getInstance();
		System.out.println("Calendar.getInstance() : " + now);
		now.add(Calendar.DATE, 3);//3�ϵ�
		now.add(Calendar.MONTH, -3);//3����
		System.out.println("3�� �� 3�� �� : " + now);
		
		System.out.println("===== LocalDate =====");
		//Java LocalDateTime : ���� ������� ����(immutable)
		LocalDate nowDate = LocalDate.now();
		System.out.println("LocalDate.now() : " + nowDate);
		System.out.println(nowDate.getYear());
		System.out.println(nowDate.getMonthValue());//1~12��
		System.out.println(nowDate.getDayOfMonth());//1~31��
		
		System.out.println("LocalDate : " + nowDate);
		
		LocalDate newdt=nowDate.plusYears(2).plusMonths(3).plusDays(2);//2����
		System.out.println("LocalDate : " + nowDate);
		System.out.println("NewDate : " + newdt);
		
		System.out.println("===== LocalTime =====");
		LocalTime nowtime=LocalTime.now();
		System.out.println("LocalTime.now() : " + nowtime);
		System.out.println(nowtime.getHour());//0~23��
		System.out.println(nowtime.getMinute());//0~59
		System.out.println(nowtime.getSecond());//0~59
		System.out.println(nowtime.getNano());//0~999,999,999
		
		System.out.println("LocalTime.now() : " + nowtime);
		
		LocalTime newtime=nowtime.plusHours(2).plusMinutes(2).plusSeconds(2);
		System.out.println("LocalTime.now() : " + nowtime);
		System.out.println("����� �ð��� : " + newtime);
		
		
		

	}

}














