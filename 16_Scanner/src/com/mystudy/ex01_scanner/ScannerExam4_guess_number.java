package com.mystudy.ex01_scanner;

import java.util.Scanner;

public class ScannerExam4_guess_number {

	public static void main(String[] args) {
		// 컴퓨터가 1~100 사이의 숫자를 정하면 사람이 맞추기
		// 선택 기회 5회
		//---------------------
		// 컴퓨터 숫자 : 70 - Math.random() 만들기
		//   사람이 선택한 숫자 80 : 작다 메시지 출력
		//   사람이 선택한 숫자 50 : 크다 메시지 출력
		// 5번 까지 시도해서 맞추면 : 성공!!! n번 만에 맞췄습니다.(화면출력)
		// 5번을 넘기면 : 실패~~~ 내가 생각한 숫자는 70입니다.(화면출력)
		// ---
		// 다시 도전하시겠습니까?(y,n)
		//=================================
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			int comNo = 0; //컴퓨터가 생각한 숫자
			int meNo = 0; //내가 결정한 숫자
			int tryCnt = 0; //시도 횟수
			
			//1. 컴퓨터가 1~100 범위의 숫자를 생각하도록 만들기
			//Math.random() : 0.000 ~ 0.9999999
			//System.out.println((int) (Math.random() * 100) + 1);
			comNo = (int) (Math.random() * 100) + 1;
			System.out.println("컴) 1~100까지 숫자중 하나를 생각했습니다. " 
					+ "맞춰보세요~~~");
			//System.out.println("컴퓨터가 생각한 숫자 : " + comNo);
			
			while (tryCnt < 5) {
				tryCnt++;
				
				//2. 숫자 선택하기
				while (true) {
					try {
						System.out.print(tryCnt + "번째> 숫자를 선택 : ");
						meNo = Integer.parseInt(scan.nextLine());
						break;
					} catch (Exception e) {
						System.out.println("[주의] 숫자값만 입력하세요");
					}
				}
				
				//3. 숫자값 비교
				//1~4 번째까지 시도
				if (tryCnt < 5) {
					if (comNo == meNo) {
						System.out.println(">> 맞췄습니다. "
								+ "내가 생각한 숫자는 " + comNo + "입니다.");
						System.out.println("게임을 종료합니다.");
						break;
					}
					if (comNo > meNo) {
						System.out.println("(com)>> 내가 생각한 숫자는 " + meNo + " 보다 크다.");
					}
					if (comNo < meNo) {
						System.out.println("(com)>> 내가 생각한 숫자는 " + meNo + " 보다 작다.");
					}
				}
				//시도 횟수가 5번째(마지막 시도)
				if (tryCnt == 5) {
					if (comNo == meNo) {//성공
						System.out.println(">> 맞췄습니다. "
								+ "내가 생각한 숫자는 " + comNo + "입니다.");
						System.out.println("게임을 종료합니다.");
					} else {//실패
						System.out.println(">> 실패~~~ "
								+ "내가 생각한 숫자는 " + comNo + "입니다.");
					}
					break;
				}
			}//내부 while 끝
			//한 번의 게임이 종료된 상태
			System.out.println("-------------------");
			
			//게임을 더 할것인지 여부 확인
			System.out.print(">> 다시 도전하시겠습니까?(y/n) ");
			String tryYesNo = scan.nextLine();
			if ("n".equalsIgnoreCase(tryYesNo)) {
				System.out.println(">>> 게임이 종료되었습니다.");
				break; 
			}
		}//외부 while 끝
		
		System.out.println("--- main() 종료 -------");
	}

}







