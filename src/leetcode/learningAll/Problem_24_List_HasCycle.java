package leetcode.learningAll;

/**
* @author nilzxq
* @version 2019年11月20日 下午6:58:01
*类说明
*/
public class Problem_24_List_HasCycle {

	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
			next=null;
		}
	}

	public static boolean hasCycle(ListNode head) {
		if(head==null||head.next==null) {
			return false;
		}
		ListNode slow=head;
		ListNode fast=head;
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ListNode head=new ListNode(4);
		head.next=new ListNode(5);
		head.next.next=new ListNode(1);
		head.next.next.next=new ListNode(9);
		head.next.next.next=head;
		System.out.println(hasCycle(head));
	}
}
