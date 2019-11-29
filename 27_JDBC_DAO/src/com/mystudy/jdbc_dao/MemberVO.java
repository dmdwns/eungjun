package com.mystudy.jdbc_dao;

//VO : Value Object
public class MemberVO {
	//DB의 MEMBER 테이블과 동일한 형태 필드 선언
	//ID, NAME, PASSWORD, PHONE, ADDRESS
	private String id;
	private String name;
	private String password;
	private String phone;
	private String address;
	
	//생성자(id,name,password,phone)
	public MemberVO(String id, String name, String password, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
	}

	public MemberVO(String id, String name, String password, String phone, String address) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}
	
	//getter, setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "MemberVO [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + ", address="
				+ address + "]";
	}
}






