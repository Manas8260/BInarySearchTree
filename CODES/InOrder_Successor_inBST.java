package BinarySearchTree;

public class InOrder_Successor_inBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	static Node inorderSuccessor(Node root,Node x)
    {
     //add code here.
     Node suc = null;
     int min = Integer.MAX_VALUE;
     while(root != null){
           if(root.data <= x.data){
               root = root.right;
           }else if(root.data > x.data){
               if(min > root.data){
                   min = root.data;
                   suc = root;
               }
               root= root.left;
           }
     }
     return suc;
    }
}
