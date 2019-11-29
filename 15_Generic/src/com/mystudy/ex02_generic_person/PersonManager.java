package com.mystudy.ex02_generic_person;

import java.util.ArrayList;

public class PersonManager {

	public static void main(String[] args) {
		ArrayList<PersonVO> list = new ArrayList<>();
		
		PersonVO person = new PersonVO("홍길동", 25);
		list.add(person);
		
		System.out.println(list);
		
		list.add(new PersonVO("김유신", 30));
		System.out.println(list);
		
		System.out.println("-----------");
		for (PersonVO vo : list) {
			String name = vo.getName();
			int age = vo.getAge();
			System.out.println("이름: "+ name +", 나이: "+ age);
		}
		
	}

}






