package leetcode.learningAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
* @author nilzxq
* @version 2020年2月13日 下午7:09:11
*类说明
*/
public class Problem_104_HashMap_FindDuplicateSubtrees {

	 public static class TreeNode {
		 int val;
		 TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
		}

	 public static class Solution{
		 static Map<String,Integer> count;
		 static List<TreeNode> ans;
		 public static List<TreeNode> findDuplicatesSubtrees(TreeNode root){
			 count=new HashMap<>();
			 ans=new ArrayList<>();
			 collect(root);
			 return ans;
		 }
		public static String collect(TreeNode node) {
			if(node==null) return "#";
			String serial=node.val+","+collect(node.left)+","+collect(node.right);
			count.put(serial, count.getOrDefault(serial, 0)+1);
			if(count.get(serial)==2)
				ans.add(node);
			return serial;
		}

		public static void main(String[] args) {
			TreeNode head1 = new TreeNode(1);
			head1.left = new TreeNode(2);
			head1.left.left=new TreeNode(4);
			head1.right = new TreeNode(3);
			head1.right.left = new TreeNode(2);
			head1.right.left.left=new TreeNode(4);
			head1.right.right = new TreeNode(4);
			System.out.println(findDuplicatesSubtrees(head1));
		}
	 }
}
