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
		/*  Set을 사용한 성적 처리
		1. 3명의 학생데이타(성명,국어,영어,수학)를 
		   StudentVO 클래스를 이용해서 만들고(저장하고)
		   "홍길동", 100, 90, 81
		   "이순신", 95, 88, 92
		   "김유신", 90, 87, 77
		2. Map<String,StudentVO> 타입의 변수(map)에 저장하고
		   key : 이름	,	value : StudentVO
		3. map에 있는 데이타를 사용해서 화면출력
		     성명     국어   영어  수학    총점     평균
		   --------------------------
		     홍길동  100  90  81  270  90.33
		   ...
		4. "홍길동" 학생의  국어점수 88점으로 수정
		5. "홍길동" 학생의 정보를 화면 출력
		************************************/
		
		//VO타입 데이타 저장
		StudentVO stu1 = new StudentVO("홍길동",100,90,81);
		StudentVO stu2 = new StudentVO("이순신",95,88,92);
		StudentVO stu3 = new StudentVO("김유신",90,87,77);
		
		//VO타입 데이타 출력
		//System.out.println(stu1.toString());
		stu1.printData();
		stu2.printData();
		stu3.printData();
		
		//Map<String,StudentVO> 타입의 변수(map)에 저장
		Map<String, StudentVO> map=new TreeMap<>();
		map.put(stu1.getName(),stu1);
		map.put(stu2.getName(),stu2);
		map.put(stu3.getName(),stu3);
		
		System.out.println();
		//map에 있는 데이타를 사용해서 화면출력
		for(StudentVO vo : map.values()) {
			vo.printData();
		}
		
		System.out.println();
		for(String name : map.keySet()) {
			StudentVO vo = map.get(name);
			System.out.println(vo.getName() + "\t" + vo.getAvg());
		}
		
		System.out.println();
		//"홍길동" 학생의  국어점수 88점으로 수정, 화면 출력
		StudentVO stu = map.get("홍길동");
		stu.printData();
		stu.setKor(88); //이미 존재하는 주소값에 국어점수를 88로 변경함
		stu.printData();
		
		System.out.println();
		StudentVO stuHong = map.get("홍길동");//홍길동에 있는 주소값이 stuHong 으로 옮겨짐
		stuHong.printData();
		
		
		System.out.println();
		stu1.printData();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}






























