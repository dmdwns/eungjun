package com.mystudy.ex06_type_casting;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("===== Car Ŭ���� =====");
		Car car=new Car();
		car.type = "�غ���";
		System.out.println("Ÿ�� : " + car.type);
		car.drive();
		car.stop();
		
		System.out.println("===== Ambulance =====");
		Ambulance am=new Ambulance();
		am.type="������";
		System.out.println("Ÿ�� : " + am.type);
		am.drive();
		am.stop();
		am.siren();
		
		System.out.println("===== FireEngine =====");
		FireEngine fe=new FireEngine();
		fe.type="�ҹ���";
		System.out.println("Ÿ�� : " + fe.type);
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
		
		System.out.println();
		System.out.println("======================");
		Car carTemp=new Car();
		carTemp.drive();
		carTemp.stop();
		//carTemp.siren(); -> ������ CarŸ�Կ��� siren() ����
		
		System.out.println("----- Car<-Ambulace ������ -----");
		//am=car; <- ũ�Ⱑ �ȸ´´�, carŸ��(�θ�)�� �� ũ��
		//am=(Ambulance)car : ����, ���������ȯ, ��������ȯ
		carTemp=am;//Car <- Ambulance : �ڵ�����ȯ ó����
		carTemp.drive();
		carTemp.stop();
		//carTemp.siren(); -> ���Ͱ������� CarŸ�Կ��� siren() ����
		
		
		//������ Ÿ������ ���� �� ���̷� �︮��
		System.out.println("---------------------");
		((Ambulance)carTemp).siren(); // �������尴ü : AmbulanceŸ��
		
		System.out.println("----- car.siren() -----");
		((Ambulance)car).siren(); // �������尴ü�� CarŸ��
	}

}













