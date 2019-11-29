package com.mystudy.ex01_instanceof;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== Car ====");
		Car car = new Car();
		car.drive();
		car.stop();
		
		System.out.println("=== Ambulance ===");
		Ambulance am = new Ambulance();
		am.drive();
		am.stop();
		am.siren();
		
		System.out.println("=== FireEngine ===");
		FireEngine fe = new FireEngine();
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
		
		System.out.println("===== CarŸ�Կ� �ڳ�Ÿ�� ���� ��� =====");
		Car carTemp = new Car();
		carTemp.drive();
		carTemp.stop();
		
		//Car <= Ambulance : Super <- sub(�ڵ�����ȯ)
		carTemp = am;
		carTemp.drive();
		carTemp.stop();
		System.out.println("---- Am <- Car <- Am -----");
		((Ambulance)carTemp).siren();
		
		System.out.println("---- Fe <- Car <- Am -----");
		System.out.println("--- �������� �ҹ����� �ٲٰ� ���̷� �︮�� �õ� ---");
		//����� ���� �߻� ClassCastException
		//((FireEngine)carTemp).water();
		//((FireEngine)carTemp).siren();
		
		System.out.println("----- Car Ÿ�Կ� ����� ��ü�� Ÿ�� Ȯ�� ---");
//		carTemp = new Car();
//		carTemp = am; //Car <== Ambulance
		carTemp = fe; //Car <== FireEngine
		
		System.out.println("--- Object Ÿ���� ��� ---");
		if (carTemp instanceof Object) {
			System.out.println("Object Ÿ�� �Դϴ�.");
		}
		
		System.out.println("--- Car Ÿ���� ��� ---");
		if (carTemp instanceof Car) {//Car Ÿ���� ��ü(instance)��?
			carTemp.drive();
			carTemp.stop();
		}
		
		System.out.println("--- Ambulance �� ��� ---");
		if (carTemp instanceof Ambulance) {
			carTemp.drive();
			carTemp.stop();
			((Ambulance) carTemp).siren();
		}
		
		System.out.println("--- FireEngine �� ��� ---");
		if (carTemp instanceof FireEngine) {//FireEngine Ÿ���̳�?
			carTemp.drive();
			carTemp.stop();
			((FireEngine) carTemp).siren();
			((FireEngine) carTemp).water();
		}
		
		System.out.println("=============================");
		System.out.println("--- Car Ÿ�� ���޽�(Ÿ��üũ) ---");
		typeCheck(car);
		
		System.out.println("--- Ambulance Ÿ�� ���޽�(Ÿ��üũ) ---");
		typeCheck(am);
		
		System.out.println("--- FireEngine Ÿ�� ���޽�(Ÿ��üũ) ---");
		typeCheck(fe);
	}
/*	
	//�޼ҵ� �����ε�(overloading)
	static void typeCheck(Car carTemp) {
		System.out.println("::: Car Ÿ���Դϴ� -------");
		carTemp.drive();
		carTemp.stop();
	}
	static void typeCheck(Ambulance am) {
		System.out.println("::: Ambulance Ÿ���Դϴ� -------");
		am.drive();
		am.stop();
		am.siren();
	}
	static void typeCheck(FireEngine fe) {
		System.out.println("::: FireEngine Ÿ���Դϴ� -------");
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
	}
*/
	static void typeCheck(Car carTemp) {
		System.out.println("::: Car Ÿ���Դϴ� -------");
		carTemp.drive();
		carTemp.stop();
		
		//Ÿ��Ȯ�� �� ó�� : instanceof
		//���Ұ�ü instanceof ����Ŭ������(Ÿ��)
		if (carTemp instanceof Ambulance) {
			System.out.println("::: Ambulance Ÿ���Դϴ� -------");
			((Ambulance) carTemp).siren();
		}
		if (carTemp instanceof FireEngine) {
			System.out.println("::: FireEngine Ÿ���Դϴ� -------");
			((FireEngine) carTemp).siren();
			((FireEngine) carTemp).water();
		}
	}
	

}





