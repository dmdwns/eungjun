package com.mystudy.ex01_random;

import java.util.Calendar;
import java.util.Random;

public class RandomExam3 {

	public static void main(String[] args) {
		//(�ǽ�)���� ����� ������� �˾ƺ���(0~100
		//Math.random(), Random ����ؼ� ������� �� �����
		//������
		//2019�� 10�� 23�� ����� �������(0~100)�� 77�Դϴ�.
		//------------------------------------------
		
		int result=0;
		System.out.println("���� ���� ���������?");
		Random ran=new Random();
		
		//��,��,�� ���ϱ�
		Calendar calendar=Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH)+1;//0���� ����
		int date=calendar.get(Calendar.DATE);
		//System.out.println(year + "�� " + month + "�� " + date + "��");
		String yyyymmdd=year + "�� " + month + "�� " + date + "��";
		
		
		
		//�ǽ�1-Random nextInt(����)
		int lucky1=ran.nextInt(101);//0~100 : (int)(Math.random()*101)
		System.out.println(yyyymmdd + " ����� ��������� " + lucky1 + "�Դϴ�");
		
		//�ǽ�2-Math.random()
		int lucky2 = (int) (Math.random() * 101);
		System.out.println(yyyymmdd + " ����� ��������� " + lucky2 + "�Դϴ�");
		
		//�ǽ�3-Random nextInt()���
//		int lucky3=ran.nextInt();//���, ���� ������ ū ���� ����
//		lucky3 %= 101;//101�� ������ ������ 100���� ������ ���ڸ����� ���ڸ� ������ �������� �����Ѵ�
//		if(lucky3<0) {//������ �ʿ�����Ƿ�
//			lucky3 *=-1;//-1�� �����༭ �������� ����� ó���Ѵ�
//		}
//		System.out.println(yyyymmdd + " ����� ��������� " + lucky3 + "�Դϴ�");
		
		
		int su=ran.nextInt();
		int lucky4 =Math.abs(su)%101; //Math.abs() : ���밪
		System.out.println(yyyymmdd + " ����� ��������� " + lucky4 + "�Դϴ�");
	
		
			
	}

}














