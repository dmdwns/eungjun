package com.mystudy.ex04_inner_class;

interface TestInter{
	int DATA =100;//���
	void printData();//�߻�޼ҵ�
}

class TestInterImpl implements TestInter{

	@Override
	public void printData() {
		System.out.println("printData()>>> ������ �żҵ�");
	}
	
}

public class AnonymousTest {
	void test() {
		//�͸�Ŭ���� : �̸��� ��� �� �� ���ǰ� ���� �ȵ�
		(new TestInter() {
			@Override
			public void printData() {
				System.out.println("�͸�Ŭ����printData() DATA: " + DATA);	
			}
		}).printData();;
	}

	public static void main(String[] args) {
		TestInter imp=new TestInterImpl();
		imp.printData();
		imp.printData();
		System.out.println("------------------");
		new TestInterImpl().printData();//�ѹ����� ������
		
		System.out.println("===============");
		AnonymousTest test=new AnonymousTest();
		test.test();
		
	}

}


















