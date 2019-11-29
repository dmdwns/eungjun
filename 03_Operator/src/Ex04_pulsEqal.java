
public class Ex04_pulsEqal {
	//int num0; 이 사이에 쓰면 자동 초기화 된다

	public static void main(String[] args) {
		// 대입연산자 : =, +=, -=, /=, %=
		// 사용형태 : 저장할변수명 대입연산자 저장할값(숫자) 또는 변수
		// 예) num += 2;
		
		int result = 0;
		System.out.println("result: " + result);
		result += 15; // result = result + 15;
		System.out.println("result +=: " + result);
		result += 15; // result = result + 15;
		System.out.println("result += 두번한거: " + result);
		System.out.println(); // 빈줄 하나 추가
		
		result -= 10; // result = result - 10; 
		System.out.println("result -=: " + result);
		System.out.println();
		
		result *= 10; // result = result * 10;
		System.out.println("result *=: " + result);
		System.out.println();
		
		result /= 30; // result = result / 10;
		System.out.println("reuslt /= " + result);
		System.out.println();
		
		result = 10;
		System.out.println("result= " +result);
		result %= 3; result = result % 10;
		System.out.println("reuslt %= " + result);
		
		//-------------------------------------------------
		
		System.out.println("---------------------------");
		int num1 = 10;
		int num2 = 20;
		result = 0;
		System.out.println("num1: " +num1);
		System.out.println("num2: " +num2);
		System.out.println("result: " +result);
		
		result += num2; // result= result + num2;
		System.out.println("result += " +result);
		
		result -= num1; // result= result - num1;
		System.out.println("result -= " +result);
		
		result += num2; // result= result + num2;
		System.out.println("result += " +result);
		
	}

}























