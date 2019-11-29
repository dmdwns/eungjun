package com.mystudy.concert;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ConcertInfoDVO {
	
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "MDGUEST";
	private static final String PASSWORD = "mdguest";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;


	//드라이버 로딩 처리
	//static 초기화 구문
	static {
		try {
			Class.forName(DRIVER);
			System.out.println(">> JDBC 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("[예외발생] 드라이버 로딩 실패!!!");
		}
	}
	//---------------------------------------------------------------------
	//SELECT : 하나의 데이터 조회(VO) - selectOne : MemberVO
		public ConcertInfoVO selectOne(int concert_num) {
			ConcertInfoVO member = null;
			List<ConcertInfoVO> list = new ArrayList<ConcertInfoVO>();
			
			try {
				//DB연결 - Connection 객체 생성(DB와 연결된)
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				
				//PreparedStatement 객체 생성하고 SQL문 실행
				StringBuilder sql = new StringBuilder();
				sql.append("SELECT CONCERT_DATE,CONCERT_NUM,HALL_NUM,CONCERT_NAME ");
				sql.append("  FROM SCHEDULE_INFO");
				sql.append(" WHERE CONCERT_NUM = ?");
				pstmt = conn.prepareStatement(sql.toString());
				
				pstmt.setInt(1, concert_num);
				rs = pstmt.executeQuery();
				
				//SQL문 실행 결과에 대한 처리
				if (rs.next()) {
					member = new ConcertInfoVO(
							rs.getDate("CONCERT_DATE"),
							rs.getInt("CONCERT_NUM"),
							rs.getInt("HALL_NUM"),
							rs.getString("CONCERT_NAME"));
						
							list.add(member);
							
					System.out.println("콘서트 일자	 " + member.concert_date+"\t"+
									   "콘서트 번호  " + member.concert_num+"\t"+
									   "콘서트 홀 번호  " + member.hall_num+"\t"+
									   "콘서트이름   " + member.concert_name);
								
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				//사용객체 close
				JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
			}
			
			return member;
		}	

		//---------------------------------------------------------------------------------
		//SELECT : 테이블 전체 데이터 조회 - selectAll : List<MemberVO>
		public List<ConcertInfoVO> selectAll() {
			ConcertInfoVO member = null;
			List<ConcertInfoVO> list = new ArrayList<>();
			
			try {
				//DB연결 - Connection 객체 생성(DB와 연결된)
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				
				//PreparedStatement 객체 생성하고 SQL문 실행
				StringBuilder sql = new StringBuilder();
				sql.append("SELECT CONCERT_DATE,CONCERT_NUM,HALL_NUM,CONCERT_NAME ");
				sql.append("  FROM SCHEDULE_INFO");
				sql.append(" ORDER BY CONCERT_NUM");
				pstmt = conn.prepareStatement(sql.toString());
				
				rs = pstmt.executeQuery();
				
				while (rs.next()) {
					member = new ConcertInfoVO(
							rs.getDate("CONCERT_DATE"),
							rs.getInt("CONCERT_NUM"),
							rs.getInt("HALL_NUM"),
							rs.getString("CONCERT_NAME"));
						
							list.add(member);
							
					System.out.println("콘서트 일자	 " + member.getConcert_date()+"\t"+
									   "콘서트 번호  " + member.getConcert_num()+"\t"+
									   "콘서트 홀 번호  " + member.getHall_num()+"\t"+
									   "콘서트이름   " + member.getConcert_name());
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				//사용객체 close
				JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
			}
			
			return list;
		}
		
	//---------------------------------------------------------------
		public void SelectConcert() {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("관람하실 콘서트를 선택해주세요");
			System.out.println("1.윤하  2.내일은 미스트롯  3.악동뮤지션  4.슈퍼밴드 5.싸이연말콘서트");
			int num = Integer.parseInt(scan.nextLine());
			switch(num) {
			case 1:
				selectOne(1);
				break;
			case 2:
				selectOne(2);
				break;
			case 3:
				selectOne(3);
				break;
			case 4:
				selectOne(4);
				break;
			case 5:
				selectOne(5);
				break;
			}
		
		}
			
		
		
		
		
		
	
}	