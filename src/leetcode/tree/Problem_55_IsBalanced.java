package leetcode.tree;

/**
 * @Author nilzxq
 * @Date 2020-07-29 14:34
 */
public class Problem_55_IsBalanced {
    public boolean isBalanced(TreeNode1 root) {
        return recur(root)!=-1;

    }

    public int recur(TreeNode1 root){
        if(root==null){
            return 0;
        }
        int left=recur(root.left);
        if(left==-1){
            return -1;
        }
        int right=recur(root.right);
        if(right==-1){
            return -1;
        }
        return Math.abs(left-right)<2 ? Math.max(left,right)+1:-1;
    }
}
