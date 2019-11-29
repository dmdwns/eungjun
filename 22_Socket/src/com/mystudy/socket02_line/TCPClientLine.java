package com.mystudy.socket02_line;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientLine {

	public static void main(String[] args) {
		System.out.println(">>> Ŭ���̾�Ʈ ����");
		//0. ����� ����(Socket) ���� ����
		Socket socket = null;
		
		try {
			System.out.println("������ǻ��IP : " + InetAddress.getLocalHost());
			System.out.println(">> ������ ����~~");
			//1. ���ϻ���(Socket) : ������ IP�ּ�, ��Ʈ(port) ������ ���� ����
			socket = new Socket(InetAddress.getLocalHost(), 10000);
			
			//2. �������κ��� in, out ����
			InputStream is = socket.getInputStream();
			
			OutputStream os = socket.getOutputStream();
			//OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(os);
			
			//3. ������(out) �����Ͱ� ������ ����(write)
			System.out.println(">> �޽��� ����");
			String msg = "�ȳ��ϼ���. ������ �ݰ����ϴ�. ������� ������~~~";
			pw.println(msg);
			pw.flush(); //���ۿ� �ִ� ������ ������ ���(����)
			
			//4. ����(in) �����Ͱ� ������ �а�(read)
			//��������
			
			//5. �ڿ�
			pw.close();
			is.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (socket != null) socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(">>> Ŭ���̾�Ʈ ����");
	}

}
