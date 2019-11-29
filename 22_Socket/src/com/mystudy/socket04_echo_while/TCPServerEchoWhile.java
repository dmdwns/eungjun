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
		// ���� ����
		// Ŭ���̾�Ʈ���� ���� �޽����� �ް� �ٽ� �ǵ����ֱ� �ݺ�
		ServerSocket server = null;
		
		//�����͸� �б� ���� ��ü�� ������ ���� ����
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//�����͸� ���� ���� ��ü�� ������ ���� ����
		OutputStream os = null;
		PrintWriter pw = null;
		
		System.out.println(">>> ��������~~~");
		try {
			server = new ServerSocket(10000);
			System.out.println(">> Ŭ���̾�Ʈ ���� �����~~");
			Socket socket = server.accept();
			System.out.println(">> Ŭ���̾�Ʈ ���ӵ�");
			
			//����� ���ϰ� �����͸� �ְ�ޱ� ���� I/O ��ü ����
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//����Ʈ(byte) ó�� �迭�� ����(char) ó�� �迭�� ��ȯ
			isr = new InputStreamReader(is);
			
			//����(buffer) ������� ���ϰ� ���δ��� �����
			br = new BufferedReader(isr);
			pw = new PrintWriter(os);
			
			//=======================
			//�а� ���� �ݺ�
			System.out.println(">> ������ �б�");
			while (true) {
				String msg = br.readLine(); //�б�
				
				//Ŭ���̾�Ʈ���� ���� �޽����� exit�̸� ���� ó��
				if (msg == null || "exit".equalsIgnoreCase(msg)) {
					System.out.println(">> I/O �ߴ�");
					break;
				}
				pw.println(msg); //����
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
		
		System.out.println(">>> ���� ���� ----------------");
	}

}






