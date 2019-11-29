
public class Ex03_for {

	public static void main(String[] args) {
		// 문제 : 1~10까지 숫자 중 2의 배수 출력
		// 2로 나누어 나머지가 0인 숫자는 2의 배수
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("2의배수(짝수) : " + i);
			}
		}
		
		System.out.println("----------------");
		// 문제 : 1~10까지 숫자 중 3의 배수 숫자 출력
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.println("3의배수 : " + i);
			}
		}
		System.out.println("---- 17의 배수 구하기 -----");
		// 문제 : 900 ~ 1000 까지 숫자 중 17의 배수인 숫자 출력
		for (int i = 900; i <= 1000; i++) {
			if (i % 17 == 0) {
				System.out.println("17의배수 : " + i);
			}
		}
		
		System.out.println("----- 79의 배수 ----");
		// 문제 : 2000 ~ 30000 까지 숫자 중 79의 배수인 숫자를 출력
		for (int i = 2000; i <= 300000; i++) {
			if (i % 79 == 0) {
				System.out.println("79의배수 : " + i);
			}
		}
		
		//=====================================
	}

}
