package com.mystudy.ex01_reader_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {

	public static void main(String[] args) {
		// FileWriter : ���Ͽ� ���ڴ��� ����
		File file = new File("file/test_char_out.txt");

		//��������
		FileWriter fw = null;
		
		try {
			//����� ��ü ����
			fw = new FileWriter(file);
			
			//��ü ���
			fw.write('��'); //char -> int
			fw.write("��"); //String
			fw.write("�α�");
			
			//����(buffer) : ���ۿ뷮�� ä������ �ڵ����� Output ó�� 
			//����(buffer)�� ä������ �ʾ��� �� Output ó���Ϸ��� flush() ȣ��
			//close() ó���ÿ��� ������ �����͸� Output ó������
			fw.flush(); //����(buffer)�� ä������ �ʾƵ� Output ó��
		
			fw.write("Hello Java!!!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fw != null) fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}








