package com.mystudy.ex09_list_set_map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class List_Set_Map {

	public static void main(String[] args) {
		// 1. List ���
		// - �̸���� : ȫ�浿, ������, �ڳ���, �̼���
		// - ��� : index : �̸�(������)
		// - ���� : ȫ�浿 -> ��������
		//-------------------------------
		System.out.println("==== List ��� ====");
		List<String> list = new ArrayList<>();
		list.add("ȫ�浿");
		list.add("������");
		list.add("�ڳ���");
		list.add("�̼���");
		System.out.println(list);
		
		System.out.println("--- List for��(��ü��ȸ) ---");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i + " : " + list.get(i));
		}
		
		System.out.println("--- List ������ for��(��ü��ȸ) ---");
		// for (�������� : ���հ�ü) { }
		int idx = 0;
		for (String str : list) {
			System.out.println(idx + " : " + str);
			idx++;
		}
		
		// 2. Set ���
		// - �̸���� : ȫ�浿, ������, �ڳ���, �̼���
		// - ��� : �̸� (��������, �����ټ�)
		// - ���� : ȫ�浿 -> ��������
		//--------------------------------
		System.out.println("==== Set ��� ======");
		Set<String> set = new TreeSet<>();
		set.add("ȫ�浿");
		set.add("������");
		set.add("�ڳ���");
		set.add("�̼���");
		System.out.println(set);
		
		System.out.println("--- ������ for�� ��� ---");
		for (String name : set) {
			System.out.println(name);
		}
		
		System.out.println("--- iterator() for�� ��� ---");
		Iterator<String> ite = set.iterator();
		for (int i = 0; i < set.size(); i++) {
			System.out.println(ite.next());
		}
		
		System.out.println("--- iterator() while�� ��� ---");
		ite = set.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		// 2. Map ���
		// - k-v : 1901-ȫ�浿, 1902-������, 1903-�ڳ���, 1904-�̼���
		// - ��� : 1901-ȫ�浿 (key ��������)
		// - ���� : ȫ�浿 -> �������� (key �� ���)
		//--------------------------------
		System.out.println("===== Map<k,v> ��� ======");
		Map<String, String> map = new TreeMap<>();
		map.put("1901", "ȫ�浿");
		map.put("1902", "������");
		map.put("1903", "�ڳ���");
		map.put("1904", "�̼���");
		
		map.put("1905", "ȫ�浿");
		
		System.out.println(map);
		System.out.println("--- keySet() ������ for�� ��� ---");
		//Set<String> keySet = map.keySet();
		for (String id : map.keySet()) {
			System.out.println(id + "-" + map.get(id));
		}
		
		//���� : ȫ�浿 -> ��������
//		if (map.containsKey("1901")) {
//			map.put("1901", "��������");
//		}
		
		//map.replace("1901", "��������"); //������ �޼ҵ� ���
		
		for (String key : map.keySet()) {
			if ("ȫ�浿".equals(map.get(key))) { //value ���� "ȫ�浿" �̳�?
				map.replace(key, "��������");
				//break;
			}
		}
		
		System.out.println("--- ������ ---");
		for (String id : map.keySet()) {
			System.out.println(id + "-" + map.get(id));
		}
		
		
	}

}





