package com.mystudy.concert;
public class SEAT_INFO_VO {
	private String customer_id;
	private int seat_num;
	private String seat_grade;
	private int concert_num;
	private int seat_price;
	private String haveseat;
	
	public SEAT_INFO_VO(String customer_id, int seat_num, String seat_grade, int concert_num, int seat_price, String haveseat) {
		super();
		this.customer_id = customer_id;
		this.seat_num = seat_num;
		this.seat_grade = seat_grade;
		this.concert_num = concert_num;
		this.seat_price = seat_price;
		this.haveseat = haveseat;
	}

	
	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public int getSeat_num() {
		return seat_num;
	}

	public void setSeat_num(int seat_num) {
		this.seat_num = seat_num;
	}

	public String getSeat_grade() {
		return seat_grade;
	}

	public void setSeat_grade(String seat_grade) {
		this.seat_grade = seat_grade;
	}

	public int getConcert_num() {
		return concert_num;
	}

	public void setConcert_num(int concert_num) {
		this.concert_num = concert_num;
	}

	public int getSeat_price() {
		return seat_price;
	}

	public void setSeat_price(int seat_price) {
		this.seat_price = seat_price;
	}

	public String getHaveseat() {
		return haveseat;
	}

	public void setHaveseat(String haveseat) {
		this.haveseat = haveseat;
	}

	@Override
	public String toString() {
		return "SEAT_INFO_VO [seat_num=" + seat_num + ", seat_grade=" + seat_grade + ", concert_num=" + concert_num
				+ ", seat_price=" + seat_price + ", haveseat=" + haveseat + "]";
	}
	
}
	