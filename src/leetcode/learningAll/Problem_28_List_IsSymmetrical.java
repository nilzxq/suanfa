package leetcode.learningAll;

/**
* @author nilzxq
* @version 2019年11月23日 下午3:51:25
*类说明
*/
public class Problem_28_List_IsSymmetrical {
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val=x;
		}
	}

	public static boolean isSymmetrical(TreeNode root) {
		if(root==null) {
			return true;
		}
		return comRoot(root.left,root.right);
	}

	public static boolean comRoot(TreeNode left,TreeNode right) {
		if(left==null) {
			return right==null;
		}
		if(right==null) {
			return false;
		}
		if(left.val!=right.val) {
			return false;
		}
		return comRoot(left.left,right.right)&&comRoot(left.right,right.left);
	}

	public static void main(String[] args) {
		TreeNode head = new TreeNode(1);
		head.left = new TreeNode(2);
		head.right = new TreeNode(2);
		head.left.left = new TreeNode(3);
		head.left.right = new TreeNode(4);
		head.right.left = new TreeNode(4);
		head.right.right = new TreeNode(3);
		System.out.println(isSymmetrical(head));
	}
}
