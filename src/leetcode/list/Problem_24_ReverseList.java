package leetcode.list;

/**
 * @Author nilzxq
 * @Date 2020-07-27 8:58
 */
public class Problem_24_ReverseList {
    public static void main(String[] args) {

        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        ListNode res=reverseList(head);
        while(res!=null){
            System.out.print(res.val+"->");
            res=res.next;
        }


    }

    public static ListNode reverseList(ListNode head){
        ListNode pre=null;
        ListNode next=null;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
}
