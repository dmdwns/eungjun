package com.mystudy.concert;

public class BookListVO {
	//T.RESERVATION_NUM ,T.CONCERT_NAME,T.SEAT_NUM,T.CUSTOMER_ID,P.PAYMENT_DATE
	private int reservation_num;
	private String concert_name;
	private String seat_num;
	private String customer_id;
	private String payment_date;
	
	public BookListVO(int reservation_num, String concert_name, String seat_num, String customer_id,
			String payment_date) {
		super();
		this.reservation_num = reservation_num;
		this.concert_name = concert_name;
		this.seat_num = seat_num;
		this.customer_id = customer_id;
		this.payment_date = payment_date;
	}

	public int getReservation_num() {
		return reservation_num;
	}

	public void setReservation_num(int reservation_num) {
		this.reservation_num = reservation_num;
	}

	public String getConcert_name() {
		return concert_name;
	}

	public void setConcert_name(String concert_name) {
		this.concert_name = concert_name;
	}

	public String getSeat_num() {
		return seat_num;
	}

	public void setSeat_num(String seat_num) {
		this.seat_num = seat_num;
	}

	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getPayment_date() {
		return payment_date;
	}

	public void setPayment_date(String payment_date) {
		this.payment_date = payment_date;
	}

	@Override
	public String toString() {
		return "BookListVO [reservation_num=" + reservation_num + ", concert_name=" + concert_name + ", seat_num="
				+ seat_num + ", customer_id=" + customer_id + ", payment_date=" + payment_date + "]";
	}
	

	
	
	
	
}
