
public class Exam01 {

	public static void main(String[] args) {
		/* (�ǽ�1) ���� 3�� �� ���� ū ���� ���Ͻÿ�
		a: 30, b: 60, c: 20
		<���>
		����ū�� : 60
		**************************/
		int a = 30;
		int b = 60;
		int c = 20;
		
		if (a > b) {
			if (a > c) {
				System.out.println("����ū�� : " + a);
			} else {
				System.out.println("����ū�� : " + c);
			}
		} else {
			if (b > c) {
				System.out.println("����ū�� : " + b);
			} else {
				System.out.println("����ū�� : " + c);
			}
		}
		System.out.println("--------------");
		int max = Integer.MIN_VALUE; //������ �� �ִ� ���� ���� ��
		if (a > max) max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		System.out.println("����ū�� : " + max);
		System.out.println("--------------");
		
		max = a; 
		if (b > max) max = b;
		if (c > max) max = c;
		System.out.println("����ū�� : " + max);
		System.out.println("--------------");
		
		/* (�ǽ�2) ���� 5�� �� ���� ū ���� ���Ͻÿ�
		a: 30, b: 60, c: 20, d: 15, e: 70
		<���>
		����ū�� : 70
		**************************/
	}

}
