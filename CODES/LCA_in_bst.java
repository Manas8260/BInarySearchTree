package BinarySearchTree;

public class LCA_in_bst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static Node LCA(Node root, Node p,Node q) {
		if(root == null)
			return null;
		
		int cur = root.data;
		if(cur < p.data && cur < q.data) {
			return LCA(root.right, p, q);
		}
		if(cur > p.data && cur >q.data) {
			return LCA(root.left, p, q);
		}
		return root;
	}
	
}
