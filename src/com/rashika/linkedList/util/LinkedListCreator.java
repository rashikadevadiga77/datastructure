package com.rashika.linkedList.util;

import com.rashika.linkedList.LinkedList;

public class LinkedListCreator<T> {
	public LinkedList<T> createLinkedList(int size) {
		LinkedList<T> linkedList = new LinkedList<T>();
		int min = 1;
		for (int i = 0; i < size; i++) {
			Integer element = (int) (Math.random() * ((size - min) + 1) + min);
			linkedList.add((T) element);
		}
		return linkedList;
	}

	public LinkedList<T> createSequentialLinkedList(int size) {
		LinkedList<T> linkedList = new LinkedList<T>();
		int min = 1;
		for (Integer i = 0; i < size; i++) {
			linkedList.add((T) i);
		}
		return linkedList;
	}

	public LinkedList<T> createLinkedList(T[] elements) {
		LinkedList<T> linkedList = new LinkedList<T>();
		for (T element : elements) {
			linkedList.add(element);
		}
		return linkedList;
	}
}
