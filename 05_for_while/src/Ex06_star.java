
public class Ex06_star {

	public static void main(String[] args) {
		/* �����
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
		
		System.out.println("==== ���� for�� ====");
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
		// �����
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
				System.out.print("*"); //5�� �ݺ�
			}
			System.out.println();
		}

	}

}




