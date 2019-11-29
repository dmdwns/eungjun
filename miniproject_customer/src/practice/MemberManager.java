package practice;

import java.util.Scanner;
import java.util.Vector;

public class MemberManager {

	Scanner scan = new Scanner(System.in);
	Vector<Member> members = new Vector<Member>();

	public void Run() {
		int key = 0;
		while ((key = selectMenu()) != 0) {
			switch (key) {
			case 1:
				addMember();
				break;
			case 2:
				removeMember();
				break;
			case 3:
				serchMember();
				break;
			case 4:
				listMember();
				break;
			default:
				System.out.println("�߸� �����Ͽ����ϴ�.");
				break;
			}
		}
		System.out.println("�����մϴ�...");
	}

	int selectMenu() {
		System.out.println("1:ȸ������ 2:ȸ���������� 3:ȸ���˻� 4:ȸ����� 0:����");
		int key = scan.nextInt();
		scan.nextLine();
		return key;
	}

	void addMember() {

		String id = "";
		String pw = "";
		String name = "";
		String tel = "";

		System.out.print("���̵� : ");
		id = scan.nextLine();
		scan.nextLine();

		System.out.print("��й�ȣ : ");
		pw = scan.nextLine();
		scan.nextLine();
		
		System.out.print("�̸� : ");
		pw = scan.nextLine();
		scan.nextLine();
		
		System.out.print("��ȭ��ȣ : ");
		pw = scan.nextLine();
		scan.nextLine();
		
		Member member = new Member(id, pw, name, tel);

		members.add(member);

		System.out.println(member.toString() + " ���ԵǾ����ϴ�.");

	}

	void removeMember() {

		String id = "";

		System.out.print("������ ȸ�� ���̵�:");

		id = scan.nextLine();

		scan.nextLine();

		Member member = Find(id);

		if (member == null) {

			System.out.println("�������� �ʽ��ϴ�.");

			return;

		}

		members.remove(member);

		System.out.println(member.toString() + " �����Ͽ����ϴ�.");

	}

	void serchMember() {

		String id = "";

		System.out.print("�˻��� ���̵�:");

		id = scan.nextLine();

		scan.nextLine();

		Member member = Find(id);

		if (member == null) {

			System.out.println("�������� �ʽ��ϴ�.");

			return;

		}

		System.out.println("���̵� �˻� ���>>" + member.toString());

	}

	void listMember() {

		System.out.println("��ü ���");

		int cnt = members.size();

		System.out.println("ȸ�� ��:" + cnt);

		for (Member member : members) {

			System.out.println(member.toString());

		}

	}

	Member Find(String id) {

		int cnt = members.size();

		for (Member member : members) {

			if (member.getId() == id) {

				return member;

			}

		}

		return null;

	}

}
