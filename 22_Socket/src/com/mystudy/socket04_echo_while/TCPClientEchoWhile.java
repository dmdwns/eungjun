package com.mystudy.socket04_echo_while;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TCPClientEchoWhile {

	public static void main(String[] args) {
		// 클라이언트 구현
		// 서버로 메시지 보내고 서버에서 보내온 메시지 받기(반복)
		// 메시지 작성 : Scanner 객체 사용해서 화면에서 입력
		Socket socket = null;
		
		//데이터를 읽기 위한 객체를 저장할 변수 선언
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//데이터를 쓰기 위한 객체를 저장할 변수 선언
		OutputStream os = null;
		PrintWriter pw = null;

		System.out.println("---- 클라이언트 시작 ----");
		try {
			socket = new Socket("localhost", 10000);
			
			//소켓과 연결된 I/O 객체 생성
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//바이트(byte) 처리 계열을 문자(char) 처리 계열로 전환
			isr = new InputStreamReader(is);
			
			//버퍼(buffer) 사용으로 편리하게 라인단위 입출력
			br = new BufferedReader(isr);
			pw = new PrintWriter(os);
			
			//==========================
			//쓰고, 읽기 반복 처리
			Scanner scan = new Scanner(System.in);
			while (true) {
				System.out.print("메시지 작성 : ");
				String msg = scan.nextLine();
				
				//서버쪽으로 쓰기(output)
				pw.println(msg);
				pw.flush();
				
				//보낸 메시지가 exit 이면 작업 종료
				if (msg == null || "exit".equalsIgnoreCase(msg)) {
					System.out.println(">>> 대화를 종료합니다.");
					break;
				}
				//서버에서 보내온 메시지 읽기(input)
				String reMsg = br.readLine();
				System.out.println("from서버> " + reMsg);
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
				if (socket != null) socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("---- 클라이언트 종료 -----");
	}

}





