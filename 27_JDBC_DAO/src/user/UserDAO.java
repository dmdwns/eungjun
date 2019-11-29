package user;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mystudy.jdbc_dao.JDBC_Close;


public class UserDAO {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "MDGUEST";
	private static final String PASSWORD = "mdguest";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet ts;
	
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
		}
	}
	
	public int join(UserDTO user) {

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO CUSTOMER ");
			sql.append("	(CUSTOMER_ID, CUSTOMER_PW, CUSTOMER_NAME, CUSTOMER_TEL) ");
			sql.append("VALUES (?, ?, ?, ?) ");
			pstmt = conn.prepareStatement(sql.toString());

			int idx = 1;
			pstmt.setString(idx++, user.getCUSTOMER_ID());
			pstmt.setString(idx++, user.getCUSTOMER_PW());
			pstmt.setString(idx++, user.getCUSTOMER_NAME());
			pstmt.setString(idx++, user.getCUSTOMER_TEL());

			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			action.JDBC_Close.closeConnStmt(conn, pstmt);
		}
		return -1; // 회원가입 실패
	}
	
	public int delete(UserDTO user) {
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM USERS ");
			sql.append("	WHERE USER_ID = ? AND PASSWORD = ?");
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, user.getCUSTOMER_ID());
			pstmt.setString(2, user.getCUSTOMER_PW());
			
			return pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			action.JDBC_Close.closeConnStmt(conn, pstmt);
		
	}
		return -1;
	}
	
	//로그인처리를 위한 id, password 체크
		//boolean checkIdPassword(id, password)
		public boolean checkIdPassword(String CUSTOMER_ID, String CUSTOMER_PW) {
			boolean result = false;

			try {
				//DB연결 - Connection 객체 생성(DB와 연결된)
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				
				//PreparedStatement 객체 생성하고 SQL문 실행
				StringBuilder sql = new StringBuilder();
				sql.append("SELECT CUSTOMER_ID, CUSTOMER_PW, CUSTOMER_NAME, CUSTOMER_TEL ");
				sql.append("  FROM CUSTOMER ");
				sql.append(" WHERE CUSTOMER_ID = ? AND CUSTOMER_PW = ?");
				pstmt = conn.prepareStatement(sql.toString());
				
				pstmt.setString(1, CUSTOMER_ID);
				pstmt.setString(2, CUSTOMER_PW);
				
				ts = pstmt.executeQuery();
				
				//SQL문 실행 결과에 대한 처리
				if (ts.next()) {//데이터가 있으면
					System.out.println(">> 데이터 있음");
					result = true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				//사용객체 close
				JDBC_Close.closeConnStmtRs(conn, pstmt, ts);
			}		
			
			return result;
		}

		public List<UserDTO> selectAll() {
			// TODO Auto-generated method stub
			return null;
		}

	
}






















