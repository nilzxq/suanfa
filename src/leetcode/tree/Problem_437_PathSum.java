package leetcode.tree;

/**
 * 路径总和
 *https://labuladong.gitbook.io/algo/suan-fa-si-wei-xi-lie/di-gui-xiang-jie#di-gui-xiang-jie
 * 
 * @Author nilzxq
 * @Date 2020-08-13 7:54
 */
public class Problem_437_PathSum {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }


        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     *  PathSum 函数：给他一个节点和一个目标值，他返回以这个节点为根的树中，和为目标值的路径总数。
     *  count 函数：给他一个节点和一个目标值，他返回以这个节点为根的树中，能凑出几个以该节点为路径开头，和为目标值的路径总数。
     */
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        return count(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }


    private int count(TreeNode root, int sum) {
        if(root==null){
            return 0;
        }
        // 我自己能不能独当一面，作为一条单独的路径呢？
        int count=root.val==sum?1:0;
        // 左边的小老弟，你那边能凑几个 sum - node.val 呀？
        // 右边的小老弟，你那边能凑几个 sum - node.val 呀？
        return count+count(root.left,sum-root.val)+count(root.right,sum-root.val);
    }
    }
