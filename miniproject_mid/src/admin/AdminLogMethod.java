package admin;



import java.util.Scanner;

public class AdminLogMethod {
	private String id;
	private String pw;
	Scanner scan = new Scanner(System.in);
	
	protected boolean inputIdPw() {
		boolean inputLog = false;
		System.out.println("========================");
		System.out.println("[ȯ���մϴ� �α����� �����մϴ�]");
		System.out.println("========================");
		
		while(inputLog=false) {
			System.out.print("���̵� : ");
			id = scan.nextLine(); // ���̵� �Է�
			
			System.out.print("��й�ȣ : ");
			pw = scan.nextLine(); // ��й�ȣ �Է�
			
			AdminVO lvo = new AdminVO(id, pw);
			 
			boolean logTrue = new AdminLogDAO().checkIdPassword(lvo);
			
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


