package com.mystudy.concert;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class PaymentDAO {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	//	private static final String URL = "jdbc:oracle:thin:@192.168.0.52:1521:xe";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "mdguest";
	private static final String PASSWORD = "mdguest";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;

	Scanner scan = new Scanner(System.in);
	
	int concert_num=1;
	int select = 0;
	int delete = 0;
	String tryYesNo;
	String customer_id = "�а���";
	String grade = "VIP" ;
	//	------------------------------------------------------------------------------------------
	static {
		try {
			Class.forName(DRIVER);
			System.out.println(">> JDBC ����̹� �ε� ����");
		} catch (ClassNotFoundException e) {
			System.out.println("[���ܹ߻�] ����̹� �ε� ����!!!");
		}
	}
	//	-----------------------------------------------------------------------�������� ���̺� ��ü ��ȸ
	/*
	public List<PaymentVO> selectAll(){
		List<PaymentVO> list = new ArrayList<>();

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT PAYMENT_UID, customer_id, PAYMENT_CREDIT, TOTAL_PRICE, PAYMENT_DATE, RESERVATION_NUM ");
			sql.append("  FROM PAYMENT ");
			sql.append(" ORDER BY PAYMENT_UID");
			pstmt = conn.prepareStatement(sql.toString());

			rs = pstmt.executeQuery();

			while (rs.next()) {
				list.add(new PaymentVO(rs.getInt("PAYMENT_UID"),
						rs.getString("customer_id"),
						rs.getString("PAYMENT_CREDIT"),
						rs.getInt("TOTAL_PRICE"),
						rs.getDate("PAYMENT_DATE"),
						rs.getInt("RESERVATION_NUM") )) ;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Payment_Close.closeConnStmtRs(conn, pstmt, rs);
		}

		return list;
	}
		*/
	//	-----------------------------------------------------------------------ȸ��id�� ��ȸ
	public void selectOne(String customer_id) {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			String sql = "";
			sql += "SELECT PAYMENT_UID, CUSTOMER_ID, PAYMENT_CREDIT, TOTAL_PRICE, PAYMENT_DATE, RESERVATION_NUM ";
			sql += "  FROM PAYMENT ";
			sql += " WHERE customer_id = ? ";
			pstmt = conn.prepareStatement(sql);

			// ? (���ε� ����)�� �� ����
			pstmt.setString(1, customer_id);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				String str = "";
				str += "������ȣ: "+rs.getInt(1) + "\n";
				str += "ȸ��ID: "+rs.getString(2) + "\n";
				str += "��������: "+rs.getString(3) + "\n";
				str += "�����ݾ�: "+rs.getInt(4) + "\n";
				str += "��������: "+rs.getDate(5) + "\n";
				str += "�����ȣ: "+rs.getInt(6);

				System.out.println(str);
			} else {
				System.out.println(customer_id + " - ������ ����");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
	}
	//	---------------------------------------------------------------------ȸ��id�� �Է�
	public void insertOne(String customer_id) {
		//	private void insertOne(PaymentVO payment) {	
		int result = 0 ;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			//SQL������ �ۼ��ؼ� Statement�� �����ϰ� SQL�� ���� ��û
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO PAYMENT");
			sql.append("	(PAYMENT_UID, CUSTOMER_ID, PAYMENT_CREDIT, TOTAL_PRICE, PAYMENT_DATE, RESERVATION_NUM) ");
			sql.append("VALUES (PAYMENT_UID.NEXTVAL,?, ?, ?, SYSDATE, RESERVATION_NUM.NEXTVAL) ");
			pstmt = conn.prepareStatement(sql.toString());

			// ? (���ε�����)�� �� ��Ī customer_id
			pstmt.setString(1, customer_id); // ȸ������ �� cumtomer_uid��ü �޾ƿ���
			if (select == 1) {
				pstmt.setString(2, "����");
			} else {
				pstmt.setString(2, "ī��");
			}
			if (grade.equalsIgnoreCase("VIP")) {
				pstmt.setInt(3, 150000); // �¼����� �� seat_price ��ü �޾ƿ���
			} else if (grade.equalsIgnoreCase("SR")) {
				pstmt.setInt(3, 130000); 
			} else if (grade.equalsIgnoreCase("R")) {
				pstmt.setInt(3, 100000);
			} else if (grade.equalsIgnoreCase("S")) {
				pstmt.setInt(3, 90000);
			}  
			
			//SQL ���� ��û - INSERT, UPDATE, DELETE : executeUpdate()
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
	}
	//	---------------------------------------------------------------------ȸ��id�� ����
	public void deleteOne(String customer_id) {
		int result = 0;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql = "DELETE FROM PAYMENT WHERE CUSTOMER_ID = ? ";
			pstmt = conn.prepareStatement(sql);

			// ?(���ε庯��) ��ġ�� �� ����
			pstmt.setString(1, customer_id);

			result = pstmt.executeUpdate(); //SQL�� ����
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
	}
//	---------------------------------------------------------------------ȸ��id�� Ƽ�������Է�(join)
	public void insertTicket(int concert_num, String customer_id, String grade) {
		int result = 0 ;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			//SQL������ �ۼ��ؼ� Statement�� �����ϰ� SQL�� ���� ��û
			StringBuilder sql = new StringBuilder();
			sql.append(" INSERT INTO TICKET ");
			sql.append("	(TICKET_NUM, PAYMENT_UID, CONCERT_DATE, CONCERT_NAME, CONCERT_NUM, HALL_NUM, SEAT_NUM, SEAT_PRICE, CUSTOMER_ID, RESERVATION_NUM) ");
			sql.append(" VALUES (TICKET_NUM.NEXTVAL, ");
		    sql.append(" (SELECT P.PAYMENT_UID FROM PAYMENT P, CUSTOMER C WHERE  P.CUSTOMER_ID = C.CUSTOMER_ID) , ");
		    sql.append(" (SELECT CONCERT_DATE FROM SCHEDULE_INFO  WHERE CONCERT_NUM = "+ concert_num +") , ");
		    sql.append(" (SELECT CONCERT_NAME FROM SCHEDULE_INFO  WHERE CONCERT_NUM = "+ concert_num +") , ");
		    sql.append(concert_num + " ," );
		    sql.append(" (SELECT HALL_NUM FROM SCHEDULE_INFO WHERE  CONCERT_NUM = "+ concert_num +" ) , ");
		    sql.append(" (SELECT SEAT_NUM FROM SEAT_INFO WHERE CONCERT_NUM = "+ concert_num +" ) , ");
		    sql.append(" (SELECT SEAT_PRICE FROM SEAT_INFO WHERE CONCERT_NUM = "+ concert_num +" ) , ");
		    sql.append("'"+ customer_id + "' ," );
		    sql.append("(SELECT RESERVATION_NUM FROM PAYMENT WHERE CUSTOMER_ID = '" +customer_id+"') )");
			
		    pstmt = conn.prepareStatement(sql.toString());
			
			//SQL ���� ��û - INSERT, UPDATE, DELETE : executeUpdate()
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
	}		
//	---------------------------------------------------------------------ȸ��id�� Ƽ�������ҷ�����(join)
	public void selectTicketInfo(String customer_id) {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			String sql = "";
			sql += "SELECT TICKET_NUM , HALL_NUM , SEAT_NUM , SEAT_PRICE , CONCERT_NAME ";
			sql += "  FROM TICKET ";
			sql += " WHERE customer_id = ?";
			pstmt = conn.prepareStatement(sql);
			
			// ? (���ε� ����)�� �� ����
			pstmt.setString(1, customer_id);

			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String str = "";
				str += "Ƽ�Ϲ�ȣ: "+rs.getInt(1) + "\n";
				str += "�������ȣ: "+rs.getInt(2) + "\n";
				str += "�¼���ȣ: "+rs.getInt(3) + "\n";
				str += "�¼�����: "+rs.getInt(4) + "\n";
				str += "�ܼ�Ʈ����: "+rs.getString(5) ;
				
				System.out.println(str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
	}
	
	//	-----------------------------------------------------------------------�����޼���1
	//	static Scanner scan = new Scanner(System.in);
	public void startPayment() {
		while(true){
			while (true) {
				if (!startPayment2(concert_num, customer_id, grade)) {
					break;
				}
				System.out.println();
			}//while�� ����
			System.out.println("---------------------------");

			System.out.println(" [1.�������]   [2.������] ");
			delete=Integer.parseInt(scan.nextLine());
			if (delete == 1) {
				deleteOne(customer_id);
				System.out.println("������ ��ҵǾ����ϴ�. �ٽ� �����Ͻðڽ��ϱ�?(y/n) ");
				tryYesNo = scan.nextLine();
				if("n".equalsIgnoreCase(tryYesNo)) {
					System.out.println(" *** ��ſ� �ð� �Ǽ��� :-) *** ");
					break;
				} else continue;
			}
			if (delete == 2) {
				scan.close();
				System.out.println(" *** ��ſ� �ð� �Ǽ��� :-) *** ");
			} break;
		}//while�� �ٱ�
	}
	//	-----------------------------------------------------------------------�����޼���2
	private boolean startPayment2(int concert_num, String customer_id, String grade) {

		boolean isContinue = true;

		//�޴� ���
		System.out.println(" [���� �Ͻðڽ��ϱ�?] ");
		System.out.println("1)���ݰ���   2)ī�����  3)���� : ");

		//�۾�����
		try {
			select = Integer.parseInt(scan.nextLine());			
		} catch (NumberFormatException e) {
			System.out.println("[���ܹ߻�] �߸��� ���� �ԷµǾ����ϴ�.\n �޴�(1,2) ���ڸ� �Է��ϼ���");
		}
		if (select == 1) {
			System.out.println("---------------------------");
			System.out.println("1)���ݰ����� �Ϸ�Ǿ����ϴ� ");
			System.out.println("---------------------------");
			insertOne(customer_id);
			selectOne(customer_id);
			System.out.println("---------------------------");
			insertTicket(concert_num, customer_id, grade);
			selectTicketInfo(customer_id);
			isContinue = false;
		}
		if (select == 2) {
			System.out.println("---------------------------");
			System.out.println("2)ī������� �Ϸ�Ǿ����ϴ� ");
			System.out.println("---------------------------");
			insertOne(customer_id);
			selectOne(customer_id);
			System.out.println("---------------------------");
			insertTicket(concert_num, customer_id, grade);
			selectTicketInfo(customer_id);
			isContinue = false;
		}
		if (select == 3) {
			isContinue = false;
		}
		return isContinue;
	}
	//	------------------------------------------------------------------------------





}
