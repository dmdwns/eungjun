package com.mystudy.ex02_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarExam {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println("new Date() : " + date);
		
		//월:0~11 - 0:1월, 1:2월, ... , 11:12월
		date=new Date(2019, 9, 24);//년도 1900년 기준 따라서 2019+1900=3919
		System.out.println("new Date() : " + date);
		
		//----------------------------------------------------------------
		System.out.println("===== Calendar =====");
		Calendar cal=Calendar.getInstance();
		System.out.println(cal);
		
		System.out.println("년도 : " + cal.get(Calendar.YEAR));
		System.out.println("월 : " + (cal.get(Calendar.MONTH)+1));
		System.out.println("일 : " + cal.get(Calendar.DATE));
		
		cal.add(Calendar.HOUR, 5);//시간추가,5시간
		System.out.println("오전오후 : " + cal.get(Calendar.AM_PM));
		System.out.println("시(12시간) : " + cal.get(Calendar.HOUR));
		System.out.println("시(24시간) : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		
		System.out.println("-------------------------------");
		//년-월-일 시:분:초	년/월/일 시:분:초
		//2019-10-24 10:39:20
		//2019-1-10 1:14:5 ------> 2019-01-10 01:14:05
		
		System.out.println(getDateTime());
		
		System.out.println("===== SimpleDateFormat =====");
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		date=new Date();
		System.out.println("date : " + date);
		System.out.println("yyyy-MM-dd hh:mm:ss >> " + sdf.format(date));// .format(): 2자리씩 차지하는 형태
		
		
	}
	
	static String getDateTime() {
		Calendar cal=Calendar.getInstance();
		cal.set(2019, 5, 5, 15, 5, 5);
		
		int month=cal.get(Calendar.MONTH)+1;
		String mm = (month < 10) ? "0"+month : ""+month; //10보다 작냐/작으면0붙여라/아니면 3번째
		
		int date=cal.get(Calendar.DATE);
		String dd = (date<10)? "0"+date : String.valueOf(mm);
		
		String dateTime=cal.get(Calendar.YEAR) 
				+ "-" + mm
				+ "-" + dd
				+ " " + cal.get(Calendar.HOUR_OF_DAY)
				+ ":" + cal.get(Calendar.MINUTE)
				+ ":" + cal.get(Calendar.SECOND);
		return dateTime;
	}

}


























