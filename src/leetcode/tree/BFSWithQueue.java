package leetcode.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author nilzxq
 * @Date 2020-07-29 15:30
 */
public class BFSWithQueue {
    public void BFSWithQueue(TreeNode1 root){
        Queue<TreeNode1> queue=new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            TreeNode1 treeNode=queue.poll();
            if(treeNode.left!=null){
                queue.add(treeNode.left);
            }
            if(treeNode.right!=null){
                queue.add(treeNode.right);
            }
        }


    }

    public void DFSWithRecursion(TreeNode1 root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            DFSWithRecursion(root.left);
        }
        if(root.right!=null){
            DFSWithRecursion(root.right);
        }
    }


}
