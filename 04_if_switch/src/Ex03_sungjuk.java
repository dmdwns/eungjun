
public class Ex03_sungjuk {

	public static void main(String[] args) {
		/* (�ǽ�) ����ó��
		����(kor), ����(eng), ����(math) ����
		����(tot) = ���� + ���� + ����
		���(avg) = ���� / 3
		-------------------
		�� : ��������� �������� ��
		90 ~ 100 : A
		80 ~ 89 : B
		70 ~ 79 : C
		60 ~ 69 : D
		60 �̸�(0~59) : F �����
		============================
		<�������>
		���� : 100   <- kor
		���� : 90    <- eng
		���� : 80    <- math
		---------
		���� : 270   <- tot
		��� : 90    <- avg
		<�򰡰��>
		A
		*******************************/
		//int kor, eng, math;
		//int kor = 100, eng = 90, math = 80;
		//���� ����Ÿ �Է�
		int kor = 100;
		int eng = 90;
		int math = 80;
		
		System.out.println("<���� �� ���>");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("---------");
		
		int tot = kor + eng + math;
		System.out.println("���� : " + tot);
		
		int avg = tot / 3;
		System.out.println("��� : " + avg);
		
		System.out.println("<�򰡰��>");
		
		//��տ� ���� ��ó��
		String result = "";
		if (avg >= 90) {
			System.out.println("A");
			result = "A";
		} else if (avg >= 80) {
			System.out.println("B");
			result = "B";
		} else if (avg >= 70) {
			System.out.println("C");
			result = "C";
		} else if (avg >= 60) {
			System.out.println("D");
			result = "D";
		} else {
			System.out.println("F �����");
			result = "F �����";
		}
		
		//====================================
		System.out.println("===================");
		System.out.println("<���� �� ���>");
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + math);
		System.out.println("---------");
		System.out.println("���� : " + tot);
		System.out.println("��� : " + avg);
		System.out.println("<�򰡰��>");
		System.out.println(result);
		
		
	}

}












