package com.mystudy.concert;

import java.util.List;
import java.util.Scanner;

public class PaymentTest {
	public static void main(String[] args) {
//		----------------------------PaymentDAO사용을 위한 객체 선언
		PaymentDAO dao = new PaymentDAO ();
//		----------------------------Payment 전체조회
		/*
		List<PaymentVO> list = dao.selectAll();
		for (PaymentVO mvo : list ) {
			System.out.println(mvo);
		}
		*/
//		----------------------------Payment 회원id로 조회
//		dao.selectOne("밀가루");
//		----------------------------Payment 회원id로 입력
//		dao.insertOne(new PaymentVO("오징어"));
//		----------------------------결제 메소드 시작
//		dao.startPayment();
		dao.startPayment();
//		---------------------------------------
				
	} 
}
