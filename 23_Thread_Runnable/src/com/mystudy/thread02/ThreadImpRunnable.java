package com.mystudy.thread02;

class ThreadParent {
	void print() {
		System.out.println("나는 Thread 클래스의 Parent클래스");
	}
}

class ThreadImp extends ThreadParent implements Runnable {
	@Override
	public void run() {
		super.print();
		System.out.println("ThreadImp.run() : Runnable 인터페이스 구현");
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}
}

public class ThreadImpRunnable {

	public static void main(String[] args) {
		System.out.println("--- main() 시작 ---");
		Thread thMain = Thread.currentThread();
		System.out.println(thMain.toString());
		
		//Runnable 인터페이스를 구현한 객체를 쓰레드로 사용하려면
		//Thread 클래스의 생성자에 Runnable 구현 객체를 전달해서 생성
		ThreadImp thImp = new ThreadImp(); //ThreadImp 객체 생성
		
		//ThreadImp 객체를 Thread 객체 생성시 주입
		Thread th = new Thread(thImp);
		th.start();
		
		System.out.println("--- main() 끝 ---");
	}

}







