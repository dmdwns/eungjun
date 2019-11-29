package com.mystudy.ex04_filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy_Test {

	public static void main(String[] args) {
		//���Ϻ��� : �������Ͽ��� �а�(Input) ������Ͽ� ����(Output)
		
		//������ ���� ����(source file : AS-IS)
		File fileIn = new File("src/com/mystudy/ex04_filecopy/FileCopy_Test.java");
		//File fileIn = new File("����Ʈ_InputStream.png");
		
		//���� ���� ��� ����(target file : TO-BE)
		File fileOut = new File("file/FileCopy_Test_backup.java");
		//File fileOut = new File("file/����Ʈ_InputStream_backup.png");
		
		//0. ���Ͽ��� �а� ���� ���� ��ü�� ������ ���� ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//1. ���Ͽ��� �а� ���� ���� ��ü ����
			fis = new FileInputStream(fileIn);
			fos = new FileOutputStream(fileOut);
			
			//2. ��ü ����ؼ� �۾� ó��(�а� ����)
			int value = -1;
			
			while (true) {
				value = fis.read(); // 1 byte �б�
				if (value == -1) break; //EOF(End Of File) ������ ���̸� �ݺ�����
				fos.write(value); // 1 byte ����
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. ��밴ü close(�������� ��������)
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
/* sadflsjdflkjsd 
 * 
 * sdfjlkasdjflks
 * */







