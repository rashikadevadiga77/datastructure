package com.rashika.linkedList;

import com.rashika.linkedList.util.LinkedListCreator;

public class ReverseALinkedList<T extends Comparable<T>>{
	public static void main(String[] args) {
		LinkedListCreator<Integer> linkedListCreator = new LinkedListCreator<Integer>();
		LinkedList<Integer> linkedList = linkedListCreator
				.createSequentialLinkedList(7);
		System.out.println("Before reverse: " + linkedList.toString());
		
		ReverseALinkedList<Integer> reverseALinkedList = new ReverseALinkedList<Integer>();
		reverseALinkedList.reverseLinkedList(linkedList);
		System.out.println("After reverse: " + linkedList.toString());
	}
	
	public void reverseLinkedList(LinkedList<T> linkedList){
		Node<T> curr = linkedList.getHead();
		Node<T> prev = null;
		Node<T> next = null;
		while(curr != null){
			next = curr.getNext();
			curr.setNext(prev);
			prev = curr;
			curr = next;
		}
		linkedList.setHead(prev);
	}
}
