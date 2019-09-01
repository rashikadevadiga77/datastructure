package com.rashika.linkedList;

public class LinkedList<T> {
	Node<T> head;

	public void add(T element) {
		if (head == null) {
			head = new Node<T>(element);
		} else {
			Node<T> currNode = head;
			while (currNode.getNext() != null) {
				currNode = currNode.getNext();
			}
			Node<T> newNode = new Node<T>(element);
			currNode.setNext(newNode);
		}
	}

	public Node<T> getHead() {
		return head;
	}
	
	public void setHead(Node<T> head) {
		this.head = head;
	}

	public void print() {
		print(head);
	}

	private void print(Node<T> node) {
		if (node != null) {
			System.out.print(node.getData() + " ");
			print(node.getNext());
		}
	}

	public int size() {
		int size = 0;
		Node node = this.head;
		while (node != null) {
			size++;
			node = node.getNext();
		}
		return size;
	}

	public Node<T> getNode(int index) {
		if (index > size()) {
			return null;
		}
		Node node = head;
		for(int i = 0; i<index; i++){
			node = node.getNext();
		}
		return node;
	}
	
	@Override
	public String toString() {
		Node<T> node = head;
		StringBuilder output = new StringBuilder();
		while (node != null) {
			output.append(node.getData().toString()).append(" ");
			node = node.getNext();
		}
		return output.toString();
	}
}
