
public class Ex05_question {

	public static void main(String[] args) {
		//���ǿ����� or ���׿�����
		// ���� ? ���๮1 : ���๮2;
		// ���� ? true�϶� ���๮�� : false�϶� ���๮��;
		int num1 = 30;
		int num2 = 20;
		boolean isBig = true;
		isBig = num1 > num2;
		
		System.out.println("num1: " + num1 + ", num2: " + num2);
		System.out.println("num1 > num2 : " + isBig);
		
		String str = (num1 > num2) ? "num1�� ũ��" : "num1�� ũ�� �ʴ�" ;
		System.out.println("num1 > num2 �����? " + str);
		
		if (num1 > num2) { //���ǽ� ��� true�� ��� ���๮
			str = "num1�� ũ��";
		} else { //���ǽ� ��� false�� ��� ���๮
			str = "num1�� ũ�� �ʴ�";
		}
		System.out.println("num1 > num2 if�� �����? " + str);
	}

}












