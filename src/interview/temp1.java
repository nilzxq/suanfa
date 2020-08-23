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
        ListNode node=new ListNode(sc.nextInt());
        ListNode temp=node;
        for(int i=1;i<n;i++){
            node.next=new ListNode(sc.nextInt());
            node=node.next;
        }
        int count=0;
        ListNode temp2=temp;
        while(temp!=null){

            if(count==k-1){
                ListNode t=temp.next;
                temp.next=t.next;
               // break;
            }
            temp=temp.next;

            count++;
        }
        print(temp2);

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
