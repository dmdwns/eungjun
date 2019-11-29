package com.mystudy.ex06_type_casting;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("=== Car 클래스 ===");
		Car car = new Car();
		car.type = "자동차";
		System.out.println("타입 : " + car.type);
		car.drive();
		car.stop();

		System.out.println("=== Ambulance ===");
		Ambulance am = new Ambulance();
		am.type = "구급차";
		System.out.println("타입 : " + am.type);
		am.drive();
		am.stop();
		am.siren();
		
		System.out.println("==== FireEngine ==");
		FireEngine fe = new FireEngine();
		fe.type = "소방차";
		System.out.println("타입 : " + fe.type);
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
		
		System.out.println("===================");
		Car carTemp = new Car();
		carTemp.drive();
		carTemp.stop();
		//carTemp.siren(); //undefined : Car타입에는 siren() 없음
		
		System.out.println("--- Car <- Ambulance 변경후 ---");
		//Ambulance <- (Ambulance) Car : 명시적 형변환, 강제형변환
		//am = (Ambulance) car; //작은타입 <- 큰타입 
		carTemp = am; //Car <- Ambulance : 자동형변환 처리됨
		carTemp.drive();
		carTemp.stop();
		//carTemp.siren();//undefined : Car타입에는 siren() 없음
		
		
		//앰블런스 타입으로 변경 후 사이렌 울리기
		System.out.println("---------------");
		((Ambulance)carTemp).siren(); //내부저장객체 : Ambulance 타입
		
		System.out.println("---- car.siren() ---");
		((Ambulance) car).siren(); //내부저장객체 : Car 타입
	}

}






















