package chapter_2_listproblem;
/** 
* @author nilzxq
* @version 2019年6月3日 下午7:49:34 
* 类说明 
*/
public class Problem_16_ListSelectionSort {

	public static class Node{
		public int value;
		public Node next;
		public Node(int data) {
			this.value=data;
		}
	}
	/**
	 * 
	 * @param head 
	 * @return
	 */
	public static Node selectionSort(Node head) {
		Node tail=null;//排序部分尾部
		Node cur=head;//未排序部分头部
		Node smallPre=null;//最小节点的前一个节点
		Node small=null;//最小的节点
		while(cur!=null) {
			small=cur;
			smallPre=getSmallestpreNode(cur);
			if(smallPre!=null) {
				small=smallPre.next;
				smallPre.next=small.next;
			}
			cur=cur==small?cur.next:cur;
			if(tail==null) {
				head=small;
			}else {
				tail.next=small;
			}
			tail=small;
		}
		return head;
	}
	
	private static Node getSmallestpreNode(Node head) {
		Node smallPre=null;
		Node small=head;
		Node pre=head;
		Node cur=head.next;
		while(cur!=null) {
			if(cur.value<small.value) {
				smallPre=pre;
				small=cur;
			}
			pre=cur;
			cur=cur.next;
		}
		return smallPre;
	}
	

	private static void printLinkedList(Node head) {
		System.out.print("Linked List: ");
		while (head != null) {
			System.out.print(head.value + " ");
			head = head.next;
		}
		System.out.println();		
	}
	
	public static void main(String[] args) {
		Node head = null;
		head = selectionSort(head);
		printLinkedList(head);

		head = new Node(1);
		head = selectionSort(head);
		printLinkedList(head);

		head = new Node(1);
		head.next = new Node(2);
		head = selectionSort(head);
		printLinkedList(head);

		head = new Node(2);
		head.next = new Node(1);
		head = selectionSort(head);
		printLinkedList(head);

		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head = selectionSort(head);
		printLinkedList(head);

		head = new Node(1);
		head.next = new Node(3);
		head.next.next = new Node(2);
		head = selectionSort(head);
		printLinkedList(head);

		head = new Node(2);
		head.next = new Node(1);
		head.next.next = new Node(3);
		head = selectionSort(head);
		printLinkedList(head);

		head = new Node(2);
		head.next = new Node(3);
		head.next.next = new Node(1);
		head = selectionSort(head);
		printLinkedList(head);

		head = new Node(3);
		head.next = new Node(1);
		head.next.next = new Node(2);
		head = selectionSort(head);
		printLinkedList(head);

		head = new Node(3);
		head.next = new Node(2);
		head.next.next = new Node(1);
		head = selectionSort(head);
		printLinkedList(head);

		head = new Node(3);
		head.next = new Node(1);
		head.next.next = new Node(4);
		head.next.next.next = new Node(2);
		head = selectionSort(head);
		printLinkedList(head);
	}

}
