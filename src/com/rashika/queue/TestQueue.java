package com.rashika.queue;

public class TestQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		
		System.out.print("Queue: ");
		queue.print();
		System.out.println();
		
		queue.dequeue();
		System.out.print("Queue: ");
		queue.print();
		System.out.println();
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		System.out.print("Queue: ");
		queue.print();
	}
}
