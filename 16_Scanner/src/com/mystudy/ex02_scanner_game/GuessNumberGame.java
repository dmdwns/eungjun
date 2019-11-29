package com.mystudy.ex02_scanner_game;

import java.util.Scanner;

public class GuessNumberGame {
	
	private Scanner scan = new Scanner(System.in);
	
	public void gameStart() {
		System.out.println("���ӽ���");
		while(true) {
			playGame();
			
			if (!tryAgain()) {
				scan.close();
				break;
			}
		}
	}
	private boolean tryAgain() {
		System.out.print(">> �ٽ� ����?(y/n) ");
		String tryYesNo = scan.nextLine();
		if ("n".equalsIgnoreCase(tryYesNo)) {
			System.out.println(">>> ��������");
			return false;
		}
		return true;
	}
	
	private void playGame() {
		int comNo = 0; //��ǻ�Ͱ� ������ ����
		int meNo = 0; //���� ������ ����
		int tryCnt = 0; //�õ� Ƚ��
		
		//1. ��ǻ�Ͱ� 1~100 ������ ���ڸ� �����ϵ��� �����
		//Math.random() : 0.000 ~ 0.9999999
		//System.out.println((int) (Math.random() * 100) + 1);
		comNo = (int) (Math.random() * 100) + 1;
		System.out.println("��) 1~100���� ������ �ϳ��� �����߽��ϴ�. " 
				+ "���纸����~~~");
		System.out.println("��ǻ�Ͱ� ������ ���� : " + comNo);
		
		while (tryCnt < 5) {
			tryCnt++;
			
			//2. ���� �����ϱ�
			while (true) {
				try {
					System.out.print(tryCnt + "��°> ���ڸ� ���� : ");
					meNo = Integer.parseInt(scan.nextLine());
					break;
				} catch (Exception e) {
					System.out.println("[����] ���ڰ��� �Է��ϼ���");
				}
			}
			
			//3. ���ڰ� ��
			//1~4 ��°���� �õ�
			if (comNo == meNo) {
				System.out.println(">> ������ϴ�. "
						+ "���� ������ ���ڴ� " + comNo + "�Դϴ�.");
				System.out.println("������ �����մϴ�.");
				break;
			}
			if (comNo > meNo) {
				System.out.println("(com)>> ���� ������ ���ڴ� " + meNo + " ���� ũ��.");
			}
			if (comNo < meNo) {
				System.out.println("(com)>> ���� ������ ���ڴ� " + meNo + " ���� �۴�.");
			}
			
			//5��°�ӿ��� ������� �Դٴ� ���� ������ ���
			//�õ� Ƚ���� 5��°(������ �õ�)
			if (tryCnt == 5) {
				System.out.println(">> ����~~~ "
						+ "���� ������ ���ڴ� " + comNo + "�Դϴ�.");
				break;
			}
		}//���� while ��
		
	}
}
