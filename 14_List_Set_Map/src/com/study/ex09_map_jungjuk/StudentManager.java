package com.study.ex09_map_jungjuk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class StudentManager {

	public static void main(String[] args) {
		/*  Set�� ����� ���� ó��
		1. 3���� �л�����Ÿ(����,����,����,����)�� 
		   StudentVO Ŭ������ �̿��ؼ� �����(�����ϰ�)
		   "ȫ�浿", 100, 90, 81
		   "�̼���", 95, 88, 92
		   "������", 90, 87, 77
		2. Map<String,StudentVO> Ÿ���� ����(map)�� �����ϰ�
		   key : �̸�	,	value : StudentVO
		3. map�� �ִ� ����Ÿ�� ����ؼ� ȭ�����
		     ����     ����   ����  ����    ����     ���
		   --------------------------
		     ȫ�浿  100  90  81  270  90.33
		   ...
		4. "ȫ�浿" �л���  �������� 88������ ����
		5. "ȫ�浿" �л��� ������ ȭ�� ���
		************************************/
		
		//VOŸ�� ����Ÿ ����
		StudentVO stu1 = new StudentVO("ȫ�浿",100,90,81);
		StudentVO stu2 = new StudentVO("�̼���",95,88,92);
		StudentVO stu3 = new StudentVO("������",90,87,77);
		
		//VOŸ�� ����Ÿ ���
		//System.out.println(stu1.toString());
		stu1.printData();
		stu2.printData();
		stu3.printData();
		
		//Map<String,StudentVO> Ÿ���� ����(map)�� ����
		Map<String, StudentVO> map=new TreeMap<>();
		map.put(stu1.getName(),stu1);
		map.put(stu2.getName(),stu2);
		map.put(stu3.getName(),stu3);
		
		System.out.println();
		//map�� �ִ� ����Ÿ�� ����ؼ� ȭ�����
		for(StudentVO vo : map.values()) {
			vo.printData();
		}
		
		System.out.println();
		for(String name : map.keySet()) {
			StudentVO vo = map.get(name);
			System.out.println(vo.getName() + "\t" + vo.getAvg());
		}
		
		System.out.println();
		//"ȫ�浿" �л���  �������� 88������ ����, ȭ�� ���
		StudentVO stu = map.get("ȫ�浿");
		stu.printData();
		stu.setKor(88); //�̹� �����ϴ� �ּҰ��� ���������� 88�� ������
		stu.printData();
		
		System.out.println();
		StudentVO stuHong = map.get("ȫ�浿");//ȫ�浿�� �ִ� �ּҰ��� stuHong ���� �Ű���
		stuHong.printData();
		
		
		System.out.println();
		stu1.printData();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}






























