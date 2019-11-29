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
		// Ŭ���̾�Ʈ ����
		// ������ �޽��� ������ �������� ������ �޽��� �ޱ�(�ݺ�)
		// �޽��� �ۼ� : Scanner ��ü ����ؼ� ȭ�鿡�� �Է�
		Socket socket = null;
		
		//�����͸� �б� ���� ��ü�� ������ ���� ����
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		//�����͸� ���� ���� ��ü�� ������ ���� ����
		OutputStream os = null;
		PrintWriter pw = null;

		System.out.println("---- Ŭ���̾�Ʈ ���� ----");
		try {
			socket = new Socket("localhost", 10000);
			
			//���ϰ� ����� I/O ��ü ����
			is = socket.getInputStream();
			os = socket.getOutputStream();
			
			//����Ʈ(byte) ó�� �迭�� ����(char) ó�� �迭�� ��ȯ
			isr = new InputStreamReader(is);
			
			//����(buffer) ������� ���ϰ� ���δ��� �����
			br = new BufferedReader(isr);
			pw = new PrintWriter(os);
			
			//==========================
			//����, �б� �ݺ� ó��
			Scanner scan = new Scanner(System.in);
			while (true) {
				System.out.print("�޽��� �ۼ� : ");
				String msg = scan.nextLine();
				
				//���������� ����(output)
				pw.println(msg);
				pw.flush();
				
				//���� �޽����� exit �̸� �۾� ����
				if (msg == null || "exit".equalsIgnoreCase(msg)) {
					System.out.println(">>> ��ȭ�� �����մϴ�.");
					break;
				}
				//�������� ������ �޽��� �б�(input)
				String reMsg = br.readLine();
				System.out.println("from����> " + reMsg);
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
		System.out.println("---- Ŭ���̾�Ʈ ���� -----");
	}

}





