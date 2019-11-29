package com.mystudy.ojdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Insert {

	public static void main(String[] args) {
		//JDBC�� �̿��� DB ���α׷��� ���� ---------------------
		//0. JDBC ���̺귯�� ����ȯ�� ����(�����ο� ���)
		//1. JDBC ����̹� �ε�
		//2. DB����  - Connection ��ü ���� <-DriverManager
		//3. Statement�� ����(SQL�� ����)
		//4. SQL ���� ����� ���� ó��
		//   -SELECT : ��ȸ(�˻�) ����Ÿ ��� ���� ���� ó��
		//   -INSERT, UPDATE, DELETE : int��(�Ǽ�) ó��
		//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�
		//=====================================

		//0. JDBC ���̺귯�� ����ȯ�� ����(�����ο� ���)
		//1. JDBC ����̹� �ε�
		try {
			//Class.forName("oracle.jdbc.driver.OracleDriver");
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("[����] ����̹� �ε� ����!!!");
			e.printStackTrace();
		}

		//2. DB����  - Connection ��ü ���� <-DriverManager
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
		} catch (SQLException e) {
			System.out.println("[����] DB���� ����!!!");
			e.printStackTrace();
		}
		
		//3. Statement�� ����(SQL�� ����)
		Statement stmt = null;
		try {
			//3-1. Connection ��ü�� ���� Statement ��ü ����
			stmt = conn.createStatement();
			
			//3-2. Statement ��ü ��� SQL�� ����
			String sql = "";
			sql += "INSERT INTO STUDENT ";
			sql += "       (ID, NAME, KOR, ENG, MATH, TOT, AVG) ";
			sql += "VALUES ('2019005', '������', 100, 90, 80, 0, 0) ";
			System.out.println("sql : " + sql);
			
			//SELECT �� : executeQuery()
			//INSERT, UPDATE, DELETE : executeUpdate()
			int result = stmt.executeUpdate(sql);
			
			//4. SQL ���� ����� ���� ó��
			System.out.println("ó���Ǽ� : " + result);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//5. Ŭ��¡ ó���� ���� �ڿ� �ݳ�(��ü ���� ������ �������� ����)
		try {
			if (stmt != null) stmt.close();
			System.out.println(">> Statement close ����");
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
