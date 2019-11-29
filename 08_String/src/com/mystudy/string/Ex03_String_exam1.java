package com.mystudy.string;

public class Ex03_String_exam1 {

	public static void main(String[] args) {
		/*(�ǽ�) String Ŭ������ �޼ҵ带 ���
		String str = "900108-1111111"; //�ֹε�Ϲ�ȣ ü��
		1. ��Ȯ�� �Էµ� ����Ÿ���� Ȯ��
		   (��ü�ڸ���: 14 �ڸ�, '-'��ġ : 7��°���� Ȯ��)
		2. ������� ���(1-2��°: �⵵, 3-4��°: ��, 5-6��°: ��)
			��)900108 -> 90�� 01�� 08�� �Ǵ� 90�� 1�� 8��
		3. ����Ȯ���ϰ� ���(1,3: ����, 2,4: ����)
		4. ����Ÿ �� ����(��: 1~12, ��: 1~31)
		���� : int num = Integer.parseInt("12") : "12" -> 12(���ڿ�->����)
		*/
		//            01234567890123
		String str = "900108-1234567";
		//��ü�ڸ���: 14 �ڸ� Ȯ��
		System.out.println("��ü�ڸ��� : " + str.length());
		if (str.length() == 14) {
			System.out.println("[����] ��ü���� 14�ڸ�");
		} else {
			System.out.println("[������] ��ü���� " + str.length());
		}
		
		//'-'��ġ : 7��°���� Ȯ��
		System.out.println(str.substring(6, 7));
		if (str.substring(6, 7).equals("-")) {
			System.out.println("[����] '-' ������ġ 7��°");
		} else {
			System.out.println("[������] '-' ������ġ 7��°�� �ƴ�");
		}
		
		//'-'��ġ : 7��°�� �ƴ� ���
		if (!str.substring(6, 7).equals("-")) {
			System.out.println(">> [������] '-' ������ġ 7��°�� �ƴ�");
		}
		
		System.out.println("str.indexOf(\"-\") : " + str.indexOf("-"));
		if (str.indexOf("-") != 6) {
			System.out.println(">>> [������] '-' ������ġ 7��°�� �ƴ�");
		}
		if (str.charAt(6) != '-' ) {
			System.out.println(">>>> [������] '-' ������ġ 7��°�� �ƴ�");
		}
		
		System.out.println("==== ������� ���� ========");
		//2. ������� ���(1-2��°: �⵵, 3-4��°: ��, 5-6��°: ��)
		String yymmdd = str.substring(0, 6);
		System.out.println("yymmdd : " + yymmdd);
		String yy = yymmdd.substring(0, 2);
		String mm = yymmdd.substring(2, 4);
		String dd = yymmdd.substring(4, 6);
		String flag = str.substring(7, 8);
		
		String yyyy = "";
		if (flag.equals("1") || flag.equals("2")) {
			yyyy = "19" + yy;
		} else if (flag.equals("3") || flag.equals("4")) {
			yyyy = "20" + yy;
		}
		System.out.println("������� : " + yyyy +"�� "+ mm +"�� "+ dd +"��");
		System.out.println("������� : " + yy +"�� "+ mm +"�� "+ dd +"��");
		
		System.out.println("======= ���� Ȯ�� ======");
		//3. ����Ȯ���ϰ� ���(1,3: ����, 2,4: ����)
		String gender = str.substring(7, 8);
		if (gender.equals("1") || gender.equals("3")) {
			System.out.println("�ֹι�ȣ ���ڸ�(ù����) : "+ gender + "(����)");
		} else if (gender.equals("2") || gender.equals("4")) {
			System.out.println("�ֹι�ȣ ���ڸ�(ù����) : "+ gender + "(����)");
		}
		
		switch(gender) {
		case "1": case "3":
			System.out.println("�ֹι�ȣ ���ڸ�(ù����) : "+ gender + "(����)");
			break;
		case "2": case "4":
			System.out.println("�ֹι�ȣ ���ڸ�(ù����) : "+ gender + "(����)");
			break;
		default:
			System.out.println("�ܱ���?");
		}
		
		System.out.println("=== ��, �� �� ���� ===");
		//4. ����Ÿ �� ����(��: 1~12, ��: 1~31)
		//              01234567890123
		//String str = "900108-1234567";
		String sMonth = str.substring(2, 4);
		int month = Integer.parseInt(sMonth);
		if (month >= 1 && month < 12) {
			System.out.println("[����] �� ����Ÿ�� ����(1~12)");
		} else {
			System.out.println("[������] �� ����Ÿ�� 1~12 ������ �ƴ�");
		}
		if (month < 1 || month > 12) {
			System.out.println("> [������] �� ����Ÿ�� 1~12 ������ �ƴ�");
		}
		
		//���� Ȯ�� : 1~31 �������� �ִ���
		int date = Integer.parseInt(str.substring(4, 6)); //"08" -> 8
		if (date >= 1 && date <= 31) {
			System.out.println("[����] �� ����Ÿ�� ����(1~31)");
		} else {
			System.out.println("[������] �� ����Ÿ�� ������ 1~31 ������ �ƴ�");
		}
		
		
	}

}





