package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author nilzxq
 * @Date 2020-08-16 11:31
 */
public class Problem_111_MinDepth {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public static int minDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null){
            queue.offer(root);
        }
        //root本身就是一层，depth初始化为1
        int depth=1;
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                /**
                 * 判断是否到达终点
                 */
                if(node.left==null&&node.right==null){
                    return depth;
                }
                /**
                 * 将cur的相邻节点加入队列
                 */
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            depth++;
        }
        return depth;
    }
}
