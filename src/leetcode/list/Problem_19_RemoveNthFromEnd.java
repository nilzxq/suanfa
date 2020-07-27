package leetcode.list;

/**
 * @Author nilzxq
 * @Date 2020-07-27 11:04
 */
public class Problem_19_RemoveNthFromEnd {
    public static void main(String[] args) {
            ListNode node=new ListNode(1);
            node.next=new ListNode(2);
            node.next.next=new ListNode(3);
            node.next.next.next=new ListNode(4);
            node.next.next.next.next=new ListNode(5);
            int n=2;
//            ListNode res=removeNthFromEnd(node,n);
//            while(res!=null) {
//                System.out.print(res.val+"->");
//                res=res.next;
//            }
//        System.out.println();
//        ListNode res1=removeNthFromEnd1(node,n);
//        while(res1!=null) {
//            System.out.print(res1.val+"->");
//            res1=res1.next;
//        }

        System.out.println();
        ListNode res2=removeNthFromEnd2(node,n);
        while(res2!=null) {
            System.out.print(res2.val+"->");
            res2=res2.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        //哑节点，哑节点用来简化某些极端情况，例如列表中只含有一个节点，或者需要删除列表的头部
        ListNode dummy=new ListNode(0);
        //哑节点指向头节点
        dummy.next=head;
        //保存链表长度
        int length=0;
        ListNode len=head;
        while(len!=null){
            length++;
            len=len.next;
        }
        length=length-n;
        ListNode target=dummy;
        while(length>0){
            length--;
            target=target.next;
        }
        target.next=target.next.next;
        return dummy.next;
        }

    public static ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode first=dummy;
        ListNode second=dummy;
        //注意是n个 因为加了个哑节点 长度加1了
        for(int i=0;i<=n;i++){
            first=first.next;
        }
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return dummy.next;
    }

    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // node1 节点先跑，node1节点 跑到第 n 个节点的时候,node2 节点开始跑
        // 当node1 节点跑到最后⼀个节点时，node2 节点所在的位置就是第 （L-n) 个节点，也就是倒数第 n+1（L代表总链表⻓度）
        while(first!=null){
            first=first.next;
            if(n<1&&first!=null){
                second=second.next;
                System.out.println(n);
            }
            n--;
        }
        second.next=second.next.next;
        return dummy.next;
    }
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
}
