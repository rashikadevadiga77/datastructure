package com.rashika.queue;

public class Queue<T> {
	Node<T> front = null;
	Node<T> rear = null;

	public void enqueue(T data) {
		Node<T> newNode = new Node<T>(data);
		if (rear == null) {
			front = rear = newNode;
		} else {
			rear.setNext(newNode);
			rear = newNode;
		}
	}

	public T dequeue() {
		if (front == null) {
			return null;
		} else {
			Node<T> node = front;
			if (rear == front) {
				front = rear = null;
			} else {
				front = front.getNext();
			}
			return node.getData();
		}
	}

	public Node<T> peek() {
		return rear;
	}

	public Boolean isEmpty() {
		return rear == null && front == null;
	}

	public void print() {
		if (front == null) {
			System.out.println("Queue is empty.");
		}
		Node<T> node = front;
		while (node != null) {
			System.out.print(node.getData() + " ");
			node = node.getNext();
		}
	}

	public int size() {
		int size = 0;
		Node node = front;
		while (node != null) {
			size++;
			node = node.getNext();
		}
		return size;
	}
}
