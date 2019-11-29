package Customer_Join;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerLogDAO {

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
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// �α���ó���� ���� id, password üũ
	// boolean checkIdPassword(id, password)
	public boolean checkIdPassword(CustomerLogVO lvo) {
		boolean result = false;
		String inputId = "";
		String inputPw = "";

		if (lvo.getId() != null && lvo.getPassword() != null) {
			try {
				conn = DriverManager.getConnection(URL, USER, PASSWORD);

				StringBuffer sql = new StringBuffer();
				sql.append("SELECT CUSTOMER_ID, CUSTOMER_PW ");
				sql.append("  FROM CUSTOMER ");
				sql.append(" WHERE CUSTOMER_ID = ? ");

				pstmt = conn.prepareStatement(sql.toString());
				String str = lvo.getId();
				pstmt.setString(1, str);

				rs = pstmt.executeQuery();

				if (rs.next()) {
					inputId = rs.getString(1);
					inputPw = rs.getString(2);

					if (checkIdPassword2(inputPw, lvo.getPassword())) {
						result = true;
						System.out.println("[�α��� �ϼ̽��ϴ�]");
					} else {
						System.out.println("[��й�ȣ�� Ʋ�Ƚ��ϴ�.]");
					}

				} else {
					System.out.println("[���̵� �����ϴ�.]");
				}

			} catch (SQLException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
			} finally {
				closeCnPsRs(conn, pstmt, rs);
			}
		} else {
			System.out.println("[�߸� �Է��ϼ̽��ϴ�.]");
		}

		return result;
	}

	private boolean checkIdPassword2(String inputPw, String inputPw1) {

		boolean result1 = false;
		if (inputPw.equals(inputPw1)) {
			result1 = true;
		}
		return result1;
	}

	private void closeCnPsRs(Connection conn, PreparedStatement pstmt, ResultSet rs) {

		try {
			if (rs != null)
				rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private void closeCnPsRs(Connection conn, PreparedStatement pstmt) {

		try {
			if (pstmt != null)
				pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
