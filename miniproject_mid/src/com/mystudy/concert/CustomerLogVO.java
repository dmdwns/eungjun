package com.mystudy.concert;
public class CustomerLogVO {
	
	private String customer_id;
	private String password;
	
	public CustomerLogVO(String customer_id, String password) {
		super();
		this.customer_id = customer_id;
		this.password = password;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setId(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "CustomerLogVO [id=" + customer_id + ", password=" + password + "]";
	}
	
}