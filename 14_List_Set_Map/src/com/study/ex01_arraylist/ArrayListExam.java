package com.study.ex01_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		//List�迭 : ArrayList - �迭 �Ӽ��� List �Ӽ��� ����
		// - List �������̽��� ��� ����(implemests)�ϴ� Ŭ����
		// - List �������̽��� Ȯ��(extends)�ؼ� �������̽�
		
		ArrayList list1=new ArrayList();// ������ ���ϸ� ���� �ٷ� �� ����
		System.out.println("list1�� ũ�� : " + list1.size()); // .size() : ũ��
		
		list1.add(new Integer(5));
		list1.add(1);//int -> Integer �ڵ�����ȯ �Ǿ� �Էµ�
		list1.add(new Integer(5)); // ���� ���� �ߺ��� ���
		list1.add(new Integer(6));
		list1.add(new Integer(7));
		System.out.println(list1.toString()); //���ڿ��� ����
		System.out.println("list1�� ũ�� : " + list1.size());
		
		list1.add(0, 100); //�ε�����ġ, �ε�����ġ�� �Է��� ����Ÿ �߰�
		System.out.println("0�ε����� 100 .add�� : " + list1.toString());
		
		list1.set(0, 999); //�ε�����ġ, �ε�����ġ�� ����Ÿ�� �Է��� ����Ÿ�� ����
		System.out.println("0�ε����� 999 .set�� : " + list1.toString());
		
		list1.remove(0); //0�� ��ġ�� ����Ÿ ����
		System.out.println("0�ε����� .remove�� : " + list1.toString());
		
		
		//list1.remove(5); //����5�� �����ϰڴٰ� �ƴ� �ε��� 5�� �ε��� ������ ����
		list1.remove(new Integer(5)); //���ο� IntegerŸ���� ���� �����ؾ���
		System.out.println("���� Integer5 ������ : " + list1.toString());
		
		Object obj = list1.get(0); //0�� �ε��� �� Ȯ��, �� ���� �������Ƿ� Object�� �ؾ���
		System.out.println("0�� �ε��� �� : " + obj);
		
		Collections.reverse(list1);//.reverse : ����Ÿ �ٲٱ�
		System.out.println(".reverse ���� : " + list1.toString());
		System.out.println("----------------------------");
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4)); // .subList(����,����������) list1�� 1���ε������� 3�� �ε��� ���� �����´�
		System.out.println("list2 : " + list2);
		
		System.out.println("----- Collection.sort() -----");
		System.out.println("list1 : " + list1);
		Collections.sort(list1); //Collections <- Ŭ���� �޼ҵ�, .sort()�������� ����
		System.out.println(".sort(list1) ������ : " + list1);
		
		Collections.sort(list2);
		System.out.println(".sort(list2) ������ : " + list2);
		
		System.out.println("----- Collection.reverse() -----");
		//reverse() : ó���� �� ��ġ�� ���� �ٲٴ� ���·� ����(���İ��� ����)
		Collections.reverse(list1);
		System.out.println(".reverse(list1) ��  list1 : " + list1);
		
		System.out.println("===============================");
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		
		list2.add("B"); //add()�� ���ʿ��߰�
		list2.add("TEST");
		System.out.println("list2 : " + list2);
		System.out.println("ù��° ����Ÿ ��ȸ : " + list2.get(0));
		System.out.println("������ ����Ÿ ��ȸ : " + list2.get(list2.size()-1));
		
		System.out.println("--------------------------");
		for(int i=0; i<list2.size(); i++) {
			System.out.println(i + " - " + list2.get(i));
		}
		
		System.out.println("--------------------------");
		printData(list1);
		printData("list1", list1);
		printData("list2", list2);
		printData(list1,list2);
		System.out.println("=========================");
		//�ǽ� : �ݺ���(for)�� ����Ͽ� list2�� �ִ� ����Ÿ ��ü ����
		
		//(��������)����Ÿ�� ��� �������� �ʰ� ���� ����
//		list2.remove(0); //0�� ��ġ�� ����Ÿ ����
//		System.out.println("0�ε����� .remove�� : " + list2.toString());
//		list2.remove(0); //0�� ��ġ�� ����Ÿ ����
//		System.out.println("1�ε����� .remove�� : " + list2.toString());
//		list2.remove(0); //0�� ��ġ�� ����Ÿ ����
//		System.out.println("2�ε����� .remove�� : " + list2.toString());
//		list2.remove(0); //0�� ��ġ�� ����Ÿ ����
//		System.out.println("2�ε����� .remove�� : " + list2.toString());
//		list2.remove(0); //0�� ��ġ�� ����Ÿ ����
//		System.out.println("2�ε����� .remove�� : " + list2.toString());
		
//		for(int i=0; i<list2.size(); i++) {
//			list2.remove(i);
//		}
//		printData(list2);
		
		/*
		System.out.println("------");
		//��������
		int list2Cnt=list2.size();
		for(int i=0; i<list2.size(); i++) {
			printData(">>list2",list2);
			list2.remove(i);
		}
		printData("list2",list2);
		*/
		
		/*
		//�ذ�1 : ������ŭ 0�� �ε��� �� ���� ó��
		int list2Cnt=list2.size();
		for(int i=0; i<list2Cnt; i++) {
			printData("��������>>list2",list2);
			list2.remove(0);
		}
		printData("�������>>list2",list2);
		*/
		
		/*
		//�ذ�2 : ������ŭ �ڿ������� ���� ó��
		//�Ǹ����� ������ ����, �ڿ���2��°, �ڿ��� 3��°, ... , �ڿ��� 0��°
		int lastIdex=list2.size()-1;
		for(int i=lastIdex; i>=0; i--) {
			printData("��������>>list2",list2);
			list2.remove(i);
		}
		printData("�������>>list2",list2);
		*/
		
		//�ذ�3: �޼ҵ� ����
		printData("��������>>list2",list2);
		list2.clear();
		
		
		
		
	}
	//�żҵ� �����
	static void printData(List list1, List list2) {
		printData("list1", list1);
		printData("list2", list2);
		System.out.println();
	}
	
	//�޼ҵ� �����
	static void printData(List list) {//�ڹ���ƿ���(�̹� �����ϴ� ��ɾ� List)
		//null ���� Ȯ��
		if(list==null) return;
		if(list.size() > 0) {//�ּ� �ϳ��̻��� ����Ÿ�� �ֳ�
			System.out.print(list.get(0));//�ϳ� �̻��� ����Ÿ�� �����Ƿ� 0�� �ε��� �ν�
		}
		for(int i=1; i<list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
		
	}
	
	static void printData(String title, List list) {
		//null ���� Ȯ��
		if(list==null) {
			System.out.println(title + " : - null");
			return;
		}
		if(list.size() == 0) {//null ���ƴ����� ����Ÿ�� �ϳ��� ����(��ü�� ����)
			System.out.println(title + " : ����Ÿ�Ǽ�0");//�ϳ� �̻��� ����Ÿ�� �����Ƿ� 0�� �ε��� �ν�
			return;
		}
		System.out.print(title + " : " + list.get(0));
		
		for(int i=1; i<list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println();
		
	}
	
	
	

}






































