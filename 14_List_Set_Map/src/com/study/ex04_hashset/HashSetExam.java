package com.study.ex04_hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		// HachSet : Set�������̽��� ������ ����ü
		//HashSet<String> set=new HashSet(); //Ŭ����Ÿ�Ժ��� <- Ŭ������ü
		
		//�������̽� Ÿ�Ժ��� <- �������̽��� ������ Ŭ������ ��ü(�ν��Ͻ�)
		Set<String> set=new HashSet<>();

		set.add("1");
		//set.add(100); <- ���ʸ� Ÿ�� ������ ���� ���ڿ�(String)�� ��� ����
		set.add("ȫ�浿");
		set.add("ȫ�浿");
		set.add(new String("ȫ�浿"));
		System.out.println(set);//�ߺ��� ��� ����
		
		set.remove("1");
		System.out.println(set);
		
		System.out.println("set.contains(\"1\") : " + set.contains("1")); //set.contains():��ȣ�� �����ϰ� �ֳ�
		System.out.println("set.contains(\"ȫ�浿\") : " + set.contains("ȫ�浿"));
		System.out.println("set.size() : " + set.size());
		
		set.add("������");
		set.add("��������");
		set.add("ȫ�淡");
		System.out.println(set);
		
		System.out.println("----- Set ��ü����Ÿ ��ȸ(Iterator) -----");
		Iterator<String> ite=set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("----- ������ ==> ������ -----");
		
		//�ǽ�(����) : ������ -> ������(����ó��)
		//������ �����ϰ� ������ �Է�
		//������ �Է��ϰ� ������ ����
		set.contains("������");
		System.out.println(set.contains("������"));
		set.remove("������");
		System.out.println(set);
		set.add("������");
		System.out.println(set);
		
		
	}
	

}



















