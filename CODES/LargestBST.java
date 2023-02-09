package BinarySearchTree;
import java.util.*;

class NodeV{
	public int maxN,minN,maxS;
	NodeV(int minN,int maxN,int maxS) {
		this.minN = minN;
		this.maxN = maxN;
		this.maxS = maxS;
	}
	
}
public class LargestBST {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static NodeV largestBSTHHHH(Node root) {
		if(root == null) {
			return new NodeV(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
			
		}
		NodeV left = largestBSTHHHH(root.left);
		NodeV right = largestBSTHHHH(root.right);
		
		// current node is greater than the left and smaller than the right
		if(left.maxN < root.data && root.data < right.minN) {
			//It is a BST 
			return new NodeV(Math.min(root.data, left.minN), 
							Math.max(root.data, right.minN),
							left.maxS+right.maxS+1);
			
		}
		return new NodeV(Integer.MIN_VALUE, Integer.MAX_VALUE, Math.max(left.maxS, right.maxS));		
	}
	public static int largestBST(Node root) {
		return largestBSTHHHH(root).maxS;
	}
}
