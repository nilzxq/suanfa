package leetcode.list;

import java.util.HashMap;

/**
 * 复杂链表的复制
 *
 * @Author nilzxq
 * @Date 2020-08-22 9:50
 */
public class Problem_35_CopyRandomList {
    static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
    public static Node copyRandomList(Node head){
        Node cur=head;
        HashMap<Node,Node> map=new HashMap<>();
        //第一遍遍历存value
        while(cur!=null){
            map.put(cur,new Node(cur.val));
            cur=cur.next;
        }
        cur=head;
        //第二遍遍历，处理徒弟的指向关系
        while(cur!=null){
            //师傅和徒弟 徒弟 是通过师傅得到的 即map.get（key师傅）得到徒弟
            map.get(cur).next=map.get(cur.next);
            map.get(cur).random=map.get(cur.random);
            cur=cur.next;
        }
        return map.get(head);
    }

}
