package leetcode.learningAll;

/**
 * @Author nilzxq
 * @Date 2020-06-12 20:42
 */
public class Problem_Tree_CheckSubTree {
    public boolean checkSubTree(TreeNode t1,TreeNode t2){
        if(t1==null){
            return t2==null;
        }

        return isSubSame(t1,t2)||checkSubTree(t1.left,t2)||checkSubTree(t1.right,t2);
    }

    private boolean isSubSame(TreeNode t1, TreeNode t2) {
        if(t1==null&&t2==null){
            return true;
        }
        if(t1==null||t2==null){
            return false;
        }

        return t1.val==t2.val&&isSubSame(t1.left,t2.left) && isSubSame(t1.right,t2.right);
    }

    public static void main(String[] args) {
        Problem_Tree_CheckSubTree cst=new Problem_Tree_CheckSubTree();
        TreeNode node=new TreeNode(4);
        node.left=new TreeNode(1);
        node.right=new TreeNode(6);
        node.left.left=new TreeNode(0);
        node.left.right=new TreeNode(2);
        node.left.right.right=new TreeNode(3);
        node.right.left=new TreeNode(5);
        node.right.right=new TreeNode(7);
        node.right.right.right=new TreeNode(8);
        TreeNode node1=new TreeNode(4);
        node1.left=new TreeNode(1);
        node1.right=new TreeNode(6);
        node1.left.left=new TreeNode(0);
        node1.left.right=new TreeNode(2);
        node1.left.right.right=new TreeNode(3);
        node1.right.left=new TreeNode(5);
        node1.right.right=new TreeNode(7);
        node1.right.right.right=new TreeNode(8);
        System.out.println(cst.checkSubTree(node,node1));
    }
}
