package leetcode.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
     * 前序遍历--递归版本
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

    public static List<Integer> preorderTraversal1(TreeNode root){
        List<Integer> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        Stack<TreeNode> stack=new Stack<>();
        stack.add(root);
        while(!res.isEmpty()){
            TreeNode node=stack.pop();
            res.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
        return res;
    }
}
