package com.mystudy.ex01_reader_witer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {
	
	public static void main(String[] args) {
		//FileWriter:파일에 문자단위 쓰기
		File file=new File("file/test_char_out.txt");
		
		//변수선언
		FileWriter fw=null;
		
		try {
			//사용할 객체 생성
			fw = new FileWriter(file);
			
			//객체사용
			fw.write('대');//char -> int
			fw.write("한");//String
			fw.write("민국");//String
			
			//버퍼(buffer) : 버퍼용령이 채워지면 자동으로 output 처리 
			//버퍼(buffer)가 채워지지 않았을 때 Output 처리하려면 flush() 호출
			//close() 처리시에는 버퍼의 데이터를 Output 처리한다
			fw.flush();//버퍼(buffer)가 채워지지 않아도 Output 처리
			
			fw.write("Hello Java!!!");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(fw != null) fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}















