package com.mystudy.ex02_extends;
/*Ŭ���� ���(extends)�ǽ�
 �ǽ�1 : PhoneŬ���� ��� Ȯ��(extends)
 WebPhone Ŭ���� �ۼ�
 	- PhoneŬ���� ��� Ȯ���ؼ� �����
 	- ������ ����
 		*����ȣ(phoneNo)�� �޾Ƽ� ��ü(�ν��Ͻ�) ����
 		*Ÿ�� ���� "WebPhone Ÿ��" ���� �ۼ�
  	- ��� : ��ȭ�ɰ�, �ް�, ��������, ���˻�
  	- ���˻� ���
  		webSerch() : ">>WebPhone - ���˻�" ���� ȭ�� ��� 
 */

class WebPhone extends Mp3Phone {
	
	public WebPhone(String phoneNo){
		super("WebPhone Ÿ��",phoneNo);
	}
	public void Webphone() {
		System.out.println(">>WebPhone-���˻�");
	}

}
