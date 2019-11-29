package com.mystudy.ex05_interface3;

//�������̽� �������
// - ������� : public static final ����
// - �߻�޼ҵ� : public abstract �޼ҵ�

//�ڹ�8(JDK8)���� �߰��� ���
// - public default �޼ҵ� : ��ɱ��� ����
// - public static �޼ҵ� : ��ɱ��� ����
interface I_Phone {
	//���ȭ�� ���� : �������̽��� ���ǵ� ��� ������ public static final ������
	public static final boolean SUCCESS_CALL = true;
	boolean FAIL_CALL = true; //public static final ��������
	
	//public abstract : �߻�޼ҵ�(abstract method)
	public abstract String getType();
	public String getPhoneNo(); //abstract ��������
	
	void call(); //public abstract ��������
	void receiveCall(); //public abstract ��������
	void view(); //public abstract ��������
	
	void sendMsg();
	void receiveMsg();
	
	//---------------------
	//public default �޼ҵ�
	public default void changNo(String PhoneNo) {
		//������ �ʿ������ �������ص� ��
	}
	
	//public static �޼ҵ�
	static void staticMethod() {
		System.out.println("I_Phone �������̽��� static �޼ҵ�~~~");
	}
}






