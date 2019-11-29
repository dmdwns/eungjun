package com.mystudy.concert;

import java.sql.Date;

public class ConcertInfoVO {

		Date concert_date;
		int concert_num;
		int hall_num;
		String concert_name;
		
		
		public ConcertInfoVO() {
			
		}


		public ConcertInfoVO(Date concert_date, int concert_num, int hall_num, String concert_name) {
			super();
			this.concert_date = concert_date;
			this.concert_num = concert_num;
			this.hall_num = hall_num;
			this.concert_name = concert_name;
		}


		public Date getConcert_date() {
			return concert_date;
		}


		public void setConcert_date(Date concert_date) {
			this.concert_date = concert_date;
		}


		public int getConcert_num() {
			return concert_num;
		}


		public void setConcert_num(int concert_num) {
			this.concert_num = concert_num;
		}


		public int getHall_num() {
			return hall_num;
		}


		public void setHall_num(int hall_num) {
			this.hall_num = hall_num;
		}


		public String getConcert_name() {
			return concert_name;
		}


		public void setConcert_name(String concert_name) {
			this.concert_name = concert_name;
		}


		@Override
		public String toString() {
			return "ConcertInfoVO [concert_date=" + concert_date + "\t"+
									", concert_num=" + concert_num +  "\t"+
									", hall_num=" + hall_num +  "\t"+
									", conert_name=" + concert_name + "]";
		}


}
