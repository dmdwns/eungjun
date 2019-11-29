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
				System.out.println("잘못 선택하였습니다.");
				break;
			}
		}
		System.out.println("종료합니다...");
	}

	int selectMenu() {
		System.out.println("1:회원가입 2:회원정보삭제 3:회원검색 4:회원목록 0:종료");
		int key = scan.nextInt();
		scan.nextLine();
		return key;
	}

	void addMember() {

		String id = "";
		String pw = "";
		String name = "";
		String tel = "";

		System.out.print("아이디 : ");
		id = scan.nextLine();
		scan.nextLine();

		System.out.print("비밀번호 : ");
		pw = scan.nextLine();
		scan.nextLine();
		
		System.out.print("이름 : ");
		pw = scan.nextLine();
		scan.nextLine();
		
		System.out.print("전화번호 : ");
		pw = scan.nextLine();
		scan.nextLine();
		
		Member member = new Member(id, pw, name, tel);

		members.add(member);

		System.out.println(member.toString() + " 가입되었습니다.");

	}

	void removeMember() {

		String id = "";

		System.out.print("삭제할 회원 아이디:");

		id = scan.nextLine();

		scan.nextLine();

		Member member = Find(id);

		if (member == null) {

			System.out.println("존재하지 않습니다.");

			return;

		}

		members.remove(member);

		System.out.println(member.toString() + " 삭제하였습니다.");

	}

	void serchMember() {

		String id = "";

		System.out.print("검색할 아이디:");

		id = scan.nextLine();

		scan.nextLine();

		Member member = Find(id);

		if (member == null) {

			System.out.println("존재하지 않습니다.");

			return;

		}

		System.out.println("아이디 검색 결과>>" + member.toString());

	}

	void listMember() {

		System.out.println("전체 목록");

		int cnt = members.size();

		System.out.println("회원 수:" + cnt);

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
