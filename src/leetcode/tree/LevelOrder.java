package leetcode.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 102 层序遍历
 * @Author nilzxq
 * @Date 2020-08-12 15:30
 */
public class LevelOrder {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public static List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        //arraydeque
        Queue<TreeNode> queue=new ArrayDeque<>();
        if(root!=null){
            queue.add(root);
        }

        while(!queue.isEmpty()){
            int n=queue.size();
            List<Integer> level=new ArrayList<>();
            for(int i=0;i<n;i++){
                //变量i无实际意义，只是为了循环n次
                TreeNode node=queue.poll();
                level.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(level);
        }
        return res;
    }

    /**
     * 二叉树的层序遍历
     * @param root
     */
    public void dfs1(TreeNode root){

        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int n=queue.size();

            for(int i=0;i<n;i++){
                //变量i无实际意义，只是为了循环n次
                TreeNode node=queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }

        }

    }

    //bfs 借助队列  先进先出
    public static void bfs(TreeNode root){
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node=queue.poll();
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
        System.out.println(levelOrder(root));

    }
}
