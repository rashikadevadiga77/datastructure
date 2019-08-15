package com.rashika.tree.binaryTree.traversal;

import com.rashika.tree.binaryTree.binarySearchTree.BinarySearchTree;
import com.rashika.tree.binaryTree.util.BinaryTreeCreator;

public class TestTraversal {
	public static void main(String[] args) {
		testInorderTraversal();
	}

	private static void testInorderTraversal() {
		System.out.println("Testing inorder traversal");
		BinaryTreeCreator<Integer> binaryTreeCreator = new BinaryTreeCreator<Integer>();
		BinarySearchTree<Integer> tree = binaryTreeCreator
				.createBinarySearchTree(11);

		// Test Inorder traversal
		System.out.println("Inorder Traversal: ");
		System.out.println("Recursive: ");
		InorderTraversal.recursive(tree.getRoot());
		System.out.println();
		System.out.println("Non Recursive: ");
		InorderTraversal.nonRecursive(tree.getRoot());
		System.out.println();

		// Test Preorder traversal
		System.out.println("Preorder Traversal: ");
		System.out.println("Recursive: ");
		PreorderTraversal.recursive(tree.getRoot());
		System.out.println();
		System.out.println("Non Recursive: ");
		PreorderTraversal.nonRecursive(tree.getRoot());
		System.out.println();

		// Test Postorder traversal
		System.out.println("Postorder Traversal: ");
		System.out.println("Recursive: ");
		PostorderTraversal.recursive(tree.getRoot());
		System.out.println();
		System.out.println("Non Recursive: ");
		PostorderTraversal.nonRecursive(tree.getRoot());
		System.out.println();

		// Test Depthwise traversals
		tree = binaryTreeCreator.createBinarySearchTree();
		System.out.println("Simple Depthwise traversal using queue");
		DepthwiseTraversal.depthwiseTraversal(tree.getRoot());
		System.out.println();

		System.out.println("Depthwise traversal - pretty display:");
		DepthwiseTraversal.depthWiseTraversal_pretty(tree.getRoot());
		System.out.println();

		System.out.println("Depthwise traversal - pretty display(2 queues):");
		DepthwiseTraversal.depthWiseTraversal_pretty2Queue(tree.getRoot());
		System.out.println();
		
		System.out.println("Depthwise traversal - pretty display(using height):");
		DepthwiseTraversal.depthWiseTraversal_prettyUsingHeight(tree);
		System.out.println();
	}
}
