package com.rashika.linkedList;

import com.rashika.linkedList.util.LinkedListCreator;

public class RemoveElementFromLinkedList {
	public static void main(String[] args) {
		LinkedListCreator<Integer> linkedListCreator = new LinkedListCreator<Integer>();
		LinkedList<Integer> linkedList = linkedListCreator
				.createSequentialLinkedList(7);
		removeElementByIndex(linkedList, 3);

		linkedList = linkedListCreator.createSequentialLinkedList(7);
		Node node = linkedList.getNode(3);
		removeElementByNode(linkedList, node);
	}

	private static void removeElementByIndex(LinkedList<Integer> linkedList,
			int index) {
		System.out.println("Removing element by index: " + index);
		System.out.println("Linked list: ");
		linkedList.print();
		if (index > linkedList.size()) {
			return;
		}
		// 0 1 2 3 4 5
		Node previousNode = linkedList.getHead();
		for (int i = 0; i < index - 1; i++) {
			previousNode = previousNode.getNext();
		}

		previousNode.setNext(previousNode.getNext().getNext());

		System.out.println("After removing element: ");
		linkedList.print();
	}

	private static void removeElementByNode(LinkedList<Integer> linkedList,
			Node node) {
		System.out.println("Removing element by node: " + node);
		System.out.println("Linked list: ");
		linkedList.print();

		Node nextNode = node.getNext();
		node.setData(nextNode.getData());
		node.setNext(nextNode.getNext());
		
		System.out.println("After removing element: ");
		linkedList.print();
	}
}
