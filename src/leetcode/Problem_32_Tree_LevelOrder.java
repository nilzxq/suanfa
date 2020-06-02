package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_32_Tree_LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root){
        //List ArrayList
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            List<Integer> tmp=new ArrayList<>();
            /**
             * for(int i = 0; i < queue.size(); i++) {}
             * 因为for第一部分只执行一次，第二部分每次循环都会执行一次，队列一直在变化，运行会不正确。可以这样：
             * 注意size
             * 用i++的时候
             * int size = queue.size();
             * for(int i = 0; i < size; i++) {}
             */
            for(int i=queue.size();i>0;i--){
                TreeNode node=queue.poll();
                tmp.add(node.val);
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            res.add(tmp);
        }
        return res;
    }

    public static void main(String[] args) {
        Problem_32_Tree_LevelOrder lo=new Problem_32_Tree_LevelOrder();
        TreeNode node=new TreeNode(4);
        node.left=new TreeNode(1);
        node.right=new TreeNode(6);
        node.left.left=new TreeNode(0);
        node.left.right=new TreeNode(2);
        node.left.right.right=new TreeNode(3);
        node.right.left=new TreeNode(5);
        node.right.right=new TreeNode(7);
        node.right.right.right=new TreeNode(8);
        System.out.println(lo.levelOrder(node));
    }
}
