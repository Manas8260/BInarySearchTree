package BinarySearchTree;

public class INsert_a_Node_in_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 static Node insertIntoBST(Node root, int key) {
	        if(root == null){
	            return new Node(key) ;
	        }
	        Node cur = root;
	        while(cur != null){
	            if(key < cur.data){
	                if(cur.left == null){
	                   cur.left = new Node(key);
	                   break;
	                }
	                cur = cur.left;
	            }else if(key > cur.data){
	                if(cur.right == null){
	                    cur.right = new Node(key);
	                    break;
	                }
	                cur = cur.right;
	            }
	        }
	        return root;
	    }

}
