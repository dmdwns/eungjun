package com.mystudy.ojdbc3_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentManager_Delete {

	public static void main(String[] args) {
		//(�ǽ�) PreparedStatement ����ؼ� ������ ����
		// ������� : ID - '2019001' ������ ã�Ƽ� ����
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			//1. JDBC ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			
			//2. DB����  - Connection ��ü ���� <-DriverManager
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			
			//3. Statement�� ����(SQL�� ����)
			//3-1. Connection ��ü�� ���� PreparedStatement ��ü ����
			String sql = "";
			sql += "DELETE FROM STUDENT WHERE ID = ?";
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(���ε庯��) ��ġ�� �� ����
			// ������� : ID - '2019001' ������ ã�Ƽ� ����
			String id = "2019111";
			pstmt.setString(1, id);
			
			//3-3. SQL�� ����
			int result = pstmt.executeUpdate();
			
			//4. SQL ���� ����� ���� ó��
			//   -SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
			//   -INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
			System.out.println(">> ó���Ǽ� : " + result);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�(��ü ���� ������ �������� ����)
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

}