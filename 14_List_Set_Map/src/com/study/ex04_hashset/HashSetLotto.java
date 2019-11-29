package com.study.ex04_hashset;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class HashSetLotto {

	public static void main(String[] args) {
		/* Set�� �̿��� �ζ� ����� : 1~45 �������� 6���� Set�� ����
		     �ζǹ�ȣ 6���� ��÷�ϰ�, ���� ���ں��� ������� ȭ�����
		   -Math.random()����ؼ� ������ ���� �����
		   -����� ���� ���ں��� ū���� ����
		       ��)1,2,3,4,5,6 
		 */
		
		//������ �̱�
		//Set�� ����X, �ߺ����X
		Set<Integer> set=new HashSet<>();
		System.out.println("�ζ��� ������ : " + set.size());
		while(set.size()<6) {//ũ�Ⱑ 6�̸����� ����
			int num=(int)(Math.random()*45+1);//+1 �ϸ� 0���� �������� �ʴ´�
			set.add(num);//.add() num���� ������ 6�� ���ڸ� ��
			System.out.print(num + " ");
		}
		System.out.println();
		
		//�������� ����
		//Collections������ ������ List���� �ؾ���
		List<Integer> list=new LinkedList<>(set);//LinkedList ���
		Collections.sort(list); //�������� ����
		System.out.println("�̹��� ��÷ : " + list); //��ȣ ���
		
		
		
	}

}












