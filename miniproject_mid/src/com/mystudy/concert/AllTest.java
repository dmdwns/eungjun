package com.mystudy.concert;

public class AllTest {

	public static void main(String[] args) {
		
		ConcertAll ca = new ConcertAll();
		
		ca.joinStart(); //회원가입, 로그인
		ca.SelectConcert(); //콘서트 티켓 조회
		ca.startReserv(); //메뉴선택
		ca.startPayment(); //결제화면
		
	}
}
