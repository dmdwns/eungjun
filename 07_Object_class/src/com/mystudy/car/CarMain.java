package com.mystudy.car;

public class CarMain {

	public static void main(String[] args) {
		// Car Ŭ������ �̿��ؼ� ��ü(�ν��Ͻ�) ����
		Car car1 = new Car();
		System.out.println("�ڵ����̸�: " + car1.name);
		System.out.println("�𵨸� : " + car1.model);
		System.out.println("������ : " + car1.color);
		System.out.println("��������: " + car1.CAR_LENGTH);
		System.out.println("�����ʺ�: " + car1.CAR_WIDTH);
		System.out.println("��������� : " + car1.existAirbag);
		System.out.println("-----------");
		
		car1.name = "ó�� ������ ��";
		System.out.println("�ڵ����̸�: " + car1.name);
		car1.existAirbag = true;
		System.out.println("��������� : " + car1.existAirbag);
		
		//car1.CAR_LENGTH = 400; //final(���ó��)�� �������� ���� �Ұ�
		System.out.println("==== ��� ���(�׽�Ʈ) ===");
		car1.run(70);
		car1.stop();
		car1.back();
		car1.dispData();
		
		//------------------------------------
		System.out.println("==== car2 ���� =====");
		Car car2 = new Car("�йи�ī", "�ҳ�Ÿ", "����");
		car2.dispData(); //�ι�° ���� Car
		car1.dispData(); //ù��° ���� Car
		
		car2.run(100);
		car2.stop();
		car2.back();
		System.out.println("car2 : " + car2);
		System.out.println("car1 : " + car1);
		
		System.out.println("=============================");
		car2 = car1; //���� ��ü(�ν��Ͻ�)�� ���� - ����Ÿ ����
		System.out.println("car2 : " + car2);
		System.out.println("car1 : " + car1);
		car2.dispData(); 
		car1.dispData(); 
	}

}





