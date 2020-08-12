package leetcode.list;

/**
 * 合并两个排序的链表
 * @Author nilzxq
 * @Date 2020-07-27 16:21
 */
public class Problem_25_MergeTwoLists {
    public static void main(String[] args) {
       ListNode node=new ListNode(1);
        node.next=new ListNode(2);
        node.next.next=new ListNode(3);
        node.next.next.next=new ListNode(4);
        node.next.next.next.next=new ListNode(5);
        ListNode node1=new ListNode(1);
        node1.next=new ListNode(2);
        node1.next.next=new ListNode(3);
        node1.next.next.next=new ListNode(4);
        node1.next.next.next.next=new ListNode(5);
//        ListNode res=mergeTwoLists(node,node1);
//        while(res!=null){
//            System.out.print(res.val+" ");
//            res=res.next;
//        }
        ListNode res1=mergeTwoLists1(node,node1);
        while(res1!=null){
            System.out.print(res1.val+" ");
            res1=res1.next;
        }
    }
    //递归

    /**
     * 考虑两种情况
     * 1）以l1开头的
     * 2）以l2开头的
     *
     * 编写递归的第一步，应当是明确当前函数应当完成的功能。
     *
     * 函数功能
     * 返回 l1指向的结点和 l2指向的结点中，值较小的结点
     * 并将从下级函数获得的返回值，链接到当前结点尾部
     *
     * 函数结束条件
     *
     * 当 l1 为空，或 l2为空，函数结束
     * 返回 l1或 l2 中剩下的部分

     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        if(l1.val<=l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    /**
     * 添加伪头节点
     * @param l1
     * @param l2
     * @return
     */
    public static ListNode mergeTwoLists1(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0),cur=dummy;

        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                cur.next=l1;
                l1=l1.next;
            }else{
                cur.next=l2;
                l2=l2.next;
            }
            cur=cur.next;
        }
        cur.next=l1!=null?l1:l2;
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
