package com.mystudy.concert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class SEAT_INFO_DAO {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "mdguest";
	private static final String PASSWORD = "mdguest";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//드라이버 로딩 처리
	//static 초기화 구문
	static {
		try {
			Class.forName(DRIVER);
			//System.out.println(">> JDBC 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("[예외발생] 드라이버 로딩 실패!!!");
		}
	}
	
	//SELECT문
	public List<SEAT_INFO_VO> selectAll() {
		List<SEAT_INFO_VO> list = new ArrayList<>();
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT SEAT_NUM, SEAT_GRADE, CONCERT_NUM, SEAT_PRICE, HAVESEAT ");
			sql.append("  FROM SEAT_INFO ");
			//sql.append(" WHERE SEAT_GRADE = ? ");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				SEAT_INFO_VO rvo = new SEAT_INFO_VO(rs.getString("CUSTOMER_ID"), rs.getInt("SEAT_NUM"),
						rs.getString("SEAT_GRADE"),rs.getInt("CONCERT_NUM"),rs.getInt("SEAT_PRICE")
						,rs.getString("HAVESEAT"));
				list.add(rvo);
			}
			
			for (SEAT_INFO_VO svo : list) {
				System.out.println(svo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		}
		return list;
	}

	//INSERT문
	public int insert(SEAT_INFO_VO seat) {
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO SEAT_INFO ");
			sql.append(" VALUES(?, ?, ?, ?, ?, ?) ");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, seat.getCustomer_id());
			pstmt.setInt(2, seat.getSeat_num());
			pstmt.setString(3, seat.getSeat_grade());
			pstmt.setInt(4, seat.getConcert_num());
			pstmt.setInt(5, seat.getSeat_price());
			pstmt.setString(6, seat.getHaveseat());

			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		
		return result;
	}
	
	
}
