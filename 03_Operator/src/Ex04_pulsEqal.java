
public class Ex04_pulsEqal {
	//int num0; �� ���̿� ���� �ڵ� �ʱ�ȭ �ȴ�

	public static void main(String[] args) {
		// ���Կ����� : =, +=, -=, /=, %=
		// ������� : �����Һ����� ���Կ����� �����Ұ�(����) �Ǵ� ����
		// ��) num += 2;
		
		int result = 0;
		System.out.println("result: " + result);
		result += 15; // result = result + 15;
		System.out.println("result +=: " + result);
		result += 15; // result = result + 15;
		System.out.println("result += �ι��Ѱ�: " + result);
		System.out.println(); // ���� �ϳ� �߰�
		
		result -= 10; // result = result - 10; 
		System.out.println("result -=: " + result);
		System.out.println();
		
		result *= 10; // result = result * 10;
		System.out.println("result *=: " + result);
		System.out.println();
		
		result /= 30; // result = result / 10;
		System.out.println("reuslt /= " + result);
		System.out.println();
		
		result = 10;
		System.out.println("result= " +result);
		result %= 3; result = result % 10;
		System.out.println("reuslt %= " + result);
		
		//-------------------------------------------------
		
		System.out.println("---------------------------");
		int num1 = 10;
		int num2 = 20;
		result = 0;
		System.out.println("num1: " +num1);
		System.out.println("num2: " +num2);
		System.out.println("result: " +result);
		
		result += num2; // result= result + num2;
		System.out.println("result += " +result);
		
		result -= num1; // result= result - num1;
		System.out.println("result -= " +result);
		
		result += num2; // result= result + num2;
		System.out.println("result += " +result);
		
	}

}























