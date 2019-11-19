package leetcode;

/** 
* @author nilzxq
* @version 2019年11月19日 下午8:00:30 
*类说明 
*/
public class Problem_24_List_IsPalindrome {
	
	public static class ListNode{
		int val;
		ListNode next;
		ListNode(int x){
			val=x;
		}
	}
	public static boolean isPalindrome(ListNode head) {
		ListNode fast=head;
		ListNode slow=head;
		if(fast==null||fast.next==null)return true;
		while(fast.next!=null&&fast.next.next!=null) {
			fast=fast.next.next;
			slow=slow.next;
		}
		ListNode newHead=reverseList(slow.next);
		while(newHead!=null) {
			if(head.val!=newHead.val) return false;
			head=head.next;
			newHead=newHead.next;
		}
		return true;
	}
	private static ListNode reverseList(ListNode head) {
		if (head.next == null) return head;
        ListNode pre = null;
        ListNode tmp;
        while (head!= null) {
            tmp = head.next;//tmp暂存当前节点的下一个节点
            head.next = pre;//当前节点下一个指向pre
            pre = head;//刷新pre
            head = tmp;//刷新当前节点为tmp
        }
        return pre;
    
	}
	
	public static void main(String[] args) {
		ListNode head=new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(2);
		head.next.next.next=new ListNode(1);
		System.out.println(isPalindrome(head));
	}
}
