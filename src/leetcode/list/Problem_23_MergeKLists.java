package leetcode.list;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author nilzxq
 * @Date 2020-10-11 21:11
 */
public class Problem_23_MergeKLists {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(){

        }
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }
    public static ListNode mergeKLists(ListNode[] lists){
        Queue<ListNode> queue=new PriorityQueue<>((v1, v2)->v1.val-v2.val);
        for(ListNode node:lists){
            if(node!=null){
                queue.offer(node);
            }
        }
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        while(!queue.isEmpty()){
            ListNode minNode=queue.poll();
            tail.next=minNode;
            tail=minNode;
            if(minNode.next!=null){
                queue.offer(minNode.next);
            }
        }
        return dummy.next;
    }
    
}
