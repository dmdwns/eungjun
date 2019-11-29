package com.study.ex05_hashmap_exam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


import com.study.ex01_arraylist.StudentVO;

public class StudentManager {

	public static void main(String[] args) {
		/*  Set�� ����� ���� ó��
		1. 3���� �л�����Ÿ(����,����,����,����)�� 
		   StudentVO Ŭ������ �̿��ؼ� �����(�����ϰ�)
		   "ȫ�浿", 100, 90, 81
		   "�̼���", 95, 88, 92
		   "������", 90, 87, 77
		2. HashSet<StudentVO> Ÿ���� ����(set)�� �����ϰ�
		3. set�� �ִ� ����Ÿ�� ����ؼ� ȭ�����
		     ����     ����   ����  ����    ����     ���
		   --------------------------
		     ȫ�浿  100  90  81  270  90.33
		   ...
		4. "ȫ�浿" �л���  �������� 88������ ����
		5. "ȫ�浿" �л��� ������ ȭ�� ���
		************************************/
		
		//1.StudentVO Ŭ������ �̿��ؼ� �����(����)
		StudentVO stu = new StudentVO("ȫ�浿",100,90,81);
		StudentVO stu1 = new StudentVO("�̼���",95,88,92);
		StudentVO stu2 = new StudentVO("������",90,87,77);
	
		
		//2.HashSet<StudentVO> Ÿ���� ����(set)�� ����
		Set<StudentVO> set=new HashSet<>();
		
		//3.set�� �ִ� ����Ÿ�� ����ؼ� ȭ�����
		set.add(stu);
		set.add(stu1);
		set.add(stu2);
		
		for(Object obj : set) {
			StudentVO svo=(StudentVO) obj;
			svo.printData();
		}
		
		//4."ȫ�浿" �л���  �������� 88������ ����
		System.out.println("�Ƹ���");
		
		
		
		
	
		
		
	}
	

}






























