package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/** 
* @author nilzxq
* @version 2020年1月30日 下午8:51:28 
*类说明 
*/
public class Problem_90_Stack_InorderTraversal {

	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val=x;	
		}
		
		public static List<Integer> inorderTraversal(TreeNode root){
			List<Integer> res=new ArrayList<>();
			Stack<TreeNode> stack=new Stack<>();
			TreeNode curr=root;
			while(curr!=null||!stack.isEmpty()) {
				while(curr!=null) {
					stack.push(curr);
					curr=curr.left;
				}
				curr=stack.pop();
				res.add(curr.val);
				curr=curr.right;
			}
			return res;
		}
		
		public static void main(String[] args) {
			TreeNode head = new TreeNode(1);
			head.left = new TreeNode(2);
			head.right = new TreeNode(3);
			head.left.left = new TreeNode(4);
			head.right.left = new TreeNode(5);
			head.right.right = new TreeNode(6);
			head.right.left.left = new TreeNode(7);
			head.right.left.right = new TreeNode(8);
			System.out.println(inorderTraversal(head));
		}
	}
	
}
