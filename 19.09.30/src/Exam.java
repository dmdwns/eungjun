
public class Exam {

	public static void main(String[] args) {
		/*(�ǽ�1) ���� 3���� ���� ū ���� ���Ͻÿ�-->Exam
		a:30, b: 60, c: 20
		<���>
		����ū�� : 60
		*******************************/
		
		/*(�ǽ�2) ���� 5���� ���� ū ���� ���Ͻÿ� -->Exam01
		a:30 b:60 c:20 d:15 e:70
		<���>
		����ū��: 70
		*******************************/
		
		int a=30;
		int b=60;
		int c=100;
		if (a>=b && a>=c) {
			System.out.println("����ū�� : " +a);
		} else if (b>=a && b>=c) {
			System.out.println("����ū�� : " +b);
		} else {
			System.out.println("����ū�� : " +c);
		}
		
		System.out.println("===teacher's solution_01===");
		if (a>b) {//a�� b���� ũ��
			if (a>c) {//a�� c���� ũ��
				System.out.println("����ū��: " +a); //a�� �ִ��̴�
			} else {
				System.out.println("����ū��: " +c);
			}
		} else {
			if (b>c) {
				System.out.println("����ū��: " +b);
			} else {
				System.out.println("����ū��: " +c);
			}
		}
		
		System.out.println("===teacher's solution_02===");
		int max = Integer.MIN_VALUE; //�����Ҽ� �ִ� ���� ������
		if (a > max) max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		System.out.println("����ū�� : " +max);
		
		System.out.println("===teacher's solution_03===");
		max = a;
		if (b > max) max = b;
		if (c > max) max = c;
		System.out.println("����ū�� : " +max);
	
	
	}

}




















