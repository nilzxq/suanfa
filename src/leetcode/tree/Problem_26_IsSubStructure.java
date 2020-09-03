package leetcode.tree;

/**
 * @Author nilzxq
 * @Date 2020-09-03 10:20
 */
public class Problem_26_IsSubStructure {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public static boolean isSubStructure(TreeNode A,TreeNode B){
        return (A!=null)&&(B!=null)&&(recur(A,B)||recur(A.left,B)||recur(A.right,B));
    }

    private static boolean recur(TreeNode A, TreeNode B) {
        if(B==null){
            return true;
        }
        if(A==null||A.val!=B.val){
            return false;
        }
        return recur(A.left,B.left)&&recur(A.right,B.right);
    }
}
