package com.mystudy.ex01_scanner;

import java.util.Scanner;

public class ScannerExam2 {

	public static void main(String[] args) {
		// 성명, 국어, 영어, 수학 점수를 화면(콘솔)에서 입력받아
		// 총점, 평균을 구하고 결과 화면 출력
		/*
		성명 : 홍길동
		국어 : 100
		영어 : 90
		수학 : 81
		----------
		총점 : 271
		평균 : 90.33
		평가결과 : A
		*/
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			//화면에서 데이터 입력 받기
			System.out.print("성명 : ");
			String name = scan.nextLine();
			
			System.out.print("국어점수 : ");
			int kor = scan.nextInt();
			
			System.out.print("영어점수 : ");
			int eng = scan.nextInt();
			
			System.out.print("수학점수 : ");
			int math = scan.nextInt();
			scan.nextLine(); //줄바꿈 문자 전에 입력된 데이터 읽어서 처리
	
			//입력값에 대한 계산 처리
			int tot = kor + eng + math;
			double avg = tot * 100 / 3 / 100.0;
			
			//성적 결과 출력
			System.out.println("\n==== 성적결과 ====");
			System.out.println("성명 : " + name);
			System.out.println("국어 : " + kor);
			System.out.println("영어 : " + eng);
			System.out.println("수학 : " + math);
			System.out.println("-------------");
			System.out.println("총점 : " + tot);
			System.out.println("평균 : " + avg);
			System.out.println("==============");
			System.out.println();
			
			System.out.print("계속 작업 하시겠습니까?(y:계속작업, n:중단) ");
			String answer = scan.nextLine();
			if (!answer.equalsIgnoreCase("Y")) {
				System.out.println(">> 작업이 종료되었습니다.");
				break;
			}
		}
	}

}









