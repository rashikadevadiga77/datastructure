package com.rashika.tree.binaryTree.binarySearchTree;

import com.rashika.tree.binaryTree.Node;

/**
 * 
 * @author Rashika The right subtree of a node contains only nodes with key
 *         greater than the node's key.
 * 
 */
public class BinarySearchTree<T extends Comparable<T>> {
	private Node<T> root = null;

	public Node<T> getRoot() {
		return root;
	}
	
	public void add(T element) {
		if (this.root == null) {
			this.root = new Node<T>(element);
		} else {
			Node<T> currNode = this.root;
			while (currNode != null) {
				if (currNode.getData().compareTo(element) >= 0) {
					if (currNode.getLeft() == null) {
						Node<T> newNode = new Node<T>(element);
						currNode.setLeft(newNode);
						break;
					} else {
						currNode = currNode.getLeft();
					}
				} else {
					if (currNode.getRight() == null) {
						Node<T> newNode = new Node<T>(element);
						currNode.setRight(newNode);
						break;
					} else {
						currNode = currNode.getRight();
					}
				}
			}
		}
	}

	/**
	 * In order traversal of tree(ascending).
	 */
	public void print() {
		print(this.root);
		System.out.println();
	}

	private void print(Node<T> node) {
		if (node != null) {
			print(node.getLeft());
			System.out.print(node.getData() + " ");
			print(node.getRight());
		}
	}
}
