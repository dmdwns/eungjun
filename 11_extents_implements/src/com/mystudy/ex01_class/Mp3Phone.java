package com.mystudy.ex01_class;

class Mp3Phone {
	private String type;
	private String phoneNo;
	
	//������
	public Mp3Phone(String phoneNo) {
		type = "Mp3phone Ÿ��";
		this.phoneNo=phoneNo;
	}
	
	public Mp3Phone(String type, String phoneNo) {
		super();
		this.type = type;
		this.phoneNo = phoneNo;
	}



	//�żҵ�
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
	
	//�����÷��� ���--------------------
	public void playmusic() {
		System.out.println(">>�����÷���~~");
	}
	

	

}







