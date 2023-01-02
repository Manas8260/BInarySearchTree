package BinarySearchTree;

public class Validate_A_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		root.left = new Node(1);
		root.right = new Node(6);
		root.right.left = new Node(4);
		root.right.right = new Node(8);
		System.out.println(isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
		
	}
	static boolean isBST(Node root,int st,int end){
		if(root == null)
			return true;		
		if(root.data <= st || root.data >= endN) 
			return false;
		
		return isBST(root.left, st, root.data)&&isBST(root.right, root.data, end);
	}
	static boolean isValidB(Node root,int l,int r) {
		return root.data > l && root.data < r;
	}

}
