
public class Ex04__break_contiune {

	public static void main(String[] args) {
		// �����ɹ�: break, continue
		// break: �ݺ����� �ߴܽ�Ű�� ��������
		// continue: �������(���� �ݺ� ó���� ����)
		//         -�ݺ����� �� ������ �̵�
		
		//1~10���� ��� �� 8�� ������� �� ��(continue)
		for(int i=1; i<=10; i++) {
			if(i != 8) {
				System.out.println(i);
			}
		}
		
		System.out.println("-------------------");
		for(int i=1; i<=10; i++) {
			if(i==8) {
				
			} else {
				System.out.println(i);
			}
		}
		
		System.out.println("---------continue----------");
		for(int i=1; i<=10; i++) {
			if(i==8) continue;//��Ƽ���� ������ �ݺ��� �ǳ����� ����, �ǳʶڴ�
			System.out.println(i);
		}
		
		
		System.out.println("---------break----------");
		//1~10���� �� 8�� ��� ó�� �ߴ�
		for(int i=1; i<=10; i++) {
			if(i==8) break;//�ݺ����� �ߴ��ϰ� ��������
			System.out.println(i);
		}
		System.out.println(">>>break ó����");
	}

}



















