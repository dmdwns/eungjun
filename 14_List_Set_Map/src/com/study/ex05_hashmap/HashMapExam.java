package com.study.ex05_hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		//Map(�������̽�) : Ű(Key)-��(Value)������ ������ ����
		//-������ ����(��,TreeMap�� ��� Key�� �������� ���ĵǾ� ����)
		//-Ű(Key):�ߺ���� �ȵ�(�ߺ��� ���� ������ ����Ÿ)
		//-��(Value):�ߺ����
		HashMap<String, Integer> map=new HashMap<>();
		map.put("ȫ�浿",100);//100 -> IntegerŸ��100, �ڵ� ����ȯ �ȰŴ�
		map.put("������",new Integer(95));
		map.put("������",88);
		map.put("���",88);
		map.put("ȫ�浿",93);//������ key���� ������ ����ó����
		System.out.println(map);
		
		HashMap<String, Integer> map2=new HashMap<>();
		map2.put("������",92);
		map2.put("����ġ",82);
		System.out.println(map2);
		map2.remove("������");//������ Ű���� �����ش޶�
		System.out.println(map2);
		
		System.out.println("map.isEmpty() : " + map.isEmpty());
		System.out.println("map.get(\"ȫ�浿\") : " + map.get("ȫ�浿"));//.get()ȫ�浿�� ���� ���´�
		System.out.println("map.containsKey(\"��������\") : " + map.containsKey("��������"));//.containsKey():����Ÿ�� �ֳ� ���� Ȯ��
		System.out.println("map.containsValue(88) : " + map.containsValue(88));//.containsKey():88���� �ֳ� ���� Ȯ��
		//==========================================================
		System.out.println("===== Map��ü��������ȸ =====");
		//��ü����Ÿ ��ȸ:Ű(Key)-������(Value) ����
		//Map������ Ű(Key)�� �̿��ؼ� ������(Value) ��ȸ
		System.out.println("----- Ű(key) ���� : keyset() ��� -----");
		System.out.println(map);
		Set<String>keys=map.keySet();
		System.out.println("Ű ��� : " + keys);
	
		Iterator<String> ite=keys.iterator();
		while(ite.hasNext()) {
			String key=ite.next();//Ű������
			Integer value=map.get(key);//��������
			System.out.println("key : " + "value : " + value);
		}
		
		System.out.println("----- ��(value) ���� : value()��� -----");
		Collection values=map.values();
		System.out.println("value : " + values);
		Iterator<Integer> iteValues=values.iterator();
		//��(value)���� �� ���ϱ�
		int sum=0;
		while(iteValues.hasNext()) {
			Integer num=iteValues.next();
			System.out.println("���� : " + num);
			sum += num;
		}
		System.out.println("�����հ� : " + sum);
	
		//----------------------------------------------------------------
		
		System.out.println("================================");
		//������ ��ȸ ���
		//��ȸ���1 : keySet(), iterator() ���
		System.out.println("----- keySet(), iterator() ��� -----");
		Set<String> set = map.keySet(); //Ű ����Ÿ�� ��ȸ�ؼ� ����
		ite = set.iterator();
		while(ite.hasNext()) {
			String key = ite.next();
			Integer value = map.get(key);
			System.out.println("key : " + key + ", value : " + value);
		}
		
		//��ȸ���2 :entrySet() ���
		System.out.println("----- entrySet() : key, value ���� -----");
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println(entrySet);
		
		Iterator<Entry<String, Integer>> entryIte = entrySet.iterator(); //.iterator(): set���� ��ȸ�Ҷ� ��
		while (entryIte.hasNext()) {
			Entry<String, Integer> entry = entryIte.next();
			System.out.println("key : " + entry.getKey() + "  value : " + entry.getValue());
		}
	
	}
	

}















