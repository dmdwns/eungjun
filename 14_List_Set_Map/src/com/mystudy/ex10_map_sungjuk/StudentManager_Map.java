package com.mystudy.ex10_map_sungjuk;

import java.util.Map;
import java.util.TreeMap;

public class StudentManager_Map {

	public static void main(String[] args) {
		/*  Map 을 사용한 성적 처리
		1. 3명의 학생데이타(성명,국어,영어,수학)를 
		   StudentVO 클래스를 이용해서 만들고(저장하고)
		   "홍길동", 100, 90, 81
		   "이순신", 95, 88, 92
		   "김유신", 90, 87, 77
		2. Map<String, StudentVO> 타입의 변수(map)에 저장하고
		   key: 이름, value: StudentVO
		3. map에 있는 데이타를 사용해서 화면출력
		     성명     국어   영어  수학    총점     평균
		   --------------------------
		     홍길동  100  90  81  270  90.33
		   ...
		4. "홍길동" 학생의  국어점수 88점으로 수정
		5. "홍길동" 학생의 정보를 화면 출력
		************************************/
		StudentVO stu1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO stu2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO stu3 = new StudentVO("김유신", 90, 87, 77);
		stu1.printData();
		stu2.printData();
		stu3.printData();

		System.out.println("=== Map에 데이터 저장 ====");
		Map<String, StudentVO> map = new TreeMap<>(); 
		map.put(stu1.getName(), stu1);
		map.put(stu2.getName(), stu2);
		map.put(stu3.getName(), stu3);
		
		System.out.println(map);
		
		System.out.println("==== Map 데이터 출력 ===");
		for (StudentVO vo : map.values()) {
			vo.printData();
		}
		System.out.println("------");
		for (String name : map.keySet()) {
			StudentVO vo = map.get(name);
			System.out.println(vo.getName() + "\t" + vo.getAvg());
		}
		
		System.out.println("=== Map 데이터 수정 ===");
		StudentVO stu = map.get("홍길동");
		stu.printData();
		System.out.println("--- stu.setKor(88) 실행후 ---");
		stu.setKor(88);
		stu.printData();
		
		System.out.println("---");
		StudentVO stuHong = map.get("홍길동");
		stuHong.printData();
		System.out.println("--- stu1 데이터 ---");
		stu1.printData();
		
		
	}

}










