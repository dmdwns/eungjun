
public class Ex08_star {

	public static void main(String[] args) {
		//�ǽ�����
		/*
		*****
		****
		***
		**
		*
		 */
		for(int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("========================");
		//�����
		//    * ��ĭ 4�� ��1�� �ٹٲ�
		//   ** ��ĭ 3�� ��2�� �ٹٲ�
		//  *** ��ĭ 2�� ��3�� �ٹٲ�
		// **** ��ĭ 1�� ��4�� �ٹٲ�
		//***** ��ĭ 0�� ��5�� �ٹٲ�
		//��ĭ�� ��� �ݺ��� ����, ����� �ݺ��� ����
	
		int spaceCnt = 4;
		int starCnt = 1;
		for(int line=1; line<=5; line++) {
			for(int space=1; space<=spaceCnt; space++) {
				System.out.print(" ");
			}
			for(int star=1; star<=starCnt; star++) {
				System.out.print("*");
			}
			System.out.println();
			spaceCnt--;
			starCnt++;
		}
		
		System.out.println("========================");
		//�����
		//***** ��ĭ 0�� ��5�� �ٹٲ�
		// **** ��ĭ 1�� ��4�� �ٹٲ�
		//  *** ��ĭ 2�� ��3�� �ٹٲ�
		//   ** ��ĭ 3�� ��2�� �ٹٲ�
		//    * ��ĭ 4�� ��1�� �ٹٲ�
		//��ĭ�� ��� �ݺ��� ����, ����� �ݺ��� ����
		int space=0;
		int star=5;
		for(int i=1; i<=5; i++) {
			for(int j=0; j<=space; j++) {
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++) {
				System.out.print("*");
			}
			System.out.println();
			space++;
			star--;
		}
		
	}

}





















