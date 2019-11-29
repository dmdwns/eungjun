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
		/*  Set을 사용한 성적 처리
		1. 3명의 학생데이타(성명,국어,영어,수학)를 
		   StudentVO 클래스를 이용해서 만들고(저장하고)
		   "홍길동", 100, 90, 81
		   "이순신", 95, 88, 92
		   "김유신", 90, 87, 77
		2. HashSet<StudentVO> 타입의 변수(set)에 저장하고
		3. set에 있는 데이타를 사용해서 화면출력
		     성명     국어   영어  수학    총점     평균
		   --------------------------
		     홍길동  100  90  81  270  90.33
		   ...
		4. "홍길동" 학생의  국어점수 88점으로 수정
		5. "홍길동" 학생의 정보를 화면 출력
		************************************/
		
		//1.StudentVO 클래스를 이용해서 만들기(저장)
		StudentVO stu = new StudentVO("홍길동",100,90,81);
		StudentVO stu1 = new StudentVO("이순신",95,88,92);
		StudentVO stu2 = new StudentVO("김유신",90,87,77);
	
		
		//2.HashSet<StudentVO> 타입의 변수(set)에 저장
		Set<StudentVO> set=new HashSet<>();
		
		//3.set에 있는 데이타를 사용해서 화면출력
		set.add(stu);
		set.add(stu1);
		set.add(stu2);
		
		for(Object obj : set) {
			StudentVO svo=(StudentVO) obj;
			svo.printData();
		}
		
		//4."홍길동" 학생의  국어점수 88점으로 수정
		System.out.println("아몰랑");
		
		
		
		
	
		
		
	}
	

}






























