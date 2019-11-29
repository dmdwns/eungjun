
public class Ex06_star {

	public static void main(String[] args) {
		/* 별찍기
		*****
		*****
		*****
		***************/
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("*****");
		System.out.println("--------------");
		
		for (int i = 1; i <= 3; i++) {
			System.out.println("*****");
		}
		
		System.out.println("==================");
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("*");
		}
		System.out.println();
		
		System.out.println("==== 이중 for문 ====");
		for (int line = 1; line <= 3; line++) {
			for (int i = 1; i <= 5; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 3; k++) {
				System.out.println("i: " + i + ", k: " + k);
			}
		}
		System.out.println("==============================");
		// 별찍기
		// *****
		// *****
		// *****
		for (int line = 1; line <= 3; line++) {
			System.out.println("*****");
		}
		
		System.out.println("==============");
		for (int line = 1; line <= 3; line++) {
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			System.out.print("*");
			
			System.out.println();
		}
		
		System.out.println("==============");
		for (int line = 1; line <= 3; line++) {
			for (int star = 1; star <= 5; star++) {
				System.out.print("*"); //5번 반복
			}
			System.out.println();
		}

	}

}




