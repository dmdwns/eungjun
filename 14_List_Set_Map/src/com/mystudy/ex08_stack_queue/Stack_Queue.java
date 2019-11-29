package com.mystudy.ex08_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue {

	public static void main(String[] args) {
		// ť(Queue) : ���Լ���(FIFO)
		System.out.println("--- ť(Queue) : ���Լ���(FIFO) ---");
		Queue<String> que = new LinkedList<>();
		que.offer("1.ù°");
		que.add("2.��°");
		que.offer("3.��°");
		System.out.println(que);

		System.out.println("--- peek() ---");
		//peek() : �����͸� Ȯ�θ��ϰ� �������� ����
		System.out.println("que.peek() : " + que.peek()); //ó�� �Է� ������ ��ȸ
		System.out.println("que.peek() : " + que.peek()); 
		System.out.println("ť���嵥���� : " + que);
		
		System.out.println("--- poll() ----");
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		
		System.out.println("ť���嵥���� : " + que);
		System.out.println("que.isEmpty() : " + que.isEmpty());
		System.out.println("que.size() : " + que.size());
		System.out.println("que.peek() : " + que.peek()); 
		
		System.out.println("---- Queue ��ü ������ ���� ---");
		while (!que.isEmpty()) {//��� ���� ������(�����Ͱ� ������)
			System.out.println("que.poll() : " + que.poll());
		}
		System.out.println("que.size() : " + que.size());
		
		//////////////////////////////////////////
		System.out.println("==== ����(Stack : LIFO - ���Լ���) ====");
		Stack<String> st = new Stack<>();
		st.push("1.ù°");
		st.push("2.��°");
		st.add("3.��°"); //add() ���ÿ��� push()�� ������
		System.out.println(st);
		
		System.out.println("size() : " + st.size());
		System.out.println("peek() : " + st.peek());//�Ǹ����� �Է� ����Ÿ ��ȸ��
		System.out.println("peek() : " + st.peek());
		System.out.println("peek() : " + st.peek());
		System.out.println("size() : " + st.size());
		
		//peek() : ������ Ȯ�θ�(���� ��밡��)
		//pop() : ������ ����ϱ� 
		//   �����Ͱ� ���� �� pop() ����� EmptyStackException ���� �߻� 
//		System.out.println("pop() : " + st.pop());
//		System.out.println("pop() : " + st.pop());
//		System.out.println("pop() : " + st.pop());
//		System.out.println("pop() : " + st.pop()); //EmptyStackException ���� �߻�
		System.out.println(st);
		
		System.out.println("size() : " + st.size());
		
		System.out.println("--- ����(Stack) ��ü ������ ��ȸ ---");
		System.out.println("st.empty() : " + st.empty());
		System.out.println("st.isEmpty() : " + st.isEmpty());
		
		while (!st.empty()) { //������� ������
			System.out.println(st.pop());
		}
		System.out.println("size() : " + st.size());
		System.out.println("st.empty() : " + st.empty());
	}

}











