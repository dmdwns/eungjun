package com.mystudy.ex02_scanner_game;

import java.util.Scanner;

public class GNGpractice {
	private Scanner scan=new Scanner(System.in);
	public void gameStart() {
		System.out.println("���ӽ���");
		while(true) {
			playGame();
			
			if(!tryAgain()) {
				scan.close();
				break;
			}
		}
	}
	
	private boolean tryAgain() {
		System.out.println("�ٽõ���(y/n)");
		String tryYesNo=scan.nextLine();
		if("n".equalsIgnoreCase(tryYesNo)) {
			System.out.println("��������");
			return false;
		}
		return true;
	
	}
	private void playGame() {
		int comNo=0;
		int meNo=0;
		int tryCnt=0;
		comNo=(int)(Math.random()*100)+1;
		System.out.println("���Ͱ� ������ ���ڸ� ���纸����");
		
		while(tryCnt<5) {
			tryCnt++;
			while(true) {
				try {
					System.out.println(tryCnt+"��° ���� ���� : ");
					meNo=Integer.parseInt(scan.nextLine());
					break;
				}catch(Exception e) {
					System.out.println("�� ���ڸ� �Է��϶�ϱ�");
				}
			}
			if(comNo==meNo) {
				System.out.println("����");
				System.out.println("����");
				break;
			}
			if(comNo>meNo) {
				System.out.println("���� �����Ѽ���");
			}
			if(comNo<meNo) {
				System.out.println("���� ������ ����");
			}
			if(tryCnt==5) {
				System.out.println("����");
				break;
			}
			
	
		}
	}

}














