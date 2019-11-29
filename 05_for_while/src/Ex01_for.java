
public class Ex01_for {

	public static void main(String[] args) {
		// 제어문 - 반복문(for, while, do ~ while)
		// for (초기값설정; 실행(종결)조건; 증감설정) {}
		// 실행(종결)조건 결과값이 true일 때 실행문 처리
		// for (; ;) {} //무한반복
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		
		System.out.println("--------------");
		//  초기값설정; 조건식 ; 증감설정
		for (int i = 1; i <= 5; i++) {
			System.out.println("*"); //5번 실행
		}
		
		System.out.println("---------");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i); //5번 실행
		}
		
		System.out.println("---------");
		for (int i = 1; i <= 10; i += 2) { //1부터 10까지 2씩 증가하면서
			System.out.println(i);
		}
		
		System.out.println("---------");
		//(주의)for 반복문 내의 실행문에서 반복인자 값을 변경 자제(피해라)
		for (int i = 1; i <= 10; i++) {
			System.out.println("반복인자 i : " + i);
			i++; //for 문 내에서 반복인자 값 변경은 하지 말것
		}
		
		System.out.println("--------");
		for (int i = 10; i >= 1; i--) {
			System.out.println("반복인자 i : " + i);
		}
		System.out.println("--------");
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("*****");
		}
		
		System.out.println("==========================");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		System.out.println("-----");
		int num = 1;
		System.out.println(num); //num : 1
		num++; //num : 2
		System.out.println(num); //num : 2
		num++; //num : 3
		System.out.println(num); //num : 3
		num++;
		
		System.out.println("=============");
		num = 1;
		for (int i = 1; i <= 5; i++) { //5번 반복
			System.out.println("num : " + num);
			System.out.println("반복인자 i : " + i);
			num++;
		}
		System.out.println("--------------");
		for (int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
		
		//=========================================
		
	}

}








