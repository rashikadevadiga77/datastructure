package com.rashika.tree.binaryTree.binarySearchTree;

public class TestBinarySearchTree {
	public static void main(String[] args) {
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		tree.add(5);
		System.out.println("Added element 5 ");
		tree.print();
		tree.add(6);
		tree.add(0);
		tree.add(1);
		tree.add(7);
		tree.add(5);
		System.out.println("Added element 6 0 1 7 3 ");
		tree.print();
	}
}
