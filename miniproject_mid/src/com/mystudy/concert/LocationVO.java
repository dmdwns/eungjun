package com.mystudy.concert;


public class LocationVO {

	int concert_num;
	String hall_location;
	int seat_sum;
	
	
	public LocationVO(int concert_num, String hall_location, int seat_sum) {
		super();
		this.concert_num = concert_num;
		this.hall_location = hall_location;
		this.seat_sum = seat_sum;
	}


	public int getConcert_num() {
		return concert_num;
	}


	public void setConcert_num(int concert_num) {
		this.concert_num = concert_num;
	}


	public String getHall_location() {
		return hall_location;
	}


	public void setHall_location(String hall_location) {
		this.hall_location = hall_location;
	}


	public int getSeat_sum() {
		return seat_sum;
	}


	public void setSeat_sum(int seat_sum) {
		this.seat_sum = seat_sum;
	}


	@Override
	public String toString() {
		return "LocationVO [concert_num=" + concert_num + ", hall_location=" + hall_location + ", seat_sum=" + seat_sum
				+ "]";
	}
	
	
}
