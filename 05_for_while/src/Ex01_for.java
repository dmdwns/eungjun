
public class Ex01_for {

	public static void main(String[] args) {
		// ��� - �ݺ���(for, while, do ~ while)
		// for (�ʱⰪ����; ����(����)����; ��������) {}
		// ����(����)���� ������� true�� �� ���๮ ó��
		// for (; ;) {} //���ѹݺ�
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		System.out.println("*");
		
		System.out.println("--------------");
		//  �ʱⰪ����; ���ǽ� ; ��������
		for (int i = 1; i <= 5; i++) {
			System.out.println("*"); //5�� ����
		}
		
		System.out.println("---------");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i); //5�� ����
		}
		
		System.out.println("---------");
		for (int i = 1; i <= 10; i += 2) { //1���� 10���� 2�� �����ϸ鼭
			System.out.println(i);
		}
		
		System.out.println("---------");
		//(����)for �ݺ��� ���� ���๮���� �ݺ����� ���� ���� ����(���ض�)
		for (int i = 1; i <= 10; i++) {
			System.out.println("�ݺ����� i : " + i);
			i++; //for �� ������ �ݺ����� �� ������ ���� ����
		}
		
		System.out.println("--------");
		for (int i = 10; i >= 1; i--) {
			System.out.println("�ݺ����� i : " + i);
		}
		System.out.println("--------");
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("*****");
		}
		
		System.out.println("==========================");
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
		System.out.println("-----");
		int num = 1;
		System.out.println(num); //num : 1
		num++; //num : 2
		System.out.println(num); //num : 2
		num++; //num : 3
		System.out.println(num); //num : 3
		num++;
		
		System.out.println("=============");
		num = 1;
		for (int i = 1; i <= 5; i++) { //5�� �ݺ�
			System.out.println("num : " + num);
			System.out.println("�ݺ����� i : " + i);
			num++;
		}
		System.out.println("--------------");
		for (int i = 1; i <= 1000; i++) {
			System.out.println(i);
		}
		
		//=========================================
		
	}

}








