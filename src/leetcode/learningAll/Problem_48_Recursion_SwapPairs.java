package leetcode.learningAll;


/**
* @author nilzxq
* @version 2019年12月17日 下午9:04:34
*类说明
*/
public class Problem_48_Recursion_SwapPairs {

	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}
//	public static ListNode swapPairs(ListNode head){
//		if(head==null||head.next==null) return head;
//		ListNode dum=new ListNode(-1);
//		ListNode pre=dum;
//		dum.next=head;
//		while(pre.next!=null&&pre.next.next!=null) {
//			ListNode t=pre.next.next;
//			pre.next.next=t.next;
//			t.next=pre.next;
//			pre.next=t;
//			pre=t.next;
//		}
//		return dum.next;
//	}

	//recursion
	public static ListNode swapPairs1(ListNode head) {
		if(head==null||head.next==null) {
			return head;
		}
		ListNode first=head;
		ListNode second=head.next;
		head=second;
		first.next=swapPairs1(second.next);
		second.next=first;
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
//		printLinkedList(swapPairs(head));
		printLinkedList(swapPairs1(head));
	}
}
