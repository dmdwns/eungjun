package com.mystudy.socket03_echo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEcho {

	public static void main(String[] args) {
		/* [�ǽ�] ������ 
		1. �������� ����ؼ� Ŭ���̾�Ʈ ���� ���
		2. Ŭ���̾�Ʈ�� �����ϸ� 
		2-1. Ŭ���̾�Ʈ�� ���� �޽����� �ް�,(�б�, Input)
		     > �����޽��� ȭ�����
		2-2. ���� �޽����� Ŭ���̾�Ʈ���� �ٽ� ����(����, Output)
		3. Ŭ���̾�Ʈ���� ���� �޽��� ȭ�� ���
		*/
		ServerSocket server = null;
		
		//�����͸� �б� ���� ��ü�� ������ ���� ����
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//�����͸� ���� ���� ��ü�� ������ ���� ����
		OutputStream os = null;
		PrintWriter pw = null;
		
		try {
			System.out.println(">>> ���� ����");
			server = new ServerSocket(10000);
			
			System.out.println(">>> �����...");
			Socket socket = server.accept();
			
			//�����͸� �ް�, ���� �����͸� �����ֱ�
			//������ �ޱ�
			is = socket.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			System.out.println(">>> �޽��� �б�");
			String msg = br.readLine();
			System.out.println("�����޽��� : " + msg);
			
			//================================
			//Ŭ���̾�Ʈ ������ ���(������, output, ����, ����)
			os = socket.getOutputStream();
			pw = new PrintWriter(os);
			
			pw.println("[�������� ����] " + msg);
			pw.flush();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) pw.close();
			try {
				if (br != null) br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println(">>> ���� ����");
		
	}
}





