package com.study.ex08_list_set_map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class List_Set_Map {

	public static void main(String[] args) {
		// 1. List ���
		//	- �̸���� : ȫ�浿, ������, �ڳ���, �̼���
		//	- ��� : index : �̸�(������)
		//	- ���� : ȫ�浿 -> ��������
		//------------------------------------
		System.out.println("����1");
		List<String> list=new ArrayList();
		//�̸����
		list.add("ȫ�浿");
		list.add("������");
		list.add("�ڳ���");
		list.add("�̼���");
		//���
		//for��
//		for(int i=0; i<list.size(); i++) {
//			System.out.println(i + ":" +list.get(i));
//		}
		
		//������ for��
		//for(�������� : ���հ�ü){}
		int idx=0;
		for(String str : list) {
			System.out.println(idx + " : " + str);
			idx++;
		}
		
		//����
		list.indexOf("ȫ�浿");
		list.set(0, "��������");
		System.out.println(list);
		
		
		
		
		System.out.println();
		// 2. Set ���
		//	- �̸���� : ȫ�浿, ������, �ڳ���, �̼���
		//	- ��� : �̸�(��������, �����ټ�)
		//	- ���� : ȫ�浿 -> ��������
		System.out.println("����2");
		Set<String> set=new TreeSet<>();
		//�̸����
		set.add("ȫ�浿");
		set.add("������");
		set.add("�ڳ���");
		set.add("�̼���");
//		//���
//		List<String> list1=new LinkedList<>(set);
//		Collections.sort(list1);
//		System.out.println(list1);
//		//����
//		set.contains("ȫ�浿");
//		set.remove("ȫ�浿");
//		set.add("��������");
//		System.out.println(set);
		
		System.out.println("----- ������ for�� ��� -----");
		for(String name : set) {
			System.out.println(name);
		}
		
		System.out.println("----- iterator() for�� ��� -----");
		Iterator<String> ite =set.iterator();
		for(int i=0; i<set.size(); i++) {
			System.out.println(ite.next());
		}
		
		System.out.println("----- iterator() while�� ��� -----");
		ite=set.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		
		
		System.out.println();
		// 3. Map ���
		//	- key-value : 1901-ȫ�浿, 1902-������, 1903-�ڳ���, 1904-�̼���
		//	- ��� : 1901-ȫ�浿(key ��������)
		//	- ���� : ȫ�浿 -> ��������(key �� ���)
		System.out.println("����3");
		Map<Integer, String> map=new TreeMap<>();
		// - key-value ������ �Է�
		map.put(1901, "ȫ�浿");
		map.put(1902, "������");
		map.put(1903, "�ڳ���");
		map.put(1904, "�̼���");
		map.put(1905, "ȫ�浿");
		//���
//		Set<Integer> set1=map.keySet();
//		Iterator<Integer>ite1=set1.iterator();
//		while(ite.hasNext()) {
//			Integer key=ite1.next();
//			String value=map.get(key);
//			System.out.println(key + "-" + value);
//		}
		
		for(Integer id : map.keySet()) {
			System.out.println(id + "-" + map.get(id));
		}
		
		System.out.println();
		//����
//		System.out.println();
//		map.put(1901,"��������");
//		Set<Integer> set2=map.keySet();
//		Iterator<Integer>ite2=set2.iterator();
//		while(ite2.hasNext()) {
//			Integer key=ite2.next();
//			String value=map.get(key);
//			System.out.println(key + "/t" +value);
//		}
		for(Integer key : map.keySet()) {
			if("ȫ�浿".equals(map.get(key)))
				map.replace(key,"��������");
		}
		
		for(Integer id : map.keySet()) {
			System.out.println(id + "-" + map.get(id));
		}
	

	}

}















