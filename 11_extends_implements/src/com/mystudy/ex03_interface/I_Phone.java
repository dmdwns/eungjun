package com.mystudy.ex03_interface;

//�������̽� : �߻�ü
public interface I_Phone {
	//{} ���� : �߻�޼ҵ�(abstract method)
	//public abstract �޼ҵ���
	public abstract String getType();
	public String getPhoneNo(); //abstract ��������
	
	void call(); //public abstract ��������
	void receiveCall(); //public abstract ��������
	void view(); //public abstract ��������
	
	void sendMsg();
	void receiveMsg();
}






