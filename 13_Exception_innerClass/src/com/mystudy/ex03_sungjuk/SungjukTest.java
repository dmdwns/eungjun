package com.mystudy.ex03_sungjuk;

public class SungjukTest {

	public static void main(String[] args) {
		//StudentVO Ÿ���� ����Ÿ 1�� ���� �� ��������, �������� ����
		System.out.println("--- main() ���� ---");
		StudentVO stu = new StudentVO("ȫ�浿", 100, 90, 80);
		System.out.println(stu.toString());
		
		boolean result = stu.setKor(999); //�߸��� ���� �Է�
		if (!result) {
			System.out.println("[���ܹ߻�] �߸��� �� �Էµ�");
		}
		System.out.println(stu.toString());
		
		System.out.println("---- setEng() ó�� ----");
		try {
			stu.setEng(999);
		} catch (JumsuOutOfValueException e) {
			System.out.println("[���ܹ߻�] " + e.getMessage());
		} catch(SungjukProcessException e) {
			System.out.println("[���ܹ߻�] ����ó���� ���� �߻�");
		}
		System.out.println(stu.toString());
		
		System.out.println("--- main() ���� ---");
	}

}





