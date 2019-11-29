package com.mtstudy.ex02_vo;

import java.util.ArrayList;



public class StudentManager {

	public static void main(String[] args) {
		/*3명의 성적 처리
		김응준, 100,90,81
		김응순, 95,88,82
		김응도, 90,86,77
		===============
		결과출력(탭만큼 간격 처리)
		예) 김응준	100	90	81	271	90.33
		       김응순95	88	92	275	91.66
		       김응도90	87	77	254	84.66
		 */
		
		
		StudentVO stu = new StudentVO("김응준",100,90,81);
		StudentVO stu1 = new StudentVO("김응순",95,88,82);
		StudentVO stu2 = new StudentVO("김응도",90,87,77);
		
		
		
		System.out.println("----------------");
		
		stu.printData(); //한사람의 데이타 화면 출력
		stu1.printData();
		stu2.printData();
	   	
		StudentVO[] students = new StudentVO[3];//하나의 배열로 저장
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
		for(StudentVO vo : students) {//for(자료형 변수명 : 수식){문장}-->개선된for문
			vo.printData();//문장
		}
		
		
		
		
	

	}
	

}






























