package com.mystudy.ex01_reader_witer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam2 {

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
			//[�ǽ�] �ݺ��� ó��(��ü����Ÿ ���)
			int readChar=-1;
			
			/*
			while(true) {
				readChar=fr.read();
				if(readChar==-1) break; //true�� �� �ݺ��ߴ�
				System.out.println(readChar + ", " + (char)readChar);
				//if(readChar==-1) break; //-1��� �ݺ��� �ߴ�
			}
			*/
			while((readChar=fr.read()) != -1) {//true�� �� ����
				System.out.print((char)readChar);
			}
			
			
			
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
