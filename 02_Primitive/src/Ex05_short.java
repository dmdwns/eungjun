
public class Ex05_short {

	public static void main(String[] args) {
		// ������ short : 2 byte(����: 65536, ���� : -32768 ~ 32767)
		short short1 = 20000;
		short short2 = 30000;
		System.out.println("short1 : " + short1);
		System.out.println("short2 : " + short2);
		
		//ǥ�������� ����� ��ġ�ʴ� ������� ����
		short sum = (short)(short1 + short2);
		System.out.println("short sum : " + sum);
		
		int sumInt = short1 + short2;
		System.out.println("int sumInt : " + sumInt);
		
		System.out.println("---- short Ÿ�� �ּ�, �ִ밪 ---");
		System.out.println("short �ּҰ� : " + Short.MIN_VALUE);
		System.out.println("short �ִ밪 : " + Short.MAX_VALUE);
	}

}



