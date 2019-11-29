package com.mystudy.ex01_reader_witer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam1 {

	public static void main(String[] args) {
		// ����(Character) ���� �Է� ó��
		// FileReader : ���Ϸ� ���� ���ڴ����� ������ �б�
		// ���ڴ��� : 1,A,$ -> 1byte����
		//			��, ��, �K, -> 2 byte����(�ѱ�, �߱��� ...)
		//-------------------------------------------
		
		// FileReader �� �о�� ��� ����(file)
		File file=new File("file/test_char.txt");
		
		//FileReader Ÿ�� ��ü ����� ���� ����
		FileReader fr=null;
		
		
		try {
			//1.��ü����
			fr=new FileReader(file);
			
			//2.��ü ����ؼ� ���ڴ����� �б�
			int readChar=fr.read();
			System.out.println("ù��° ���� : " + readChar + ", char : " + (char)readChar);
			
			readChar=fr.read();
			System.out.println("�ι�° ���� : " + readChar + ", char : " + (char)readChar);
			
			readChar=fr.read();
			System.out.println("����° ���� : " + readChar + ", char : " + (char)readChar);
			
		} catch (FileNotFoundException e) {
			System.out.println("[���ܹ߻�] " + e.getMessage());
		} catch (IOException e) {
			System.out.println("[���ܹ߻�] " + e.getMessage());
		} finally {
			//3.close ó��
			try {
				if(fr != null)
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
