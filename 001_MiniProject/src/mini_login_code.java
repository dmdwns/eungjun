import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class mini_login_code {
	static final String DRIVER = "oracle.jdbc.OracleDriver";
	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String USER = "mystudy";
	static final String PASSWORD = "mystudypw";
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	//����̹� �ε� ó��
	//static �ʱ�ȭ ����
	
	//�α���ó���� ���� id, password üũ
	//boolean checkIdPassword(id, password)
	//�α���ó���� ���� id, password üũ
		//boolean checkIdPassword(id, password)
		public boolean checkIdPassword(String id, String password) {
			boolean result = false;

			try {
				//DB���� - Connection ��ü ����(DB�� �����)
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				
				//PreparedStatement ��ü �����ϰ� SQL�� ����
				StringBuilder sql = new StringBuilder();
				sql.append("SELECT ID, NAME, PASSWORD, PHONE, ADDRESS ");
				sql.append("  FROM MEMBER ");
				sql.append(" WHERE ID = ? AND PASSWORD = ?");
				pstmt = conn.prepareStatement(sql.toString());
				
				pstmt.setString(1, id);
				pstmt.setString(2, password);
				
				rs = pstmt.executeQuery();
				
				//SQL�� ���� ����� ���� ó��
				if (rs.next()) {//�����Ͱ� ������
					System.out.println(">> ������ ����");
					result = true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				//��밴ü close
				JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
			}		
			
			return result;
	}
}