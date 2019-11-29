package com.mystudy.ex03_fileoutputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream_Ex01 {

	public static void main(String[] args) {
		//FileOutputStream : byte ������ ���Ͽ� ���� (���,����)
		// - OutputStream �߻�Ŭ���� ��ӹ޾�(Ȯ���ؼ� extends) ������� Ŭ����
		
		File file = new File("file/test_out_01.txt");
		FileOutputStream fos=null;
		try {
			//1. ��ü����
			//fos = new FileOutputStream(file);//�׻� ������ ���� �����
			fos = new FileOutputStream(file, true);//false ���� ���� ����, true ���� �߰�(append) ���·� ���, run�Ҷ����� ��� ���
			
			//2. ��ü����۾�ó�� 
			fos.write('H');
			fos.write('e');
			fos.write('l');
			fos.write('l');
			fos.write('o');
			fos.write('~');
			
			byte[] bytes="Hello Java!!".getBytes();//.getBytes():����Ʈ�迭�� �������ش�
			for(int i=0; i<bytes.length; i++) {
				fos.write(bytes[i]);
			}
			
			//write(����Ʈ�迭) : ����Ʈ�迭 ���� ���Ͽ� ���(����)
			fos.write(bytes);
			
			//write(����Ʈ�迭, ������ġ, ����)
			//012345679101112 : �ε���
			//Hello Java!!
			fos.write(bytes, 6, 6); //6��° �ε������� 6���о���δ�
			
			fos.write('\n');
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			//3. ��ü close
			if (fos != null) {
				try {
					fos.close();
				}catch (IOException e) {
					
				}
			}
		}
	}

}
