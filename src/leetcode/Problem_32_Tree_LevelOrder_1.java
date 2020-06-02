package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Problem_32_Tree_LevelOrder_1 {
    public int[] levelOrder(TreeNode root){
        if(root==null){
            return new int[0];
        }
        Queue<TreeNode> queue=new LinkedList<TreeNode>() {{add(root);}};
        ArrayList<Integer> arrayList=new ArrayList<Integer>();
        //queue.isEmpty
        while(!queue.isEmpty()){
            //返回第一个元素，并在队列中删除
            TreeNode node=queue.poll();
            arrayList.add(node.val);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null) {
                queue.add(node.right);
            }
        }
        int[] res=new  int[arrayList.size()];
        for(int i=0;i<res.length;i++){
            res[i]=arrayList.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        Problem_32_Tree_LevelOrder_1 lo=new Problem_32_Tree_LevelOrder_1();
        TreeNode node=new TreeNode(4);
        node.left=new TreeNode(1);
        node.right=new TreeNode(6);
        node.left.left=new TreeNode(0);
        node.left.right=new TreeNode(2);
        node.left.right.right=new TreeNode(3);
        node.right.left=new TreeNode(5);
        node.right.right=new TreeNode(7);
        node.right.right.right=new TreeNode(8);
        int[] res=lo.levelOrder(node);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
