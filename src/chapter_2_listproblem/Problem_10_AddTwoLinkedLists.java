package chapter_2_listproblem;

import java.util.Stack;

/** 
* @author nilzxq
* @version 2019年5月28日 下午9:18:34 
* 类说明 
*/
public class Problem_10_AddTwoLinkedLists {

	public static class Node{
		public int value;
		public Node next;
		
		public Node(int data) {
			this.value=data;
		}
	}
	
	public static Node addList1(Node head1,Node head2) {
		Stack<Integer> s1=new Stack<Integer>();
		Stack<Integer> s2=new Stack<Integer>();
		while(head1!=null) {
			s1.push(head1.value);
			head1=head1.next;
		}
		while(head2!=null) {
			s2.push(head2.value);
			head2=head2.next;
		}
		int ca=0;
		int n1=0;
		int n2=0;
		int n=0;
		Node node=null;
		Node pre=null;
		while(!s1.isEmpty()||s2.isEmpty()) {
			n1=s1.isEmpty()?0:s1.pop();
			n2=s2.isEmpty()?0:s2.pop();
			n=n1+n2+ca;
			pre=node;
			node=new Node(n%10);
			node.next=pre;
			ca=n/10;
		}
		if(ca==1) {
			pre=node;
			node=new Node(1);
			node.next=pre;
		}
		return node;
	}
	
	public static Node addList2(Node head1,Node head2) {
		head1=reverseList(head1);
		head2=reverseList(head2);
		int ca=0;
		int n1=0;
		int n2=0;
		int n=0;
		Node c1=head1;
		Node c2=head2;
		Node node=null;
		Node pre=null;
		while(c1!=null||c2!=null) {
			n1=c1!=null?c1.value:0;
			n2=c2!=null?c2.value:0;
			n=n1+n2+ca;
			pre=node;
			node=new Node(n%10);
			node.next=pre;
			ca=n/10;
			c1=c1!=null?c1.next:null;
			c2=c2!=null?c2.next:null;
		}
		//如果节点为1 生成一个节点值为1的新节点
		if(ca==1) {
			pre=node;
			node=new Node(1);
			node.next=pre;
		}
		reverseList(head1);
		reverseList(head2);
		return node;
	}
	
	public static Node reverseList(Node head) {
		Node pre=null;
		Node next=null;
		while(head!=null) {
			//在头节点改变之前，先改变下一个节点的指针
			next=head.next;
			//头节点的下一个节点要改成它的上一个节点，是一个逆转的过程
			head.next=pre;
			//上一个节点前移指向头节点
			pre=head;
			//头节点后移指向下一个节点
			head=next;
		}
		//返回反转后头节点指针
		return pre;
	}
	
	public static void printLinkedList(Node head) {
		System.out.print("Linked List:");
		while(head!=null) {
			System.out.print(head.value+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Node head1=new Node(9);
		head1.next=new Node(9);
		head1.next.next = new Node(9);
		
		Node head2=new Node(1);
		
		printLinkedList(head1);
		printLinkedList(head2);
		printLinkedList(addList1(head1, head2));
		printLinkedList(addList2(head1, head2));
	}
}
