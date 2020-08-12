package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * 数的遍历
 * @Author nilzxq
 * @Date 2020-08-12 13:56
 */
public class PreorderTraversal {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }

    /**
     * 前序遍历
     * @param root
     * @return
     */
    static List<Integer> list=new ArrayList<>();
    public static List<Integer> preorderTraversal(TreeNode root){
        if(root==null){
            return list;
        }
        list.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list;
    }
}
