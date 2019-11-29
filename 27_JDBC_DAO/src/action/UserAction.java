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
		System.out.println("-------------------- ȸ �� �� �� -------------------");
		System.out.println(">> 1. ȸ������  2. ȸ�� ���� ����  3. ȸ�� Ż��  0. ����ȭ������");
		System.out.println("-------------------------------------------------");
		System.out.println(">>�۾� ����");
		
		
		while (true) {
			try {
			select = Integer.parseInt(scan.nextLine()); 
			if(select == 1) {
				System.out.print("���̵� �Է� : ");
				CUSTOMER_ID = scan.nextLine();
				System.out.print("��й�ȣ �Է� : ");
				CUSTOMER_PW = scan.nextLine();
				System.out.print("�̸� :");
				CUSTOMER_NAME = scan.nextLine();
				System.out.print("��ȭ��ȣ :");
				CUSTOMER_TEL = scan.nextLine();
				udto = new UserDTO(CUSTOMER_ID, CUSTOMER_PW, CUSTOMER_NAME, CUSTOMER_TEL);
				udao.join(udto);
				//result = udao.join(udto);
			} else {
				System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է� �ٶ��ϴ�.");
				break;
			}
			break;
		} catch (Exception e) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}

			try {
				select = Integer.parseInt(scan.nextLine()); 
				if(select == 3) {
					System.out.println("���̵� �Է��ϼ��� : ");
					CUSTOMER_ID = scan.nextLine();
					System.out.println("��й�ȣ�� �Է��ϼ��� :");
					CUSTOMER_PW = scan.nextLine();
					udto = new UserDTO(CUSTOMER_ID, CUSTOMER_PW);
					udao.delete(udto);
					System.out.println("result" + result);
				} else {
					System.out.println("�߸� �Է��߽��ϴ�. �ٽ� �Է� �ٶ��ϴ�.");
					break;
				}
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("exception: �߸� �Է��ϼ̽��ϴ�.");
			}
		
		}
		
		}
		}
	

}