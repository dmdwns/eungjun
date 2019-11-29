package com.mystudy.ojdbc3_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentManager_Update {

	public static void main(String[] args) {
		//(실습) 	PreparedStatement 사용해서 수정작업
		// 수정대상 : ID - '2019001' 데이터 수정
		// 이름:홍길동, 국어:100, 영어:90, 수학: 81
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. DB연결  - Connection 객체 생성 <-DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			
			//3. Statement문 실행(SQL문 실행)
			//3-1. Connection 객체로 부터 PreparedStatement 객체 생성
			String sql = "";
			sql += "UPDATE STUDENT ";
			sql += "   SET NAME = ? ";
			sql += "     , KOR = ? ";
			sql += "     , ENG = ? ";
			sql += "     , MATH = ? ";
			sql += " WHERE ID = ? ";
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(바인드변수) 위치에 값 대입
			// 이름:홍길동, 국어:100, 영어:90, 수학: 81
			String id = "2019001";
			String name = "홍길동";
			int kor = 100;
			int eng = 90;
			int math = 81;
			
			int idx = 1;
			pstmt.setString(idx++, name); //1
			pstmt.setInt(idx++, kor); //2
			pstmt.setInt(idx++, eng); //3
			pstmt.setInt(idx++, math); //4
			pstmt.setString(idx++, id); //5
			
			//3-3. SQL문 실행
			int result = pstmt.executeUpdate();
			
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
				if (pstmt != null) pstmt.close();
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
