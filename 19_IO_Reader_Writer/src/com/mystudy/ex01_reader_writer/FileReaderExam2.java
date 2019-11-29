package com.mystudy.ex01_reader_writer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam2 {

	public static void main(String[] args) {
		// ����(Character) ���� �Է� ó��
		// FileReader : ���Ϸ� ���� ���ڴ����� ������ �б�
		// ���ڴ��� : 1, A, $ - 1 byte����
		//         ��, ��, �K - 2 byte����(�ѱ�, �߱���, �±���, �ƶ���...)
		//-----------------------------
		
		// FileReader �� �о�� ��� ����(file)
		File file = new File("file/test_char.txt");
		
		// FileReader Ÿ�� ��ü ����� ���� ����
		FileReader fr = null;
		
		try {
			//1. ��ü����
			fr = new FileReader(file);
			
			//2. ��ü ����ؼ� ���ڴ����� �б�
			//[�ǽ�] �ݺ��� ó�� (��ü ������ �о ȭ�� ���)
			int readChar = -1;
			/*
			while (true) {
				readChar = fr.read();
				if (readChar == -1) break; //true�϶� �ݺ� �ߴ�
				System.out.print((char)readChar);
			}
			*/
			while ((readChar = fr.read()) != -1) {//true�϶� ����
				System.out.print((char)readChar);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("[���ܹ߻�] " + e.getMessage());
		} catch (IOException e) {
			System.out.println("[���ܹ߻�] " + e.getMessage());
		} finally {
			//3. close ó��
			try {
				if (fr != null) fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}









