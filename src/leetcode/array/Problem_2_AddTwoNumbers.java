package leetcode.array;

/**
 * @Author nilzxq
 * @Date 2020-07-26 23:15
 */
public class Problem_2_AddTwoNumbers {
    public static void main(String[] args) {
        ListNode node1=new ListNode(2);
        node1.next=new ListNode(4);
        node1.next.next=new ListNode(3);
        ListNode node2=new ListNode(5);
        node2.next=new ListNode(6);
        node2.next.next=new ListNode(4);
        ListNode res=addTwoNumbers(node1,node2);
        while(res!=null){
            System.out.print(res.val);
            res=res.next;
        }

    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1,ListNode l2){
        int flag=0;
        ListNode dummyHead=new ListNode(0);
        //System.out.println(dummyHead.next);
        ListNode p=l1,q=l2, node=dummyHead;
        //System.out.println(dummyHead.next);
        int temp=0;
        while(p!=null||q!=null){
            int sum=p.val+q.val+flag;
            flag=sum/10;
            node.next=new ListNode(sum%10);
            //System.out.println(node.val);
            node=node.next;
            //System.out.println(node.val);
            if(p!=null){
                p=p.next;
            }
            if(l2!=null){
                q=q.next;
            }
        }
        //System.out.println(node.val);
        if(flag>0){
            node.next=new ListNode(flag);
        }
        //System.out.println(node.val);
        //System.out.println(dummyHead.next.val);
        //System.out.println(node.next);
        return dummyHead.next;
    }
}
