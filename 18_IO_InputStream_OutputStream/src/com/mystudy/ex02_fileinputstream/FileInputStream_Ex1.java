package com.mystudy.ex02_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//����Ʈ(byte) ���� ó��
//������ �Է�(�б�) : InputStream - �߻�Ŭ���� 
//FileInputStream - InputStream�� ��ӹ޾�(extends) ���� Ŭ���� 
//   ����(file)�� ���� �����͸� �Է�(�о�) ó���ϱ� ���� Ŭ����
public class FileInputStream_Ex1 {

	public static void main(String[] args) {
		File file = new File("temp.txt");
		if (!file.exists()) {//������ ������ ���� ����� ó��
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			//1. FileInputStream ��ü ����
			//   ����� ���ϰ�ü�� ���� �޾Ƽ� ��ü����
			// FileNotFoundException ���� �߻� ���ɼ��� ����
			FileInputStream fis = new FileInputStream(file); 
			
			//2. ��ü ���
			int readValue = fis.read(); //IOException �߻� ����
			System.out.println("read() ��(int) : " + readValue);
			System.out.println("read() char : " + (char) readValue);
			
			System.out.println("--- ��ü������ �о���� ----");
			while (true) {
				readValue = fis.read();
				if (readValue == -1) break;//EOF(End Of File) ������ -1 ����
				System.out.print("int �� : " + readValue);
				System.out.println(" - char ���� : " + (char) readValue);
			}
			//3. ��ü �ݱ� : ��� �ڿ� ����ġ(���� close)
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}







