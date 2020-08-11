package leetcode.learningAll;

import java.util.LinkedList;
import java.util.List;


/**
* @author nilzxq
* @version 2019年11月25日 下午6:39:49
*类说明
*/
public class Problem_29_List_Levelorder {

	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val=x;
		}
	}
	public static List<List<Integer>> levelOrder(TreeNode root){
		List<List<Integer>> res=new LinkedList<>();
		if(root==null) {
			return res;
		}
		levelOrderHelper(res,root,0);
		return res;
	}

	public static void levelOrderHelper(List<List<Integer>> res,TreeNode root,int depth) {
		if(root==null) {
			return;
		}
		if(res.size()<=depth) {
			res.add(new LinkedList<>());
		}
		res.get(depth).add(root.val);
		levelOrderHelper(res,root.left,depth+1);
		levelOrderHelper(res,root.right,depth+1);
	}

	public static void main(String[] args) {
		TreeNode head1 = new TreeNode(1);
		head1.left = new TreeNode(2);
		head1.right = new TreeNode(3);
		head1.right.left = new TreeNode(6);
		head1.right.right = new TreeNode(7);
		List<List<Integer>> res=levelOrder(head1);
		System.out.println(res);
	}
}
