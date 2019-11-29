
public class Exam01 {

	public static void main(String[] args) {
		/* (실습1) 숫자 3개 중 가장 큰 수를 구하시오
		a: 30, b: 60, c: 20
		<결과>
		가장큰수 : 60
		**************************/
		int a = 30;
		int b = 60;
		int c = 20;
		
		if (a > b) {
			if (a > c) {
				System.out.println("가장큰수 : " + a);
			} else {
				System.out.println("가장큰수 : " + c);
			}
		} else {
			if (b > c) {
				System.out.println("가장큰수 : " + b);
			} else {
				System.out.println("가장큰수 : " + c);
			}
		}
		System.out.println("--------------");
		int max = Integer.MIN_VALUE; //저장할 수 있는 가장 작은 수
		if (a > max) max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		System.out.println("가장큰수 : " + max);
		System.out.println("--------------");
		
		max = a; 
		if (b > max) max = b;
		if (c > max) max = c;
		System.out.println("가장큰수 : " + max);
		System.out.println("--------------");
		
		/* (실습2) 숫자 5개 중 가장 큰 수를 구하시오
		a: 30, b: 60, c: 20, d: 15, e: 70
		<결과>
		가장큰수 : 70
		**************************/
	}

}
