package com.mystudy.ex02_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStream_Ex3_1 {

	public static void main(String[] args) {
		File file = new File("file/test_01.txt");
		FileInputStream fis = null;
		
		try {
			//1. ��ü ����(���� �б�) <- File ��ü �Է¹���
			fis = new FileInputStream(file);
			
			//2. ��ü ��� �۾� ó��
			byte[] bytes = new byte[10];
			System.out.println("bytes : " + Arrays.toString(bytes));
			//fis.read(byte[] b) : byte[] �迭�� ũ�⸸ŭ �о� b������ ����
			//���ϰ� : �о�� ����
			int byteCnt = fis.read(bytes);
			System.out.println("�о�� ���� : " + byteCnt);
			System.out.println("�о�� �� : " + Arrays.toString(bytes));
			for (int i = 0; i < byteCnt; i++) {
				System.out.println("���� : " + bytes[i] 
						+ ", char: " + (char)bytes[i]);
			}
			
			byteCnt = fis.read(bytes);
			System.out.println("�о�� ���� : " + byteCnt);
			System.out.println("�о�� �� : " + Arrays.toString(bytes));
			for (int i = 0; i < byteCnt; i++) {
				System.out.println("���� : " + bytes[i] 
						+ ", char: " + (char)bytes[i]);
			}
			
			byteCnt = fis.read(bytes);
			System.out.println("�о�� ���� : " + byteCnt);
			System.out.println("�о�� �� : " + Arrays.toString(bytes));
			for (int i = 0; i < byteCnt; i++) {
				System.out.println("���� : " + bytes[i] 
						+ ", char: " + (char)bytes[i]);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. ��밴ü close
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		
	}

}








