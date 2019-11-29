package com.mystudy.ex01_random;

import java.util.Calendar;
import java.util.Random;

public class RandomExam3 {

	public static void main(String[] args) {
		// (�ǽ�) ���� ����� ������� �˾ƺ���(0~100)
		// Math.random(), Random ����ؼ� ������� �� �����
		// ������
		// 2019�� 10�� 23�� ����� �������(0~100)�� 77�Դϴ�.
		//---------------------------------
		int result = 0;
		System.out.println("���� ���� ��������� ���ϱ��?");
		
		//��, ��, �� ���ϱ�
		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;//(0~11) + 1
		int date = calendar.get(Calendar.DATE);
		
		System.out.println("year : " + year);
		System.out.println("month : " + month);
		System.out.println("date : " + date);
		System.out.println(year +"�� "+ month +"�� "+ date +"��");
		String yyyymmdd = year +"�� "+ month +"�� "+ date +"��";
		System.out.println("-------------");
		
		//�ǽ�1 - Random nextInt(����)
		Random ran = new Random();
		result = ran.nextInt(101); //0~100 : (int)(Math.random() * 101)
		System.out.println(yyyymmdd + " ����� �������(0~100)�� "
				+ result + "�Դϴ�.");
		
		//�ǽ�2 - Math.random()
		result = (int) (Math.random() * 101);
		System.out.print(yyyymmdd);
		System.out.println(" ����� �������(0~100)�� "+ result + "�Դϴ�.");
		
		//�ǽ�3 - Random nextInt() ����ؼ�
		int su = ran.nextInt();
		result = Math.abs(su) % 101;
		System.out.println(yyyymmdd + " ����� �������(0~100)�� "
				+ result + "�Դϴ�.");
	}

}






