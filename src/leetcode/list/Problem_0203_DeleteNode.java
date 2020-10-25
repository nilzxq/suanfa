package leetcode.list;

/**
 * 删除中间节点
 * @Author nilzxq
 * @Date 2020-10-25 22:49
 */
public class Problem_0203_DeleteNode {
    public class ListNode{
        int val;
        ListNode next;
        ListNode(int x){
            val=x;
        }
    }
    public void deleteNode(ListNode node){
        //将这个结点的数据替换为下一个结点
        node.val=node.next.val;
        //删除下一个结点
        node.next=node.next.next;
    }
}
