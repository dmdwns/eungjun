package com.mystudy.ex03_isr;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderExam {

	public static void main(String[] args) {
		// byte ó�� �迭 -> ���� ó�� �迭 ��ȯ
		// �����͸� byte�迭�� �о���̰�, ���������� ���ڴ��� ó��
		// InputStreamReader : InputStream -> Reader ��ȯ
		// OutputStreamWriter : OutputStream -> Writer ��ȯ
		
		File file = new File("file/test_isr.txt");
		
		FileInputStream fis = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream(file);
			
//			int readByte = fis.read();
//			System.out.println((char)readByte);
//			readByte = fis.read();
//			System.out.println((char)readByte);
			
			isr = new InputStreamReader(fis);
			int readIsr = isr.read();
			System.out.println((char)readIsr);
			
			readIsr = isr.read();
			System.out.println((char)readIsr);
			
			//���� ����� ����ؼ� �б�(���δ���)
			br = new BufferedReader(isr);
			String str = br.readLine();
			System.out.println(str);
			
			while (true) {
				str = br.readLine();
				if (str == null) break;
				System.out.println(str);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}







