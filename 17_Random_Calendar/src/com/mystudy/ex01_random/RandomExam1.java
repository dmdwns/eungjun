package com.mystudy.ex01_random;

import java.util.Random;

public class RandomExam1 {

	public static void main(String[] args) {
		/* Random : ����(������ ��)�� �����ϴ� Ŭ����
		�������� : nextInt() - int Ÿ���� ���� �߻�
		        nextInt(10) - 0~9 ������ ������ ���� �߻�
		        nextLong() - long Ÿ���� ���� �߻�
		�Ǽ����� : nextFloat() - �Ǽ��� float Ÿ�� ���� �߻�
		        nextDouble() - �Ǽ��� double Ÿ���� ���� �߻�
		���� ���� : nextBoolean() - true, false �� �� �ϳ� �߻�
		*/
		Random ran = new Random();
		System.out.println("---- nextBoolean() ------");
		System.out.println("ran.nextBoolean() : " + ran.nextBoolean());
		System.out.println("ran.nextBoolean() : " + ran.nextBoolean());
		for (int i = 0; i < 10; i++) {
			System.out.print(ran.nextBoolean() + " ");
		}
		System.out.println();
		
		System.out.println("\n---- nextInt() -------");
		System.out.println("ran.nextInt() : " + ran.nextInt());
		System.out.println("ran.nextInt() : " + ran.nextInt());
		System.out.println("ran.nextInt() : " + ran.nextInt());
		for (int i = 0; i < 100; i++) {
			System.out.print(ran.nextInt() + " ");
		}
		System.out.println();
		
		System.out.println("\n----- nextFloat() -----");
		System.out.println("ran.nextFloat() : " + ran.nextFloat());
		System.out.println("ran.nextFloat() : " + ran.nextFloat());
		System.out.println("ran.nextFloat() : " + ran.nextFloat());
		
		System.out.println("\n---- nextDouble() -----");
		System.out.println("ran.nextDouble() : " + ran.nextDouble());
		System.out.println("ran.nextDouble() : " + ran.nextDouble());
		System.out.println("ran.nextDouble() : " + ran.nextDouble());
	}

}






