package BinarySearchTree;

class Node{
	Node left,right;
	int data;
	public Node(Node root,int data) {
		left = null;
		right = null;
		this.data = data;
	}
}
public class Ceil_in_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static int findCeil(Node root,int key) {
		int ceil = -1;
		while(root!= null) {
			if(root.data == key) {
				ceil = root.data;
				return ceil;
			}
			if(key > root.data) {
				root = root.right;
			}else {
				ceil = root.data;
				root = root.left;
			}
		}
		return ceil;
	}

}
