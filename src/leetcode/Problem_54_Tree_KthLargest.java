package leetcode;

import java.util.ArrayList;

/**
 * @Author nilzxq
 * @Date 2020-06-08 22:18
 */
public class Problem_54_Tree_KthLargest {
    public int kthLargest(TreeNode root, int k) {
        ArrayList<Integer> array=inorder(root,new ArrayList<Integer>());
        return array.get(k-1);
    }

    private ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> array){
        if(root==null){
            return array;
        }
        inorder(root.right,array);
        array.add(root.val);
        inorder(root.left,array);
        return array;
    }

    int res;
    int n;
    public int kthLargest1(TreeNode root, int k) {
        inorder1(root,k);
        return res;
    }

    private void inorder1(TreeNode root, int k) {
        if(root==null||n>k){
            return;
        }
        inorder1(root.right,k);
        n++;
        if(n==k) res=root.val;
        inorder1(root.left,k);
    }


    public static void main(String[] args) {
        Problem_54_Tree_KthLargest kl=new Problem_54_Tree_KthLargest();
        TreeNode node=new TreeNode(4);
        node.left=new TreeNode(1);
        node.right=new TreeNode(6);
        node.left.left=new TreeNode(0);
        node.left.right=new TreeNode(2);
        node.left.right.right=new TreeNode(3);
        node.right.left=new TreeNode(5);
        node.right.right=new TreeNode(7);
        node.right.right.right=new TreeNode(8);
        System.out.println(kl.kthLargest(node,1));
        System.out.println(kl.kthLargest1(node,1));
    }
}
