package chapter_3_binarytreeproblem;

import java.util.Stack;

/** 
* @author nilzxq
* @version 2019年6月11日 上午8:37:17 
* 类说明 
*/

public class Problem_01_PreInPosTraversal {
	
	/**
	 * 构建二叉树
	 *
	 */
	public static class Node{
		public int value;
		public Node left;
		public Node right;
		
		public Node(int data) {
			this.value=data;
		}
	}
	/**
	 * 递归 前序遍历
	 * @param head
	 */
	public static void preOrderRecur(Node head) {
		if(head==null) {
			return;
		}
		System.out.print(head.value+" ");
		preOrderRecur(head.left);
		preOrderRecur(head.right);
	}
	
	/**
	 * 递归 中序遍历
	 * @param head
	 */
	public static void inOrderRecur(Node head) {
		if(head==null) {
			return;
		}
		inOrderRecur(head.left);
		System.out.print(head.value+" ");
		inOrderRecur(head.right);
	}
	
	/*
	 * 递归 后序遍历
	 */
	public static void posOrderRecur(Node head) {
		if(head==null) {
			return;
		}
		posOrderRecur(head.left);
		posOrderRecur(head.right);
		System.out.print(head.value+" ");
	}
	
	/**
	 * 用非递归的方式实现前序遍历
	 * 1.申请一个新的栈，记为stack.然后将头节点head压入stack中
	 * 2.从stack中弹出栈顶节点，记为cur,然后打印cur节点的值，再将节点cur的右孩子（不为空的话）先压入stack中
	 *   最后将cur的左孩子（不为空的话）压入stack中
	 * 3.不断重复步骤2，直到stack为空，全部过程结束
	 * @param head
	 */
	public static void preOrderUnRecur(Node head) {
		System.out.print("pre-order:");
		if(head!=null) {
			Stack<Node> stack=new Stack<Node>();
			stack.add(head);
			while(!stack.isEmpty()) {
				head=stack.pop();
				System.out.print(head.value+" ");
				if(head.right!=null) {
					stack.push(head.right);
				}
				if(head.left!=null) {
					stack.push(head.left);
				}
			}
		}
		System.out.println();
	}
	
	public static void inOrderUnRecur(Node head) {
		System.out.print("in-order:");
		if(head!=null) {
			Stack<Node> stack=new Stack<Node>();
			while(!stack.isEmpty()||head!=null) {
				if(head!=null) {
					stack.push(head);
					head=head.left;
				}else {
					head=stack.pop();
					System.out.print(head.value+" ");
					head=head.right;
					}
			}
		}
		System.out.println();
	}
	
	/**
	 * 后序遍历 非递归方式1
	 * 1.申请一个栈，记为s1，然后将头节点head压入s1中
	 * 2.从s1中弹出的节点记为cur,然后依次将cur的左孩子和右孩子压入s1中
	 * 3.整个过程中，每一个从s1中弹出的节点都放进s2中
	 * 4.不断重复步骤2和步骤3，直到s1为空，过程停止
	 * 5.从s2中依次弹出节点并打印，打印的顺序就是后序遍历的顺序
	 * @param head
	 */
	public static void posOrderUnRecur1(Node head) {
		System.out.print("pos-order: ");
		if(head!=null) {
			Stack<Node> s1=new Stack<Node>();
			Stack<Node> s2=new Stack<Node>();
			s1.push(head);
			while(!s1.isEmpty()) {
				head=s1.pop();
				s2.push(head);
				if(head.left!=null) {
					s1.push(head.left);
				}
				if(head.right!=null) {
					s1.push(head.right);
				}
			}
			while(!s2.isEmpty()) {
				System.out.print(s2.pop().value+" ");
			}
		}
		System.out.println();
	}
	
	/**
	 * 后序遍历 非递归方式2
	 * h代表最近一次弹出并打印的节点，初始时h为头节点
	 * c代表stack的栈顶节点
	 * @param h
	 */
	public static void posOrderUnRecur2(Node h) {
		System.out.print("pos-order: ");
		if(h!=null) {
			Stack<Node> stack=new Stack<Node>();
			stack.push(h);
			Node c=null;
			while(!stack.isEmpty()) {
				c=stack.peek();
				if(c.left!=null&&h!=c.left&&h!=c.right) {
					stack.push(c.left);
				}else if(c.right!=null&&h!=c.right) {
					stack.push(c.right);
				}else {
					System.out.print(stack.pop().value+" ");
					h=c;
				}
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node head = new Node(5);
		head.left = new Node(3);
		head.right = new Node(8);
		head.left.left = new Node(2);
		head.left.right = new Node(4);
		head.left.left.left = new Node(1);
		head.right.left = new Node(7);
		head.right.left.left = new Node(6);
		head.right.right = new Node(10);
		head.right.right.left = new Node(9);
		head.right.right.right = new Node(11);

		// recursive
		System.out.println("==============recursive==============");
		System.out.print("pre-order: ");
		preOrderRecur(head);
		System.out.println();
		System.out.print("in-order: ");
		inOrderRecur(head);
		System.out.println();
		System.out.print("pos-order: ");
		posOrderRecur(head);
		System.out.println();

		// unrecursive
		System.out.println("============unrecursive=============");
		preOrderUnRecur(head);
		inOrderUnRecur(head);
		posOrderUnRecur1(head);
		posOrderUnRecur2(head);

	}

}
