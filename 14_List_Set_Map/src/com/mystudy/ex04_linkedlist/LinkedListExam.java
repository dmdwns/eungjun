package com.mystudy.ex04_linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		// LinkedList : List �迭
		LinkedList<String> list = new LinkedList();
		list.add("ȫ�浿");
//		list.add("ȫ�浿");
//		list.add("������");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println("-----------------");
		
		String str = "ȫ�浿,������,������,ȫ�淡,��������";
		String[] strs = str.split(",");
		System.out.println("strs : " + Arrays.toString(strs));
		
		//�迭�� �ִ� �����͸� ����Ʈ�� �߰�
		for (int i = 0; i < strs.length; i++) {
			list.add(strs[i]);
		}
		System.out.println("list : " + list);
		
		System.out.println("------------------");
		Collections.reverse(list);
		System.out.println("list : " + list);
		
		Collections.sort(list);
		System.out.println("list : " + list);
		
		//������ ����
		list.remove("������");
		System.out.println("������ ������ list : " + list);
		
		//---------------------
		//[�ǽ�] �������� -> ��������2 ���� ó��
		//1. "��������" �� ��� �ִ��� ã��
		//2. ã�� ��ġ�� "��������2"�� ����
		int idx = list.indexOf("��������");
		System.out.println("idx : " + idx);
		
		list.set(idx, "��������2");
		System.out.println("list : " + list);
	}

}







