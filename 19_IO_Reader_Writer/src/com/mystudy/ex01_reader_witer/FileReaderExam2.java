package com.mystudy.ex01_reader_witer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExam2 {

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
			//[실습] 반복문 처리(전체데이타 출력)
			int readChar=-1;
			
			/*
			while(true) {
				readChar=fr.read();
				if(readChar==-1) break; //true일 때 반복중단
				System.out.println(readChar + ", " + (char)readChar);
				//if(readChar==-1) break; //-1찍고 반복문 중단
			}
			*/
			while((readChar=fr.read()) != -1) {//true일 때 실행
				System.out.print((char)readChar);
			}
			
			
			
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
