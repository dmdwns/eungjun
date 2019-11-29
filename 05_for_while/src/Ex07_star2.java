
public class Ex07_star2 {

	public static void main(String[] args) {
		/* 별찍기(직각삼각형)
		 *
		 **
		 ***
		 ****
		 *****
		*/
		for (int star = 1; star <= 1; star++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int star = 1; star <= 2; star++) {
			System.out.print("*");
		}
		System.out.println();

		for (int star = 1; star <= 3; star++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int star = 1; star <= 4; star++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int star = 1; star <= 5; star++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("===================");
		int cnt = 1; // * 출력 갯수
		for (int line = 1; line <= 5; line++) {
			for (int star = 1; star <= cnt; star++) {
				System.out.print("*");
			}
			System.out.println();
			cnt++; 
		}
		
		//===================================
		System.out.println("==============");
		/* 별찍기(직각삼각형)
		 *     1 라인 : * 1개
		 **    2 라인 : * 2개
		 ***   3 라인 : * 3개
		 ****  4 라인 : * 4객
		 ***** 5 라인 : * 5개
		*/
		for (int line = 1; line <= 5; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}







