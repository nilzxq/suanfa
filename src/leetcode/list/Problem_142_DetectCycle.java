package leetcode.list;

/**
 * 环形链表
 * @Author nilzxq
 * @Date 2020-08-12 8:21
 */
public class Problem_142_DetectCycle {
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }
    public static ListNode detectCycle(ListNode head){
        if(head==null||head.next==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(true){
            if(fast==null||fast.next==null){
                return null;
            }
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        fast=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }
}
