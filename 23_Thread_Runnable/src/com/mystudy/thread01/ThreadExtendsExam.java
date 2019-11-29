package com.mystudy.thread01;

class ThreadParent {
	void print() {
		System.out.println("���� ThreadTest Ŭ������ Parent Ŭ����");
	}
}

// ������� �����ϴ� Ŭ���� �����
// Thread Ŭ������ ���Ȯ��(extends)�ؼ� �����
class ThreadTest extends Thread {
	int num = 10;
	ThreadTest() {}
	ThreadTest(int num) {
		this.num = num;
	}
	@Override
	public void run() {
		// Thread Ŭ������ run() �޼ҵ带 �������̵�(overriding)�ؼ�
		// ������� �Ϸ��� �۾��� �ۼ� ó��
		System.out.println(this.getName() + ">>> run() ����");
		for (int i = 1; i <= num; i++) {
			System.out.println(this.getName() + " : " + i);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(this.getName() + ">>> run() ��");
	}
}

public class ThreadExtendsExam {

	public static void main(String[] args) {
		System.out.println("--- main() ���� ---");
		ThreadTest th1 = new ThreadTest();
		//th1.run(); //�ܼ� �޼ҵ� ȣ��
		th1.start(); //������� ���۽�Ű���� start() ���
		
		//�����带 �ϳ� �� �����ؼ� ����
		ThreadTest th2 = new ThreadTest(10);
		//th2.run(); //�ܼ� �޼ҵ� ȣ��
		th2.start();
		
		System.out.println("--- main() �� ---");
	}

}
