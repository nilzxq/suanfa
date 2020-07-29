package leetcode.list;

/**
 * @Author nilzxq
 * @Date 2020-07-29 11:51
 */
public class Problem_141_HasCycle {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head){
        if(head==null||head.next==null){
            return false;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null||fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }
}
