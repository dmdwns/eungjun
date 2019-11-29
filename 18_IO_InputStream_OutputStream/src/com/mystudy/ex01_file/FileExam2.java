package com.mystudy.ex01_file;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) {
		//���ϸ� : temp.txt - ���ϸ�.Ȯ����(��)
		File file1 = new File("temp.txt");
		
		//File ��ü������ ������ ���翩�ο� ������� ���� ����
		System.out.println(file1);
		
		// c:\temp\aaa\a1\temp.txt : ������ ���
		File file2 = new File("c:\\temp\\aaa\\a1\\temp.txt");
		System.out.println(file2);
		
		//����� ���(. : ������ġ, .. : �������丮(����))
		File file3 = new File("file/temp.txt");
		
		System.out.println("\n--- File getAbsolutePath() -----");
		System.out.println("������ġ(file1): " + file1.getAbsolutePath());
		System.out.println("������ġ(file2): " + file2.getAbsolutePath());
		System.out.println("������ġ(file3): " + file3.getAbsolutePath());
		
		System.out.println("---- File exists() ----");
		System.out.println("�ֳ�(file1): " + file1.exists());
		System.out.println("�ֳ�(file2): " + file2.exists());
		System.out.println("�ֳ�(file3): " + file3.exists());
		
		System.out.println("--- File getName() ----");
		System.out.println("���ϸ�(file1): " + file1.getName());
		System.out.println("���ϸ�(file2): " + file2.getName());
		System.out.println("���ϸ�(file3): " + file3.getName());
		
		System.out.println("--- File getPath() ----");
		System.out.println("file1.getPath(): " + file1.getPath());
		System.out.println("file2.getPath(): " + file2.getPath());
		System.out.println("file3.getPath(): " + file3.getPath());
		
		System.out.println("--- File �Ӽ� ���� ----");
		System.out.println("file1.length(): " + file1.length());
		System.out.println("file1.canRead(): " + file1.canRead());
		System.out.println("file1.canWrite(): " + file1.canWrite());
		System.out.println("file1.canExecute(): " + file1.canExecute());
		
		System.out.println("--- isDirectory(), isFile() ---");
		System.out.println("file1.isDirectory(): " + file1.isDirectory());
		System.out.println("file1.isFile(): " + file1.isFile());
		
		//���� ���� �� ����
		File file4 = new File("file/temp4.txt");
		try {
			//���ϸ� ����, ����(���丮)������ IOException �߻�
			boolean isSuccess = file4.createNewFile();
			System.out.println("���ϻ��� : " + isSuccess);
		} catch (IOException e) {
			e.printStackTrace();
		}
		file4.delete();
	}

}









