package login;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public interface DAO {
	static final String Driver = "oracle.jdbc.OracleDriver";
	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String USER = "MDGUEST";
	static final String PASSWORD = "mdguest";
	
	//JDBC연결 메소드
	public Connection getConnection() throws ClassNotFoundException, Exception;
	//인원현황을 가져오는 메소드
	public ArrayList<Customer> getMembers() throws SQLException, Exception;

}
