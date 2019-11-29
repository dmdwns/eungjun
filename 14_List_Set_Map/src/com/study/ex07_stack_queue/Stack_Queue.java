package com.study.ex07_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Stack_Queue {
	
	public static void main(String[] args) {
		//큐(Queue) : 선입선출(FIFO)
		System.out.println("----- 큐(Queue) : 선입선출(FIFO) -----");
		Queue<String> que = new LinkedList<>();
		que.offer("1.첫째");
		que.add("2.둘째");
		que.offer("3.셋째");
		System.out.println(que);
		
		System.out.println("----- peek() -----");
		//.peek() : 데이터를 확인만하고 꺼내지는 않음
		System.out.println("que.peek() : " + que.peek());//.peek()-->첫번째 데이터 뽑는다
		System.out.println("que.peek() : " + que.peek());//.peek()-->두번써도 첫번째 데이터 뽑는다
		System.out.println("큐저장데이터(peek) : " + que);//뽑아내도 그대로다. 즉 확인만 한 것
		
		System.out.println("----- poll() -----");
//		System.out.println("que.poll() : " + que.poll());//첫번째 데이터 뽑는다
//		System.out.println("que.poll() : " + que.poll());//두번째 데이터 뽑는다
//		System.out.println("que.poll() : " + que.poll());//세번째 데이터 뽑는다
//		System.out.println("que.poll() : " + que.poll());//네번째 데이터 뽑는다
//		System.out.println("큐저장데이터(pool) : " + que);//초과로 뽑아서 사라짐
		
		System.out.println("que.isEmpty() : " + que.isEmpty());//따라서 que는 비어있음 -> true
		System.out.println("que.size() : " + que.size());//따라서 que 사이즈는 0
		
		System.out.println("que.peek() : " + que.peek());//비었으므로 데이터 확인이 안된다
		
		System.out.println("----- Queue 전체 데이터 추출 -----");//poll 사용
		while(!que.isEmpty()) {// 비어있지 않으면(데이터가 있으면)
			System.out.println("que.poll() : " + que.poll());
		}
		System.out.println(que);
		
		System.out.println("===== 스택(stack : LIFO - 후입선출) =====");
		Stack<String> st=new Stack<>();
		st.push("1.첫째");
		st.push("2.둘째");
		st.add("3.셋째");//add()사용시에도 push()와 동일함
		System.out.println(st);
		System.out.println(st.size());
		System.out.println("st.peek() : " + st.peek()); //.peek() 마지막에 입력한 데이터를 조회
		System.out.println("st.peek() : " + st.peek()); 
		System.out.println("st.peek() : " + st.peek()); //몇번을 해도 맨 마지막 데이터만 조회한다
		System.out.println(st.size()); // 사이즈 변함 없다
		
		//peek() : 데이터 확인만(현재 사용가능)
		//pop() : 꺼내서 사용하기
		// 데이터가 없으면 예외발생(EmptyStackException)
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());
//		System.out.println("st.pop() : " + st.pop());//예외발생
		System.out.println(st);//예외발생했으므로 실행 안됨
		System.out.println(st.size());//예외발생했으므로 실행 안됨
		
		System.out.println("----- stack 전체 데이타 조회 -----");
		System.out.println(st.empty());// 비어있지 않으므로 false
		System.out.println(st.isEmpty());
		
		while(!st.empty()) {//비어있지 않으면
			System.out.println(st.pop());
			
		}
		System.out.println("st.size() : " + st.size());
		System.out.println("st.isEmpty() : " + st.isEmpty());
		
	}
}















