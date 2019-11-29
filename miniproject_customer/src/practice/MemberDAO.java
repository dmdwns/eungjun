package practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Customer_Join.CustomerVO;
import Customer_Join.JDBC_Close;

public class MemberDAO {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "mdguest";
	private static final String PASSWORD = "mdguest";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	static {
		try {
			Class.forName(DRIVER);
			System.out.println("성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("실패");
		}
	}

	public int join(Member Practice) {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO CUSTOMER ");
			sql.append("	(CUSTOMER_ID, CUSTOMER_PW, CUSTOMER_NAME, CUSTOMER_TEL) ");
			sql.append("VALUES (?, ?, ?, ?) ");
			pstmt = conn.prepareStatement(sql.toString());

			int idx = 1;
			pstmt.setString(idx++, Practice.getId());
			pstmt.setString(idx++, Practice.getPw());
			pstmt.setString(idx++, Practice.getName());
			pstmt.setString(idx++, Practice.getTel());

			return pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		return -1;
	}

	// 회원정보 삭제 메소드
	public int delete(Member Practice) {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM CUSTOMER ");
			sql.append("	WHERE CUSTOMER_ID = ? AND CUSTOMER_PW = ?");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, Practice.getId());
			pstmt.setString(2, Practice.getPw());

			return pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		return -1;
	}

}
