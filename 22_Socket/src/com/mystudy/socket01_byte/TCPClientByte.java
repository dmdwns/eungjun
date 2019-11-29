package com.mystudy.socket01_byte;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClientByte {

	public static void main(String[] args) {
		// Ŭ���̾�Ʈ : Socket �̿��ؼ� ������ ����(����IP�ּ�, ������Ʈ��ȣ)
		Socket socket = null;
		try {
			System.out.println("---- Ŭ���̾�Ʈ ----");
			//                 locakhost(������ǻ��, 127�� �����ϴ� IP)
			socket = new Socket("127.0.0.1", 10000);
			System.out.println(">> ���� ���� ����~~~");
			
			//������ Socket ��ü�� ���� Input, Output ��Ʈ�� ����
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			//OutputStream �̿��ؼ� ���������� ����
//			System.out.println(">> ���������� ���� 'A' ������");
//			os.write('A');
			
			byte[] buf = "�ȳ��ϼ���~ �ݰ����ϴ�.".getBytes();
			os.write(buf);
			
			os.close();
			is.close();
			
			System.out.println(">>>> Ŭ���̾�Ʈ ����");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}







