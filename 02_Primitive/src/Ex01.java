/** �����ۼ��� �ּ�
 * 
 * @author bitcamp
 *
 */
/* �ּ���(������ �ּ�ó��)
����Ģ(�ݵ�� ��ų ��) - Ŭ������ �ۼ� ��Ģ
 - ������ҹ���, ����, Ư������(_, $) ���
 - ��ҹ��� ���л��(Hello, HELLO, HeLLo - 3���� �̸�), 
 - ���� ���� ���� 
 - �����(Ű����) ���ȵ�
 - ���ڷ� ���� �ȵ�(Ex01 ���, 01Ex �ȵ�)
 
����Ģ(�����ڵ� ���� ���)
 - Ŭ����(�������̽�)����  ù���ڴ� �빮�ڷ� ���� �Ѵ�
 - ���մܾ��� ��� �ܾ��� ù���ڸ� �빮�ڷ� �ۼ�(HelloWorld)
 - ������, �޼ҵ���� �ҹ��ڷ� �����Ѵ�.
 - ������� ��ü �빮�ڷ� �ۼ��ϰ� ���վ��� ������ �����(_) ���
   (PI, MAX_NUMBER)
*/
// �ּ���(���� �ּ�ó��)
public class Ex01 {
	
	public static void main(String[] args) {
		System.out.println("Hello World~~");
		System.out.println("�����: " + 1 + 2);
		System.out.println("�����: " + (1 + 2));
		System.out.println("�����: " + 1 * 2);
		System.out.println("�����: " + (1 - 2));
		
		System.out.println("\"�ȳ��ϼ���\""); // "�ȳ��ϼ���~~"
		System.out.println("\\�ȳ��ϼ���\\");
		System.out.println("'�ȳ��ϼ���'");
		System.out.println("---------");
		
		System.out.println("ȫ�浿��!");
		System.out.println("�ݰ����ϴ�.");
		System.out.println("---------");
		
		System.out.println("ȫ�浿��!\n�ݰ����ϴ�."); //n : new line
		System.out.println("ȫ�浿��!\t�ݰ����ϴ�.");
		
		//----------------------------
		//����(variable)�� ����
		//����ŸŸ�� ������;
		//������ = ��;
		//---
		//����ŸŸ�� ������ = ��(�ʱⰪ);
		System.out.println("==========");
		String str1; //str1 ���� ����
		str1 = "ȫ�浿��!";
		String str2 = "�ݰ����ϴ�";
		System.out.println(str1 + str2);
	}
}









