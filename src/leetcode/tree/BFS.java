package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author nilzxq
 * @Date 2020-07-16 21:22
 */
public class BFS {
    public static int[] levelOrder(TreeNode root){
        if(root==null){
            return new int[0];
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>(){{ add(root); }};
        ArrayList<Integer> arr=new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            arr.add(node.val);
            if(node.left!=null) queue.add(node.left);
            if(node.right!=null) queue.add(node.right);
        }
        int[] res=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode treeNode=new TreeNode(1);
        treeNode.left=new TreeNode(2);
        treeNode.right=new TreeNode(89);
        treeNode.right.left=new TreeNode(4);
        treeNode.right.right=new TreeNode(5);
        int[] res=levelOrder(treeNode);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}


class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
        val=x;
    }
}
