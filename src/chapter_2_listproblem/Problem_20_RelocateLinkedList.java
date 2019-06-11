package chapter_2_listproblem;

import sort.MergeSort;

/** 
* @author nilzxq
* @version 2019年6月7日 下午4:05:33 
* 类说明 
*/
public class Problem_20_RelocateLinkedList {

	public static class Node{
		public Node next;
		public int value;
		
		public Node(int value){
			this.value=value;
		}
	}
	
	public static void relocate(Node head) {
		if(head==null||head.next==null) {
			return;
		}
		Node mid=head;
		Node right=head.next;
		//从长度为2开始，长度每增加2，mid后移一个节点
		while(right.next!=null&&right.next.next!=null) {
			mid=mid.next;
			right=right.next.next;
		}
		//遍历一遍找到mid之后，将左半区与右半区分离成两个链表（mid.next=null）,
		//分别记为left(head)和right(原来的mid.next)
		right=mid.next;
		mid.next=null;
		mergeLR(head,right);
	}
	
	public static void mergeLR(Node left,Node right) {
		Node next=null;
		while(left.next!=null) {
			next=right.next;
			right.next=left.next;
			left.next=right;
			left=right.next;
			right=next;
		}
		left.next=right;
	}
	
	public static void printLinkedList(Node head) {
		System.out.print("Linked List: ");
		while(head!=null) {
			System.out.print(head.value+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Node head = null;
		relocate(head);
		printLinkedList(head);

		head = new Node(1);
		relocate(head);
		printLinkedList(head);

		head = new Node(1);
		head.next = new Node(2);
		relocate(head);
		printLinkedList(head);

		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		relocate(head);
		printLinkedList(head);

		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		relocate(head);
		printLinkedList(head);

		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		relocate(head);
		printLinkedList(head);

		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		relocate(head);
		printLinkedList(head);

		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);
		head.next.next.next.next.next = new Node(6);
		head.next.next.next.next.next.next = new Node(7);
		relocate(head);
		printLinkedList(head);

	}
}
