package com.mystudy;

//Ŭ���� �������� : public, public���� ����(default)
class Ex02_class {
	//�ʵ�(�������, �ν��Ͻ�����, �Ӽ�-property) ����
	int num = 111; //�ʱⰪ ���� ����
	
	//Ŭ��������, ����ƽ(static)����, �ν��Ͻ�(��ü) ���� ����
	static int staticNum = 222; 

	//������
	Ex02_class() {} //�⺻������(default Constructor) ���� ����
	
	public static void main(String[] args) {
		//���ú���(��������)
		int num1 = 200;
		int num2 = 100;
		int result = 0;
		result = num1 + num2;
		System.out.println("result : " + result);
		System.out.println("----------------");
		
		//�޼ҵ� ���(ȣ��) : �޼ҵ��(�μ���1, �μ���2, ..., �μ���n)
		result = add(num1, num2);
		System.out.println("result(add������) : " + result);
		System.out.println("======================");
		System.out.println("staticNum : " + staticNum);
		
		//static �������� non-static ������ ���̷�Ʈ�� ���� ����(������)
		//System.out.println("num : " + num);
		//System.out.println("sub : " + sub(num1, num2));
		
		//----------------------------
		/* ��ü����(�ν��Ͻ� ����, �ν��Ͻ�ȭ �Ѵ�)
		Ŭ����Ÿ�Ը� ������;
		������ = new Ŭ������();
		Ŭ����Ÿ�Ը� ������ = new Ŭ������();
		*/
		Ex02_class ex01; //���� ����
		ex01 = new Ex02_class();
		
		//static �޼ҵ忡�� non-static �޼ҵ� �Ǵ� �ʵ�(�ν��Ͻ�����) ���
		//������ ��ü(�ν��Ͻ�)�� ���ؼ��� ��� ����
		System.out.println("ex01.num : " + ex01.num);
		ex01.num = 1000;
		System.out.println("ex01.num : " + ex01.num);
		result = ex01.sub(num1, num2); //��ü(�ν��Ͻ�)�� ����ؼ� ����
		System.out.println("sub ��� : " + result);
	}
	
	/* �޼ҵ�(method) ����
	void �޼ҵ��() {} 
	void �޼ҵ��(�Ķ����Ÿ�� ������, ...) {} 
	����(����Ÿ)Ÿ�� �޼ҵ��() {}
	����Ÿ�� �޼ҵ��(�Ķ����Ÿ�� ������, ....) {}
	*/
	static int add(int a, int b) {
		//int result = a + b;
		//return result;
		return a + b; //����Ÿ���� ������ ��� return�� �ʼ� �ۼ�
	}
	
	//non-static �޼ҵ�
	int sub(int a, int b) {
		return a - b;
	}

}












