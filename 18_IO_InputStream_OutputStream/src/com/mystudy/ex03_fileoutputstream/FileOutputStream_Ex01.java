package com.mystudy.ex03_fileoutputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_Ex01 {

	public static void main(String[] args) {
		//FileOutputStream : byte 단위로 파일에 저장 (출력,쓰기)
		// - OutputStream 추상클래스 상속받아(확장해서 extends) 만들어진 클래스
		
		File file = new File("file/test_out_01.txt");
		FileOutputStream fos=null;
		try {
			//1. 객체생성
			//fos = new FileOutputStream(file);//항상 파일을 새로 만든다
			fos = new FileOutputStream(file, true);//false 쓰면 위와 같다, true 쓰면 추가(append) 형태로 출력, run할때마다 계속 출력
			
			//2. 객체사용작업처리 
			fos.write('H');
			fos.write('e');
			fos.write('l');
			fos.write('l');
			fos.write('o');
			fos.write('~');
			
			byte[] bytes="Hello Java!!".getBytes();//.getBytes():바이트배열을 리턴해준다
			for(int i=0; i<bytes.length; i++) {
				fos.write(bytes[i]);
			}
			
			//write(바이트배열) : 바이트배열 값을 파일에 출력(쓰기)
			fos.write(bytes);
			
			//write(바이트배열, 시작위치, 갯수)
			//012345679101112 : 인덱스
			//Hello Java!!
			fos.write(bytes, 6, 6); //6번째 인덱스부터 6개읽어들인다
			
			fos.write('\n');
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. 객체 close
			if (fos != null) {
				try {
					fos.close();
				}catch (IOException e) {
					
				}
			}
		}
	}

}
