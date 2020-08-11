package leetcode.list;

/**
 * 反转链表
 * 从位置m到n的链表
 * @Author nilzxq
 * @Date 2020-08-11 15:53
 */
public class Problem_92_ReverseBetween {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
    static ListNode successor=null;
    public static ListNode reverseN(ListNode head,int n){
        if(n==1){
            successor=head.next;
            return head;
        }
        //以head.next为起点，需要反转前n-1个节点
        ListNode last=reverseN(head.next,n-1);
        head.next.next=head;
        head.next=successor;
        return last;
    }
    public static ListNode reverseBetween(ListNode head,int m,int n){
        //base case
        if(m==1){
            return reverseN(head,n);
        }
        //前进到反转的起点触发base case
        head.next=reverseBetween(head.next,m-1,n-1);
        return head;
    }

    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        reverseBetween(head,2,4);
    }
}
