package BinarySearchTree;

public class TWO_SUM_IN_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public boolean findTarget(Node root,int k) {
		if(root == null)return false;
		BST_Iterator_adv l = new BST_Iterator_adv(root, false);
		BST_Iterator_adv r = new BST_Iterator_adv(root, true);
		
		int i = l.next(), j = r.next();
		while(i<j) {
			if(i+j == k)return true;
			else if(i+j < k)i = l.next();
			else j = r.next();
		}
		return false;
	}

}
