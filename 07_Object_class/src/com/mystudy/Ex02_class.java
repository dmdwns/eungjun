package com.mystudy;

//클래스 접근제한 : public, public선언 없음(default)
class Ex02_class {
	//필드(멤버변수, 인스턴스변수, 속성-property) 선언
	int num = 111; //초기값 생략 가능
	
	//클래스변수, 스테틱(static)변수, 인스턴스(객체) 공통 변수
	static int staticNum = 222; 

	//생성자
	Ex02_class() {} //기본생성자(default Constructor) 생락 가능
	
	public static void main(String[] args) {
		//로컬변수(지역변수)
		int num1 = 200;
		int num2 = 100;
		int result = 0;
		result = num1 + num2;
		System.out.println("result : " + result);
		System.out.println("----------------");
		
		//메소드 사용(호출) : 메소드명(인수값1, 인수값2, ..., 인수값n)
		result = add(num1, num2);
		System.out.println("result(add연산결과) : " + result);
		System.out.println("======================");
		System.out.println("staticNum : " + staticNum);
		
		//static 영역에서 non-static 영역을 다이렉트로 접근 못함(사용못함)
		//System.out.println("num : " + num);
		//System.out.println("sub : " + sub(num1, num2));
		
		//----------------------------
		/* 객체생성(인스턴스 생성, 인스턴스화 한다)
		클래스타입명 변수명;
		변수명 = new 클래스명();
		클래스타입명 변수명 = new 클래스명();
		*/
		Ex02_class ex01; //변수 선언
		ex01 = new Ex02_class();
		
		//static 메소드에서 non-static 메소드 또는 필드(인스턴스변수) 사용
		//생성된 객체(인스턴스)를 통해서만 사용 가능
		System.out.println("ex01.num : " + ex01.num);
		ex01.num = 1000;
		System.out.println("ex01.num : " + ex01.num);
		result = ex01.sub(num1, num2); //객체(인스턴스)를 사용해서 접근
		System.out.println("sub 결과 : " + result);
	}
	
	/* 메소드(method) 형태
	void 메소드명() {} 
	void 메소드명(파라미터타입 변수명, ...) {} 
	리턴(데이타)타입 메소드명() {}
	리턴타입 메소드명(파라미터타입 변수명, ....) {}
	*/
	static int add(int a, int b) {
		//int result = a + b;
		//return result;
		return a + b; //리턴타입이 정해진 경우 return문 필수 작성
	}
	
	//non-static 메소드
	int sub(int a, int b) {
		return a - b;
	}

}












