package leetcode.learningAll;

public class Problem_Tree_ConvertBiNode {
    //定义一个全局头指针
    TreeNode rootNode;
    public TreeNode covertBiNode(TreeNode root){
        //头指针实例化
        rootNode=new TreeNode(0);
        //备份这个头指针
        TreeNode fNode=rootNode;
        xh(root);
        //返回二叉树的第一个节点
        return fNode.right;
    }

    public void xh(TreeNode r){
        //跳出递归的条件
        if(r==null){
            return;
        }
        //中序遍历
        xh(r.left);
        //将root放入链表的最后??
        rootNode.right=r;
        //将二叉树中结点原有的left置空
        r.left=null;
        //指向头指针的最后一个节点
        rootNode=rootNode.right;
        xh(r.right);
    }

    public TreeNode covertBiNode1(TreeNode root) {
        if (root == null)
            return null;
        // 中序遍历
        TreeNode sub = covertBiNode1(root.left);
        // 若为空则说明遍历完了，就直接将sub指向root
        if (sub == null)
            sub = root;
        else {
            // 记录头节点
            TreeNode temp = sub;
            // 找到链表队尾
            while (sub.right != null)
                sub = sub.right;
            // 将当前节点放入队尾
            sub.right = root;
            sub = temp;
        }
        // 所有的左子树均置空
        root.left = null;
        root.right = covertBiNode1(root.right);
        return sub;
    }


    // for test -- print tree
    public static void printTree(TreeNode head) {
        System.out.println("Binary Tree:");
        printInOrder(head, 0, "H", 17);
        System.out.println();
    }

    public static void printInOrder(TreeNode head, int height, String to, int len) {
        if (head == null) {
            return;
        }
        printInOrder(head.right, height + 1, "v", len);
        String val = to + head.val + to;
        int lenM = val.length();
        int lenL = (len - lenM) / 2;
        int lenR = len - lenM - lenL;
        val = getSpace(lenL) + val + getSpace(lenR);
        System.out.println(getSpace(height * len) + val);
        printInOrder(head.left, height + 1, "^", len);
    }

    public static String getSpace(int num) {
        String space = " ";
        StringBuffer buf = new StringBuffer("");
        for (int i = 0; i < num; i++) {
            buf.append(space);
        }
        return buf.toString();
    }
    public static void main(String[] args) {
        Problem_Tree_ConvertBiNode cb=new Problem_Tree_ConvertBiNode();
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.right=new TreeNode(5);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        root.right.right=new TreeNode(6);
        root.left.left.left=new TreeNode(0);
        //TreeNode tn=cb.covertBiNode(root);
        TreeNode tn1=cb.covertBiNode1(root);
        //printTree(tn);
        printTree(tn1);
    }



}
