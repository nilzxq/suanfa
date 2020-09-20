package interview.haoweilai;

/**
 * @Author nilzxq
 * @Date 2020-09-20 14:21
 */
import java.util.*;

/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 * }
 *
 */


public class Solution2 {

    public class ListNode{
        int val;
        ListNode next=null;
    }
    /**
     * 逆序
     * @param head ListNode类 头结点
     * @return ListNode类
     */
    public ListNode reverseList (ListNode head) {
        // write code here
        ListNode pre=null;
        ListNode cur=head;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=temp;
        }
        return pre;
    }

    public static void main(String[] args) {
//        int a=10,b=5,c=a+++b,d=a+++b;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        String str="Example";
//        str[3]="B";
//        str=str+1;
//        Int l=str.length;
//        str>>>3;
        String s1="world";
        String s2="world";
        char s3[]={'w','o','r','l','d'};
        System.out.println(s2.equals((s3)));
        System.out.println(s1.equals((new String("world"))));
        System.out.println(s1==s2);
        System.out.println(s1.equals((s2)));

    }
}
