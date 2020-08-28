package leetcode.tree;

import sun.reflect.generics.tree.Tree;

import java.util.*;

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

    //数组
    public static int[] levelOrder1(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null){
            queue.offer(root);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                arr.add(node.val);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
        }
        int[] res=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
    }

    //奇数行从左到右打印
    //偶数行从右到左打印
    public List<List<Integer>> levelOrder2(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        if(root!=null){
            queue.offer(root);
        }
        List<List<Integer>> arr=new ArrayList<>();

        while(!queue.isEmpty()){
            int size=queue.size();
            //双端队列
            LinkedList<Integer> temp=new LinkedList<>();

            for(int i=0;i<size;i++){
                TreeNode node=queue.poll();
                if(arr.size()%2==0){
                    temp.addLast(node.val);
                }else{
                    temp.addFirst(node.val);
                }
                    if(node.left!=null){
                        queue.add(node.left);
                    }
                    if(node.right!=null) {
                        queue.add(node.right);
                    }


            }
            arr.add(temp);
        }
        return arr;
    }
}
