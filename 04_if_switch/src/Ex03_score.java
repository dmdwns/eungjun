
public class Ex03_score {

	public static void main(String[] args) {
		/*(�ǽ�) ����ó��
		����(kor), ����(eng), ����(math) ����
		����(tot) = ���� + ���� + ����
		���(avg) = ���� / 3
		-----------------------------------
		�� : ��������� �������� ��
		90 ~ 100 : A
		80 ~ 89 : B
		70 ~ 79 : C
		60 ~ 69 : D
		60�̸�(0~59) : F �����
		===================================
		�������
		���� : 100
		���� : 90
		���� : 80
		-------------
		���� : 270
		��� : 90
		<������>
		A
		**************************************/
		// int kor=100, eng=90, math=80;
		// int kor, eng, math;
		// kor=100;
		// eng=90;
		// math=80;
		// �ؿ� ��� ������
		int kor = 100;
		int eng = 90;
		int math = 80;
		int tot = kor + eng + math ;
		int avg = tot/3;
		System.out.println(">>>if�� �̿�<<<");
		System.out.println("<�������>");
		System.out.println("���� : " +kor);
		System.out.println("���� : " +eng);
		System.out.println("���� : " +math);
		System.out.println("���� : " +tot);
		System.out.println("��� : " +avg);
		if (avg>=90 && avg<=100) {
			System.out.println("������: A");
		}
		if (avg>=80 && avg<=89) {
			System.out.println("������: B");
		}
		if (avg>=70 && avg<=79) {
			System.out.println("������: C");
		}
		if (avg>=60 && avg<=69) {
			System.out.println("������: D");
		}
		if (avg>=0 && avg<60) {
			System.out.println("������: F�����");
		}
		
		System.out.println("======================================");
		
		System.out.println(">>>else if �̿�<<<");
		if(avg>=90 && avg<=100) {
			System.out.println("������: A");
		} else if (avg>=80 && avg<=89) {
			System.out.println("������: B");
	    } else if (avg>=70 && avg<=79) {
	    	System.out.println("������: C");
	    } else if (avg>=60 && avg<=69) {
	    	System.out.println("������: D");
	    } else {
	    	System.out.println("������: F�����");
	    }
		
		System.out.println("======================================");

		
		if (avg>=90) {
			System.out.println("������: A");
			
		} else if (avg>=80) {
			System.out.println("������: B");
			
		} else if (avg>=70) {
			System.out.println("������: C");
			
		} else if (avg>=60) {
			System.out.println("������: D");
			
		} else {
			System.out.println("������: F�����");
			
		}
		
		System.out.println("======================================");
		
		
	}	

}




