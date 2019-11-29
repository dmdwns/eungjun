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
	
	//드라이버 로딩 처리
	//static 초기화 구문
	
	//로그인처리를 위한 id, password 체크
	//boolean checkIdPassword(id, password)
	//로그인처리를 위한 id, password 체크
		//boolean checkIdPassword(id, password)
		public boolean checkIdPassword(String id, String password) {
			boolean result = false;

			try {
				//DB연결 - Connection 객체 생성(DB와 연결된)
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				
				//PreparedStatement 객체 생성하고 SQL문 실행
				StringBuilder sql = new StringBuilder();
				sql.append("SELECT ID, NAME, PASSWORD, PHONE, ADDRESS ");
				sql.append("  FROM MEMBER ");
				sql.append(" WHERE ID = ? AND PASSWORD = ?");
				pstmt = conn.prepareStatement(sql.toString());
				
				pstmt.setString(1, id);
				pstmt.setString(2, password);
				
				rs = pstmt.executeQuery();
				
				//SQL문 실행 결과에 대한 처리
				if (rs.next()) {//데이터가 있으면
					System.out.println(">> 데이터 있음");
					result = true;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				//사용객체 close
				JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
			}		
			
			return result;
	}
}