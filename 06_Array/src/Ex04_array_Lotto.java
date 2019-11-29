
public class Ex04_array_Lotto {

	public static void main(String[] args) {
		int a = 100;
		int b = 999;
		int temp = 0;
		//a와 b의 값을 서로 교환 하시오(바꾸시오)
		System.out.println("a: " + a + ", b: " + b);
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a: " + a + ", b: " + b);
		
		//===============================
		/* 로또 번호 만들기
		1. int 타입의 숫자 45개의 숫자를 저장할 배열타입 변수 선언(balls)
		2. 초기화 : 1~45까지의 숫자(번호)를 입력
		3. 많이 섞고(충분히 많이)
		4. 6개 번호 추출(앞에서 순서대로)
		================================*/
		//1. int 타입의 숫자 45개의 숫자를 저장할 배열타입 변수 선언(balls)
		int[] balls = new int[45];
		
		//2. 초기화 : 1~45까지의 숫자(번호)를 입력
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		System.out.println("--- 초기화 결과 확인 ----");
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		
		System.out.println("---- Math.random() 이용 ------");
		//3. 많이 섞고(충분히 많이)
		//Math.random() : 0.00000.. ~ 0.9999999999..
		//(int)(Math.random() * 45) : 0 ~ 44 까지의 랜덤한 숫자 생서
		//System.out.println((int)(Math.random() * 45));
		int rNum = (int)(Math.random() * 45);
		System.out.println("변경전 0 : " + balls[0] + ", "
				+ rNum + " : " + balls[rNum]);
		
		//balls[0] <-> balls[rNum]
		temp = balls[0];
		balls[0] = balls[rNum];
		balls[rNum] = temp;
		
		System.out.println("변경후 0 : " + balls[0] + ", "
				+ rNum + " : " + balls[rNum]);
		
		//충분히 많이 섞고 : 0번인덱스값(첫번째 값)과 임의의 위치 값 맞교환
		for (int i = 0; i < 100000; i++) {
			rNum = (int)(Math.random() * 45);
			temp = balls[0];
			balls[0] = balls[rNum];
			balls[rNum] = temp;
		}

		System.out.println("----- 섞은 결과 확인 -----");
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		
		//4. 6개 번호 추출(앞에서 순서대로)
		System.out.println(">>> 로또 추첨 결과(1등)");
		for (int i = 0; i < 6; i++) {
			System.out.print(balls[i] + " ");
		}
	}

}






