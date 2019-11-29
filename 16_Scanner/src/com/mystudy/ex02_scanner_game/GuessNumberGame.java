package com.mystudy.ex02_scanner_game;

import java.util.Scanner;

public class GuessNumberGame {
	
	private Scanner scan = new Scanner(System.in);
	
	public void gameStart() {
		System.out.println("게임시작");
		while(true) {
			playGame();
			
			if (!tryAgain()) {
				scan.close();
				break;
			}
		}
	}
	private boolean tryAgain() {
		System.out.print(">> 다시 도전?(y/n) ");
		String tryYesNo = scan.nextLine();
		if ("n".equalsIgnoreCase(tryYesNo)) {
			System.out.println(">>> 게임종료");
			return false;
		}
		return true;
	}
	
	private void playGame() {
		int comNo = 0; //컴퓨터가 생각한 숫자
		int meNo = 0; //내가 결정한 숫자
		int tryCnt = 0; //시도 횟수
		
		//1. 컴퓨터가 1~100 범위의 숫자를 생각하도록 만들기
		//Math.random() : 0.000 ~ 0.9999999
		//System.out.println((int) (Math.random() * 100) + 1);
		comNo = (int) (Math.random() * 100) + 1;
		System.out.println("컴) 1~100까지 숫자중 하나를 생각했습니다. " 
				+ "맞춰보세요~~~");
		System.out.println("컴퓨터가 생각한 숫자 : " + comNo);
		
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
			
			//5번째임에도 여기까지 왔다는 것은 못맞춘 경우
			//시도 횟수가 5번째(마지막 시도)
			if (tryCnt == 5) {
				System.out.println(">> 실패~~~ "
						+ "내가 생각한 숫자는 " + comNo + "입니다.");
				break;
			}
		}//내부 while 끝
		
	}
}
