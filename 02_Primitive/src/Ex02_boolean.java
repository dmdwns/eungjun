
public class Ex02_boolean {

	public static void main(String[] args) {
		//boolean : true, false ���� ����(����)
		//Ÿ�� ������ = �ʱⰪ;
		boolean bool1 = true; //���ڿ� "true"�� �ƴ�
		boolean bool2 = false;

		System.out.println("bool1 : " + bool1);
		System.out.println("bool2 : " + bool2);
		System.out.println("-----------------");
		
		bool1 = false;
		if (bool1) { //bool1 �� ���� true �� ����
			System.out.println("if�� : bool1�� ��(true)�̸� ����");
		} else { //bool1 �� ���� false �϶� ����
			System.out.println("if�� : bool1�� ����(false)�̸� ����");
		}
		
		System.out.println("--- main() �� ---");
	}
}







