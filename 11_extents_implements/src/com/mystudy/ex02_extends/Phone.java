package com.mystudy.ex02_extends;

public class Phone {
	//�ʵ�(�Ӽ�) ----------
	private String type;//��ȭ�� Ÿ�� (����)
	private String phoneNo;//��ȭ��ȣ
		
		
		//������ ----------
	public Phone(String phoneNo){
		this.type="Phone Ÿ��";
		this.phoneNo=phoneNo;
	}
		
	public Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
	}


	//�żҵ�(���)----------
	public String getType() {
		return type;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
		
	//��ȭ�ɱ� ���
	public void call() {
		System.out.println(">>��ȭ�ɱ�");
	}
		
	//��ȭ�ޱ� ���
	public void receivecall() {
		System.out.println(">>��ȭ�ޱ�");
	}
		
	//��ȭ���� ����
	public void view() {
		System.out.println("Ÿ�� : " + type + " , ��ȭ��ȣ : " + phoneNo);
	}

	
}





