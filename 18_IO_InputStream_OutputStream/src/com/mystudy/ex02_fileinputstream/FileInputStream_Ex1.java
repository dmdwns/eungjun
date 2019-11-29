package com.mystudy.ex02_fileinputstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//바이트(byte) 단위 처리
//데이터 입력(읽기) : InputStream - 추상클래스 
//FileInputStream - InputStream을 상속받아(extends) 만든 클래스 
//   파일(file)로 부터 데이터를 입력(읽어) 처리하기 위한 클래스
public class FileInputStream_Ex1 {

	public static void main(String[] args) {
		File file = new File("temp.txt");
		if (!file.exists()) {//파일이 없으면 새로 만들기 처리
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		try {
			//1. FileInputStream 객체 생성
			//   사용할 파일객체를 전달 받아서 객체생성
			// FileNotFoundException 예외 발생 가능성이 있음
			FileInputStream fis = new FileInputStream(file); 
			
			//2. 객체 사용
			int readValue = fis.read(); //IOException 발생 가능
			System.out.println("read() 값(int) : " + readValue);
			System.out.println("read() char : " + (char) readValue);
			
			System.out.println("--- 전체데이터 읽어오기 ----");
			while (true) {
				readValue = fis.read();
				if (readValue == -1) break;//EOF(End Of File) 만나면 -1 리턴
				System.out.print("int 값 : " + readValue);
				System.out.println(" - char 문자 : " + (char) readValue);
			}
			//3. 객체 닫기 : 사용 자원 원위치(파일 close)
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}







