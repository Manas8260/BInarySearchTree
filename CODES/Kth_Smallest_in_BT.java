package BinarySearchTree;

import java.util.Stack;

public class Kth_Smallest_in_BT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		root.left = new Node(3);
		root.right = new Node(7);
		root.left.left =new Node(1);
		root.left.right =new Node(4);
		root.left.left.right =new Node(2);
		root.right.right = new Node(8);
		root.right.left = new Node(6);
		System.out.println(kthSmall(root, 2));
		System.out.println(KthLarge(root, 2));
	}
	static int kthSmall(Node root,int key) {
		if(root == null) {
			return -1;
		}
		int cnt =0;
		Stack<Node> st = new Stack<>();
		Node node = root,
				ansN = null;
		while(true) {
			if(node != null) {
				st.push(node);
				node = node.left;
			}else {
				if(st.isEmpty()) {
					break;
				}
				node = st.pop();
				cnt++;
				if(cnt == key) {
					ansN = node;
					break;
				}
				node = node.right;
			}
		}
		return ansN != null?ansN.data:-1;
	}
	static int KthLarge(Node root,int key) {
		if(root == null) {
			return -1;
		}
		int cnt =0;
		Stack<Node> st = new Stack<>();
		st.add(root);
		while(!st.isEmpty()) {
			Node n = st.pop();
			cnt++;
			if(n.left != null) {
				st.add(n.left);
			}
			if(n.right != null) {
				st.add(n.right);
			}
		}
		int ks = cnt - key + 1;
		return kthSmall(root, ks);
	}

}
