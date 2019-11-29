package com.mystudy.ex06_type_casting;

public class CarTest {

	public static void main(String[] args) {
		System.out.println("===== Car 클래스 =====");
		Car car=new Car();
		car.type = "붕붕이";
		System.out.println("타입 : " + car.type);
		car.drive();
		car.stop();
		
		System.out.println("===== Ambulance =====");
		Ambulance am=new Ambulance();
		am.type="구급차";
		System.out.println("타입 : " + am.type);
		am.drive();
		am.stop();
		am.siren();
		
		System.out.println("===== FireEngine =====");
		FireEngine fe=new FireEngine();
		fe.type="소방차";
		System.out.println("타입 : " + fe.type);
		fe.drive();
		fe.stop();
		fe.siren();
		fe.water();
		
		System.out.println();
		System.out.println("======================");
		Car carTemp=new Car();
		carTemp.drive();
		carTemp.stop();
		//carTemp.siren(); -> 못쓴다 Car타입에는 siren() 없다
		
		System.out.println("----- Car<-Ambulace 변경후 -----");
		//am=car; <- 크기가 안맞는다, car타입(부모)이 더 크다
		//am=(Ambulance)car : 가능, 명시적형변환, 강제형변환
		carTemp=am;//Car <- Ambulance : 자동형변환 처리됨
		carTemp.drive();
		carTemp.stop();
		//carTemp.siren(); -> 위와같은이유 Car타입에는 siren() 없다
		
		
		//엠블런스 타입으로 변경 후 사이렌 울리기
		System.out.println("---------------------");
		((Ambulance)carTemp).siren(); // 내부저장객체 : Ambulance타입
		
		System.out.println("----- car.siren() -----");
		((Ambulance)car).siren(); // 내부저장객체가 Car타입
	}

}













