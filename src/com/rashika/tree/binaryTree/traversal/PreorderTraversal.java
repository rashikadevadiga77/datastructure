package com.rashika.tree.binaryTree.traversal;

import java.util.Stack;

import com.rashika.tree.binaryTree.Node;

public class PreorderTraversal {
	public static void recursive(Node<?> node) {
		if (node != null) {
			System.out.print(node.getData() + " ");
			recursive(node.getLeft());
			recursive(node.getRight());
		}
	}

	public static void nonRecursive(Node<?> node) {
		Stack<Node> stack = new Stack<Node>();
		stack.push(node);
		while (!stack.isEmpty()) {
			Node currNode = stack.pop();
			System.out.print(currNode.getData() + " ");
			if (currNode.getRight() != null) {
				stack.push(currNode.getRight());
			}

			if (currNode.getLeft() != null) {
				stack.push(currNode.getLeft());
			}
		}
	}
}
