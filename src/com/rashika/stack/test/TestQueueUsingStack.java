package com.rashika.stack.test;

import com.rashika.stack.QueueUsingStack;

public class TestQueueUsingStack {
	public static void main(String[] args) {
		QueueUsingStack<Integer> queue = new QueueUsingStack<Integer>();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		
		while(!queue.isEmpty()){
			System.out.print(queue.pop() + " ");
		}
	}
}
