
public class Ex10_array2dim_exam_191011 {

	public static void main(String[] args) {
		//2���� �迭�� ����� ���� ó��
				//�ǽ�����. 
				//  ����, ����, ���� ���� 3���� ������ 2���� �迭(sungjuk) �����
				//  ������ �Է��ϰ� ���κ� ������ ����� ��� �Ͽ� ȭ�鿡 ������ ���
				/*
					����   ����  ����   ����     ���
					--------------------------
					100  90  80  270   90.0
					100  90  81  271   90.33
					95   85  77  257   85.66
					--------------------------
				*/
		
		int[][] sungjuk={{100,90,80},{100,90,81},{95,85,77}};//���� 2���� �迭 ����
		String[] name= {"����","����","����","����","���"};//����, ����, ��� ������ �迭 ����
		for(int i=0; i<name.length; i++) {
			System.out.print(name[i] + "\t");//����, ����, ��� ���
		}
		//�����м� ���
		System.out.println();
		System.out.println("-----------------------------------");
		//����, ����, ��� ���
		for(int i=0; i<sungjuk.length; i++) {
			int sum=0;
			for(int j=0; j<sungjuk[i].length; j++) {
				sum = sum + sungjuk[i][j]; //���� ���ϱ� ���� ����
				System.out.print(sungjuk[i][j] + "\t");//���� ���� ���
			}
			System.out.println(sum + "\t" + sum/sungjuk[i].length);//��� ���
		}
		//�Ʒ����м� ���
		System.out.println("-----------------------------------");
		//��.
	}

}












