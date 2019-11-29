
public class Ex02_array2 {

	public static void main(String[] args) {
		/* ���� : 1~10������ ���� �迭�� ����(�ݺ������)�ϰ�
		         �迭�� �ִ� ����Ÿ�� ���
		������� : ������[�ε�����ȣ] : ��
		num[0] : 1
		num[1] : 2
		------------------ */
		//int Ÿ�� �迭 ����(ũ�� 10��)
		//      �ε��� 0  1  2  3  4  5  6  7  8  9
		//int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[] num = new int[10];
		
		//�迭�� ���� ����(1, 2, 3, ..., 9, 10) - �ݺ������
		//num[0] = 1;
		//num[1] = 2;
		//num[2] = 3;
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		
		//�迭�� �ִ� ��(����Ÿ) ��� -�ݺ������
		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "] : " + num[i]);
		}
		//----------------------------
		System.out.println("======================");
		//�迭�� �ʱ�ȭ
		for (int i = 0; i < num.length; i++) {
			num[i] = 0;
		}
		
		//5���� ����Ÿ�� ���� (11~15) ���� �ϰ� ���
		int value = 11;
		for (int i = 0; i < 5; i++) {
			num[i] = value;
			value++;
		}
		
		//�迭�� �ִ� ��(����Ÿ) ��� -�ݺ������
		for (int i = 0; i < num.length; i++) {
			System.out.println("num[" + i + "] : " + num[i]);
		}
		dispData(num); //�޼ҵ� ȣ��� - num �μ�, �Ű����� ��
		
	}
	
	//�޼ҵ�, �޼���(method)
	static void dispData(int[] arr) { //�Ű����� int[] ���� ����
		System.out.println("==== �迭 ����Ÿ ��� ===");
		for (int i = 0; i < arr.length; i++) {
			System.out.println( i + " : " + arr[i]);
		}
		System.out.println("--------------------------");
	}
	
	

}






