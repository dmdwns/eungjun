
public class Ex_191002 {

	public static void main(String[] args) {
		/* char Ÿ�� ����Ÿ �����Ҽ� �ִ� �迭 ����ؼ� �迭�� '*'�� �����ϰ�, �迭�� �ִ�
		  ����Ÿ�� ����ؼ� �ﰢ�� ������� ���
		  
		  @         :�迭�� ù��° ��ġ���� ���
		  @ #       :�迭�� ù��° �ι�° ��ġ���� ���
		  @ # $
		  @ # $ %
		  @ # $ % &
		 
		 *****************************/
		char[] ch= {'@', '#', '$', '%', '&'};
		for(int i=0; i<ch.length; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print(ch[j] + " ");
			}
			System.out.println();
		}

	}

}
