
public class Ex03_char {

	public static void main(String[] args) {
		// ������(char) : 2 byte ���, ���� 1���� ����(0~65535)
		// �ڹ� ����ó�� ����� �����ڵ�(Unicode) ����
		char char1 = 'A'; //"A"�� ���ڿ�(String), 'A'�� ����(char)
		System.out.println("char1 : " + char1); //A
		System.out.println("char1 �������� : " + (char1 + 1));
		System.out.println("char1 �������� : " + (char)(char1 + 1)); //65+1 -> 66 -> char ��ȯ     

		char char2 = '��';
		System.out.println("char2 : " + char2);
		
		char char3 = '\uAC00'; //�����ڵ� ��� ǥ��
		System.out.println("char3 : " + char3);
		
		System.out.println("--------");
		System.out.println("char1 : " + char1);
		char1 = (char)(char1 + 1); // char <- (char)int ����ȯó��
		System.out.println("char1(������) : " + char1);
	}

}





