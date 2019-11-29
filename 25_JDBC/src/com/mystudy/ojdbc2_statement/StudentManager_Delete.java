package com.mystudy.ojdbc2_statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Delete {

	public static void main(String[] args) {
		//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)
		//1. JDBC 드라이버 로딩
		//2. DB연결  - Connection 객체 생성 <-DriverManager
		//3. Statement문 실행(SQL문 실행)
		//4. SQL 실행 결과에 대한 처리
		//   -SELECT : 조회(검색) 데이타 결과 값에 대한 처리
		//   -INSERT, UPDATE, DELETE : int값(건수) 처리
		//5. 클로징 처리에 의한 자원 반납
		//=====================================
		
		//(실습) 삭제 : '홍경래' 데이터 삭제
		Connection conn = null;
		Statement stmt = null;
		
		//1. JDBC 드라이버 로딩
		try {
			//1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. DB연결  - Connection 객체 생성 <-DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			
			//3. Statement문 실행(SQL문 실행)
			//3-1. Connection 객체로 부터 Statement 객체 생성
			stmt = conn.createStatement();
			
			//3-2. Statement 객체를 이용해서 SQL문 실행
			String name = "홍경래";
			
			String sql = ""; //DELETE 문 작성
			sql += "DELETE FROM STUDENT WHERE NAME = '" + name +"' ";
			
			System.out.println("sql : " + sql);
			
			int result = stmt.executeUpdate(sql);
			
			//4. SQL 실행 결과에 대한 처리
			//   -SELECT : 조회(검색) 데이타 결과 값에 대한 처리
			//   -INSERT, UPDATE, DELETE : int값(건수) 처리
			System.out.println(">> 처리건수 : " + result);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. 클로징 처리에 의한 자원 반납(객체 생성 순서와 역순으로 진행)
			try {
				if (stmt != null) stmt.close();
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

}



