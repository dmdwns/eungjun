package com.mystudy.ex03_sungjuk;

public class SungjukTest {

	public static void main(String[] args) {
		//StudentVO 타입의 데이타 1개 생성 후 국어점수, 영어점수 변경
		System.out.println("--- main() 시작 ---");
		StudentVO stu = new StudentVO("홍길동", 100, 90, 80);
		System.out.println(stu.toString());
		
		boolean result = stu.setKor(999); //잘못된 점수 입력
		if (!result) {
			System.out.println("[예외발생] 잘못된 값 입력됨");
		}
		System.out.println(stu.toString());
		
		System.out.println("---- setEng() 처리 ----");
		try {
			stu.setEng(999);
		} catch (JumsuOutOfValueException e) {
			System.out.println("[예외발생] " + e.getMessage());
		} catch(SungjukProcessException e) {
			System.out.println("[예외발생] 성적처리중 예외 발생");
		}
		System.out.println(stu.toString());
		
		System.out.println("--- main() 종료 ---");
	}

}





