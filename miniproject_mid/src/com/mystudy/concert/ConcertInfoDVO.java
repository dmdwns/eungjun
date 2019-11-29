package com.mystudy.concert;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ConcertInfoDVO {
	
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
	//---------------------------------------------------------------------
	//SELECT : �ϳ��� ������ ��ȸ(VO) - selectOne : MemberVO
		public ConcertInfoVO selectOne(int concert_num) {
			ConcertInfoVO member = null;
			List<ConcertInfoVO> list = new ArrayList<ConcertInfoVO>();
			
			try {
				//DB���� - Connection ��ü ����(DB�� �����)
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				
				//PreparedStatement ��ü �����ϰ� SQL�� ����
				StringBuilder sql = new StringBuilder();
				sql.append("SELECT CONCERT_DATE,CONCERT_NUM,HALL_NUM,CONCERT_NAME ");
				sql.append("  FROM SCHEDULE_INFO");
				sql.append(" WHERE CONCERT_NUM = ?");
				pstmt = conn.prepareStatement(sql.toString());
				
				pstmt.setInt(1, concert_num);
				rs = pstmt.executeQuery();
				
				//SQL�� ���� ����� ���� ó��
				if (rs.next()) {
					member = new ConcertInfoVO(
							rs.getDate("CONCERT_DATE"),
							rs.getInt("CONCERT_NUM"),
							rs.getInt("HALL_NUM"),
							rs.getString("CONCERT_NAME"));
						
							list.add(member);
							
					System.out.println("�ܼ�Ʈ ����	 " + member.concert_date+"\t"+
									   "�ܼ�Ʈ ��ȣ  " + member.concert_num+"\t"+
									   "�ܼ�Ʈ Ȧ ��ȣ  " + member.hall_num+"\t"+
									   "�ܼ�Ʈ�̸�   " + member.concert_name);
								
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				//��밴ü close
				JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
			}
			
			return member;
		}	

		//---------------------------------------------------------------------------------
		//SELECT : ���̺� ��ü ������ ��ȸ - selectAll : List<MemberVO>
		public List<ConcertInfoVO> selectAll() {
			ConcertInfoVO member = null;
			List<ConcertInfoVO> list = new ArrayList<>();
			
			try {
				//DB���� - Connection ��ü ����(DB�� �����)
				conn = DriverManager.getConnection(URL, USER, PASSWORD);
				
				//PreparedStatement ��ü �����ϰ� SQL�� ����
				StringBuilder sql = new StringBuilder();
				sql.append("SELECT CONCERT_DATE,CONCERT_NUM,HALL_NUM,CONCERT_NAME ");
				sql.append("  FROM SCHEDULE_INFO");
				sql.append(" ORDER BY CONCERT_NUM");
				pstmt = conn.prepareStatement(sql.toString());
				
				rs = pstmt.executeQuery();
				
				while (rs.next()) {
					member = new ConcertInfoVO(
							rs.getDate("CONCERT_DATE"),
							rs.getInt("CONCERT_NUM"),
							rs.getInt("HALL_NUM"),
							rs.getString("CONCERT_NAME"));
						
							list.add(member);
							
					System.out.println("�ܼ�Ʈ ����	 " + member.getConcert_date()+"\t"+
									   "�ܼ�Ʈ ��ȣ  " + member.getConcert_num()+"\t"+
									   "�ܼ�Ʈ Ȧ ��ȣ  " + member.getHall_num()+"\t"+
									   "�ܼ�Ʈ�̸�   " + member.getConcert_name());
				}
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				//��밴ü close
				JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
			}
			
			return list;
		}
		
	//---------------------------------------------------------------
		public void SelectConcert() {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("�����Ͻ� �ܼ�Ʈ�� �������ּ���");
			System.out.println("1.����  2.������ �̽�Ʈ��  3.�ǵ�������  4.���۹�� 5.���̿����ܼ�Ʈ");
			int num = Integer.parseInt(scan.nextLine());
			switch(num) {
			case 1:
				selectOne(1);
				break;
			case 2:
				selectOne(2);
				break;
			case 3:
				selectOne(3);
				break;
			case 4:
				selectOne(4);
				break;
			case 5:
				selectOne(5);
				break;
			}
		
		}
			
		
		
		
		
		
	
}	