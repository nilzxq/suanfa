package interview;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-08-23 21:45
 */
public class temp1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        ListNode node=new ListNode(0);
        ListNode temp=node;
        for(int i=0;i<n;i++){
           int value=sc.nextInt();
            if(n+1!=k){
                continue;
            }
            temp.next=new ListNode(value);
            temp=temp.next;
        }
        while(node!=null){
            System.out.print(node.val);
            node=node.next;
        }
    }

    public static class ListNode{
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static void print(ListNode node){
        ListNode temp=node;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}
