package leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 重建二叉树
 * @Author nilzxq
 * @Date 2020-08-11 9:40
 * 知识点：
 *
 * 前序遍历列表：第一个元素永远是 【根节点 (root)】
 * 中序遍历列表：根节点 (root)【左边】的所有元素都在根节点的【左分支】，【右边】的所有元素都在根节点的【右分支】
 * 算法思路：
 *
 * 通过【前序遍历列表】确定【根节点 (root)】
 * 将【中序遍历列表】的节点分割成【左分支节点】和【右分支节点】
 * 递归寻找【左分支节点】中的【根节点 (left child)】和 【右分支节点】中的【根节点 (right child)】
 */
public class Problem_07_BuildTree {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public static TreeNode buildTree(int[] preorder,int[] inorder){
        //边界与递归出口
        if(preorder==null||preorder.length==0){
            return null;
        }
        //1.获取到树根节点的value值
       TreeNode root=new TreeNode(preorder[0]);
       int index=findIndex(preorder,inorder);
       //2.构建left左子树，right右子树
       // root.left=buildTree(左子树的前序数组，左子树的中序数组);
        root.left=buildTree(Arrays.copyOfRange(preorder,1,index+1),
                Arrays.copyOfRange(inorder,0,index));
        // root.right=buildTree(右子树的前序数组，右子树的中序数组)
        root.right=buildTree(Arrays.copyOfRange(preorder,index+1,preorder.length),
                Arrays.copyOfRange(inorder,index+1,inorder.length));
        return root;
    }

    private static int findIndex(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            if(inorder[i]==preorder[0]){
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] preorder={3,9,20,15,7};
        int[] inorder={9,3,15,20,7};
       System.out.println(buildTree(preorder,inorder));
    }
}
