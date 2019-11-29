package com.mystudy.concert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//ȸ������
public class ConcertAll {
	private static final String DRIVER = "oracle.jdbc.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "mdguest";
	private static final String PASSWORD = "mdguest";

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	Scanner scan = new Scanner(System.in);
	private String pw;

	int seat_price;
	Integer num;
	String have_seat;
	int concert_num ; //�ӽ÷� ����
	
	int select = 0;
	int delete = 0;
	String tryYesNo;
	String customer_id;
	String grade;

	
	//	---------------------------------------------------------------------------------------����̹� �ε�
	static {
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
		}

	}
	//	---------------------------------------------------------------------------------------join����
	public void joinStart() {

        CustomerVO vo = null;
        ConcertAll dao = new ConcertAll();
        int result = 0;
        int select = 0;

        String customer_id = null;
        String password;
        String name;
        String tel;

        // ���̵�, ��й�ȣ, �̸� ����
        String idpwForm = "^[a-zA-Z0-9]{3,8}$"; // �ƾƵ� ��й�ȣ ���� : 3~8�ڸ�, �����ҹ���, �빮��, ���� ����
        String nameForm = "^[��-�R]{1,12}$"; // �̸� ���� : �ѱ۸� ����, 1~12�ڸ�
        String telForm = "^010-\\d{4}-\\d{4}$";// ��ȭ��ȣ �Է� ����

        while (true) {
                System.out.println("===================== ȸ������ ������ =====================");
                System.out.println(" [1.ȸ������    2.ȸ�� ���� ����    3.ȸ�� Ż��    4.�α���  ]");
                System.out.println("======================================================");
                System.out.println("[�޴� ����]");
                select = Integer.parseInt(scan.nextLine());

                switch (select) {
                case 1:
                        while (true) {
                                System.out.print("���̵� : ");
                                customer_id = scan.nextLine();
                                if (customer_id.matches(idpwForm)) {
                                        if (dao.checkId(customer_id)) {
                                                System.out.println("�����ϴ� ���̵� �Դϴ�.");
                                        } else {
                                                break;
                                        }
                                } else {
                                        System.out.println("�ٸ� ���̵� �Է��ϼ���.");
                                }
                        }

                        while (true) {
                                System.out.print("��й�ȣ :");
                                password = scan.nextLine();
                                if (password.matches(idpwForm)) {
                                        break;
                                } else {
                                        System.out.println("���ǿ� ���� �ʽ��ϴ� �ٽ� �Է��ϼ���");
                                }
                        }

                        while (true) {
                                System.out.print("�̸� : ");
                                name = scan.nextLine();
                                if (name.matches(nameForm)) {
                                        break;
                                } else {
                                        System.out.println("�̸��� Ȯ���ϼ���");
                                }
                        }

                        while (true) {
                                System.out.print("�ڵ��� ��ȣ : ");
                                tel = scan.nextLine();
                                if (tel.matches(telForm)) {
                                        if (dao.checkTel(tel)) {
                                                System.out.println("�����ϴ� �ڵ�����ȣ �Դϴ�.");
                                        } else {
                                                break;
                                        }
                                } else {
                                        System.out.println("�ٽ� �Է� �ϼ���.");
                                }
                        }
                        vo = new CustomerVO(customer_id, password, name, tel);
                        dao.join(vo);
                        break;

                case 2:
                        while (true) {
                                System.out.print("���̵� : ");
                                customer_id = scan.nextLine();
                                System.out.print("��й�ȣ :");
                                password = scan.nextLine();
                                if (!dao.checkIdPassword(customer_id, password)) {
                                        System.out.println("���Գ����� �����ϴ�.");
                                } else {
                                        break;
                                }
                        }

                        while (true) {

                                System.out.println("================== ȸ�� ���� ���� =====================");
                                System.out.println("[1.��й�ȣ ����    2.�̸� ����    3.��ȭ��ȣ ����    4.����ȭ������]");
                                System.out.println("==================================================");
                                select = Integer.parseInt(scan.nextLine());

                                if (select == 1) {
                                        while (true) {
                                                System.out.print("������ ��й�ȣ : ");
                                                password = scan.nextLine();
                                                if (password.matches(idpwForm)) {
                                                        dao.updatePassword(password, customer_id);
                                                        System.out.println(password + "�� �ٲ�����ϴ�");
                                                        break;
                                                } else {
                                                        System.out.println("��й�ȣ Ȯ��");
                                                }
                                        }
                                }
                                if (select == 2) {
                                        while (true) {
                                                System.out.print("������ �̸� : ");
                                                name = scan.nextLine();
                                                if (name.matches(nameForm)) {
                                                        dao.updateName(name, customer_id);
                                                        System.out.println(name + "���� �ٲ�����ϴ�.");
                                                        break;
                                                } else {
                                                        System.out.println("�̸�Ȯ��");
                                                }
                                        }
                                }
                                if (select == 3) {
                                        while (true) {
                                                System.out.print("������ ��ȭ��ȣ : ");
                                                tel = scan.nextLine();
                                                if (tel.matches(telForm)) {
                                                        dao.updatetel(tel, customer_id);
                                                        System.out.println(tel + "���� ����Ǿ����ϴ�.");
                                                        break;
                                                } else {
                                                        System.out.println("��ȭ��ȣȮ��");
                                                }
                                        }
                                }
                                if (select == 4) {
                                        System.out.println("ó��ȭ��");
                                        break;
                                }
                        }
                        break;

                case 3:
                        while (true) {
                                System.out.print("���̵� : ");
                                customer_id = scan.nextLine();
                                System.out.print("��й�ȣ :");
                                password = scan.nextLine();
                                if (!dao.checkIdPassword(customer_id, password)) {
                                        System.out.println("���� ȸ���Դϴ�");
                                } else {
                                        vo = new CustomerVO(customer_id, password);
                                        dao.delete(vo);
                                        System.out.println("Ż�� �Ǿ����ϴ�.");
                                        break;
                                }
                        }
                        break;

                case 4:
                        inputIdPw();// �α��� �޼ҵ�
                        return;
                } // switch ���� ��
        }
}
	//	--------------------------------------------------------------------------------------------
	public int join(CustomerVO Customer_Join) {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO CUSTOMER ");
			sql.append("	(CUSTOMER_ID, CUSTOMER_PW, CUSTOMER_NAME, CUSTOMER_TEL) ");
			sql.append("VALUES (?, ?, ?, ?) ");
			pstmt = conn.prepareStatement(sql.toString());

			int idx = 1;
			pstmt.setString(idx++, Customer_Join.getId());
			pstmt.setString(idx++, Customer_Join.getPassword());
			pstmt.setString(idx++, Customer_Join.getName());
			pstmt.setString(idx++, Customer_Join.getTel());

			return pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		return -1;
	}

	//��й�ȣ ���� �޼ҵ�
	public int updatePassword(String password, String id) {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE CUSTOMER SET CUSTOMER_PW = ? WHERE CUSTOMER_ID = ?");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, password);
			pstmt.setString(2, id);

			return pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		return -1;
	}

	//�̸� ���� �޼ҵ�
	public int updateName(String name, String id) {

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE CUSTOMER SET CUSTOMER_NAME = ? WHERE CUSTOMER_ID = ?");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, name);
			pstmt.setString(2, id);

			return pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		return -1;	
	}

	//��ȭ��ȣ ���� �޼ҵ�
	public int updatetel(String tel, String id) {

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			StringBuilder sql = new StringBuilder();
			sql.append("UPDATE CUSTOMER SET CUSTOMER_TEL = ? WHERE CUSTOMER_ID = ?");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, tel);
			pstmt.setString(2, id);

			return pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		return -1;	
	}

	public int delete(CustomerVO Customer_Join) {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			StringBuilder sql = new StringBuilder();
			sql.append("DELETE FROM CUSTOMER ");
			sql.append("	WHERE CUSTOMER_ID = ? AND CUSTOMER_PW = ?");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, Customer_Join.getId());
			pstmt.setString(2, Customer_Join.getPassword());

			return pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		return -1;
	}

	public boolean checkId(String id) {
		boolean result = false;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT CUSTOMER_ID FROM CUSTOMER WHERE CUSTOMER_ID = ?");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, id);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		}		
		return result;
	}

	public boolean checkIdPassword(String id, String password) {
		boolean result = false;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT CUSTOMER_ID, CUSTOMER_PW FROM CUSTOMER WHERE CUSTOMER_ID = ? AND CUSTOMER_PW = ?");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, id);
			pstmt.setString(2, password);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				result = true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		}		
		return result;
	}

	public boolean checkTel(String tel) {
		boolean result = false;

		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			StringBuilder sql = new StringBuilder();
			sql.append("SELECT CUSTOMER_TEL FROM CUSTOMER WHERE CUSTOMER_TEL = ?");
			pstmt = conn.prepareStatement(sql.toString());

			pstmt.setString(1, tel);

			rs = pstmt.executeQuery();

			if (rs.next()) {//�����Ͱ� ������
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		}		
		return result;
	}
	//	--------------------------------------------------------------------------------------------�α��ν���
	protected boolean inputIdPw() {
		boolean inputLog = false;
		System.out.println("========================");
		System.out.println("[ȯ���մϴ� �α����� �����մϴ�]");
		System.out.println("========================");

		while(true) {
			System.out.print("���̵� : ");
			customer_id = scan.nextLine(); // ���̵� �Է�

			System.out.print("��й�ȣ : ");
			pw = scan.nextLine(); // ��й�ȣ �Է�

			CustomerLogVO lvo = new CustomerLogVO(customer_id, pw);

			boolean logTrue = checkIdPassword(lvo);

			if (logTrue) {
				inputLog = true;
				break;
			} else {
				System.out.println("�ٽ� �Է����ּ���.");
			}			
		}
		return inputLog;
	}
	//	�α��� ���� �޼ҵ�

	// �α���ó���� ���� id, password üũ
	// boolean checkIdPassword(id, password)
	public boolean checkIdPassword(CustomerLogVO lvo) {
		boolean result = false;
		String inputId = "";
		String inputPw = "";

		if (lvo.getCustomer_id() != null && lvo.getPassword() != null) {
			try {
				conn = DriverManager.getConnection(URL, USER, PASSWORD);

				StringBuffer sql = new StringBuffer();
				sql.append("SELECT CUSTOMER_ID, CUSTOMER_PW ");
				sql.append("  FROM CUSTOMER ");
				sql.append(" WHERE CUSTOMER_ID = ? ");

				pstmt = conn.prepareStatement(sql.toString());
				String str = lvo.getCustomer_id();
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
	//	--------------------------------------------------------------------------------------------�ܼ�Ʈ Ƽ�� ��ȸ 
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
			while (rs.next()) {
                member = new ConcertInfoVO(
                                rs.getDate("CONCERT_DATE"),
                                rs.getInt("CONCERT_NUM"),
                                rs.getInt("HALL_NUM"),
                                rs.getString("CONCERT_NAME"));
                
                list.add(member);
        
		    }
		} catch (SQLException e) {
		        e.printStackTrace();
		} finally {
		        //��밴ü close
		        JDBC_Close.closeConnStmtRs(conn, pstmt, rs);
		}
		return member;
	}	


	//---------------------------------------------------------------
	public void SelectConcert() {
        boolean run = true;
        while(run) {
        	try {
                Scanner scan = new Scanner(System.in);
                System.out.println(">>>�����Ͻ� �ܼ�Ʈ�� �������ּ���");
                System.out.println("1.BTS  2.������ �̽�Ʈ��  3.�ǵ�������  4.���۹�� 5.���̿����ܼ�Ʈ");
                concert_num = Integer.parseInt(scan.nextLine());
        
		        switch(concert_num) {
		        
			        case 1:
			                selectOne(1);
			                run = false;
			                break;
			        case 2:
			                selectOne(2);
			                run = false;
			                break;
			        case 3:
			                selectOne(3);
			                run = false;
			                break;
			        case 4:
			                selectOne(4);
			                run = false;
			                break;
			        case 5:
			                selectOne(5);
			                run = false;
			                break;
			        default :
			                System.out.println("1-5������ ���ڸ� �Է����ּ���.");
		        }
        
            }
        	catch(Exception e) {
	                System.out.println("���ڸ� �Է����ּ���.");
	        }
        }
	}
	//	-------------------------------------------------------------------------------���Ž���
	//�޴� ����
	public void menu() {
		System.out.println("======================= �ܼ�Ʈ ���� �ý��� =======================");
		System.out.println("");
		System.out.println("[1]����                [2]���                [3]��ȸ                [4]����                ");
		System.out.println("");
		System.out.println("============================================================");
	}
	//------------------------------------------------------------------------------------
	int seatNum[] = new int[25];
	String seatVip[] = new String[25];
	String seatSr[] = new String[25];
	String seatR[] = new String[25];
	String seatS[] = new String[25];
	

	ConcertAll()  {
		for (int i = 0; i < seatVip.length; i++) {
			seatNum[i] = i + 1;
			seatVip[i] = "��";
			seatSr[i] = "��";
			seatR[i] = "��";
			seatS[i] = "��";
		}
	}

	public void startReserv() {	
		
		boolean bool = true;
		System.out.println("<<< �ܼ�Ʈ ���Ű� ���۵Ǿ����ϴ�");
		
		while (bool) {
			Integer choice;
			menu();
			System.out.print("���ϴ� �۾��� �������ּ���(1~4) : ");		
			try {
				choice = Integer.parseInt(scan.nextLine());
				switch (choice) {
					case 1: //�����۾�
						checkSeat();
						grade();
						bool = false;
						break;
					case 2: //����۾�
						cancel();	
						bool = false;
						break;
					case 3: //���� ���� ��ȸ
						checkSeat();
						bool = false;
						break;
					case 4: //���α׷� ����
						System.out.println("<<< �ܼ�Ʈ ���Ű� ����Ǿ����ϴ�.");
						bool = false;
						break;
					default:
						System.out.println("[����] 1~4 ������ ���ڸ� �����ϼ���");
				}
			} catch(Exception e) {
				e.printStackTrace();
				System.out.println("[����] ���ڸ� �Է� �����մϴ�.~~~");
			}
		}

		SEAT_INFO_VO svo = new SEAT_INFO_VO(customer_id, (grade +"-"+ num), grade, concert_num, seat_price, have_seat);
		insert(svo);

	}

	//��� �޼ҵ�
	public void cancel() {
		//���̵�, ��� üũ ��ġ�� ��� �ش� �¼� ���
		System.out.println("��Ҹ� ���� ���̵�� ��й�ȣ�� �ٽ� �Է����ּ���");
		inputIdPw1();	
		deleteData(customer_id);
	}

	//���� ����� delete��
	public int deleteData(String customer_id) {
		int result = 0;
		try {
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", 
					"mdguest", "mdguest");
			
			String sql = "";
			sql += "DELETE FROM SEAT_INFO ";
			sql += "  WHERE CUSTOMER_ID = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, customer_id);
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}	
		return result;
	}
	
	//�α��� - ��� �޼ҵ�
	protected boolean inputIdPw1() {
		boolean inputLog = false;

		while(true) {
			System.out.print("���̵� : ");
			customer_id = scan.nextLine(); // ���̵� �Է�

			System.out.print("��й�ȣ : ");
			pw = scan.nextLine(); // ��й�ȣ �Է�

			CustomerLogVO lvo = new CustomerLogVO(customer_id, pw);

			boolean logTrue = checkIdPassword(lvo);

			if (logTrue) {
				inputLog = true;
				System.out.println(grade + num + " �¼��� ���������� ��ҵǾ����ϴ�.");
				if (grade.equalsIgnoreCase("VIP")) {
					seatVip[num - 1] = "��";
					checkSeat();
					break;
				}
				if (grade.equalsIgnoreCase("SR")) {
					seatSr[num - 1] = "��";	
					checkSeat();
					break;
				}
				if (grade.equalsIgnoreCase("R")) {
					seatR[num - 1] = "��";
					checkSeat();
					break;
				}
				if (grade.equalsIgnoreCase("S")) {
					seatS[num - 1] = "��";
					checkSeat();
					break;
				}
				break;
			} else {
				System.out.println("�ٽ� �Է����ּ���.");
			}			
		}
		return inputLog;
	}

	//������ �¼� ��� ���� �޼ҵ�
	public void grade() {
		while (true) {
			System.out.print("�¼� ����� �������ּ���(VIP/SR/R/S) : ");			
			grade = scan.nextLine();
			if (grade.equalsIgnoreCase("VIP")) {
				seatNum(seatVip);
				checkSeat();
				break;
			}
			if (grade.equalsIgnoreCase("SR")) {
				seatNum(seatSr);				
				checkSeat();
				break;
			}
			if (grade.equalsIgnoreCase("R")) {
				seatNum(seatR);
				checkSeat();
				break;
			}
			if (grade.equalsIgnoreCase("S")) {
				seatNum(seatS);
				checkSeat();
				break;
			}
			else {
				System.out.println("[����] ���� �¼� ����Դϴ�.");
			}

		}	
	}

	//������ �¼� ��ȣ ���� �޼ҵ�
	String seat[];
	public void seatNum(String seat[]) {
		while (true) {
			try {
				System.out.print("�¼� ��ȣ�� �������ּ���(1~25) : ");
				num = Integer.parseInt(scan.nextLine());

				if (num < 1 || num > 25) {
					System.out.println("���� �¼� ��ȣ�Դϴ�.");

				} 
				else {
					if (seat == seatVip) {
						if (seatVip[num - 1].toString().equals("��")) {
							System.out.println("�̹� ���õ� �ڸ��Դϴ�");
							continue;
						} 
						else {
							seatVip[num - 1] = "��";								
						}
					}
					if (seat == seatSr) {
						if (seatSr[num - 1].toString().equals("��")) {
							System.out.println("�̹� ���õ� �ڸ��Դϴ�");
							continue;
						} 
						else {
							seatSr[num - 1] = "��";								
						}
					}
					if (seat == seatR) {
						if (seatR[num - 1].toString().equals("��")) {
							System.out.println("�̹� ���õ� �ڸ��Դϴ�");
							continue;
						} 
						else {
							seatR[num - 1] = "��";								
						}
					}
					if (seat == seatS) {
						if (seatS[num - 1].toString().equals("��")) {
							System.out.println("�̹� ���õ� �ڸ��Դϴ�");
							continue;
						} 
						else {
							seatS[num - 1] = "��";
						}
					}
					break;
				}				
			}
			catch (Exception e) {
				System.out.println("[����] ���ڸ� �Է� �����մϴ�.");
			}	
		}
		
		if (seat == seatVip) {
			seat_price = 150000;
		}
		if (seat == seatSr) {
			seat_price = 130000;
		}
		if (seat == seatR) {
			seat_price = 100000;
		}
		if (seat == seatS) {
			seat_price = 90000;
		}

		if (seat[num-1].toString().equals("��")) {
			have_seat = "�����ȵ�";
		}
		else {
			have_seat = "������";
		}
	}

	//�¼� ��ȸ
	public void checkSeat() {
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			
			StringBuilder sql = new StringBuilder();
			sql.append("SELECT SUBSTR(SEAT_NUM, 1, INSTR(SEAT_NUM, '-') - 1) as DBGRADE" );
			sql.append(" 	  ,TO_NUMBER(SUBSTR(SEAT_NUM, INSTR(SEAT_NUM, '-') + 1)) DBNUM ");		
			sql.append("  FROM SEAT_INFO ");		
			sql.append(" WHERE CONCERT_NUM = ? ");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setInt(1, concert_num);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				String gradeDb;
				int numDb;
				gradeDb = rs.getString(1);				
				numDb = rs.getInt(2);
				//System.out.println(gradeDb + numDb);
								
				if (gradeDb.equalsIgnoreCase("VIP")) {
					seatVip[numDb - 1] = "��";
				}
				if (gradeDb.equalsIgnoreCase("SR")) {
					seatSr[numDb - 1] = "��";
				}
				if (gradeDb.equalsIgnoreCase("R")) {
					seatR[numDb - 1] = "��";
				}
				if (gradeDb.equalsIgnoreCase("S")) {
					seatS[numDb - 1] = "��";
				}
				
			}
			
			System.out.println("<<<<<<<<<<<<<< ���� �¼� ����");
			System.out.print("\t");
			for (int i = 0; i < seatVip.length; i++) {
				System.out.print(seatNum[i] + "\t");
			}
			System.out.println();
			System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.print("VIP\t");
			for (int i = 0; i < seatVip.length; i++) {
				System.out.print(seatVip[i] + "\t");
			}
			System.out.println();
			System.out.print("SR\t");
			for (int i = 0; i < seatSr.length; i++) {
				System.out.print(seatSr[i] + "\t");
			}
			System.out.println();
			System.out.print("R\t");
			for (int i = 0; i < seatR.length; i++) {
				System.out.print(seatR[i] + "\t");
			}
			System.out.println();
			System.out.print("S\t");
			for (int i = 0; i < seatS.length; i++) {
				System.out.print(seatS[i] + "\t");
			}
			System.out.println();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
