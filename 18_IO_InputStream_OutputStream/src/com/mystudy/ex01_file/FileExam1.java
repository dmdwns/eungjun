package com.mystudy.ex01_file;

import java.io.File;

public class FileExam1 {

	public static void main(String[] args) {
		// File Ŭ����
		String separator = File.separator; //���� ��� ������
		System.out.println("File.separator : " + separator);
		
		char separatorChar = File.separatorChar;
		System.out.println("File.separatorChar : " + separatorChar);
		
		System.out.println("----------");
		String pathSeparator = File.pathSeparator; //���(path) ������
		System.out.println("File.pathSeparator : " + pathSeparator);

		System.out.println("=================");
		File[] listRoots = File.listRoots();
		for (int i = 0; i < listRoots.length; i++) {
			System.out.println(listRoots[i]);
		}
	}

}



















