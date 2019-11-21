package leetcode;

/** 
* @author nilzxq
* @version 2019年11月21日 下午5:26:27 
*类说明 
*/
public class Problem_26_List_MaxDepth {
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val=x;
		}
	}

	public static int maxDepth(TreeNode root) {
		if(root==null){
			return 0;
		}
		int left=maxDepth(root.left);
		int right=maxDepth(root.right);
		return left>right?left+1:right+1;
	}
	
	public static void main(String[] args) {
		TreeNode head1 = new TreeNode(1);
		head1.left = new TreeNode(2);
		head1.right = new TreeNode(3);
		head1.right.left = new TreeNode(6);
		head1.right.right = new TreeNode(7);
		System.out.println(maxDepth(head1));
	}
}
