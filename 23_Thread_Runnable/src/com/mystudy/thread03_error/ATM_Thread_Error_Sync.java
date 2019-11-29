package com.mystudy.thread03_error;

class ATM_Error_Sync implements Runnable {
	int money;
	
	ATM_Error_Sync() {}
	ATM_Error_Sync(int money) {
		this.money = money;
	}
	//�Ա�
	//synchronized ���� : �޼ҵ尡 ����Ǵ� ���� ����ȭ ó��
	// �ϳ��� �����尡 �޼ҵ带 ����ϰ� �ִ� ���� ������ ����
	// �ٸ� �����忡�� ����Ϸ��� �� �� �����°� ��(�ʵ尪�� ���� ����ȭ)
	synchronized void add(int money) {
		this.money += money;
		System.out.println(Thread.currentThread()
				+ " �Ա�: "+ money +", �����ܾ�: " + this.money);
	}
	//���
	synchronized void out(int money) {
		this.money -= money;
		System.out.println(Thread.currentThread()
				+ " ���: "+ money +", �����ܾ�: " + this.money);
	}
	void bankSleep(int millisecond) {
		try {
			Thread.currentThread().sleep(millisecond);
		} catch (InterruptedException e) {}
	}
	
	@Override
	public void run() {
		add(1000);
		bankSleep(1000);
		out(500);
		bankSleep(1000);
		out(300);
		bankSleep(1000);
		out(200);
	}
	
}

public class ATM_Thread_Error_Sync {

	public static void main(String[] args) {
		System.out.println("--- main() ���� ---");
		ATM_Error_Sync bank = new ATM_Error_Sync();
		System.out.println("�����ܰ� : " + bank.money);
		
		Thread th1 = new Thread(bank, "ATM-1");
		Thread th2 = new Thread(bank, "ATM-2");
		Thread th3 = new Thread(bank, "ATM-3");
		th1.start();
		th2.start();
		th3.start();

		System.out.println("--- main() �� ---");
	}

}





