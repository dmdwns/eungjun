package com.mystudy.ex02_extends;

//Phone Ŭ���� ��ӹ޾�(extends : Ȯ���ؼ�) Mp3Phone �����
class Mp3Phone extends Phone {
	
	Mp3Phone(String type, String phoneNo){
		super("Mp3Phone Ÿ��", phoneNo);//�θ�Ŭ���� ������ ȣ��
		
	}
	
	public void palyMusic() {
		System.out.println(">>Mp3phone-�����÷���");
	}

}
