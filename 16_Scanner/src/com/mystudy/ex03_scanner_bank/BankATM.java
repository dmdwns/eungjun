package com.mystudy.ex03_scanner_bank;

import java.util.Scanner;

//[실습] 은행의 ATM
//1.입금  2.출금  3.통장확인  0.종료
//------------------------------
//계좌를 하나 만들고 입금/출금/통장확인 작업을 처리
public class BankATM {
	private int money; //통장계좌(금액)
	private Scanner scan = new Scanner(System.in);
	
	public void startBank() {
		System.out.println(">> 어서오세요");
		while (true) {
			if (!bankATM()) {
				scan.close();
				break;
			}
			System.out.println();
		}
		System.out.println(">> ATM 기계가 종료되었습니다.");
	}

	private boolean bankATM() {
		boolean isContinue = true;
		//메뉴 출력
		System.out.println("------------------------");
		System.out.println("1.입금  2.출금  3.통장확인  0.종료");
		System.out.println("------------------------");
		System.out.print(">>작업선택 : ");
		
		//작업선택 
		int select = -1;
		try {
			select = Integer.parseInt(scan.nextLine());
		} catch(NumberFormatException e) {
			System.out.println("[예외발생] 잘못된 값이 입력되었습니다.\n"
					+ "메뉴(0~3) 숫자만 입력하세요.");
		}
		if (select == 1) {
			//System.out.println("입금처리~~");
			inputMoney(); //입금처리
			showMoney(); //통장 잔액 표시
		}
		if (select == 2) {
			//System.out.println("출금처리~~");
			outputMoney(); //출금처리
			showMoney(); //통장 잔액 표시
		}
		if (select == 3) {
			//System.out.println("통장확인~~");
			showMoney();
		}
		if (select == 0) {
			System.out.println("ATM 기계를 종료하겠습니다.");
			isContinue = false;
		}
		
		return isContinue;
	}

	//출금처리 메소드
	private void outputMoney() {
		//System.out.println("출금처리~~");
		while (true) {
			try {
				System.out.print(">>출금액 : ");
				int outMoney = Integer.parseInt(scan.nextLine());
				if (money >= outMoney) {
					money -= outMoney;
				} else {
					System.out.println(">> 잔액부족으로 출금 불가");
				}
				break; //정상처리 되면 반복 종료
			} catch(NumberFormatException e) {
				System.out.println("[예외발생] 잘못된 값이 입력되었습니다.\n" 
						+ "숫자(0~9)만 입력하세요.\n"
						+ "다시 작업을 선택하세요.");
			}
		}
	}

	private void showMoney() {
		System.out.print("::통장금액 : " + money + " 원");
		
	}

	//입금처리 메소드
	private void inputMoney() {
		while (true) {
			try {
				System.out.print(">>입금액 : ");
				money += Integer.parseInt(scan.nextLine());
				break; //정상처리 되면 반복 종료
			} catch(NumberFormatException e) {
				System.out.println("[예외발생] 잘못된 값이 입력되었습니다.\n" 
						+ "숫자(0~9)만 입력하세요.\n"
						+ "다시 작업을 선택하세요.");
			}
		}
	}
}

/* *********************
>> 어서오세요
------------------------
1.입금  2.출금  3.통장확인  0.종료
------------------------
>>작업선택 : 1
>>입금액 : 10000
::통장금액 : 10000원

------------------------
1.입금  2.출금  3.통장확인  0.종료
------------------------
>>작업선택 : 2
>>출금액 : 5000
::통장금액 : 5000원

------------------------
1.입금  2.출금  3.통장확인  0.종료
------------------------
>>작업선택 : 3
::통장금액 : 5000원

------------------------
1.입금  2.출금  3.통장확인  0.종료
------------------------
>>작업선택 : 0
>>작업을 종료했습니다.
******************************/





