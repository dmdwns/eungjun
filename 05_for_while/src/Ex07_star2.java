
public class Ex07_star2 {

	public static void main(String[] args) {
		/* �����(�����ﰢ��)
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
		int cnt = 1; // * ��� ����
		for (int line = 1; line <= 5; line++) {
			for (int star = 1; star <= cnt; star++) {
				System.out.print("*");
			}
			System.out.println();
			cnt++; 
		}
		
		//===================================
		System.out.println("==============");
		/* �����(�����ﰢ��)
		 *     1 ���� : * 1��
		 **    2 ���� : * 2��
		 ***   3 ���� : * 3��
		 ****  4 ���� : * 4��
		 ***** 5 ���� : * 5��
		*/
		for (int line = 1; line <= 5; line++) {
			for (int star = 1; star <= line; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}







