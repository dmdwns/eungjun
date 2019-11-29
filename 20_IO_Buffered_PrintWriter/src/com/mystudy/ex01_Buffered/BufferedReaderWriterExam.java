package com.mystudy.ex01_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExam {

	public static void main(String[] args) {
		// ����(buffer) ����� �����Ǿ� �ִ� Ŭ����
		// BufferedReader, BufferedWriter
		// File -> FileReader -> BufferedReader
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader bufferedReader = null;
		BufferedWriter bufferedWriter = null;
		
		try {
			//���Ϸκ��� �б� ���� ��ü ���� -------------------
			File inFile = new File("file/test_buf_rw_in.txt");
			fr = new FileReader(inFile);
			
			//���ۻ�� + �����б� ���
			bufferedReader = new BufferedReader(fr);
			
			//���Ͽ� ���� ���� ��ü ���� -----------------------
			File outFile = new File("file/test_buf_rw_out.txt");
			fw = new FileWriter(outFile);
			
			//���ۻ�� + ���Ͼ��� ���
			bufferedWriter = new BufferedWriter(fw);
			
			//������ ����
			bufferedWriter.write("�ȳ��ϼ���. �ڹٰ������Դϴ�.\n");
			bufferedWriter.write("Hello Java!!!");
			bufferedWriter.newLine();
			bufferedWriter.newLine();
			bufferedWriter.write("����ֳ���???????");
			bufferedWriter.newLine();
			bufferedWriter.write("-----------------");
			bufferedWriter.newLine();
			
			bufferedWriter.flush();
			
			//���Ϸ� ���� �а� ����(���۱�� �̿��ؼ�)
			//���Ͽ��� �б�(�� �� �б�)
			String str = bufferedReader.readLine();
			System.out.println("readLine() ó�� ���� �� : " + str);
			
			//���Ͽ� ����(�� �� ����)
			bufferedWriter.write(str);
			bufferedWriter.newLine(); //�ٹٲ� ó��
			
			//���� ������ ��� �а� ����
			str = bufferedReader.readLine();//���̻� ������ null ����
			while (str != null) {
				bufferedWriter.write(str);
				bufferedWriter.newLine(); //�ٹٲ� ó��
				str = bufferedReader.readLine();
			}
			
			bufferedWriter.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//��� ��ü close
			try {
				bufferedWriter.close();
				bufferedReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}








