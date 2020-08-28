package leetcode.list;

import leetcode.stack.StackX;

import java.util.Stack;

/**
 * @Author nilzxq
 * @Date 2020-08-17 19:21
 */
public class Problem_06_ReversePrint {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }

    public static int[] reversePrint(ListNode head){
        Stack<ListNode> listNodes = new Stack<>();
        int temp=0;
        while(head!=null){
            listNodes.push(head);
            head=head.next;
            temp++;
        }
        System.out.println(listNodes.size());
        int[] res=new int[temp];
        for(int i=0;i<temp;i++){
            res[i]=listNodes.pop().val;
        }
        return res;

    }

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        listNode.next=new ListNode(2);
        listNode.next.next=new ListNode(3);
        int[] res=reversePrint(listNode);
    }
}
