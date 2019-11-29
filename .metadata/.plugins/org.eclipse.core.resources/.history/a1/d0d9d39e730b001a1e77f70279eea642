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
	/*---------------------------------------------------*/
	
	public void concertView(int concert_num) {

	 		try {
	 			//DB연결 - Connection 객체 생성(DB와 연결된)
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				
				//PreparedStatement 객체 생성하고 SQL문 실행
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
				//사용객체 close
				JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
			}
			
		}	

	}

			
	

