package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年5月14日 上午12:00:57
*类说明
*/
public class Problem_2_AddTwoNumbers {

	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1,ListNode l2) {
		ListNode head= new ListNode(0);
		ListNode p=l1,q=l2,curr=head;
		int flag=0;
		while(p!=null||q!=null) {
			int x=(p!=null)?p.val:0;
			int y=(q!=null)?q.val:0;
			int sum=x+y+flag;
			flag=sum/10;
			curr.next=new ListNode(sum%10);
			curr=curr.next;
			if(p!=null) p=p.next;
			if(q!=null) q=q.next;
		}
		if(flag>0) {
			curr.next=new ListNode(flag);
		}
		return head.next;
	}

	public static void printLinkedList(ListNode node) {
		System.out.println("ListNode:");
		while(node!=null) {
			System.out.print(node.val+" ");
			node=node.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
	    ListNode head1=new ListNode(2);
	    head1.next=new ListNode(4);
	    head1.next.next=new ListNode(3);
	    ListNode head2=new ListNode(5);
	    head2.next=new ListNode(6);
	    head2.next.next=new ListNode(4);
	    printLinkedList(addTwoNumbers(head1,head2));

	}
}
