
public class Ex01_if {

	public static void main(String[] args) {
		/* ���-�б⹮(�񱳹�) : if��
		if (���ǹ�) {
			������ ����(��); <- ���ǹ��� ����� ��(true)�� ��
		}
		*/
		int num1 = 30;
		int num2 = 20;

		System.out.println(">> ���۾� ��");
		if (num1 < num2) {
			System.out.println("num1�� num2���� �۴�.");
		}
		System.out.println(">> ���۾� ��");
		
		System.out.println("=========================");
		/* ������ ���� �� ��� ���
		90 ~ 100 : ���
		80 ~ 89 : ��ȣ
		70 ~ 79 : ����
		60 ~ 69 : ����
		0 ~ 59 : ����
		--�������
		���� : 90
		�򰡰�� : ���
		*/
		System.out.println("--- �� ��� --");
		int jumsu = 80;
		System.out.println("���� : " + jumsu);
		
		if (jumsu >= 90 && jumsu <= 100) {
			System.out.println("�򰡰�� : ���");
			System.out.println("90�̻��϶��� ����");
		}
		if (jumsu >= 80 && jumsu <= 89) {
			System.out.println("�򰡰�� : ��ȣ");
		}
		if (jumsu >= 70 && jumsu < 80) {
			System.out.println("�򰡰�� : ����");
		}
		if (jumsu >= 60 && jumsu < 70) {
			System.out.println("�򰡰�� : ����");
		}
		if (jumsu >= 0 && jumsu < 60) {
			System.out.println("�򰡰�� : ����");
		}
		
		System.out.println(">> ����ó�� ��");
	}

}











