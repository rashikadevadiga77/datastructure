package com.rashika.tree.binaryTree.traversal;

import java.util.Stack;

import com.rashika.tree.binaryTree.Node;

public class PostorderTraversal {
	public static void recursive(Node<?> node) {
		if (node != null) {
			recursive(node.getLeft());
			recursive(node.getRight());
			System.out.print(node.getData() + " ");
		}
	}

	public static void nonRecursive(Node<?> node) {
		Stack<Node> mainStack = new Stack<Node>();
		Stack<Node> tempStack = new Stack<Node>();

		mainStack.push(node);

		while (!mainStack.isEmpty()) {
			Node currNode = mainStack.pop();
			tempStack.push(currNode);

			if (currNode.getLeft() != null) {
				mainStack.push(currNode.getLeft());
			}

			if (currNode.getRight() != null) {
				mainStack.push(currNode.getRight());
			}
		}

		while (!tempStack.isEmpty()) {
			System.out.print(tempStack.pop().getData() + " ");
		}
	}
}
