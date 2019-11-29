package com.mystudy.concert;

import java.util.Scanner;

public class ConcertInfo {

	public static void main(String[] args) {

		ConcertInfoDVO dao = new ConcertInfoDVO();

		dao.SelectConcert();
//			dao.selectAll();
//			dao.dispData(1);

	}
}