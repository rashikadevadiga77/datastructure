package com.rashika.tree.binaryTree.traversal;

import java.util.Stack;

import com.rashika.tree.binaryTree.Node;

public class InorderTraversal {
	public static void recursive(Node node) {
		if (node != null) {
			recursive(node.getLeft());
			System.out.print(node.getData() + " ");
			recursive(node.getRight());
		}
	}

	public static void nonRecursive(Node node) {
		Stack<Node> stack = new Stack<Node>();
		while (node != null) {
			stack.push(node);
			node = node.getLeft();
		}

		while (!stack.isEmpty()) {
			Node currNode = stack.pop();
			System.out.print(currNode.getData() + " ");
			if (currNode.getRight() != null) {
				currNode = currNode.getRight();
				while (currNode != null) {
					stack.push(currNode);
					currNode = currNode.getLeft();
				}
			}
		}
	}
}
