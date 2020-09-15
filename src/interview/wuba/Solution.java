package interview.wuba;

import leetcode.sort.A;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author nilzxq
 * @Date 2020-09-14 21:00
 */
public class Solution {
    public class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
  }
    /**
     *二叉树的层序遍历
     * @param node TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public static ArrayList<ArrayList<Integer>> printNode (TreeNode node) {
        // write code here
        if(node==null){
            return null;
        }
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        if(node!=null){
            queue.add(node);
        }
        while(!queue.isEmpty()){
            int size=queue.size();
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode treeNode=queue.poll();
                if(treeNode.val!='#'){
                    list.add(treeNode.val);
                }
                if(treeNode.left!=null){
                    queue.add(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.add(treeNode.right);
                }
                res.add(list);
            }
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
