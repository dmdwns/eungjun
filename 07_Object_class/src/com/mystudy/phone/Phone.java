package com.mystudy.phone;

public class Phone {
	//�ʵ庯�� ����(�ν��Ͻ� ����)
	String name; //�𵨸�
	String phoneNo; //��ȭ��ȣ
	int hsize; //����ũ��
	int vsize; //����ũ��
	boolean hasLCD; //LCD����
	
	//������
	Phone() {} //�⺻������
	Phone(String name, String phoneNo) {
		this.name = name; //this ���簴ü(�ν��Ͻ�)
		this.phoneNo = phoneNo;
	}
	
	Phone(String name, String phoneNo, boolean hasLCD) {
		this.name = name; //this ���簴ü(�ν��Ͻ�)
		this.phoneNo = phoneNo;
		this.hasLCD = hasLCD;
	}
	
	//�޼ҵ� �ۼ�
	void view() {
		System.out.println("--- ��ȭ�� ���� ---");
		System.out.println("�𵨸� : " + name);
		System.out.println("��ȭ��ȣ : " + phoneNo);
		System.out.println("����ũ�� : " + hsize);
		System.out.println("����ũ�� : " + vsize);
		System.out.println("LCD���� : " + hasLCD);
	}
	//��ȭ�ɱ�
	void call() {
		System.out.println(">> ��ȭ�ɱ�");
	}
	//��ȭ�ޱ�
	void receiveCall() {
		System.out.println(">> ��ȭ�ޱ�");
	}
	//�޽��� ������(����)
	void sendSms(String msg) {
		System.out.println("[�޽�������] " + msg);
	}
	//�޽��� �ޱ�(����)
	String receiveSms(String msg) {
		//System.out.println("[�޽�������] " + msg);
		return "[�޽�������] " + msg;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", phoneNo=" + phoneNo + ", hsize=" + hsize + ", vsize=" + vsize + ", hasLCD="
				+ hasLCD + "]";
	}
	
	
}






