package leetcode.learningAll;

/**
* @author nilzxq
* @version 2019年11月15日 下午5:20:40
*类说明
*/
public class Problem_21_List_RemoveNthFromEnd {

	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}
	public static ListNode removeNthFromEnd(ListNode head,int n) {
		ListNode left=head;
		ListNode right=head;

		for(int i=0;i<n;i++) {
			right=right.next;
		}

		if(right==null) {
			return head.next;
		}

		while(right.next!=null) {
			left=left.next;
			right=right.next;
		}
		left.next=left.next.next;
		return head;
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
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		removeNthFromEnd(head,2);
		printLinkedList(head);
	}
}
