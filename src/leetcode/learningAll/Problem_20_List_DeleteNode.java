package leetcode.learningAll;

/**
* @author nilzxq
* @version 2019年11月14日 下午8:12:55
*类说明
*/
public class Problem_20_List_DeleteNode {

	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}

	public static void deleteNode(ListNode node) {
		node.val=node.next.val;
		node.next=node.next.next;
	}

	public static void printLinkedList(ListNode head) {
		System.out.print("Linked List: ");
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}


	public static void main(String[] args) {
		ListNode head=new ListNode(4);
		head.next=new ListNode(5);
		head.next.next=new ListNode(1);
		head.next.next.next=new ListNode(9);
		deleteNode(head.next);
		printLinkedList(head);
	}
}
