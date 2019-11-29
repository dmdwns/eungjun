
public class Ex04_array_Lotto {

	public static void main(String[] args) {
		int a = 100;
		int b = 999;
		int temp = 0;
		//a�� b�� ���� ���� ��ȯ �Ͻÿ�(�ٲٽÿ�)
		System.out.println("a: " + a + ", b: " + b);
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a: " + a + ", b: " + b);
		
		//===============================
		/* �ζ� ��ȣ �����
		1. int Ÿ���� ���� 45���� ���ڸ� ������ �迭Ÿ�� ���� ����(balls)
		2. �ʱ�ȭ : 1~45������ ����(��ȣ)�� �Է�
		3. ���� ����(����� ����)
		4. 6�� ��ȣ ����(�տ��� �������)
		================================*/
		//1. int Ÿ���� ���� 45���� ���ڸ� ������ �迭Ÿ�� ���� ����(balls)
		int[] balls = new int[45];
		
		//2. �ʱ�ȭ : 1~45������ ����(��ȣ)�� �Է�
		for (int i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		System.out.println("--- �ʱ�ȭ ��� Ȯ�� ----");
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		
		System.out.println("---- Math.random() �̿� ------");
		//3. ���� ����(����� ����)
		//Math.random() : 0.00000.. ~ 0.9999999999..
		//(int)(Math.random() * 45) : 0 ~ 44 ������ ������ ���� ����
		//System.out.println((int)(Math.random() * 45));
		int rNum = (int)(Math.random() * 45);
		System.out.println("������ 0 : " + balls[0] + ", "
				+ rNum + " : " + balls[rNum]);
		
		//balls[0] <-> balls[rNum]
		temp = balls[0];
		balls[0] = balls[rNum];
		balls[rNum] = temp;
		
		System.out.println("������ 0 : " + balls[0] + ", "
				+ rNum + " : " + balls[rNum]);
		
		//����� ���� ���� : 0���ε�����(ù��° ��)�� ������ ��ġ �� �±�ȯ
		for (int i = 0; i < 100000; i++) {
			rNum = (int)(Math.random() * 45);
			temp = balls[0];
			balls[0] = balls[rNum];
			balls[rNum] = temp;
		}

		System.out.println("----- ���� ��� Ȯ�� -----");
		for (int i = 0; i < balls.length; i++) {
			System.out.print(balls[i] + " ");
		}
		System.out.println();
		
		//4. 6�� ��ȣ ����(�տ��� �������)
		System.out.println(">>> �ζ� ��÷ ���(1��)");
		for (int i = 0; i < 6; i++) {
			System.out.print(balls[i] + " ");
		}
	}

}






