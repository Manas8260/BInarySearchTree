package BinarySearchTree;

import java.util.*;

public class BST_Iterator_adv {
	private Stack<Node> stack = new Stack<Node>();
	boolean rev = true;
	
	public BST_Iterator_adv(Node root,boolean isRev) {
		rev = isRev;
		pushAll(root);
	}
	
	public boolean hasNext() {
		return !stack.isEmpty();
	}
	
	public int next() {
		Node tN = stack.pop();
		if(rev == false)pushAll(tN.right);
		else pushAll(tN.left);
		return tN.data;
	}
	public void pushAll(Node node) {
		while(node != null) {
			stack.push(node);
			if(rev)
				node = node.right;
			else
				node = node.left;
		}
	}

}
