
public class Ex02_gt_lt {

	public static void main(String[] args) {
		// �񱳿����� : >, <, >= (ũ�ų� ����), <= (�۰ų� ����)
		//           == (����/�����ϴ�), != (���� �ʴ�, �ٸ���)
		// �񱳿����� ��� �� : true, false
		int num1 = 30;
		int num2 = 20;
		//num1 > num2 -> ??
		System.out.println(num1 > num2);
		System.out.println(num1 + " > " + num2 + " : " + (num1 > num2));
		// ctrl + alt + �Ʒ��� ����Ű : ����, ctrl + D : ���� ����
		System.out.println(num1 + " < " + num2 + " : " + (num1 < num2));
		System.out.println(num1 + " >= " + num2 + " : " + (num1 >= num2));
		System.out.println(num1 + " <= " + num2 + " : " + (num1 <= num2));
		System.out.println(num1 + " == " + num2 + " : " + (num1 == num2));
		System.out.println(num1 + " != " + num2 + " : " + (num1 != num2));
		
		System.out.println("=======================");
		boolean power = true; //������ ����
		System.out.println("power : " + power);
		power = !power; //���� ����� ���� �ƴ� ��(true <-> false)
		System.out.println("power : " + power);
		power = !power; //���� ����� ���� �ƴ� ��(true <-> false)
		System.out.println("power : " + power);
		
		System.out.println("-------------");
		power = false;
		if (power) {//power ���� true �� �� ����
			System.out.println("power���� true : ����ON ����");
		}
		if (!power) {//power ���� false �� �� ����
			System.out.println("power���� false : ����OFF ����");
		}
		
	}

}












