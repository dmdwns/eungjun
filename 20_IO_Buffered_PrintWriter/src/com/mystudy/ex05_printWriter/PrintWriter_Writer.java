package com.mystudy.ex05_printwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_Writer {

	public static void main(String[] args) {
		//File -> FileWriter -> (BufferedWriter) -> PrintWriter
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter(new File("file/pw_out.txt"));
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			//pw = new PrintWriter(new BufferedWriter(new FileWriter(new File("file/pw_out.txt"))));
			
			pw.write("안녕하세요~~");
			pw.write("반갑습니다.\n");
			
			pw.print("지금 자바공부중~~");
			pw.print("월요일이라 힘드네~ 월요병???\n");
			
			pw.println("오전이니까~ 집중하자~~");
			pw.println("----------------");
			
			pw.printf("%10s %10s %20s\n", "이제", "둘째시간", "6시간 남았다.");
			pw.printf("%-50s", "앞으로도 5일 남았다. 야호~~");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}

}







