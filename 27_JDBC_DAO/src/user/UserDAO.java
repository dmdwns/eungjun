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
		return -1; // ȸ������ ����
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
	
	//�α���ó���� ���� id, password üũ
		//boolean checkIdPassword(id, password)
		public boolean checkIdPassword(String CUSTOMER_ID, String CUSTOMER_PW) {
			boolean result = false;

			try {
				//DB���� - Connection ��ü ����(DB�� �����)
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				
				//PreparedStatement ��ü �����ϰ� SQL�� ����
				StringBuilder sql = new StringBuilder();
				sql.append("SELECT CUSTOMER_ID, CUSTOMER_PW, CUSTOMER_NAME, CUSTOMER_TEL ");
				sql.append("  FROM CUSTOMER ");
				sql.append(" WHERE CUSTOMER_ID = ? AND CUSTOMER_PW = ?");
				pstmt = conn.prepareStatement(sql.toString());
				
				pstmt.setString(1, CUSTOMER_ID);
				pstmt.setString(2, CUSTOMER_PW);
				
				ts = pstmt.executeQuery();
				
				//SQL�� ���� ����� ���� ó��
				if (ts.next()) {//�����Ͱ� ������
					System.out.println(">> ������ ����");
					result = true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				//��밴ü close
				JDBC_Close.closeConnStmtRs(conn, pstmt, ts);
			}		
			
			return result;
		}

		public List<UserDTO> selectAll() {
			// TODO Auto-generated method stub
			return null;
		}

	
}






















