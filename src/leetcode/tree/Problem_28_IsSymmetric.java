package leetcode.tree;

/**
 * @Author nilzxq
 * @Date 2020-08-13 7:04
 */
public class Problem_28_IsSymmetric {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }

    public static boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        return recur(root.left,root.right);
    }

    /**
     * 当 LL 和 RR 同时越过叶节点： 此树从顶至底的节点都对称，因此返回 true
     * 当 LL 或 RR 中只有一个越过叶节点： 此树不对称，因此返回 false
     * 当节点 LL 值 与节点 RR 值不等： 此树不对称，因此返回 false
     * @param l
     * @param r
     * @return
     */

    public static boolean recur(TreeNode l,TreeNode r){
        if(l==null&&r==null){
            return true;
        }
        if(l==null||r==null||l.val!=r.val){
            return false;
        }
        return recur(l.left,r.right)&&recur(r.right,r.left);
    }
}
