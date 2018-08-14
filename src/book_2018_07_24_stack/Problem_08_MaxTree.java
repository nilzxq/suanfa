package book_2018_07_24_stack;

import java.util.HashMap;
import java.util.Stack;

/** 
* @author nilzxq
* @version 2018年8月7日 下午2:34:24 
* 类说明 
*/
public class Problem_08_MaxTree {

	public static class Node{
		public int value;
		public Node left;
		public Node right;
		public Node(int data) {
			this.value=data;
		}
	}
	
	public Node getMaxTree(int[] arr) {
		Node[] nArr=new Node[arr.length];
		for(int i=0;i!=arr.length;i++) {
			nArr[i]=new Node(arr[i]);
		}
		Stack<Node> stack=new Stack<Node>();
		HashMap<Node,Node> lBigMap=new HashMap<Node,Node>();
		HashMap<Node,Node> rBigMap=new HashMap<Node,Node>();
		for(int i=0;i!=nArr.length;i++) {
			Node curNode=nArr[i];
			while((!stack.isEmpty())&&stack.peek().value<curNode.value) {
				popStackSetMap(stack,lBigMap);
			}
		}
	}

	private void popStackSetMap(Stack<Node> stack, HashMap<Node, Node> lBigMap) {
		// TODO Auto-generated method stub
		
	}
}
