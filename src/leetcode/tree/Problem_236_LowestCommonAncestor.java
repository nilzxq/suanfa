package leetcode.tree;

/**
 * 二叉树的最近公共祖先
 * @Author nilzxq
 * @Date 2020-08-14 9:28
 */
public class Problem_236_LowestCommonAncestor {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }

    /**
     * 分情况讨论
     *  结束条件 如果root为p或者q则直接返回root root==null 代表到了叶节点 直接返回即可
     * 1.如果p,q在左侧  return left (right==null)也就是在左侧继续找
     * 2.如果p，q在右侧  return right (left==null)也就是在右侧继续找
     * 3.如果p,q异侧 直接 return root
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        //当遍历到叶结点后就会返回null
        if(root==null){
            return root;
        }
        //当找到p或者q的是时候就会返回pq
        /*当然，值得一提的是，如果公共祖先是自己（pq），并不需要寻找另外
         一个，我们在执行前序遍历会先找上面的，后找下面的，我们会直接返回公共祖先。*/
        if(root==p||root==q){
            return root;
        }

        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        //2.
        if(left==null){
            return right;
        }
        //1.
        if(right==null){
            return left;
        }
        //3.
        return root;
    }
}
