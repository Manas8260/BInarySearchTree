package BinarySearchTree;

public class Recover_BST_2_nodes_swapped {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	private static Node first ;
	private static Node mid;
	private static Node last;
	private static Node prev;
	
	public static void inorder(Node root) {
		
		if(root == null)
			return ;
		
		inorder(root.left);
		
		if(prev != null && root.data < prev.data) {
			//1st violation
			//mark these 2 as first and middle
			if(first == null) {
				first = prev;
				mid = root;
			}
			//2nd violation
			//mark root as last 
			else {
				last = root;
			}
		}
		// Mark this as previous
		prev = root;
		inorder(root.right);
	}
	public static void correctIN(Node root) {
		first = mid = last = null;
		prev = new Node(Integer.MIN_VALUE);
		inorder(root);
		
		if(first != null && last != null) {
			int t = first.data;
			first.data = last.data;
			last.data = t;
		}else if(first != null && mid != null) {
			int t = first.data;
			first.data = last.data;
			last.data = t;
		}
	}
	

}
