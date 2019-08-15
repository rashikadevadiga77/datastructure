package com.rashika.tree.binaryTree;
/**
 * 
 * @author Rashika
 *
 * @param <T>
 * Node of a binary tree
 */
public class Node<T extends Comparable<T>> {
	private T data;
	Node<T> left, right;

	public Node(T data) {
		this.data = data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setLeft(Node<T> left) {
		this.left = left;
	}

	public Node<T> getLeft() {
		return left;
	}

	public void setRight(Node<T> right) {
		this.right = right;
	}

	public Node<T> getRight() {
		return right;
	}
}
