package com.study.ex04_hashset;

import java.util.HashSet;

class Person {
	String name; //�̸�
	int age; //����
	String jumin; //�ֹι�ȣ
	public Person(String name, int age, String jumin) {
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age 
				+ ", jumin=" + jumin + "]" + "\n";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jumin == null) ? 0 : jumin.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (jumin == null) {
			if (other.jumin != null)
				return false;
		} else if (!jumin.equals(other.jumin))
			return false;
		return true;
	}
	
}

public class HashSetExam_equals {

	public static void main(String[] args) {
		// Set �ߺ������� �ϳ��� ����
		// ������ �������� ���� ������ ���δ� equals �޼ҵ� ����
		// equals() �޼ҵ带 ������(override)�ϰ�, hashCode() �Բ� ������
		// �񱳼��� : hashCode() �� ���� ������ equals() ��
		HashSet set = new HashSet();
		set.add("ABC");
		set.add("ABC");
		set.add("XYZ");
		System.out.println(set);
		
		set.add(new Person("ȫ�浿", 30, "901010-1111111"));
		set.add(new Person("ȫ�浿", 30, "901010-1111111"));
		set.add(new Person("ȫ�浿", 30, "901010-1222222"));
		System.out.println(set);
	}

}




