//	--------------------------------------------------------------------------- payment ����
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
            sql.append("        (TICKET_NUM, PAYMENT_UID, CONCERT_DATE, CONCERT_NAME, CONCERT_NUM, HALL_NUM, SEAT_NUM, SEAT_PRICE, CUSTOMER_ID, RESERVATION_NUM) ");
            sql.append(" VALUES (TICKET_NUM.NEXTVAL, ");
	        sql.append(" (SELECT PAYMENT_UID FROM PAYMENT WHERE CUSTOMER_ID = '"+ customer_id +"') , ");
	        sql.append(" (SELECT CONCERT_DATE FROM SCHEDULE_INFO  WHERE CONCERT_NUM = "+ concert_num +") , ");
	        sql.append(" (SELECT CONCERT_NAME FROM SCHEDULE_INFO  WHERE CONCERT_NUM = "+ concert_num +") , ");
	        sql.append(concert_num + " ," );
	        sql.append(" (SELECT HALL_NUM FROM SCHEDULE_INFO WHERE  CONCERT_NUM = "+ concert_num +" ) , ");
	        sql.append(" (SELECT SEAT_NUM FROM SEAT_INFO WHERE CUSTOMER_ID = '"+ customer_id +"' ) , ");
	        sql.append(" (SELECT SEAT_PRICE FROM SEAT_INFO WHERE CUSTOMER_ID = '"+ customer_id +"' ) , ");
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
			sql += "SELECT t.ticket_num, t.hall_num, s.seat_grade, t.seat_num, t.concert_name, t.seat_price ";
            sql += "  FROM TICKET T, SEAT_INFO S ";
            sql += " WHERE t.seat_num=  s.seat_num";
            sql += " AND t.customer_id = '"+customer_id+"' " ;
            pstmt = conn.prepareStatement(sql);
            
            // ? (���ε� ����)�� �� ����

            rs = pstmt.executeQuery();
            
            if (rs.next()) {
                    String str = "";
                    str += "Ƽ�Ϲ�ȣ: "+rs.getInt(1) + "\n";
                    str += "�������ȣ: "+rs.getInt(2) + "\n";
                    str += "�¼����: "+rs.getString(3) + "\n";
                    str += "�¼���ȣ: "+rs.getString(4) + "\n";
                    str += "�ܼ�Ʈ����: "+rs.getString(5) + "\n";
                    str += "�¼�����: "+rs.getInt(6) ;
				
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
					deleteData(customer_id);
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
	//INSERT��
	public int insert(SEAT_INFO_VO seat) {
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			StringBuilder sql = new StringBuilder();
			sql.append("INSERT INTO SEAT_INFO ");
			sql.append(" VALUES(?, ?, ?, ?, ?, ?) ");
			
			pstmt = conn.prepareStatement(sql.toString());
			
			pstmt.setString(1, seat.getCustomer_id());
			pstmt.setString(2, seat.getSeat_num());
			pstmt.setString(3, seat.getSeat_grade());
			pstmt.setInt(4, seat.getConcert_num());
			pstmt.setInt(5, seat.getSeat_price());
			pstmt.setString(6, seat.getHaveseat());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();			
		} finally {
			JDBC_Close.closeConnStmt(conn, pstmt);
		}
		
		return result;
	}
	
}


















