/* package ���� : �����׸������� �⺻������ ���
       ��Ű������ : java ������ �� ����(����)�� ��ġ�ϸ� �� �� �� �ۼ�
 	�ڹ�(class) ������ ��ġ�� ��Ÿ�� 
 	�Ϲ����� �ۼ� ��Ģ : ȸ���� �����θ��� �ݴ�� ��� 
 	�ۼ���) com.bitcamp.mystudy
*/
package com.mystudy;

//import ���� : �����׸������� �Ϲ������� ���
// Ŭ������ ��ġ�� ��������� �����ϴ� ����
// (java.lang ��Ű�� �̿��� ��Ű���� �ִ� Ÿ�� ���� �Ϲ������� ���)
//import java.util.*; //* : ��ǥ���ڷμ� �ǹ̻� ��� ���� ����
import java.util.Scanner;

//class ���� : �ʼ� �׸�
public class Ex01_package_import_class {

	public static void main(String[] args) {
		System.out.println("Hello World~");
		//java.util.Scanner scan = new java.util.Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		System.out.print(">> �λ縻 : ");
		String hello = scan.nextLine();
		System.out.println("�λ縻 ��� : " + hello);
	}

}







