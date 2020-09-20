package interview.haoweilai;

/**
 * @Author nilzxq
 * @Date 2020-09-20 14:05
 */
import sun.reflect.generics.tree.Tree;

import java.util.*;

public class Solution1 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    /**
     * 二叉树的非递归前序遍历
     * @param root TreeNode类 根节点
     * @return string字符串
     */
    public static String notReCuPreOrder (TreeNode root) {
        // write code here
        if(root==null){
            return "";
        }

        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            TreeNode node=stack.pop();
            sb.append(node.val+",");
            //System.out.print(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
        String res="\""+sb.toString().substring(0,sb.length()-1)+"\"";
        return res;
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        System.out.println(notReCuPreOrder(null));
    }
}
