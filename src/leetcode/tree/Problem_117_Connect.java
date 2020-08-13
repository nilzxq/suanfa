package leetcode.tree;

/**
 * 对比116 不是完全二叉树
 * @Author nilzxq
 * @Date 2020-08-13 10:48
 */
public class Problem_117_Connect {
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

        public Node connect(Node root){
            if(root==null){
                return null;
            }
            if(root.left!=null&&root.right!=null){
                root.left.next=root.right;
            }
            if(root.left!=null&&root.right==null){
                root.left.next=getNext(root.next);
            }
            if(root.right!=null){
                root.right.next=getNext(root.next);
            }
            //先右后左
            //这里要注意：先递归右子树，否则右子树根节点next关系没建立好，左子树到右子树子节点无法正确挂载
            connect(root.right);
            connect(root.left);
            return root;
        }

        public Node getNext(Node root){
            if(root==null){
                return null;
            }
            if(root.left!=null){
                return root.left;
            }
            if(root.right!=null){
                return root.right;
            }
            if(root.next!=null){
                return getNext(root.next);
            }
            return null;
        }

        public Node connect1(Node root){
            if(root==null||(root.left==null&&root.right==null)){
                return root;
            }
            if(root.left!=null&&root.right!=null){
                root.left.next=root.right;
                root.right.next=getNextNoNullChild(root);
            }
            if(root.left==null){
                root.right.next=getNextNoNullChild(root);
            }
            if(root.right==null){
                root.left.next=getNextNoNullChild(root);
            }
            root.right=connect(root.right);
            root.left=connect(root.left);
            return root;
        }

        private Node getNextNoNullChild(Node root) {
            while(root.next!=null){
                if(root.next.left!=null){
                    return root.next.left;
                }
                if(root.next.right!=null){
                    return root.next.right;
                }
                root=root.next;
            }
            return null;
        }
    }
}
