package leetcode.tree;

/**
 * 路径总和
 * @Author nilzxq
 * @Date 2020-08-13 9:00
 */
public class HasPathSum {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public static boolean hasPathSum(TreeNode root,int sum){
        if(root==null){
            return false;
        }
        //这个很重要！！！！ 左右节点同时为空的才是到达了叶子节点
        if(root.left==null&&root.right==null){
            return root.val==sum;
        }
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
