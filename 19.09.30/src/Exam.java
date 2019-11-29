
public class Exam {

	public static void main(String[] args) {
		/*(실습1) 숫자 3개중 가장 큰 수를 구하시오-->Exam
		a:30, b: 60, c: 20
		<결과>
		가장큰수 : 60
		*******************************/
		
		/*(실습2) 숫자 5개중 가장 큰 수를 구하시오 -->Exam01
		a:30 b:60 c:20 d:15 e:70
		<결과>
		가장큰수: 70
		*******************************/
		
		int a=30;
		int b=60;
		int c=100;
		if (a>=b && a>=c) {
			System.out.println("가장큰수 : " +a);
		} else if (b>=a && b>=c) {
			System.out.println("가장큰수 : " +b);
		} else {
			System.out.println("가장큰수 : " +c);
		}
		
		System.out.println("===teacher's solution_01===");
		if (a>b) {//a가 b보다 크면
			if (a>c) {//a가 c보다 크면
				System.out.println("가장큰수: " +a); //a가 최댓값이다
			} else {
				System.out.println("가장큰수: " +c);
			}
		} else {
			if (b>c) {
				System.out.println("가장큰수: " +b);
			} else {
				System.out.println("가장큰수: " +c);
			}
		}
		
		System.out.println("===teacher's solution_02===");
		int max = Integer.MIN_VALUE; //저장할수 있는 가장 작은수
		if (a > max) max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		System.out.println("가장큰수 : " +max);
		
		System.out.println("===teacher's solution_03===");
		max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		System.out.println("가장큰수 : " +max);
	
	
	}

}




















