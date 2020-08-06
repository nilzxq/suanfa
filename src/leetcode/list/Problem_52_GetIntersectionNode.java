package leetcode.list;

/**
 * @Author nilzxq
 * @Date 2020-08-07 6:08
 */
public class Problem_52_GetIntersectionNode {
    /**
     * 测试样例有误
     * @param args
     */
    public static void main(String[] args) {
        ListNode node1=new ListNode(4);
        node1.next=new ListNode(1);
        node1.next.next=new ListNode(8);
        node1.next.next.next=new ListNode(4);
        node1.next.next.next.next=new ListNode(5);
        ListNode node2=new ListNode(5);
        node2.next=new ListNode(0);
        node2.next.next=new ListNode(1);
        node2.next.next.next=new ListNode(8);
        node2.next.next.next.next=new ListNode(4);
        node2.next.next.next.next.next=new ListNode(5);
        ListNode res=getIntersectionNode(node1,node2);
        System.out.println(res);
    }
    public static ListNode getIntersectionNode(ListNode headA,ListNode headB){
        if(headA==null||headB==null){
            return null;
        }
        ListNode first=headA;
        ListNode second=headB;
        int count1=0;
        int count2=0;
        while(first!=null){
            first=first.next;
            count1++;
        }
        while(second!=null){
            second=second.next;
            count2++;
        }
        first=headA;
        second=headB;
        int abs=Math.abs(count1-count2);
        while(abs!=0){
            if(count2>count1){
                second=second.next;
                abs--;
            }else if(count1>count2){
                first=first.next;
                abs--;
            }
        }
        while(first!=null){
            if(first==second){
                return first;
            }
            first=first.next;
            second=second.next;
        }
        return null;
    }

    public ListNode getIntersectionNode1(ListNode headA, ListNode headB) {
        if(headA==null||headB==null){
            return null;
        }
        ListNode first=headA;
        ListNode second=headB;
        while(first!=second){
            first=first!=null?first.next:headB;
            second=second!=null?second.next:headA;
        }
        return first;
    }


    static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
            next=null;
        }
    }
}
