package com.mystudy.ex08_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue {

	public static void main(String[] args) {
		// 큐(Queue) : 선입선출(FIFO)
		System.out.println("--- 큐(Queue) : 선입선출(FIFO) ---");
		Queue<String> que = new LinkedList<>();
		que.offer("1.첫째");
		que.add("2.둘째");
		que.offer("3.셋째");
		System.out.println(que);

		System.out.println("--- peek() ---");
		//peek() : 데이터를 확인만하고 꺼내지는 않음
		System.out.println("que.peek() : " + que.peek()); //처음 입력 데이터 조회
		System.out.println("que.peek() : " + que.peek()); 
		System.out.println("큐저장데이터 : " + que);
		
		System.out.println("--- poll() ----");
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		System.out.println("que.poll() : " + que.poll());
		
		System.out.println("큐저장데이터 : " + que);
		System.out.println("que.isEmpty() : " + que.isEmpty());
		System.out.println("que.size() : " + que.size());
		System.out.println("que.peek() : " + que.peek()); 
		
		System.out.println("---- Queue 전체 데이터 추출 ---");
		while (!que.isEmpty()) {//비어 있지 않으면(데이터가 있으면)
			System.out.println("que.poll() : " + que.poll());
		}
		System.out.println("que.size() : " + que.size());
		
		//////////////////////////////////////////
		System.out.println("==== 스택(Stack : LIFO - 후입선출) ====");
		Stack<String> st = new Stack<>();
		st.push("1.첫째");
		st.push("2.둘째");
		st.add("3.셋째"); //add() 사용시에도 push()와 동일함
		System.out.println(st);
		
		System.out.println("size() : " + st.size());
		System.out.println("peek() : " + st.peek());//맨마지막 입력 데이타 조회됨
		System.out.println("peek() : " + st.peek());
		System.out.println("peek() : " + st.peek());
		System.out.println("size() : " + st.size());
		
		//peek() : 데이터 확인만(현재 사용가능)
		//pop() : 꺼내서 사용하기 
		//   데이터가 없을 때 pop() 실행시 EmptyStackException 예외 발생 
//		System.out.println("pop() : " + st.pop());
//		System.out.println("pop() : " + st.pop());
//		System.out.println("pop() : " + st.pop());
//		System.out.println("pop() : " + st.pop()); //EmptyStackException 예외 발생
		System.out.println(st);
		
		System.out.println("size() : " + st.size());
		
		System.out.println("--- 스택(Stack) 전체 데이터 조회 ---");
		System.out.println("st.empty() : " + st.empty());
		System.out.println("st.isEmpty() : " + st.isEmpty());
		
		while (!st.empty()) { //비어있지 않으면
			System.out.println(st.pop());
		}
		System.out.println("size() : " + st.size());
		System.out.println("st.empty() : " + st.empty());
	}

}











