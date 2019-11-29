package admin1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import admin.JDBC_Close;

public class HallDAO {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "MDGUEST";
	private static final String PASSWORD = "mdguest";
	
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	//����̹� �ε� ó��
	//static �ʱ�ȭ ����
	static {
		try {
			Class.forName(DRIVER);
			System.out.println(">> JDBC ����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("[���ܹ߻�] ����̹� �ε� ����!!!");
		}
	}
	/*---------------------------------------------------*/
	
	public void concertView(int concert_num) {

	 		try {
	 			//DB���� - Connection ��ü ����(DB�� �����)
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				
				//PreparedStatement ��ü �����ϰ� SQL�� ����
				StringBuilder sql = new StringBuilder();
//				sql.append(" INSERT INTO TICKET	");
				sql.append("SELECT CONCERT_NUM , HALL_LOCATION , SEAT_SUM ");
				sql.append(" FROM HALL_INFO ");
				sql.append(" WHERE CONCERT_NUM =? ");
				
				pstmt = conn.prepareStatement(sql.toString());
				
				pstmt.setInt(1, concert_num);
				rs = pstmt.executeQuery();
				String str = " ";
				while(rs.next()) {
				str += rs.getInt(1)+"\t";
				str += rs.getString(2)+"\t";
				str += rs.getString(3);
				
				System.out.println(str);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				//��밴ü close
				JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
			}
			
		}	

	}

			
	

