package com.mystudy.ex02_vo;


public class StudentManager {

	public static void main(String[] args) {
		/* 3���� ���� ó��
		ȫ�浿, 100, 90, 81
		�̼���, 95, 88, 92
		������, 90, 86, 77
		=====================
		��� ���(�Ǹ�ŭ ���� ó��)
		ȫ�浿     100  90  81  271 90.33
		�̼���	95	88	92	275	91.66
		������	90	87	77	254	84.66
		*/
		StudentVO stu = new StudentVO("ȫ�浿", 100, 90, 80);
		stu.printData();
		//stu.setKor(0);
		//stu.computeTotAvg();
		System.out.println("�������� : " + stu.getKor());
		//stu.setTot(290);
		//stu.setAvg(98);
		stu.printData();
		
		StudentVO stu2 = new StudentVO("�̼���", 95, 88, 92);
		stu2.printData();
		
		StudentVO stu3 = new StudentVO("������", 90, 86, 77);
		stu3.printData();
		
		//int[] nums = new int[3];
		System.out.println("===== �迭�� ���� ��� ====");
		StudentVO[] students = new StudentVO[3];
		students[0] = stu;
		students[1] = stu2;
		students[2] = stu3;
		
		students[0].printData();
		students[1].printData();
		students[2].printData();
		
		System.out.println("---------------");
		printData(students);
	}
	
	public static void printData(StudentVO[] students) {
		for (StudentVO vo : students) {
			vo.printData();
		}
	}

}





