package BinarySearchTree;

public class BST_from_preOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	static Node createBST(int a[], int bnd ,int i[]) {
		if(i[0] == a.length || a[i[0]] > bnd) {
			return null;
		}
		Node root = new Node(a[i[0]++]);
		root.left = createBST(a, root.data, i);
		root.right = createBST(a, bnd, i);
		return root;
	}

}
