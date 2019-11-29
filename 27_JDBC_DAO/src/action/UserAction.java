package action;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

import user.UserDAO;
import user.UserDTO;

public class UserAction {

	public static void main(String[] args) {
		
		UserDTO udto = null;
		UserDAO udao = new UserDAO();
		Scanner scan = new Scanner(System.in);
		int result = 0;
		int select = 0;
		
		 String CUSTOMER_ID;
		 String CUSTOMER_PW;
		 String CUSTOMER_NAME;
		 String CUSTOMER_TEL;
		
		while(true) {
		System.out.println("-------------------- 회 원 가 입 -------------------");
		System.out.println(">> 1. 회원가입  2. 회원 정보 변경  3. 회원 탈퇴  0. 메인화면으로");
		System.out.println("-------------------------------------------------");
		System.out.println(">>작업 선택");
		
		
		while (true) {
			try {
			select = Integer.parseInt(scan.nextLine()); 
			if(select == 1) {
				System.out.print("아이디 입력 : ");
				CUSTOMER_ID = scan.nextLine();
				System.out.print("비밀번호 입력 : ");
				CUSTOMER_PW = scan.nextLine();
				System.out.print("이름 :");
				CUSTOMER_NAME = scan.nextLine();
				System.out.print("전화번호 :");
				CUSTOMER_TEL = scan.nextLine();
				udto = new UserDTO(CUSTOMER_ID, CUSTOMER_PW, CUSTOMER_NAME, CUSTOMER_TEL);
				udao.join(udto);
				//result = udao.join(udto);
			} else {
				System.out.println("잘못 입력했습니다. 다시 입력 바랍니다.");
				break;
			}
			break;
		} catch (Exception e) {
			System.out.println("잘못 입력하셨습니다.");
		}

			try {
				select = Integer.parseInt(scan.nextLine()); 
				if(select == 3) {
					System.out.println("아이디를 입력하세요 : ");
					CUSTOMER_ID = scan.nextLine();
					System.out.println("비밀번호를 입력하세요 :");
					CUSTOMER_PW = scan.nextLine();
					udto = new UserDTO(CUSTOMER_ID, CUSTOMER_PW);
					udao.delete(udto);
					System.out.println("result" + result);
				} else {
					System.out.println("잘못 입력했습니다. 다시 입력 바랍니다.");
					break;
				}
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("exception: 잘못 입력하셨습니다.");
			}
		
		}
		
		}
		}
	

}