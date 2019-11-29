
public class Ex06_array_copy {

	public static void main(String[] args) {
		// �迭 ���� 
		int[] num1 = new int[5];
		int[] num2 = new int[5];
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		num1[0] = 10;
		num1[1] = 20;
		num1[2] = 30;
		num1[3] = 40;
		num1[4] = 50;
		System.out.print("num1 : ");
		printData(num1);
		System.out.print("num2 : ");
		printData(num2);
		
		System.out.println("===== �迭����(�ּҰ�����/��������) ===");
		//���1 : �ּҰ� ����
		num2 = num1; //���� ����Ÿ ����(����Ÿ�� �ϳ��� ����)
		num2[0] = 999;
		System.out.print("num1 : ");
		printData(num1);
		printData("num2", num2);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		
		System.out.println("===========================");
		System.out.println("=== �迭�� ����(�������� ����/��������(deep copy))");
		int[] num3 = new int[5];
		printData("num3", num3);
		
		//����Ÿ���� : num3 <- num1
		for (int i = 0; i < num1.length; i++) {
			num3[i] = num1[i];
		}
		System.out.println(">>> num3 <- num1 ������");
		printData("num3", num3);
		System.out.println("num1�� �ּ� : " + num1);
		System.out.println("num3�� �ּ� : " + num3);
		
		num1[0] = 888;
		System.out.println("--- num1[0] = 888 ������ ---");
		printData("num1", num1);
		printData("num2", num2);
		printData("num3", num3);
		
		num3[1] = 777;
		System.out.println("--- num3[1] = 777 ������ ---");
		printData("num1", num1);
		printData("num2", num2);
		printData("num3", num3);
		
		System.out.println("============================");
		System.out.println("--- System.arraycopy() ----");
		int[] num4 = new int[5];
		printData("num4", num4);
		
		//System.arraycopy(src, srcPos, dest, destPos, length);
		//System.arraycopy(�ҽ���ü, ������ġ, ���ü, ��������ġ, ũ��)
		System.arraycopy(num3, 0, num4, 0, num3.length);
		System.out.println(">>> System.arraycopy() ������");
		printData("num4", num4);
		
		num4[num4.length - 1] = 5555; //num4�� ������ ����Ÿ ����
		System.out.println(">> num4[num4.length - 1] = 5555 ������ --");
		printData("num3", num3);
		printData("num4", num4);
		
		System.out.println("================================");
		System.out.println("=== �迭��ü.clone() ���� ====");
		int[] num5 = num4.clone();
		printData("num4", num4);
		printData("num5", num5);
		//num4, num5 : ��ü �ּҰ� Ȯ��
		
		//��� �� �� ������ ���� �� ���� ����Ÿ ��
		
		
	}//end main
	
	static void printData(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	//�޼ҵ� �����ε�(method overloading)
	static void printData(String name, int[] arr) {
		System.out.print(name + " : ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

}//end class
