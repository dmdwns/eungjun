package com.mystudy.concert;


public class AdminVO {

	
	String id;
	String password;
	public AdminVO(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AdminVO [id=" + id + ", password=" + password + "]";
	}
	
	
}
