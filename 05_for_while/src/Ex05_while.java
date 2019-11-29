
public class Ex05_while {

	public static void main(String[] args) {
		// 반복문 : while
		/*
		초기값 설정문;
		while (실행조건식) {
			반복인자에 대한 증감설정(선택적);
			처리할 실행문(들);
			반복인자에 대한 증감설정(선택적);
		}
		*/
		// 1~10 출력
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("---------");
		//while문으로
		int i = 1; //초기값 설정
		while (i <= 10) { //실행여부 판단을 위한 조건식
			System.out.print(i + " ");
			i++; //증감설정
		}
		
		System.out.println("\n-------------");
		// while문으로
		i = 0;
		while (i < 10) {
			i++; //증감설정
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("===============");
		//break문 사용
		int num = 1;
		while (true) { //while 문 무한반복
			System.out.println(num);
			if (num == 100) break;
			num++;
		}
		
		System.out.println("---- continue ----");
		num = 0;
		while (num < 10) {
			num++;
			if (num == 5) continue; //전: 증감식, 후:실행문
			System.out.println(num);
		}
		System.out.println();
		
		System.out.println("===== do ~ while ======");
		/* do ~ while : 무조건 한 번은 실행됨
		초기값설정;
		do {
			증감치설정(실행문 전/후 선택적 작성)
			실행문(들);
		} while (조건식);
		*/
		// 1~10 출력(do ~ while문으로 작성)
		int doNum = 1;
		do {
			System.out.println(doNum);
			doNum++;
		} while (doNum <= 10);
		
		System.out.println("=====================");
		// 문제 : 1~10까지의 숫자 중 짝수만 출력(while문 사용)
		num = 1;
		while (num <= 10) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			num++;
		}
		
		// 문제 : 1~10까지의 합을 구하고 출력(while문 사용)
		System.out.println("------------");
		num = 1;
		int sum = 0; //합계저장용
		while (num <= 10) {
			sum = sum + num;
			num++;
		}
		System.out.println("1~10까지의 합계: " + sum);
		
		
	}

}







