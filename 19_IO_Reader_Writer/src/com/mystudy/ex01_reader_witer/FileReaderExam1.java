package com.mystudy.ex01_reader_witer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam1 {

	public static void main(String[] args) {
		// 문자(Character) 단위 입력 처리
		// FileReader : 파일로 부터 문자단위로 데이터 읽기
		// 문자단위 : 1,A,$ -> 1byte문자
		//			대, 한, 핳, -> 2 byte문자(한글, 중국어 ...)
		//-------------------------------------------
		
		// FileReader 로 읽어올 대상 지정(file)
		File file=new File("file/test_char.txt");
		
		//FileReader 타입 객체 저장용 변수 선언
		FileReader fr=null;
		
		
		try {
			//1.객체생성
			fr=new FileReader(file);
			
			//2.객체 사용해서 문자단위로 읽기
			int readChar=fr.read();
			System.out.println("첫번째 문자 : " + readChar + ", char : " + (char)readChar);
			
			readChar=fr.read();
			System.out.println("두번째 문자 : " + readChar + ", char : " + (char)readChar);
			
			readChar=fr.read();
			System.out.println("세번째 문자 : " + readChar + ", char : " + (char)readChar);
			
		} catch (FileNotFoundException e) {
			System.out.println("[예외발생] " + e.getMessage());
		} catch (IOException e) {
			System.out.println("[예외발생] " + e.getMessage());
		} finally {
			//3.close 처리
			try {
				if(fr != null)
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
