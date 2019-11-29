package com.mystudy.ex02_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream_Ex2 {

	public static void main(String[] args) {
		File file = new File("file/test_01.txt");
		FileInputStream fis = null;
		
		try {
			//1. 객체생성
			fis = new FileInputStream(file);
			
			//2. 객체사용 작업 처리
			int readValue = -1;
//			while (true) {
//				readValue = fis.read();
//				if (readValue == -1) break;
//				System.out.print("int 값: " + readValue);
//				System.out.println(", " + (char)readValue);
//			}
			
			//fis.read() -> readValue
			//readValue != -1 : 읽은 값이 EOF가 아니면
			while ((readValue = fis.read()) != -1) {
				System.out.print("int 값: " + readValue);
				System.out.println(", " + (char)readValue);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 객체 close
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
