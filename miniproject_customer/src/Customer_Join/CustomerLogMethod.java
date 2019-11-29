package Customer_Join;

import java.util.Scanner;

public class CustomerLogMethod {
	private String id;
	private String pw;
	Scanner scan = new Scanner(System.in);
	
	protected boolean inputIdPw() {
		boolean inputLog = false;
		System.out.println("========================");
		System.out.println("[환영합니다 로그인을 시작합니다]");
		System.out.println("========================");
		
		while(true) {
			System.out.print("아이디 : ");
			id = scan.nextLine(); // 아이디 입력
			
			System.out.print("비밀번호 : ");
			pw = scan.nextLine(); // 비밀번호 입력
			
			CustomerLogVO lvo = new CustomerLogVO(id, pw);
			 
			boolean logTrue = new CustomerLogDAO().checkIdPassword(lvo);
			
			if (logTrue) {
				inputLog = true;
				System.out.println("로그인이 하셨습니다");
				break;
			} else {
				System.out.println("다시 입력해주세요.");
			}			
		}
		return inputLog;
	}
	
	

}



