package leetcode.learningAll;

import java.util.ArrayList;
import java.util.List;


/**
* @author nilzxq
* @version 2019年11月22日 下午7:30:22
*类说明
*/
public class Problem_27_List_IsValidBST {

	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val=x;
		}
	}

	public static boolean isValidBST(TreeNode root) {
		if(root==null){
			return true;
		}
		List<Integer> list=new ArrayList<Integer>();
		orderBST(root,list);
		for(int i=0;i<list.size()-1;i++) {
			if(list.get(i)>=list.get(i+1)) return false;
		}
		return true;
	}

	public static void orderBST(TreeNode root,List<Integer> list) {
		if(root==null) return;
		orderBST(root.left,list);
		list.add(root.val);
		orderBST(root.right,list);
	}

	public static void main(String[] args) {
		TreeNode head = new TreeNode(1);
		head.left = new TreeNode(0);
		head.right = new TreeNode(3);
		head.right.left = new TreeNode(2);
		head.right.right = new TreeNode(7);
		System.out.println(isValidBST(head));
	}
}
