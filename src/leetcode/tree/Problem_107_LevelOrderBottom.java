package leetcode.tree;

import sun.awt.image.ImageWatched;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author nilzxq
 * @Date 2020-09-10 15:11
 */
public class Problem_107_LevelOrderBottom {
    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    public List<List<Integer>> levelOrderBottom(TreeNode root){
        LinkedList<List<Integer>> list=new LinkedList<>();
        if(root==null){
            return list;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> oneLevel=new ArrayList<>();
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                oneLevel.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            list.addFirst(oneLevel);
        }
        return list;
        }
    }
}
