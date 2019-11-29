package com.mystudy.ex01_reader_witer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	
	public static void main(String[] args) {
		//FileWriter:���Ͽ� ���ڴ��� ����
		File file=new File("file/test_char_out.txt");
		
		//��������
		FileWriter fw=null;
		
		try {
			//����� ��ü ����
			fw = new FileWriter(file);
			
			//��ü���
			fw.write('��');//char -> int
			fw.write("��");//String
			fw.write("�α�");//String
			
			//����(buffer) : ���ۿ���� ä������ �ڵ����� output ó�� 
			//����(buffer)�� ä������ �ʾ��� �� Output ó���Ϸ��� flush() ȣ��
			//close() ó���ÿ��� ������ �����͸� Output ó���Ѵ�
			fw.flush();//����(buffer)�� ä������ �ʾƵ� Output ó��
			
			fw.write("Hello Java!!!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(fw != null) fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}















