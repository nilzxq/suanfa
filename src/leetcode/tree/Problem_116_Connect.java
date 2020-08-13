package leetcode.tree;

/**
 * 填充每个节点的下一个右侧节点指针
 * @Author nilzxq
 * @Date 2020-08-13 10:10
 */
public class Problem_116_Connect {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    /**
     * https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/solution/tian-chong-mei-ge-jie-dian-de-xia-yi-ge-you-ce-j-3/255170
     * @param root
     * @return
     */
    public Node connect(Node root){
        if(root==null){
            return null;
        }
        if(root.left!=null){
            root.left.next=root.right;
        }
        //不在同一个父节点的情况 画图理解一下
        if(root.right!=null){
            root.right.next=root.next!=null?root.next.left:null;
        }
        connect(root.left);
        connect(root.right);
        return root;
    }
}
