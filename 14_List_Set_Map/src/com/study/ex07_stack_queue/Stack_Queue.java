package com.study.ex07_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue {
	
	public static void main(String[] args) {
		//ť(Queue) : ���Լ���(FIFO)
		System.out.println("----- ť(Queue) : ���Լ���(FIFO) -----");
		Queue<String> que = new LinkedList<>();
		que.offer("1.ù°");
		que.add("2.��°");
		que.offer("3.��°");
		System.out.println(que);
		
		System.out.println("----- peek() -----");
		//.peek() : �����͸� Ȯ�θ��ϰ� �������� ����
		System.out.println("que.peek() : " + que.peek());//.peek()-->ù��° ������ �̴´�
		System.out.println("que.peek() : " + que.peek());//.peek()-->�ι��ᵵ ù��° ������ �̴´�
		System.out.println("ť���嵥����(peek) : " + que);//�̾Ƴ��� �״�δ�. �� Ȯ�θ� �� ��
		
		System.out.println("----- poll() -----");
//		System.out.println("que.poll() : " + que.poll());//ù��° ������ �̴´�
//		System.out.println("que.poll() : " + que.poll());//�ι�° ������ �̴´�
//		System.out.println("que.poll() : " + que.poll());//����° ������ �̴´�
//		System.out.println("que.poll() : " + que.poll());//�׹�° ������ �̴´�
//		System.out.println("ť���嵥����(pool) : " + que);//�ʰ��� �̾Ƽ� �����
		
		System.out.println("que.isEmpty() : " + que.isEmpty());//���� que�� ������� -> true
		System.out.println("que.size() : " + que.size());//���� que ������� 0
		
		System.out.println("que.peek() : " + que.peek());//������Ƿ� ������ Ȯ���� �ȵȴ�
		
		System.out.println("----- Queue ��ü ������ ���� -----");//poll ���
		while(!que.isEmpty()) {// ������� ������(�����Ͱ� ������)
			System.out.println("que.poll() : " + que.poll());
		}
		System.out.println(que);
		
		System.out.println("===== ����(stack : LIFO - ���Լ���) =====");
		Stack<String> st=new Stack<>();
		st.push("1.ù°");
		st.push("2.��°");
		st.add("3.��°");//add()���ÿ��� push()�� ������
		System.out.println(st);
		System.out.println(st.size());
		System.out.println("st.peek() : " + st.peek()); //.peek() �������� �Է��� �����͸� ��ȸ
		System.out.println("st.peek() : " + st.peek()); 
		System.out.println("st.peek() : " + st.peek()); //����� �ص� �� ������ �����͸� ��ȸ�Ѵ�
		System.out.println(st.size()); // ������ ���� ����
		
		//peek() : ������ Ȯ�θ�(���� ��밡��)
		//pop() : ������ ����ϱ�
		// �����Ͱ� ������ ���ܹ߻�(EmptyStackException)
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());//���ܹ߻�
		System.out.println(st);//���ܹ߻������Ƿ� ���� �ȵ�
		System.out.println(st.size());//���ܹ߻������Ƿ� ���� �ȵ�
		
		System.out.println("----- stack ��ü ����Ÿ ��ȸ -----");
		System.out.println(st.empty());// ������� �����Ƿ� false
		System.out.println(st.isEmpty());
		
		while(!st.empty()) {//������� ������
			System.out.println(st.pop());
			
		}
		System.out.println("st.size() : " + st.size());
		System.out.println("st.isEmpty() : " + st.isEmpty());
		
	}
}















