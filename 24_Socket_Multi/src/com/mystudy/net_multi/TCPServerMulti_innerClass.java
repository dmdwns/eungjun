package com.mystudy.net_multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerMulti_InnerClass {

	public static void main(String[] args) {
		System.out.println("---- main() 시작 ---");
		new TCPServerMulti_InnerClass();
		System.out.println("---- main() 끝 ---");
	}
	TCPServerMulti_InnerClass() {
		serverStart();
	}
	private void serverStart() {
		ServerSocket server = null;
		System.out.println(">> 서버소켓 객체 생성");
		try {
			server = new ServerSocket(10000);
			while (true) {
				System.out.println(">> 서버 대기중..." + "192.168.0.100");
				Socket socket = server.accept();
				System.out.println(">> 클라이언트 접속");
				System.out.println(">> 클라이언트 접속 정보 : "
						+ socket.getInetAddress());
				
				//소켓정보 사용해서 입출력 처리(내부클래스 사용)
				SocketThread thr = new SocketThread(socket);
				thr.start(); //쓰레드로 동작시키기 위해 start() 호출
				System.out.println(">> " + socket.getInetAddress() 
						+ " 쓰레드 생성");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//내부클래스 : 소켓(Socket)을 전달받아 쓰레드 생성하는 클래스
	class SocketThread extends Thread {
		Socket socket; 
		SocketThread(Socket socket) {
			this.socket = socket;
		}
		@Override
		public void run() {
			System.out.println(">>> 쓰레드 시작 : " 
					+ socket.getInetAddress());
			InputStream is = null;
			OutputStream os = null;
			
			InputStreamReader isr = null;
			BufferedReader br = null;
			
			try {
				is = socket.getInputStream();
				os = socket.getOutputStream();
				
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);
				
				System.out.println(">> 읽기 시작");
				
				while (true) {
					String msg = br.readLine();
					if (msg == null || "exit".equalsIgnoreCase(msg)) {
						break;
					}
					System.out.println(">>> " + msg);
				}
				
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				System.out.println(">> 클라이언트 종료");
				try {
					if (br != null) br.close();
					if (os != null) os.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}







