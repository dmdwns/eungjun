
public class Ex05_while {

	public static void main(String[] args) {
		// �ݺ��� : while
		/*
		�ʱⰪ ������;
		while (�������ǽ�) {
			�ݺ����ڿ� ���� ��������(������);
			ó���� ���๮(��);
			�ݺ����ڿ� ���� ��������(������);
		}
		*/
		// 1~10 ���
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("---------");
		//while������
		int i = 1; //�ʱⰪ ����
		while (i <= 10) { //���࿩�� �Ǵ��� ���� ���ǽ�
			System.out.print(i + " ");
			i++; //��������
		}
		
		System.out.println("\n-------------");
		// while������
		i = 0;
		while (i < 10) {
			i++; //��������
			System.out.print(i + " ");
		}
		System.out.println();
		
		System.out.println("===============");
		//break�� ���
		int num = 1;
		while (true) { //while �� ���ѹݺ�
			System.out.println(num);
			if (num == 100) break;
			num++;
		}
		
		System.out.println("---- continue ----");
		num = 0;
		while (num < 10) {
			num++;
			if (num == 5) continue; //��: ������, ��:���๮
			System.out.println(num);
		}
		System.out.println();
		
		System.out.println("===== do ~ while ======");
		/* do ~ while : ������ �� ���� �����
		�ʱⰪ����;
		do {
			����ġ����(���๮ ��/�� ������ �ۼ�)
			���๮(��);
		} while (���ǽ�);
		*/
		// 1~10 ���(do ~ while������ �ۼ�)
		int doNum = 1;
		do {
			System.out.println(doNum);
			doNum++;
		} while (doNum <= 10);
		
		System.out.println("=====================");
		// ���� : 1~10������ ���� �� ¦���� ���(while�� ���)
		num = 1;
		while (num <= 10) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
			num++;
		}
		
		// ���� : 1~10������ ���� ���ϰ� ���(while�� ���)
		System.out.println("------------");
		num = 1;
		int sum = 0; //�հ������
		while (num <= 10) {
			sum = sum + num;
			num++;
		}
		System.out.println("1~10������ �հ�: " + sum);
		
		
	}

}







