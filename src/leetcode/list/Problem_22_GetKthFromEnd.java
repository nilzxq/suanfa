package leetcode.list;

/**
 * @Author nilzxq
 * @Date 2020-07-27 9:08
 */
public class Problem_22_GetKthFromEnd {
    public static void main(String[] args) {
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        ListNode res=getKthFromEnd(head,2);
        ListNode res1=getKthFromEnd1(head,2);
//        while(res!=null){
//            System.out.print(res.val+"->");
//            res=res.next;
//        }

        while(res1!=null){
            System.out.print(res1.val+"->");
            res1=res1.next;
        }
    }

    public static ListNode getKthFromEnd(ListNode head,int k){

        int count=0;
        ListNode cur=head;
        while(cur!=null){
            cur=cur.next;
            count++;
        }
        if(count==k){
            return head;
        }
        //System.out.println(count);
        int temp=1;
        while(head!=null){
            if(temp==count-k){
                return head.next;
            }
            head=head.next;
            temp++;
            //System.out.println(temp);
        }
        return null;
    }

    /**
     * 双指针法
     * @param head
     * @param k
     * @return
     */
    public static ListNode getKthFromEnd1(ListNode head,int k){
        ListNode latter=head;
        ListNode former=head;
        for(int i=0;i<k;i++){
            former=former.next;
        }
        while(former!=null){
            former=former.next;
            latter=latter.next;
        }
        return latter;
    }

    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
}
