
public class Ex02_if_else {

	public static void main(String[] args) {
		// if�� 3����
		// if (����) {}
		// if (����) {} else {}
		// if (����) {} else if () {} else if () {} .... else {} 
		int num1 = 30;
		int num2 = 100;
		System.out.println("num1: "+ num1 +", num2: "+ num2);
		
		//1. if (����) {}
		if (num1 > num2) {
			System.out.println("num1�� num2���� ũ��");
		}
		if (num1 <= num2) {
			System.out.println("num1�� num2���� �۰ų� ����");
		}
		System.out.println(">> if() ��");
		
		System.out.println("-----------------------");
		//2. if (����) {} else {}
		if (num1 > num2) {
			System.out.println("num1�� num2���� ũ��");
		} else {
			System.out.println("num1�� num2���� �۰ų� ����");
		}
		
		System.out.println("----------------------");
		//3. if (����) {} else if () {} else if () {} ....
		if (num1 > num2) {
			System.out.println("num1�� num2���� ũ��");
		} else { //ũ�� ����(�۰ų�, ����)
			if (num1 == num2) {
				System.out.println("num1�� num2�� ����");
			} else { //ũ���� �ʰ� ������ ����
				System.out.println("num1�� num2���� �۴�");
			}
		}
		System.out.println("------>>>>>>>");
		if (num1 > num2) { //ũ��?
			System.out.println(">> num1�� num2���� ũ��");
		} else if (num1 == num2) { //����?
			System.out.println(">> num1�� num2�� ����");
		} else { //�۳�?
			System.out.println(">> num1�� num2���� �۴�");
		}
		System.out.println("================================");
		
		/* 
		if () {
			if () {
				if () {
				} else {
				}
			}
		} else {
			if () {
			} else if () {
			} else if () {
			} else if () {
			} else {
			}
		}
		
		*/
	}

}










