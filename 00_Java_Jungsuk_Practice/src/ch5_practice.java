
public class ch5_practice {

	public static void main(String[] args) {
		System.out.println("[��������5-4]");
		//���� 2���� �迭�� ��� ���հ� ����� ���϶�
		int[][] arr = {
				{5, 5, 5, 5, 5},
				{10, 10, 10, 10, 10},
				{20, 20, 20, 20, 20},
				{30, 30, 30, 30, 30}
		};
		int tot = 0;
		float avg = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				tot += arr[i][j];
			}
		}
		avg = tot / (float)(arr.length * arr[0].length);
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);
		
		System.out.println("[��������5-6]");
		//�Ž������� �� ���� �������� ������ �� �ִ����� ���
		//���� money�� �ݾ��� �������� �ٲپ��� �� ���� �� ���� ������ �ʿ����� ����ؼ� ���
		//������ ���� ���� �������� �Ž��� �����
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "�� : " + money/coinUnit[i]);
			money = money%coinUnit[i];//���� ������=�Ž�������ϴ� ��
		}
		
		System.out.println("[��������5-7]");//���� ���ؾȵ�
		//5-6����
		//������ ������ ������ �Ž������� ������ �� ������ '�Ž��� ���� �����մϴ�' ���
		//������ ���� ������ �Ž������� ������ ��ū ���� ������ ���� ���� ������ ������ ȭ�鿡 ���
		int[] coin = {5, 5, 5, 5};
		for(int i = 0; i < coinUnit.length; i++) {
			int coinNum = 0;
			//�ݾ��� ���������� ������ �ʿ��� ������ ������ ���Ѵ�
			coinNum = money / coinUnit[i];
			//�迭coin���� coinNum��ŭ�� ������ ����.
			//����� ������ ���ٸ� �迭 coin�� �ִ� ��ŭ ����.
			if(coin[i] >= coinNum) {
				coin[i] -= coinNum;
			} else {
				coinNum = coin[i];
				coin[i] = 0;
			}
			//�ݾ׿��� ������ ������ ���������� ���� ���� ����.
			money -= coinNum * coinUnit[i];
			
			System.out.println(coinUnit[i] + "��: " + coinNum);
		}
		if(money > 0) {
			System.out.println("�Ž������� �����մϴ�");
			System.exit(0);
		}
		System.out.println("���� ������ ����");
		for(int i = 0; i < coinUnit.length; i++) {
			System.out.println(coinUnit[i] + "��:" + coin[i]);
		}
		
	}

}





















