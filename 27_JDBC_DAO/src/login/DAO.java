package login;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public interface DAO {
	static final String Driver = "oracle.jdbc.OracleDriver";
	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String USER = "MDGUEST";
	static final String PASSWORD = "mdguest";
	
	//JDBC���� �޼ҵ�
	public Connection getConnection() throws ClassNotFoundException, Exception;
	//�ο���Ȳ�� �������� �޼ҵ�
	public ArrayList<Customer> getMembers() throws SQLException, Exception;

}
