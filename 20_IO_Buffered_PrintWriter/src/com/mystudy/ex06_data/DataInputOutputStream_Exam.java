package com.mystudy.ex06_data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class DataInputOutputStream_Exam {

	public static void main(String[] args) {
		// DataInputStream, DataOutputStream 
		// �⺻������ Ÿ�� ������� ����, �б�
		File file = new File("file/data_io_stream.txt");
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		DataInputStream dis = null;
		DataOutputStream dos = null;
		
		try {
			//���Ͽ� ����, ����� �����͸� �о����
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			//�⺻ ������ Ÿ������ ������ ����
			dos.writeInt(10000);
			dos.writeBoolean(true);
			dos.writeByte(127);
			dos.writeDouble(Math.PI);
			dos.writeUTF("abc�ѱ۹��ڿ�");
			dos.writeUTF("Hello Java");
			
			//=======================
			//����� ������ �о����
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			//(����) ���� �о�� ���� ������ ���� + ������ Ÿ���� ��ġ�ؼ� ���� ��
			System.out.println(dis.readInt());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readByte());
			System.out.println(dis.readDouble());
			System.out.println(dis.readUTF());
			System.out.println(dis.readUTF());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				dis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}







