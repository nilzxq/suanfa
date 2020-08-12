package leetcode.tree;

/**
 * 二叉树的最大深度
 * @Author nilzxq
 * @Date 2020-08-12 23:11
 */
public class Problem_104_MaxDepth {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }

    /**
     * DFS
     * @param root
     * @return
     */
    public static int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
