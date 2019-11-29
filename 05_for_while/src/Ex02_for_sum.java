
public class Ex02_for_sum {

	public static void main(String[] args) {
		// 문제 : 1~10까지의 합계를 구하시오
		// 1~10까지의 합계 : 55
		int sum = 1+2+3+4+5+6+7+8+9+10;
		System.out.println("1~10까지의 합계 : "+ sum);
		System.out.println("---------");

		// 문제 : 1 ~ 1000 까지의 합계 구하시오
		sum = 0;
		int num = 1;
		for (int i = 1; i <= 1000; i++) {
			sum += num; //sum = sum + num;
			num++; //num = num + 1;
		}
		System.out.println(">>> 1~1000까지의 합계: "+ sum);
		System.out.println("----------");
		
		sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum += i;
			//System.out.println("i: " + i + ", sum: " + sum);
		}
		System.out.println(">>> 1~1000까지의 합계: "+ sum);
		System.out.println("----------");
		
		//--------------------------
		/* 문제 : 10 ~ 1 까지의 숫자 출력(for문 사용)
		10
		9
		8
		...
		2
		1
		***********/
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("-------------");
		num = 10;
		for (int i = 11; i <= 20; i++) {
			System.out.println(num);
			num = num - 1; //num--; 
		}
		
		/* 문제 : 1 ~ 10 까지의 숫자 중 짝수 출력(2,4,6,8,10)
		2
		4
		6
		8
		10
		*************/
		System.out.println("------------");
		for (int i = 2; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println("\n----------"); //줄바꿈 후 출력
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		/* 문제 : 1 ~ 10 까지의 숫자 중 홀수 출력(1,3,5,7,9)
		1
		3
		5
		7
		9
		*************/
		System.out.println("==== 홀수 출력 =========");
		for (int i = 1; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println("\n----------"); //줄바꿈 후 출력
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

}







