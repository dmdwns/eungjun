
public class Ex04_switch_case {

	public static void main(String[] args) {
		// switch case�� : ����񱳱���
		/*
		switch (�񱳱��ذ�) {
		case �񱳰�1 :
			������ ����(��);
			break;
		case �񱳰�2 :
			������ ����(��);
			break;
		...
		default :
			������ ����(��);
			break;
		}	
		*/
		int month = 6;
		
		switch (month) {
		case 1 :
			System.out.println("31�ϱ��� �ֽ��ϴ�");
			break;
		case 2 :
			System.out.println("28�� �Ǵ� 29�ϱ��� �ֽ��ϴ�");
			break;
		case 3 :
			System.out.println("31�ϱ��� �ֽ��ϴ�");
			break;
		case 4 : case 6: 
			System.out.println("30�ϱ��� �ֽ��ϴ�");
			break;
		default : 
			System.out.println("��ġ�ϴ� ���� �����ϴ�.");
			break;
		}
		System.out.println(">> switch ��");
		
		//---------------------------
		System.out.println("-----------------");
		switch (month) {
		case 1:
		case 3:
		case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�");
			break;
		case 2 :
			System.out.println(month + "���� 28�� �Ǵ� 29�ϱ��� �ֽ��ϴ�");
			break;
		case 4 : case 6: case 9: case 11: 
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�");
			break;
		default : 
			System.out.println("��ġ�ϴ� ���� �����ϴ�.");
			break;
		}
		
		//--------------------
		System.out.println("===================");
		/* ��ǰ ��÷ ����� ���� ��ǰ ����
		1�� : �����, 2��: ��ġ�����, 3��: ��Ź��, 4��: û�ұ�
		����� �ش����� ������(���� ���) : ����
		*/
		String result = "1��";
		System.out.println("��÷��� : " + result);
		String resultMsg = "";
		switch (result) {
			case "1��":
				//System.out.println("��ǰ: �����");
				resultMsg = "�����";
				break;
			case "2��":
				//System.out.println("��ǰ: ��ġ�����");
				resultMsg = "��ġ�����";
				break;
			case "3��":
				System.out.println("��ǰ: ��Ź��");
				break;
			case "4��": //4���� û�ұ� + ���� ����
				System.out.println("��ǰ: û�ұ�, ����");
				break;
			default :
				System.out.println("��ǰ: ����");
				break;
		}
		
		//��÷��� ���
		System.out.println("��÷��� " + result + " ��ǰ�� " 
				+ resultMsg + " �Դϴ�");
		
	}

}









