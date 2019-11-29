package action;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_Close {
	public static void closeConnStmtRs(Connection conn,
			PreparedStatement pstmt, ResultSet rs) {
		//5. 클로징 처리에 의한 자원 반납(객체 생성 순서와 역순으로 진행)
		try {
			if (rs != null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
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
	public static void closeConnStmt(Connection conn,
			PreparedStatement pstmt) {
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





