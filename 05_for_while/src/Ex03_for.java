
public class Ex03_for {

	public static void main(String[] args) {
		// ���� : 1~10���� ���� �� 2�� ��� ���
		// 2�� ������ �������� 0�� ���ڴ� 2�� ���
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("2�ǹ��(¦��) : " + i);
			}
		}
		
		System.out.println("----------------");
		// ���� : 1~10���� ���� �� 3�� ��� ���� ���
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.println("3�ǹ�� : " + i);
			}
		}
		System.out.println("---- 17�� ��� ���ϱ� -----");
		// ���� : 900 ~ 1000 ���� ���� �� 17�� ����� ���� ���
		for (int i = 900; i <= 1000; i++) {
			if (i % 17 == 0) {
				System.out.println("17�ǹ�� : " + i);
			}
		}
		
		System.out.println("----- 79�� ��� ----");
		// ���� : 2000 ~ 30000 ���� ���� �� 79�� ����� ���ڸ� ���
		for (int i = 2000; i <= 300000; i++) {
			if (i % 79 == 0) {
				System.out.println("79�ǹ�� : " + i);
			}
		}
		
		//=====================================
	}

}
