package leetcode.learningAll;

/**
 * @Author nilzxq
 * @Date 2020-06-10 22:36
 */
public class Problem_1367_Tree_IsSubPath {
    public boolean isSubPath(ListNode head,TreeNode root){
        if(head==null) return true;
        if(root==null) return false;
        //先判断当前的节点，如果不对，再看左子树和右子树
        return isSub(head,root)||isSubPath(head,root.left)||isSubPath(head,root.right);
    }

    private boolean isSub(ListNode head, TreeNode node) {
        //特判：链表走完了，返回true
        if(head==null) return true;
        //特判：链表没走完，树走完了，返回false
        if(node==null) return false;
        //值不同，必定不是
        if(head.val!=node.val){
            return false;
        }
        //如果值相同，继续看，左边和右边有一个满足的即可
        return isSub(head.next,node.left)||isSub(head.next,node.right);
    }

    public static void main(String[] args) {
        Problem_1367_Tree_IsSubPath isp=new Problem_1367_Tree_IsSubPath();
        ListNode listNode=new ListNode(4);
        listNode.next=new ListNode(6);
        listNode.next.next=new ListNode(5);
        TreeNode node=new TreeNode(4);
        node.left=new TreeNode(1);
        node.right=new TreeNode(6);
        node.left.left=new TreeNode(0);
        node.left.right=new TreeNode(2);
        node.left.right.right=new TreeNode(3);
        node.right.left=new TreeNode(5);
        node.right.right=new TreeNode(7);
        node.right.right.right=new TreeNode(8);
        System.out.println(isp.isSubPath(listNode,node));
    }

}
