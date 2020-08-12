package leetcode.list;

/**
 * 环形链表
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
        //是&& 不是||
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }

    public boolean hasCycle1(ListNode head){
        if(head==null||head.next==null){
            return false;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null){
            if(fast!=null&&fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }else{
                return false;
            }
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public boolean hasCycle2(ListNode head){
        if(head==null||head.next==null){
            return false;
        }
        ListNode fast=head.next;
        ListNode slow=head;
        while(fast!=slow){
            if(fast==null||fast.next==null){
                return false;
            }
            fast=fast.next.next;
            slow=slow.next;
        }
        return true;
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
