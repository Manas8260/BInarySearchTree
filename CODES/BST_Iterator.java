package BinarySearchTree;

import java.util.*;
public class BST_Iterator {
	private Stack<Node> stack = new Stack<Node>();
	
	public BST_Iterator(Node root) {
		pushAll(root);
	}
	public boolean hasNext() {
		return !stack.isEmpty();
	}
	public int next() {
		Node tN = stack.pop();
		pushAll(tN.right);
		return tN.data;
	}
	private void pushAll(Node node) {
		for(; node != null ;stack.push(node),node = node.left);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
