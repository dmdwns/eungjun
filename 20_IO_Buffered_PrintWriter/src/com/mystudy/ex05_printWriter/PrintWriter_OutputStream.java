package com.mystudy.ex05_printwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriter_OutputStream {

	public static void main(String[] args) {
		// PrintWriter : byte계열, 문자계열 모두 사용 가능
		FileOutputStream fos = null;
		PrintWriter pw = null;
		
		try {
			fos = new FileOutputStream(new File("file/pw_out2.txt"));
			pw = new PrintWriter(fos);
			
			pw.write("안녕하세요~~");
			pw.write("반갑습니다.\n");
			
			pw.print("지금 자바 공부중~");
			pw.print("월요일 신난당~~~~\n");
			
			pw.println("IO 공부 신나고 재밌다~~~");
			pw.println("PrintWriter 편하네~~");
			pw.println("------------");
			
			pw.printf("%10s %10s %20s\n", "이제", "둘째시간", "6시간 남았다.");
			pw.printf("%-50s", "앞으로도 5일 남았다. 야호~~");
			pw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (pw != null) {
				pw.close();
			}
		}
	}

}





