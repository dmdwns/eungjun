package com.mystudy.ex03_sungjuk;

//���� ����� ����(Exception) �����
//SungjukProcessException ���� Ŭ������ ����� ���ܸ� �׷����ؼ� ��� ����
public class JumsuOutOfValueException extends SungjukProcessException {
	public JumsuOutOfValueException() {
		super("��������(0~100)�� ��� ���Դϴ�.");
	}
}
