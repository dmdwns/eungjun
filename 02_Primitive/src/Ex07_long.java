
public class Ex07_long {

	public static void main(String[] args) {
		// ������ long : 8 byte
		// ���� : ����� ū ��
		// long Ÿ�԰� ����� ǥ�� : ���� + L �Ǵ� l(���� ��ҹ��� ��)
		long num1 = 20000000000L; //long Ÿ�� ���̾� ���
		long num2 = 30000000000l;
		long sum = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println("-------------------------");

		System.out.println("--- long Ÿ�� �ּ�/�ִ밪 ---");
		System.out.println("long Ÿ�� �ּҰ� : " + Long.MIN_VALUE);
		System.out.println("long Ÿ�� �ִ밪 : " + Long.MAX_VALUE);
		
		System.out.println("===== Ÿ�� ����ȯ =====");
		byte numByte = 100; //1 byte
		short numShort = 3000; //2 byte
		int numInt = 3000000; //4 byte
		long numLong = 5000000000000000L; //8 byte
		
		numByte = (byte) numShort; //�սǹ߻� ���ɼ� ����
		System.out.println("numByte : " + numByte);
		
		numLong = numInt; //longŸ�� <- intŸ�� : �սǾ��� ����
		System.out.println("numLong : " + numLong);
	}

}




