package com.rashika.tree.binaryTree.problems;

import com.rashika.tree.binaryTree.Node;
import com.rashika.tree.binaryTree.binarySearchTree.BinarySearchTree;
import com.rashika.tree.binaryTree.util.BinaryTreeCreator;


public class AncestorsOfNode<T extends Comparable<T>> {
	public static void main(String[] args) {
		AncestorsOfNode<Integer> ancestorsOfNode = new AncestorsOfNode<Integer>();
		BinaryTreeCreator<Integer> binaryTreeCreator = new BinaryTreeCreator<Integer>();
		BinarySearchTree<Integer> binarySearchTree = binaryTreeCreator.createBinarySearchTree();
		ancestorsOfNode.printAncestors(binarySearchTree.getRoot(), 7);
	}
	
	public boolean printAncestors(Node<T> root, T target){
		if(root == null){
			return false;
		}
		if(root.getData().equals(target)){
			System.out.print(root.getData() + " ");
			return true;
		}
		
		if(printAncestors(root.getLeft(), target) || printAncestors(root.getRight(), target)){
			System.out.print(root.getData() + " ");
			return true;
		}
		
		return false;
	}
}
