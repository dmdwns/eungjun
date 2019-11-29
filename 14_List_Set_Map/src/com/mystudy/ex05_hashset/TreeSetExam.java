package com.mystudy.ex05_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExam {

	public static void main(String[] args) {
		/* Set�� �̿��� �ζ� ����� : 1~ 45 �������� 6���� Set�� ����
		�ζǹ�ȣ 6���� ��÷�ϰ�, ���� ���ں��� ������� ȭ�����
		- Math.random() ����ؼ� ������ ���� ����� 
		  (int)(Math.random() * 45 + 1)
		- ����� ���� ���ں��� ū���� ���·�
		    ��¿�) ������ �ζǹ�ȣ : 5, 8, 10, 25, 33, 41
		*/
		Set<Integer> lottoSet = new TreeSet();
		System.out.println("lottoSet.size() : " +lottoSet.size());
		for (int i = 0; lottoSet.size() < 6; i++) {
			int lottoNum = (int)(Math.random() * 45 + 1);
			System.out.println(lottoNum);
			lottoSet.add(lottoNum);
		}
		System.out.println("�ζǹ�ȣ : " + lottoSet);
		
		System.out.println("-------------");
		lottoSet.clear();
		for (; lottoSet.size() < 6; ) {
			int lottoNum = (int)(Math.random() * 45 + 1);
			System.out.println(lottoNum);
			lottoSet.add(lottoNum);
		}
		System.out.println("�ζǹ�ȣ : " + lottoSet);
		
		System.out.println("-------------");
		lottoSet.clear();
		while (lottoSet.size() < 6) {
			lottoSet.add((int)(Math.random() * 45 + 1));
		}
		System.out.println("�ζǹ�ȣ : " + lottoSet);
		
		System.out.println("==== ���� �۾� ====");
		ArrayList<Integer> list = new ArrayList<>(lottoSet);
		System.out.println("�ζ� list : " + list);
		
		Collections.sort(list);
		System.out.println("������ �ζǹ�ȣ : " + list);
	}

}
