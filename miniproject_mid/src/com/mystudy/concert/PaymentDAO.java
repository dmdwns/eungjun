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
	String customer_id = "밀가루";
	String grade = "VIP" ;
	//	------------------------------------------------------------------------------------------
	static {
		try {
			Class.forName(DRIVER);
			System.out.println(">> JDBC 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("[예외발생] 드라이버 로딩 실패!!!");
		}
	}
	//	-----------------------------------------------------------------------결제정보 테이블 전체 조회
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
	//	-----------------------------------------------------------------------회원id로 조회
	public void selectOne(String customer_id) {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			String sql = "";
			sql += "SELECT PAYMENT_UID, CUSTOMER_ID, PAYMENT_CREDIT, TOTAL_PRICE, PAYMENT_DATE, RESERVATION_NUM ";
			sql += "  FROM PAYMENT ";
			sql += " WHERE customer_id = ? ";
			pstmt = conn.prepareStatement(sql);

			// ? (바인드 변수)에 값 설정
			pstmt.setString(1, customer_id);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				String str = "";
				str += "결제번호: "+rs.getInt(1) + "\n";
				str += "회원ID: "+rs.getString(2) + "\n";
				str += "결제정보: "+rs.getString(3) + "\n";
				str += "결제금액: "+rs.getInt(4) + "\n";
				str += "결제일자: "+rs.getDate(5) + "\n";
				str += "예약번호: "+rs.getInt(6);

				System.out.println(str);
			} else {
				System.out.println(customer_id + " - 데이터 없음");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
	}
	//	---------------------------------------------------------------------회원id로 입력
	public void insertOne(String customer_id) {
		//	private void insertOne(PaymentVO payment) {	
		int result = 0 ;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			//SQL문장을 작성해서 Statement에 전달하고 SQL문 실행 요청
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO PAYMENT");
			sql.append("	(PAYMENT_UID, CUSTOMER_ID, PAYMENT_CREDIT, TOTAL_PRICE, PAYMENT_DATE, RESERVATION_NUM) ");
			sql.append("VALUES (PAYMENT_UID.NEXTVAL,?, ?, ?, SYSDATE, RESERVATION_NUM.NEXTVAL) ");
			pstmt = conn.prepareStatement(sql.toString());

			// ? (바인딩변수)에 값 매칭 customer_id
			pstmt.setString(1, customer_id); // 회원가입 시 cumtomer_uid객체 받아오기
			if (select == 1) {
				pstmt.setString(2, "현금");
			} else {
				pstmt.setString(2, "카드");
			}
			if (grade.equalsIgnoreCase("VIP")) {
				pstmt.setInt(3, 150000); // 좌석선택 시 seat_price 객체 받아오기
			} else if (grade.equalsIgnoreCase("SR")) {
				pstmt.setInt(3, 130000); 
			} else if (grade.equalsIgnoreCase("R")) {
				pstmt.setInt(3, 100000);
			} else if (grade.equalsIgnoreCase("S")) {
				pstmt.setInt(3, 90000);
			}  
			
			//SQL 실행 요청 - INSERT, UPDATE, DELETE : executeUpdate()
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
	}
	//	---------------------------------------------------------------------회원id로 삭제
	public void deleteOne(String customer_id) {
		int result = 0;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			String sql = "";
			sql = "DELETE FROM PAYMENT WHERE CUSTOMER_ID = ? ";
			pstmt = conn.prepareStatement(sql);

			// ?(바인드변수) 위치에 값 설정
			pstmt.setString(1, customer_id);

			result = pstmt.executeUpdate(); //SQL문 실행
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
	}
//	---------------------------------------------------------------------회원id로 티켓정보입력(join)
	public void insertTicket(int concert_num, String customer_id, String grade) {
		int result = 0 ;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			//SQL문장을 작성해서 Statement에 전달하고 SQL문 실행 요청
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
			
			//SQL 실행 요청 - INSERT, UPDATE, DELETE : executeUpdate()
			result = pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
	}		
//	---------------------------------------------------------------------회원id로 티켓정보불러오기(join)
	public void selectTicketInfo(String customer_id) {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			String sql = "";
			sql += "SELECT TICKET_NUM , HALL_NUM , SEAT_NUM , SEAT_PRICE , CONCERT_NAME ";
			sql += "  FROM TICKET ";
			sql += " WHERE customer_id = ?";
			pstmt = conn.prepareStatement(sql);
			
			// ? (바인드 변수)에 값 설정
			pstmt.setString(1, customer_id);

			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				String str = "";
				str += "티켓번호: "+rs.getInt(1) + "\n";
				str += "공연장번호: "+rs.getInt(2) + "\n";
				str += "좌석번호: "+rs.getInt(3) + "\n";
				str += "좌석가격: "+rs.getInt(4) + "\n";
				str += "콘서트제목: "+rs.getString(5) ;
				
				System.out.println(str);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
	}
	
	//	-----------------------------------------------------------------------결제메세지1
	//	static Scanner scan = new Scanner(System.in);
	public void startPayment() {
		while(true){
			while (true) {
				if (!startPayment2(concert_num, customer_id, grade)) {
					break;
				}
				System.out.println();
			}//while문 안쪽
			System.out.println("---------------------------");

			System.out.println(" [1.결제취소]   [2.나가기] ");
			delete=Integer.parseInt(scan.nextLine());
			if (delete == 1) {
				deleteOne(customer_id);
				System.out.println("결제가 취소되었습니다. 다시 진행하시겠습니까?(y/n) ");
				tryYesNo = scan.nextLine();
				if("n".equalsIgnoreCase(tryYesNo)) {
					System.out.println(" *** 즐거운 시간 되세요 :-) *** ");
					break;
				} else continue;
			}
			if (delete == 2) {
				scan.close();
				System.out.println(" *** 즐거운 시간 되세요 :-) *** ");
			} break;
		}//while문 바깥
	}
	//	-----------------------------------------------------------------------결제메세지2
	private boolean startPayment2(int concert_num, String customer_id, String grade) {

		boolean isContinue = true;

		//메뉴 출력
		System.out.println(" [결제 하시겠습니까?] ");
		System.out.println("1)현금결제   2)카드결제  3)종료 : ");

		//작업선택
		try {
			select = Integer.parseInt(scan.nextLine());			
		} catch (NumberFormatException e) {
			System.out.println("[예외발생] 잘못된 값이 입력되었습니다.\n 메뉴(1,2) 숫자만 입력하세요");
		}
		if (select == 1) {
			System.out.println("---------------------------");
			System.out.println("1)현금결제가 완료되었습니다 ");
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
			System.out.println("2)카드결제가 완료되었습니다 ");
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
