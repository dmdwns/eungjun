
public class Exam01 {

	public static void main(String[] args) {
		int a=30;
		int b=60;
		int c=20;
		int d=90;
		int e=70;
		if (a>=b && a>=c && a>=d && a>=e) {
			System.out.println("����ū�� : " +a);
		} else if (b>=a && b>=c && b>=d && b>=e) {
			System.out.println("����ū��: " +b);
		} else if (c>=a && c>=b && c>=d && c>=e) {
			System.out.println("����ū��: " +c);
		} else if (d>=a && d>=b && d>=c && d>=e) {
			System.out.println("����ū��: " +d);
		} else {
			System.out.println("����ū��: " +e);
		}
		
		System.out.println("=========================");
		//array �迭 �ȹ�� ���� ī��
		int array[] = {30, 60, 20, 90, 70};
		int max = array[0]; //�ִ�
		int min = array[0]; //�ּڰ�
		for(int i=0; i<array.length; i++) {
			if(max<array[i]) {//max�� ������ array[i]�� ũ�� max = array[i]
				max = array[i];
			}
			if (min>array[i]) {//min�� ������ array[i]�� ������ min = array[i]
				min=array[i];
			}
		}
		System.out.println("�ִ� : " +max);
		System.out.println("�ּڰ� : " +min);
		
		System.out.println("===teacher's solution_01===");

	}

}













