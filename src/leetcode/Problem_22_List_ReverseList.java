package leetcode;

/** 
* @author nilzxq
* @version 2019年11月16日 下午2:40:14 
*类说明 
*/
public class Problem_22_List_ReverseList {

	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}
	
	public static ListNode reverseList(ListNode head){
		ListNode pre = null, cur = head, next = null;
		while(cur != null){
			next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
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
		ListNode head1=reverseList(head);
		printLinkedList(head1);
	}
}
