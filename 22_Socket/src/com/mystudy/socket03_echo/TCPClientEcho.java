package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientEcho {

	public static void main(String[] args) {
		/* [실습] 클라이언트측 
		1. 소켓 사용해서 서버에 접속
		2. 서버에 접속하면 
		2-1. 서버쪽으로 메시지 전송(쓰기, output)
		2-2. 서버쪽에서 보내온 메시지 받기(읽기, input)
		3. 받은 메시지 화면 출력
		*/
		Socket socket = null;
		
		//데이터를 읽기 위한 객체를 저장할 변수 선언
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//데이터를 쓰기 위한 객체를 저장할 변수 선언
		OutputStream os = null;
		PrintWriter pw = null;
		
		try {
			System.out.println("----- 클라이언트 ---------");
			socket = new Socket("localhost", 10000);
			System.out.println(">>> 서버에 접속 완료");
			
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//서버쪽으로 쓰기(전송, output)
			System.out.println(">>> 메시지 쓰기(client -> server)");
			pw = new PrintWriter(os);
			
			String msg = "안녕하세요~ 반갑습니다.";
			pw.println(msg); //서버쪽으로 메시지 출력(output, 쓰기, 전송)
			pw.flush();
			System.out.println("보낸메시지 : " + msg);
			
			//=================================
			//서버에서 보내온 메시지 받기(읽기, input, 수신)
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			String receiveMsg = br.readLine();
			System.out.println(">>받은메시지 : " + receiveMsg);
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			try {
				if (br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(">>> 클라이언트 종료");
	}

}






