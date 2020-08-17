package leetcode.tree;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author nilzxq
 * @Date 2020-08-17 20:35
 */
public class Problem_54_KthLargest {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public int kthLargest(TreeNode root,int k){
        List<Integer> list=bfs(root,new ArrayList<>());
        return list.get(k-1);
    }

    public List<Integer> bfs(TreeNode root,List<Integer> list){
        if(root==null){
            return list;
        }
        bfs(root.right,list);
        list.add(root.val);
        bfs(root.left,list);
        return list;
    }

    int n=0;
    int res=0;
    public int kthLargest1(TreeNode root,int k){
        n=k;
        bfs(root);
        return res;
    }
    public void bfs(TreeNode root){
        if(root.right!=null&&n>0){
            bfs(root.right);
        }
        n--;
        if(n==0){
            res=root.val;
        }
        if(root.left!=null&&n>0){
            bfs(root.left);
        }
    }
}
