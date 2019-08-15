package com.rashika.tree.binaryTree.util;

import com.rashika.tree.binaryTree.Node;
import com.rashika.tree.binaryTree.binarySearchTree.BinarySearchTree;

public class BinaryTreeCreator<T extends Comparable<T>> {
	
	public Node<T> createBinaryTree() {
		Node<T> node = new Node(1);
		
		//Level 2
		node.setLeft(new Node(2));
		node.setRight(new Node(3));
		
		//Level 3
		node.getLeft().setLeft(new Node(4));
		node.getLeft().setRight(new Node(5));
		node.getRight().setLeft(new Node(6));
		node.getRight().setRight(new Node(7));
		
		return node;
	}

	public BinarySearchTree<T> createBinarySearchTree(T[] elements) {
		BinarySearchTree<T> binarySearchTree = new BinarySearchTree<T>();
		for(T element : elements){
			binarySearchTree.add(element);
		}
		return binarySearchTree;
	}
	
	public BinarySearchTree<T> createBinarySearchTree(int size) {
		BinarySearchTree<T> binarySearchTree = new BinarySearchTree<T>();
		int min  = 1;
		for(int i = 0; i<size; i++){
			Integer element = (int) (Math.random() * ((size - min) + 1) + min);
			binarySearchTree.add((T)element);
		}
		return binarySearchTree;
	}
}
