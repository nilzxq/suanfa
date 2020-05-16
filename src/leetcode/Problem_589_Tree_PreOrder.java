package leetcode;

import java.util.ArrayList;
import java.util.List;

/** 
* @author nilzxq
* @version 2020年5月16日 下午8:56:48 
*类说明 
*/
public class Problem_589_Tree_PreOrder {

	public static class Node{
		public int val;
		public List<Node> children;
		public Node(int val) {
			this.val=val;
		}
		public Node(int val,List<Node> children) {
			this.val=val;
			this.children=children;
		}
	}
	static List<Integer> res=new ArrayList<Integer>();
	
	public static List<Integer> preorder(Node root){
		if(root==null) {
			return res;
		}
		res.add(root.val);
		for(Node child:root.children) {
			preorder(child);
		}
		return res;
	}
	
//	public static void main(String[] args) {
//		List<Node> root=new ArrayList<Node>(3);
//		Node head=new Node(1,root);
//		System.out.println(preorder(head));
//	}
//	
}
