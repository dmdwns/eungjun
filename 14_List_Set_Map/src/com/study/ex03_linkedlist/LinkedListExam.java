package com.study.ex03_linkedlist;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		// LinkedList : List�迭
		LinkedList<String> list=new LinkedList();
		list.add("�浿��");
		//list.add("�浿��");
		//list.add("������");
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println("--------------------------");
		
		String str="�浿��,������,������,��������,ȫ�淡";
		String[] strs=str.split(",");
		System.out.println("strs : " + Arrays.deepToString(strs));//����ŸȮ�ο�
		
		//�迭�� �ִ� �����͸� ����Ʈ�� �߰�
		for(int i=0; i<strs.length; i++) {
			list.add(strs[i]);
		}
		System.out.println("list : " + list);
		
		System.out.println("------------------------------");
		Collections.reverse(list);
		System.out.println(list); // ó���� ������, �ι�°�� �������� �±�ȯ
		
		Collections.sort(list); // ������ ������� ����
		System.out.println(list);
		
		//������ ����
		list.remove("������");
		System.out.println("������ ������ : " + list);
		
		//--------------------------------------
		//[�ǽ�] �������� -> ��������2�� ����
		//1."��������"�� ��� �ִ��� ã�´�
		//2.ã�� ��ġ�� "��������2"�� ����
		
		
		System.out.println("----- �̸��ٲٱ� �ǽ� -----");
		System.out.println("list �ٲٱ��� : " + list);
		//�������� ��ġã��
//		list.indexOf("��������");
//		System.out.println(list.indexOf("��������"));
		
//		//set�� ����� ����
//		list.set(3, "��������2");
//		System.out.println(list);
		
		//���Ʒ� ���ļ�
		list.set(list.indexOf("��������"), "��������2");
		System.out.println("list �ٲ��� : " + list);
		
		//VOŸ���϶��� indexOf �ȸԴ´�. for�� getname()�Ἥ ã�ƾ���
		
		
	}

}


























