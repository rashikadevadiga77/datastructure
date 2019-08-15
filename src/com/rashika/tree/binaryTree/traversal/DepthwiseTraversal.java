package com.rashika.tree.binaryTree.traversal;

import com.rashika.queue.Queue;
import com.rashika.tree.binaryTree.Node;
import com.rashika.tree.binaryTree.binarySearchTree.BinarySearchTree;

public class DepthwiseTraversal {
	public static void depthwiseTraversal(Node<?> root) {
		if (root == null) {
			return;
		}
		Queue<Node> queue = new Queue<Node>();
		queue.enqueue(root);

		while (!queue.isEmpty()) {
			Node node = queue.dequeue();
			System.out.print(node.getData() + " ");
			if (node.getLeft() != null) {
				queue.enqueue(node.getLeft());
			}

			if (node.getRight() != null) {
				queue.enqueue(node.getRight());
			}
		}
	}

	public static void depthWiseTraversal_pretty(Node<?> node) {
		if (node == null) {
			return;
		}
		Queue<Node> queue = new Queue<Node>();
		queue.enqueue(node);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				Node currNode = queue.dequeue();
				System.out.print(currNode.getData() + " ");
				if (currNode.getLeft() != null) {
					queue.enqueue(currNode.getLeft());
				}

				if (currNode.getLeft() != null) {
					queue.enqueue(currNode.getRight());
				}
			}
			System.out.println();
		}
	}

	public static void depthWiseTraversal_pretty2Queue(Node<?> node) {
		Queue<Node> queue1 = new Queue<Node>();
		Queue<Node> queue2 = new Queue<Node>();

		queue1.enqueue(node);
		while (!queue1.isEmpty() || !queue2.isEmpty()) {
			while (!queue1.isEmpty()) {
				Node currNode = queue1.dequeue();
				System.out.print(currNode.getData() + " ");
				if (currNode.getLeft() != null) {
					queue2.enqueue(currNode.getLeft());
				}

				if (currNode.getLeft() != null) {
					queue2.enqueue(currNode.getRight());
				}
			}
			System.out.println();
			while (!queue2.isEmpty()) {
				Node currNode = queue2.dequeue();
				System.out.print(currNode.getData() + " ");
				if (currNode.getLeft() != null) {
					queue1.enqueue(currNode.getLeft());
				}

				if (currNode.getLeft() != null) {
					queue1.enqueue(currNode.getRight());
				}
			}
			System.out.println();
		}
	}

	public static void depthWiseTraversal_prettyUsingHeight(
			BinarySearchTree<?> tree) {
		int height = tree.height();
		for (int i = 0; i < height; i++) {
			depthWiseTraversal_prettyUsingHeight(tree.getRoot(), i);
			System.out.println();
		}
	}

	private static void depthWiseTraversal_prettyUsingHeight(Node<?> node,
			int height) {
		if (height == 0) {
			System.out.print(node.getData() + " ");
		} else {
			depthWiseTraversal_prettyUsingHeight(node.getLeft(), height - 1);
			depthWiseTraversal_prettyUsingHeight(node.getRight(), height - 1);
		}
	}
}