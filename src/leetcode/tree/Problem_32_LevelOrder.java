package leetcode.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 层次遍历
 * @Author nilzxq
 * @Date 2020-08-22 10:11
 */
public class Problem_32_LevelOrder {

    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null){
            queue.offer(root);
        }
        List<List<Integer>> list=new ArrayList<>();
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer> temp = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                temp.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                    //temp.add(node.left.val);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                    //temp.add(node.right.val);
                }
            }
            list.add(temp);
        }
        return list;
    }
}
