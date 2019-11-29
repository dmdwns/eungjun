package com.mystudy.ex05_printWriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriterExam2 {

	public static void main(String[] args) {
		// PrintWriter : byte�迭 ���ڰ迭 ��λ�� ����
		FileOutputStream fos=null;
		PrintWriter pw=null;
		
		try {
			fos=new FileOutputStream(new File("file/pw_out2.txt"));
			pw=new PrintWriter(fos);
			
			pw.write("�ȳ��ϼ���~~");
			pw.write("�ݰ����ϴ�.\n");
			
			pw.print("���� �ڹ� ������~");
			pw.print("������ �ų���~~~\n");
			
			pw.println("IO ���� �ų��� ��մ�~~~");
			pw.println("PrnitWriter ���ϳ�~~");
			pw.println("-------------------------");
			
			pw.printf("%10s %10s %20s\n", "����", "�ι�° �ð�", "6�ð� ���Ҵ�.");
			pw.printf("%-50s", "�����ε� 5�� ���Ҵ� �Ф�");
			
			
			pw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(pw != null) {
				pw.close();
			}
		}
	}

}
