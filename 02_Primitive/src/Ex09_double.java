
public class Ex09_double {

	public static void main(String[] args) {
		// �Ǽ��� double : 8 byte
		// ǥ������ : ����.����   / ����.���� + D �Ǵ� d
		double d1 = 1.1;
		double d2 = 1.12345678901234567890d;
		System.out.println("double 1.1 : " + d1);
		System.out.println("double 1.12345678901234567890d : " + d2);
		
		double sum = d1 + d2;
		System.out.println("d1 + d2 : " + sum);
		
		System.out.println("3.4f + 3.2f : " + (3.4f + 3.2f));
		System.out.println("3.4d + 3.2d : " + (3.4d + 3.2d));
		
		System.out.println("=========================");
		float f1 = 3.4f;
		d1 = f1; //double <- float : �ڵ�����ȯ
		
		//������ <-> �Ǽ��� : �ڵ�����ȯ �������δ� ǥ������
		//int, long -> float, double : �ڵ�����ȯ �����ϳ� ���� ����
	}

}






