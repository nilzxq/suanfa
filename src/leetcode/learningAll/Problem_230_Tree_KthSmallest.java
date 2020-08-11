package leetcode.learningAll;

import java.util.ArrayList;

public class Problem_230_Tree_KthSmallest {

    public int kthSmallest(TreeNode root,int k){
        if(root==null){
            return 0;
        }
        ArrayList<Integer> res=inorder(root,new ArrayList<>());
        return res.get(k - 1);
    }


    private  ArrayList<Integer> inorder(TreeNode root,ArrayList<Integer> arr){
        if(root==null){
            return arr;
        }
        inorder(root.left,arr);
        arr.add(root.val);
        inorder(root.right,arr);
        return arr;
    }

    public int kthSmallest1(TreeNode root,int k){
        inorder1(root,k);
        return res;
    }
    //剪枝
    int n;
    int res;
    private void inorder1(TreeNode root,int k){
        if(root==null||n>k){
            return;
        }
        inorder1(root.left,k);
        n++;
        if(n==k) res=root.val;
        inorder1(root.right,k);
    }

    public static void main(String[] args) {
        Problem_230_Tree_KthSmallest ks=new Problem_230_Tree_KthSmallest();
        TreeNode node=new TreeNode(4);
        node.left=new TreeNode(1);
        node.right=new TreeNode(6);
        node.left.left=new TreeNode(0);
        node.left.right=new TreeNode(2);
        node.left.right.right=new TreeNode(3);
        node.right.left=new TreeNode(5);
        node.right.right=new TreeNode(7);
        node.right.right.right=new TreeNode(8);
        System.out.println(ks.kthSmallest(node,1));
        System.out.println(ks.kthSmallest1(node,1));
    }
}
