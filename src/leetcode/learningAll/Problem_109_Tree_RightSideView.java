package leetcode.learningAll;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
* @author nilzxq
* @version 2020年4月22日 下午6:31:51
*类说明
*/
public class Problem_109_Tree_RightSideView {

	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val=x;
		}
	}
	//广度优先搜索进行层次遍历
	public static List<Integer> rightSideView(TreeNode root){
		List<Integer> res=new ArrayList<>();
		if(root==null) {
			return res;
		}
		Queue<TreeNode> queue=new LinkedList<>();//定义队列，将根节点入队
		queue.offer(root);
		while(!queue.isEmpty()) {
			int size=queue.size();//当前队列大小，即当前层的节点个数
			for(int i=0;i<size;i++) {//遍历当前层的所有节点
				TreeNode node=queue.poll();
				//将当前节点的左右孩子入队
				if(node.left!=null) {
					queue.offer(node.left);
				}
				if(node.right!=null) {
					queue.offer(node.right);
				}
				if(i==size-1) { //将当前层的最后一个节点放入结果列表
					res.add(node.val);
				}
			}
		}
		return res;
	}

	//我们按照 「根结点 -> 右子树 -> 左子树」 的顺序访问， 就可以保证每层都是最先访问最右边的节点的。
	public static List<Integer> res=new ArrayList<>();
	public static List<Integer> rightSideView1(TreeNode root){
		dfs(root,0);
		return res;
	}

	private static void dfs(TreeNode root,int depth) {
		if(root==null) {
			return;
		}
		//先访问当前节点，再递归地访问右子树和左子树
		//如果当前节点所在深度还没有出现地res里，说明在该深度下当前节点是第一个被访问的
		//节点，因此将当前节点加入res中。
		if(depth==res.size()) {
			res.add(root.val);
		}
		depth++;
		dfs(root.right,depth);
		dfs(root.left,depth);
	}

	public static void main(String[] args) {
		TreeNode node=new TreeNode(1);
		node.left=new TreeNode(2);
		node.right=new TreeNode(3);
		node.left.right=new TreeNode(5);
		node.right.right=new TreeNode(4);
		System.out.println(rightSideView(node));
		System.out.println(rightSideView1(node));
	}
}
