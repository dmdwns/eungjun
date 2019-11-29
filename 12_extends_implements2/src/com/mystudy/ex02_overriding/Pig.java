package com.mystudy.ex02_overriding;

class Pig extends Animal {
	String name = "µÅÁö";
	void sound() {
		System.out.println(">> ²Ü~~ ²Ü~~~");
	}
	
	@Override
	String getName() {
		//return super.getName(); //ºÎ¸ğÅ¸ÀÔÀÇ getName() È£Ãâ
		return name;
	}
}







