package leetcode.list;

/**
 * @Author nilzxq
 * @Date 2020-10-06 16:44
 */
public class Problem_25_ReverseKGroup {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(){};
        ListNode(int val){
            this.val=val;
        }
        ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }

    public ListNode reverseKGroup(ListNode head,int k){
        if(head==null){
            return null;
        }
        ListNode a,b;
        a=b=head;
        for(int i=0;i<k;i++){
            //不足k个，不需要反转，base case
            if(b==null){
                return head;
            }
            b=b.next;
        }
        //反转前k个元素
        ListNode newHead=reverse2(a,b);
        //递归反转链表并连接起来
        a.next=reverseKGroup(b,k);
        return newHead;
    }

    //反转整个链表
    ListNode reverse(ListNode a){
        ListNode pre,cur,nxt;
        pre=null;
        cur=a;
        nxt=a;
        while(cur!=null){
            nxt=cur.next;
            //逐个结点反转
            cur.next=pre;
            //更新指针位置
            pre=cur;
            cur=nxt;
        }
        //返回反转后的头结点
        return pre;
    }

    //反转区间[a,b)的元素，注意是左闭右开
    ListNode reverse2(ListNode a,ListNode b){
        ListNode pre,cur,nxt;
        pre=null;
        cur=a;
        nxt=a;
        //while终止条件改一下 null改为b
        while(cur!=b){
            nxt=cur.next;
            cur.next=pre;
            pre=cur;
            cur=nxt;
        }
        //返回反转后的头结点
        return pre;
    }


}
