package Customer_Join;

import java.util.Scanner;

public class CustomerLogMethod {
	private String id;
	private String pw;
	Scanner scan = new Scanner(System.in);
	
	protected boolean inputIdPw() {
		boolean inputLog = false;
		System.out.println("========================");
		System.out.println("[ȯ���մϴ� �α����� �����մϴ�]");
		System.out.println("========================");
		
		while(true) {
			System.out.print("���̵� : ");
			id = scan.nextLine(); // ���̵� �Է�
			
			System.out.print("��й�ȣ : ");
			pw = scan.nextLine(); // ��й�ȣ �Է�
			
			CustomerLogVO lvo = new CustomerLogVO(id, pw);
			 
			boolean logTrue = new CustomerLogDAO().checkIdPassword(lvo);
			
			if (logTrue) {
				inputLog = true;
				System.out.println("�α����� �ϼ̽��ϴ�");
				break;
			} else {
				System.out.println("�ٽ� �Է����ּ���.");
			}			
		}
		return inputLog;
	}
	
	

}



