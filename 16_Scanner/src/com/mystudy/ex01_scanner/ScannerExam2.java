package com.mystudy.ex01_scanner;

import java.util.Scanner;

public class ScannerExam2 {

	public static void main(String[] args) {
		// ����, ����, ����, ���� ������ ȭ��(�ܼ�)���� �Է¹޾�
		// ����, ����� ���ϰ� ��� ȭ�� ���
		/*
		���� : ȫ�浿
		���� : 100
		���� : 90
		���� : 81
		----------
		���� : 271
		��� : 90.33
		�򰡰�� : A
		*/
		Scanner scan = new Scanner(System.in);
		
		while (true) {
			//ȭ�鿡�� ������ �Է� �ޱ�
			System.out.print("���� : ");
			String name = scan.nextLine();
			
			System.out.print("�������� : ");
			int kor = scan.nextInt();
			
			System.out.print("�������� : ");
			int eng = scan.nextInt();
			
			System.out.print("�������� : ");
			int math = scan.nextInt();
			scan.nextLine(); //�ٹٲ� ���� ���� �Էµ� ������ �о ó��
	
			//�Է°��� ���� ��� ó��
			int tot = kor + eng + math;
			double avg = tot * 100 / 3 / 100.0;
			
			//���� ��� ���
			System.out.println("\n==== ������� ====");
			System.out.println("���� : " + name);
			System.out.println("���� : " + kor);
			System.out.println("���� : " + eng);
			System.out.println("���� : " + math);
			System.out.println("-------------");
			System.out.println("���� : " + tot);
			System.out.println("��� : " + avg);
			System.out.println("==============");
			System.out.println();
			
			System.out.print("��� �۾� �Ͻðڽ��ϱ�?(y:����۾�, n:�ߴ�) ");
			String answer = scan.nextLine();
			if (!answer.equalsIgnoreCase("Y")) {
				System.out.println(">> �۾��� ����Ǿ����ϴ�.");
				break;
			}
		}
	}

}









