package com.mtstudy.ex01_bean;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student();
		//stu.name = "홍길동";
		//System.out.println(stu.name);//디폴트일때,private선언하면 접근 안됨
		stu.setName("홍길동2");
 	   	System.out.println("이름 : " + stu.getName());
 	   	
 	   	System.out.println("----- set/get매소드 이용 국,영,수,총점,평균 점수 출력 -----");
 	   	
 	   	stu.setKor(83);
 	    stu.setEng(97);
 	    stu.setMath(100);
 	   	System.out.println("국어점수 : " + stu.getKor());
 	   	System.out.println("영어점수 : " + stu.getEng());
 	   	System.out.println("수학점수 : " + stu.getMath());
 	   	stu.computeAvg();
 	   	System.out.println("총점 : " + stu.getTot());
 	   	System.out.println("평균 : " + stu.getAvg());
 	   	
 	    //===============================================
 	   	
 	   	System.out.println("----- 생성자 이용01 ------");
 	   	Student stu2 = new Student("김땡", 84, 101, 100);//컨트롤 + 스페이스 : 생성자
 	    System.out.println("이름 : " + stu2.getName());
 	   	System.out.println("국어점수 : " + stu2.getKor());
	   	System.out.println("영어점수 : " + stu2.getEng());
	   	System.out.println("수학점수 : " + stu2.getMath());
	   	System.out.println("총점 : " + stu2.getTot());
	   	System.out.println("평균 : " + stu2.getAvg());
	   	
	   	System.out.println("----- 생성자 이용02 ------");
	   	System.out.println(stu2.toString());
	
	
	
	
	}
	
	

}


















