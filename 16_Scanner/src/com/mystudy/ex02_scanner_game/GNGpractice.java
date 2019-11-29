package com.mystudy.ex02_scanner_game;

import java.util.Scanner;

public class GNGpractice {
	private Scanner scan=new Scanner(System.in);
	public void gameStart() {
		System.out.println("게임시작");
		while(true) {
			playGame();
			
			if(!tryAgain()) {
				scan.close();
				break;
			}
		}
	}
	
	private boolean tryAgain() {
		System.out.println("다시도전(y/n)");
		String tryYesNo=scan.nextLine();
		if("n".equalsIgnoreCase(tryYesNo)) {
			System.out.println("게임종료");
			return false;
		}
		return true;
	
	}
	private void playGame() {
		int comNo=0;
		int meNo=0;
		int tryCnt=0;
		comNo=(int)(Math.random()*100)+1;
		System.out.println("컴터가 생각한 숫자를 맞춰보세요");
		
		while(tryCnt<5) {
			tryCnt++;
			while(true) {
				try {
					System.out.println(tryCnt+"번째 숫자 선택 : ");
					meNo=Integer.parseInt(scan.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("땡 숫자만 입력하라니까");
				}
			}
			if(comNo==meNo) {
				System.out.println("맞춤");
				System.out.println("종료");
				break;
			}
			if(comNo>meNo) {
				System.out.println("내가 생각한숫자");
			}
			if(comNo<meNo) {
				System.out.println("내가 생각한 숫자");
			}
			if(tryCnt==5) {
				System.out.println("실패");
				break;
			}
			
	
		}
	}

}














