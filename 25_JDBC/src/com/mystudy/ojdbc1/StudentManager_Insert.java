package com.mystudy.ojdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Insert {

	public static void main(String[] args) {
		//JDBC를 이용한 DB 프로그래밍 절차 ---------------------
		//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)
		//1. JDBC 드라이버 로딩
		//2. DB연결  - Connection 객체 생성 <-DriverManager
		//3. Statement문 실행(SQL문 실행)
		//4. SQL 실행 결과에 대한 처리
		//   -SELECT : 조회(검색) 데이타 결과 값에 대한 처리
		//   -INSERT, UPDATE, DELETE : int값(건수) 처리
		//5. 클로징 처리에 의한 자원 반납
		//=====================================

		//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)
		//1. JDBC 드라이버 로딩
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("[예외] 드라이버 로딩 실패!!!");
			e.printStackTrace();
		}

		//2. DB연결  - Connection 객체 생성 <-DriverManager
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
		} catch (SQLException e) {
			System.out.println("[예외] DB연결 실패!!!");
			e.printStackTrace();
		}
		
		//3. Statement문 실행(SQL문 실행)
		Statement stmt = null;
		try {
			//3-1. Connection 객체로 부터 Statement 객체 생성
			stmt = conn.createStatement();
			
			//3-2. Statement 객체 사용 SQL문 실행
			String sql = "";
			sql += "INSERT INTO STUDENT ";
			sql += "       (ID, NAME, KOR, ENG, MATH, TOT, AVG) ";
			sql += "VALUES ('2019005', '강감찬', 100, 90, 80, 0, 0) ";
			System.out.println("sql : " + sql);
			
			//SELECT 문 : executeQuery()
			//INSERT, UPDATE, DELETE : executeUpdate()
			int result = stmt.executeUpdate(sql);
			
			//4. SQL 실행 결과에 대한 처리
			System.out.println("처리건수 : " + result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//5. 클로징 처리에 의한 자원 반납(객체 생성 순서와 역순으로 진행)
		try {
			if (stmt != null) stmt.close();
			System.out.println(">> Statement close 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null) conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
