package leetcode.learningAll;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Problem_32_Tree_LevelOrder3 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null) queue.add(root);
        while(!queue.isEmpty()){
            //LinkedList
            LinkedList<Integer> list=new LinkedList<>();
            for(int i=queue.size();i>0;i--){
                TreeNode node=queue.poll();
                if(res.size()%2==0)list.addLast(node.val);// 偶数层 -> 队列头部
                else list.addFirst(node.val);// 奇数层 -> 队列尾部
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
            }
            res.add(list);
        }
       return res;
    }

    public static void main(String[] args) {
        Problem_32_Tree_LevelOrder3 lo=new Problem_32_Tree_LevelOrder3();
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
