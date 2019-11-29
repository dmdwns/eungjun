package com.mystudy.socket04_echo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEchoWhile {

	public static void main(String[] args) {
		// 서버 구현
		// 클라이언트에서 보낸 메시지를 받고 다시 되돌려주기 반복
		ServerSocket server = null;
		
		//데이터를 읽기 위한 객체를 저장할 변수 선언
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//데이터를 쓰기 위한 객체를 저장할 변수 선언
		OutputStream os = null;
		PrintWriter pw = null;
		
		System.out.println(">>> 서버시작~~~");
		try {
			server = new ServerSocket(10000);
			System.out.println(">> 클라이언트 접속 대기중~~");
			Socket socket = server.accept();
			System.out.println(">> 클라이언트 접속됨");
			
			//연결된 소켓과 데이터를 주고받기 위한 I/O 객체 생성
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//바이트(byte) 처리 계열을 문자(char) 처리 계열로 전환
			isr = new InputStreamReader(is);
			
			//버퍼(buffer) 사용으로 편리하게 라인단위 입출력
			br = new BufferedReader(isr);
			pw = new PrintWriter(os);
			
			//=======================
			//읽고 쓰기 반복
			System.out.println(">> 데이터 읽기");
			while (true) {
				String msg = br.readLine(); //읽기
				
				//클라이언트에서 보낸 메시지가 exit이면 종료 처리
				if (msg == null || "exit".equalsIgnoreCase(msg)) {
					System.out.println(">> I/O 중단");
					break;
				}
				pw.println(msg); //쓰기
				pw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) pw.close();
			try {
				if (br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (server != null) server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(">>> 서버 종료 ----------------");
	}

}






