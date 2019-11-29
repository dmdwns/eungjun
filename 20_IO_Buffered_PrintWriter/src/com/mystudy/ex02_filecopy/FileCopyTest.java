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
		//(파일복사) 2가지 방식으로 파일 복사 - 속도 비교
		//방법1 : byte 단위 복사
		//방법2 : 버퍼기능 사용 복사
		// BufferedInputStream, BufferedOutputStream
		
		File file = new File("file/img_tea.jpg");
		
		//파일로부터 byte 단위 처리할 객체 저장할 변수 선언
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		//버퍼사용을 위한 변수 선언
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;

		try {
			//파일 읽고 쓰기위한 객체 생성
			fis = new FileInputStream(file);
			fos = new FileOutputStream("file/img_tea_copy.jpg");
			
			//현재시간 년월일시분초 값을 long타입으로 리턴
			long startTime = System.currentTimeMillis();
			
			//파일복사(byte 단위)
			//(실습) 바이트 단위 복사작업을 구현(fis, fos 사용)
			
			
			long endTime = System.currentTimeMillis();
			System.out.println("byte 복사시간 : "
					+ (endTime - startTime));
			fos.close();
			fis.close();
			
			//============================
			//버퍼(buffer) 사용 복사
			bis = new BufferedInputStream(new FileInputStream(file), 1000);
			bos = new BufferedOutputStream(
					new FileOutputStream("file/img_tea_bos.jpg"), 1000);
					
			startTime = System.currentTimeMillis();
			//읽고 쓰기
			int readBis = bis.read();
			while (readBis != -1) {
				bos.write(readBis);
				readBis = bis.read();
			}
			
			endTime = System.currentTimeMillis();
			System.out.println("버퍼(buffer) 복사시간 : "
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







