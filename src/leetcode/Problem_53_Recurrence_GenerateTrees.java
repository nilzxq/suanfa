package leetcode;

import java.util.ArrayList;
import java.util.List;

/** 
* @author nilzxq
* @version 2019年12月23日 下午6:10:46 
*类说明 
*/
public class Problem_53_Recurrence_GenerateTrees {
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val=x;
		}
	}

	public static List<TreeNode> generateTrees(int n){
		if(n==0) return new ArrayList<>();
		return generateTreeHelper(1,n);
	}
	
	public static List<TreeNode> generateTreeHelper(int i,int j){
		List<TreeNode> res=new ArrayList<>();
		//i>j返回一个空的子树
		if(i>j) {
			res.add(null);
			return res;
		}
		//i=j时返回一个节点的子树
		if(i==j) {
			res.add(new TreeNode(i));
			return res;
		}
		//分治+递归建树
		for(int k=i;k<=j;k++) {
			List<TreeNode> left=generateTreeHelper(i,k-1);
			List<TreeNode> right=generateTreeHelper(k+1,j);
			for(TreeNode tmpR:right) {
				for(TreeNode tmpL:left) {
					TreeNode tn=new TreeNode(k);
					tn.left=tmpL;
					tn.right=tmpR;
					res.add(tn);
				}
			}
		}
		return res;
	}
}
