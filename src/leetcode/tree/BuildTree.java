package leetcode.tree;

import java.util.Arrays;

/**
 * @Author nilzxq
 * @Date 2020-08-13 9:31
 */
public class BuildTree {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null||inorder.length==0){
            return null;
        }
        TreeNode root = new TreeNode(postorder[postorder.length - 1]);
        //root.val;
        //发现root的坐标
        int index = findIndex(inorder, postorder);
        root.left = buildTree(Arrays.copyOfRange(inorder, 0, index),
                Arrays.copyOfRange(postorder, 0, index));
        root.right=buildTree(Arrays.copyOfRange(inorder,index+1,inorder.length),
                Arrays.copyOfRange(postorder,index,postorder.length-1));
        return root;
    }

    public static int findIndex(int[] inorder, int[] postorder) {
        int root = postorder[postorder.length - 1];
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] postorder={9,15,7,20,3};
        int[] inorder={9,3,15,20,7};
        System.out.println(buildTree(inorder,postorder));
    }
}
