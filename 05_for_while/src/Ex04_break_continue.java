
public class Ex04_break_continue {

	public static void main(String[] args) {
		// �����ɹ� : break, continue
		// break : �ݺ����� �ߴܽ�Ű�� ���� ����
		// continue : �������(���� �ݺ� ó���� ����)
		//      - �ݺ����� �� ������ �̵�
		//----------------------------
		
		// 1~10 ���� ����ϵ� 8�� ������� �� ��(continue)
		for (int i = 1; i <= 10; i++) {
			if (i != 8) {
				System.out.println(i);
			} 
		}
		System.out.println("---- continue ----");
		
		for (int i = 1; i <= 10; i++) {
			if (i == 8) continue; //���� �ݺ� ó��
			System.out.println(i);
		}
		
		System.out.println("===== break ======");
		// 1~10���� ��� �� 8�� ��� ó�� �ߴ�
		for (int i = 1; i <= 10; i++) {
			if (i == 8) break; //�ݺ����� �ߴ��ϰ� ��������
			System.out.println(i);
		}
		System.out.println(">>> break ó�� ��");
		
	}

}








