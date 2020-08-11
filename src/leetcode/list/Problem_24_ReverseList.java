package leetcode.list;

/**
 * 反转链表
 * @Author nilzxq
 * @Date 2020-07-27 8:58
 */
public class Problem_24_ReverseList {
    public static void main(String[] args) {

        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
//        ListNode res=reverseList(head);
//        while(res!=null){
//            System.out.print(res.val+"->");
//            res=res.next;
//        }

//        ListNode res1=reverseList1(head);
//        while(res1!=null){
//            System.out.print(res1.val+"->");
//            res1=res1.next;
//        }

        ListNode res2=reverseList2(head);
        while(res2!=null){
            System.out.print(res2.val+"->");
            res2=res2.next;
        }

    }

    /**
     * 两个节点变量
     * @param head
     * @return
     */
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

    public static ListNode reverseList1(ListNode head){
        ListNode pre=head;
        ListNode cur=null;
        ListNode temp=null;
        while(pre!=null){
            temp=pre.next;
            pre.next=cur;
            cur=pre;
            pre=temp;
        }
        return cur;
    }

    /**
     * 递归
     * @param head
     * @return
     */
    public static ListNode reverseList2(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode last=reverseList2(head.next);
        head.next.next=head;
        head.next=null;
        return last;
    }

    /**
     * 反转链表前 N 个节点
     * @param head
     * @return
     */
    static ListNode successor=null;//后驱节点
    //反转以head为起点的n个节点，返回新的头节点
    public static ListNode reverseListN(ListNode head,int n){
        if(n==1){
            //记录第n+1个节点
            successor=head.next;
            return head;
        }
        //以head.next为起点，需要反转前n-1个节点
        ListNode last=reverseListN(head.next,n-1);
        head.next.next=head;
        //让反转之后的head节点和后面的节点连起来
        head.next=successor;
        return last;
    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
}
