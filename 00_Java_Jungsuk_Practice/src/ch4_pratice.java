
public class ch4_pratice {

	public static void main(String[] args) {
		System.out.println("[연습문제 4-2]");
		//1~20까지 정수 중에서 2or3의 배수가 아닌 수의 총합
		int sum = 0;
		for(int i = 1; i <= 20; i++) {
			if(i%2 != 0 && i%3 != 0) {
				sum += i;	
			}
		}
		System.out.println(sum);
		
		System.out.println("[연습문제4-3]");
		//1+(1+2)+(1+2+3)+...+(1+2+3+...+10)
		int num = 0;
		sum = 0;
		for(int i = 1; i <= 10; i++) {
			num += i;
			sum += num;
		}
		System.out.println(sum);
		
		System.out.println("[연습문제4-4]");
		//1+(-2)+3+(-4)+... 몇까지 더해야 총합이 100이상이 되는가
		num = 0;
		sum = 0;
		int buho = 1;
		for(int i = 1; sum < 100; i++, buho = -buho) {
			num = i*buho;
			sum += num;
		}
		System.out.println(sum);
		System.out.println("몇까지 더해야 총합이 100이상이 되는가 : " + num);
		
		System.out.println("[연습문제4-5]");
		//다음의 for문을 while 문으로 변경하시오
		/*
		 for(int i = 0; i <=10; i++){
		 	for(int j = 0; j <= i; j++)
		 		System.out.print("*");
		 	System.out.println();
		 }
		 }
		 }
		 */
		int i = 0;
		while(i <= 10) {
			int j = 0;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		
		System.out.println("[연습문제4-6]");
		//두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력
		//(1,5), (2,4), (3,3), (4,2), (5,1)
		for(int k = 1; k <= 6; k++)
			for(int l = 1; l <= 6; l++)
				if(k + l == 6)
					System.out.println(k + " + " + l + " = " +(k+l));
		
		System.out.println("[연습문제4-8]");
		//2x + 4y = 10 의 모든 해 구하기. x,y는 정수. 0<= x <=10, 0<= y <=10
		//(1,2),(3,1),(5,0)
		for(int x = 0; x <= 10; x++) {
			for(int y = 0; y <= 10; y++) {
				if((2*x) + (4*y) == 10) {
					System.out.println("x="+x+ ", y="+y);
				}
			}
		}
		
		System.out.println("[연습문제4-12]");
		//구구단 출력
		//단 각 단의 *3까지만 출력
		for(int k = 1; k <= 3; k++) {
			for(int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + k + "=" + (j*k));
				System.out.print("\t");
			}
			System.out.println();
			
		}
		
		
	}

}




















