
public class Ex06_int {

	public static void main(String[] args) {
		// ������ int : 4 byte, ����(-2,147,483,648 ~ -2,147,483,647)
		int num1 = 70000;
		int num2 = 30000;
		int sum = num1 + num2;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println(num1 + " + " + num2 + " = " + sum);
		System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		
		// % ������ : ������ ���� �� ���� ������ ���� ����
		System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
		
		//------------------
		// 0���� ������ ���(100 / 0) : ���ܹ߻� ArithmeticException: / by zero
		int num3 = 0;
		//System.out.println(num1 / num3);
		
		
		System.out.println("--- int Ÿ�� �ּ�/�ִ밪 ---");
		System.out.println("int �ּҰ� : " + Integer.MIN_VALUE);
		System.out.println("int �ִ밪 : " + Integer.MAX_VALUE);
		
		System.out.println("--- main() �� ---");
		
	}

}






