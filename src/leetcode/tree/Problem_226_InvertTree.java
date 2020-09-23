package leetcode.tree;



/**
 * @Author nilzxq
 * @Date 2020-09-23 11:51
 */
public class Problem_226_InvertTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }

    //递归
    public TreeNode invertTree(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode temp=root.left;
        root.left=invertTree(root.right);
        root.right=invertTree(temp);
        return root;
    }

    //非递归

}
