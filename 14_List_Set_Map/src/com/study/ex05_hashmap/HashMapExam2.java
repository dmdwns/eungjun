
package com.study.ex05_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam2 {

	public static void main(String[] args) {
		// ������ for���� ����� Map ����Ÿ ��ȸ
		int[] nums = {10, 20, 30, 40};
		System.out.println("----- �⺻���� for�� �迭�� ��� -----");
		for(int i=0; i<nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		
		System.out.println("----- ������ for�� �迭�� ��� -----");
		//for(�ϳ��ǵ�����Ÿ�� ����Һ����� : ���հ�ü){}
		for(int num : nums) {
			System.out.print(num + " ");
		}
		System.out.println();
		
		//=================================================
		System.out.println("==============================");
		Map<String,String> map=new HashMap<>();
		map.put("Ű1","��1");
		map.put("Ű2","��2");
		map.put("Ű3","��3");
		map.put("Ű4","��4");
		map.put("Ű5","��5");
		System.out.println(map); //��¼��� �� �� ��
		
		//===================================================
		// ��ü ����Ÿ ȭ�� ���
		// ��¿�) Ű1-��1
		// �ǽ�1 : keySet(), iterator() ���(while�� �����)
		System.out.println("----- �ǽ�1 : keySet(), iterator() ���(while�� �����) -----");
		Set<String> set=map.keySet();// Ű �����͸� ��ȸ�ؼ� ����
		Iterator<String>ite = set.iterator();
		while(ite.hasNext()) {
			String key=ite.next();//��ȸ�ؼ� �����´�
			String value=map.get(key);
			System.out.println(key + "-" + value);
		}
		
		
		// �ǽ�2 : keySet() ���(������ for�� ���)
		System.out.println("----- �ǽ�2 :  keySet() ���(������ for�� ���) -----");
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + "-" +map.get(key));
		}
		System.out.println("-----");
		for(String key : map.keySet()) {
			System.out.println(key + "-" +map.get(key));
		}
		
		System.out.println("===== entrySet() ������ for�� ��� =====");
		//Set<Entry<String, String>> entrySet = map.entrySet();
		for(Entry<String, String> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
	}

}

































