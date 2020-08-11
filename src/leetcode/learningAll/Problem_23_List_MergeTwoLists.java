package leetcode.learningAll;

/**
* @author nilzxq
* @version 2019年11月18日 下午2:35:58
*类说明
*/
public class Problem_23_List_MergeTwoLists {

	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}

	public static  ListNode mergeTwoLists(ListNode l1,ListNode l2) {
		if(l1==null) {
			return l2;
		}
		if(l2==null) {
			return l1;
		}
		ListNode head=null;
		if(l1.val<=l2.val) {
			head=l1;
			head.next=mergeTwoLists(l1.next,l2);

		}else {
			head=l2;
			head.next=mergeTwoLists(l1,l2.next);

		}
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
		ListNode head1=new ListNode(1);
		head1.next=new ListNode(2);
		head1.next.next=new ListNode(3);
		head1.next.next.next=new ListNode(4);
		ListNode head2=new ListNode(3);
		head2.next=new ListNode(4);
		head2.next.next=new ListNode(7);
		head2.next.next.next=new ListNode(8);
		ListNode head=mergeTwoLists(head1,head2);
		printLinkedList(head);
	}
}
