package com.mystudy.ex02_filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {
		//(���Ϻ���) 2���� ������� ���� ���� - �ӵ� ��
		//���1 : byte ���� ����
		//���2 : ���۱�� ��� ����
		// BufferedInputStream, BufferedOutputStream
		
		File file = new File("file/img_tea.jpg");
		
		//���Ϸκ��� byte ���� ó���� ��ü ������ ���� ����
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//���ۻ���� ���� ���� ����
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			//���� �а� �������� ��ü ����
			fis = new FileInputStream(file);
			fos = new FileOutputStream("file/img_tea_copy.jpg");
			
			//����ð� ����Ͻú��� ���� longŸ������ ����
			long startTime = System.currentTimeMillis();
			
			//���Ϻ���(byte ����)
			//(�ǽ�) ����Ʈ ���� �����۾��� ����(fis, fos ���)
			
			
			long endTime = System.currentTimeMillis();
			System.out.println("byte ����ð� : "
					+ (endTime - startTime));
			fos.close();
			fis.close();
			
			//============================
			//����(buffer) ��� ����
			bis = new BufferedInputStream(new FileInputStream(file), 1000);
			bos = new BufferedOutputStream(
					new FileOutputStream("file/img_tea_bos.jpg"), 1000);
					
			startTime = System.currentTimeMillis();
			//�а� ����
			int readBis = bis.read();
			while (readBis != -1) {
				bos.write(readBis);
				readBis = bis.read();
			}
			
			endTime = System.currentTimeMillis();
			System.out.println("����(buffer) ����ð� : "
					+ (endTime - startTime));
			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}







