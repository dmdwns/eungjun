package com.mystudy.ojdbc3_prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentManager_Update {

	public static void main(String[] args) {
		//(�ǽ�) 	PreparedStatement ����ؼ� �����۾�
		// ������� : ID - '2019001' ������ ����
		// �̸�:ȫ�浿, ����:100, ����:90, ����: 81
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
			sql += "UPDATE STUDENT ";
			sql += "   SET NAME = ? ";
			sql += "     , KOR = ? ";
			sql += "     , ENG = ? ";
			sql += "     , MATH = ? ";
			sql += " WHERE ID = ? ";
			pstmt = conn.prepareStatement(sql);
			
			//3-2. ?(���ε庯��) ��ġ�� �� ����
			// �̸�:ȫ�浿, ����:100, ����:90, ����: 81
			String id = "2019001";
			String name = "ȫ�浿";
			int kor = 100;
			int eng = 90;
			int math = 81;
			
			int idx = 1;
			pstmt.setString(idx++, name); //1
			pstmt.setInt(idx++, kor); //2
			pstmt.setInt(idx++, eng); //3
			pstmt.setInt(idx++, math); //4
			pstmt.setString(idx++, id); //5
			
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
