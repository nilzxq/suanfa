package leetcode.recursion;

import java.util.LinkedList;
import java.util.List;

/**
 * 二叉树中的和为某一值的路径
 * @Author nilzxq
 * @Date 2020-09-01 6:34
 */
public class Problem_34_PathSum {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    LinkedList<List<Integer>> res=new LinkedList<>();
    LinkedList<Integer> path=new LinkedList<>();
    public List<List<Integer>> pathSum(TreeNode root,int sum){
        recur(root,sum);
        return res;
    }

    void recur(TreeNode root,int tar){
        if(root==null){
            return;
        }
        path.add(root.val);
        tar-=root.val;
        if(tar==0&&root.left==null&&root.right==null){
            res.add(new LinkedList<>(path));
        }
        recur(root.left,tar);
        recur(root.right,tar);
        path.removeLast();
    }
}
