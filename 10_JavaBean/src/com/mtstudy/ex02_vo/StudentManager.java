package com.mtstudy.ex02_vo;

import java.util.ArrayList;



public class StudentManager {

	public static void main(String[] args) {
		/*3���� ���� ó��
		������, 100,90,81
		������, 95,88,82
		������, 90,86,77
		===============
		������(�Ǹ�ŭ ���� ó��)
		��) ������	100	90	81	271	90.33
		       ������95	88	92	275	91.66
		       ������90	87	77	254	84.66
		 */
		
		
		StudentVO stu = new StudentVO("������",100,90,81);
		StudentVO stu1 = new StudentVO("������",95,88,82);
		StudentVO stu2 = new StudentVO("������",90,87,77);
		
		
		
		System.out.println("----------------");
		
		stu.printData(); //�ѻ���� ����Ÿ ȭ�� ���
		stu1.printData();
		stu2.printData();
	   	
		StudentVO[] students = new StudentVO[3];//�ϳ��� �迭�� ����
	   	students[0]=stu;
	   	students[1]=stu1;
	   	students[2]=stu2;
	   	System.out.println("------------");
	   	students[0].printData();
	   	students[1].printData();
	   	students[2].printData();
	   	System.out.println("-------------");
	   	printData(students);

	}
	
	public static void printData(StudentVO[] students) {
		for(StudentVO vo : students) {//for(�ڷ��� ������ : ����){����}-->������for��
			vo.printData();//����
		}
		
		
		
		
	

	}
	

}






























