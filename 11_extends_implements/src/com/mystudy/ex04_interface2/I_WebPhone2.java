package com.mystudy.ex04_interface2;

//�������̽��� ��� �޼ҵ带 ���� �����ؼ� ����� ���
public interface I_WebPhone2 {
	//I_Phone ���ǵ� �޼ҵ� --------------------
	public abstract String getType();
	public String getPhoneNo(); //abstract ��������
	
	void call(); //public abstract ��������
	void receiveCall(); //public abstract ��������
	void view(); //public abstract ��������
	
	void sendMsg();
	void receiveMsg();
	
	//I_Mp3Phone �޼ҵ� ---------------------------
	void playMusic(); //public abstract �޼ҵ�
	
	//web �˻�
	void webSearch();
}








