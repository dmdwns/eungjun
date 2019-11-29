package user;

import java.util.Scanner;

public class UserDTO {

	private String CUSTOMER_ID;
	private String CUSTOMER_PW;
	private String CUSTOMER_NAME;
	private String CUSTOMER_TEL;
	
	Scanner scan = new Scanner(System.in);
	
	public UserDTO() {
		System.out.println("아이디를 입력 : ");
		CUSTOMER_ID = scan.nextLine();
		System.out.println("비밀번호 입력 : ");
		CUSTOMER_PW = scan.nextLine();
		System.out.println("이름 입력 :");
		CUSTOMER_NAME = scan.nextLine();
		System.out.println("전화번호 입력 :");
		CUSTOMER_TEL = scan.nextLine();
	}
	
	public UserDTO(String id, String password) {
		
		this.CUSTOMER_ID = CUSTOMER_ID;
		this.CUSTOMER_PW = CUSTOMER_PW;
	}
	

	public UserDTO(String CUSTOMER_ID, String CUSTOMER_PW, String CUSTOMER_NAME, String CUSTOMER_TEL) {
		super();
		this.CUSTOMER_ID = CUSTOMER_ID;
		this.CUSTOMER_PW = CUSTOMER_PW;
		this.CUSTOMER_NAME = CUSTOMER_NAME;
		this.CUSTOMER_TEL = CUSTOMER_TEL;
	}

	public String getCUSTOMER_ID() {
		return CUSTOMER_ID;
	}

	public void setCUSTOMER_ID(String cUSTOMER_ID) {
		CUSTOMER_ID = cUSTOMER_ID;
	}

	public String getCUSTOMER_PW() {
		return CUSTOMER_PW;
	}

	public void setCUSTOMER_PW(String cUSTOMER_PW) {
		CUSTOMER_PW = cUSTOMER_PW;
	}

	public String getCUSTOMER_NAME() {
		return CUSTOMER_NAME;
	}

	public void setCUSTOMER_NAME(String cUSTOMER_NAME) {
		CUSTOMER_NAME = cUSTOMER_NAME;
	}

	public String getCUSTOMER_TEL() {
		return CUSTOMER_TEL;
	}

	public void setCUSTOMER_TEL(String cUSTOMER_TEL) {
		CUSTOMER_TEL = cUSTOMER_TEL;
	}

	@Override
	public String toString() {
		return "UserDTO [CUSTOMER_ID=" + CUSTOMER_ID + ", CUSTOMER_PW=" + CUSTOMER_PW + ", CUSTOMER_NAME="
				+ CUSTOMER_NAME + ", CUSTOMER_TEL=" + CUSTOMER_TEL + "]";
	}


}