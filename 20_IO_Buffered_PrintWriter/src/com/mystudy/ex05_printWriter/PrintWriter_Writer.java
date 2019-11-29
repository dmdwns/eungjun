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
			
			pw.write("�ȳ��ϼ���~~");
			pw.write("�ݰ����ϴ�.\n");
			
			pw.print("���� �ڹٰ�����~~");
			pw.print("�������̶� �����~ ���亴???\n");
			
			pw.println("�����̴ϱ�~ ��������~~");
			pw.println("----------------");
			
			pw.printf("%10s %10s %20s\n", "����", "��°�ð�", "6�ð� ���Ҵ�.");
			pw.printf("%-50s", "�����ε� 5�� ���Ҵ�. ��ȣ~~");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
		}
	}

}







