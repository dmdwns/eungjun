
public class Ex08_float {

	public static void main(String[] args) {
		// �Ǽ��� float : 4 byte
		// �Ҽ��� ���� ����Ÿ ���� ����
		// ǥ������ : ����.���� + f �Ǵ� F
		// �Ҽ������� 6�ڸ� ������ ��Ȯ�� ����
		float f1 = 3.4f;
		float f2 = 3.2F;
		System.out.println("float 3.4f : " + f1);
		System.out.println("float 3.2f : " + f2);
		System.out.println("3.4f + 3.2f : " + (f1 + f2));
		
		System.out.println("3.4f + 3.1f : " + (3.4f + 3.1f));
		
		System.out.println("--- float Ÿ�� �ּ�/�ִ밪 ---");
		System.out.println("float �ּҰ� : " + Float.MIN_VALUE);
		System.out.println("float �ִ밪 : " + Float.MAX_VALUE);
		
		float f3 = 1123456789012345f;
		System.out.println("1123456789012345f : " + f3);

	}

}





