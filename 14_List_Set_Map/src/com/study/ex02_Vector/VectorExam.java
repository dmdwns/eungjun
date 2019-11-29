package com.study.ex02_Vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExam {
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		//VectorŬ���� : List�迭
		Vector<String> v=new Vector<>(5); //����뷮 5
		v.add("1"); //�ε��� : 0
		v.add("2"); //�ε��� : 1
		v.add("3"); //�ε��� : 2
		System.out.println(v); //��������� 5������ 3���� ������
		System.out.println("v.size() : " + v.size());
		System.out.println("v.capacity() : " + v.capacity());//�����Ҽ� �ִ� �뷮, �뷮���� ���ϸ� �⺻������ 10����
		
		String temp = v.toString(); //.toString() : ��������δ� ���ڿ��� ����
		System.out.println(temp);
		
		System.out.println("----- v.remove(2) -----");
		v.remove(2); //������ �ε��� ����
		System.out.println("v.size() : " + v.size()); //������� �ϳ��ٰ�
		System.out.println("v.capacity() : " + v.capacity()); //�뷮�� �״��
		
		System.out.println("----- v.trimToSize() -----");
		v.trimToSize();//�����뷮�� �����ش�
		System.out.println("v.size() : " + v.size()); 
		System.out.println("v.capacity() : " + v.capacity());
		
		System.out.println("----- v.addElement() <- add�� ���� -----");
		v.addElement("4");//add�� ���� �Ѵ� �� �ڿ� �߰����ش�
		System.out.println(v);
		
		v.add("AA"); //�������̽������� add�� ��밡��
		System.out.println(v);
		
		System.out.println("----- remove(), add(), set() -----");
		v.remove("2");// " "���� 2�� ã�Ƽ� ������
		System.out.println(v);
		
		v.add(2, "BB"); //2���ε����� BB�� ����, ��ȸ : get
		System.out.println(v);
		
		v.set(2 , "CCC"); //2�� �ε����� CCC�� ����/������Ʈ �Ѵ�
		System.out.println(v);
		
		System.out.println("v.size() : " + v.size()); 
		System.out.println("v.capacity() : " + v.capacity());
		
		System.out.println("----- ��ü���� clone() -----");
		Vector<String> v2=(Vector<String>)v.clone();
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2);
		
		System.out.println("----- v2.clear() ������ -----");
		v2.clear(); // ��ü����Ÿ ����
		System.out.println("v : " + v);
		System.out.println("v2 : " + v2); //��� : ���Ϳ��� Ŭ���� ���ο�� ���� �����Ѵ�
		
		System.out.println("====== Enumeration ��ü ��� ��ȸ ======");//��ü������ ��ȸ
		Enumeration<String> enu = v.elements(); //
		while(enu.hasMoreElements()) {
			String str=(String)enu.nextElement();//Ÿ������ ���ϸ� objectŸ��,�츮�� ���� StringŸ������
			System.out.println("enu.nextElement() : " + str);
		}
		System.out.println(v);
		
		System.out.println("===== Iterator Ȱ�� ��ȸ =====");//�ϳ��� �̾Ƽ� ��ȸ
		Iterator<String> ite = v.iterator();
		System.out.println("ite.hasNext() : " +ite.hasNext());
		while(ite.hasNext()) {
			String str=ite.next();
			System.out.println("ite.next() : " + str);
		}
		System.out.println("ite.hasNext() : " +ite.hasNext());
	}
}


























