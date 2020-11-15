package leetcode.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author nilzxq
 * @Date 2020-11-14 15:04
 */
public class Problem_114_Flatten {
    public static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(){}
        TreeNode(int val){
            this.val=val;
            this.left=left;
            this.right=right;
        }
    }

    public static void flatten(TreeNode root){
        List<TreeNode> list=new ArrayList<>();
        preOrderTravelsal(root,list);
        int size=list.size();
        for(int i=1;i<size;i++){
            TreeNode prev=list.get(i-1),curr=list.get(i);
            prev.left=null;
            prev.right=curr;
        }
    }

    private static void preOrderTravelsal(TreeNode root, List<TreeNode> list) {
        if(root!=null){
            list.add(root);
            preOrderTravelsal(root.left,list);
            preOrderTravelsal(root.right,list);
        }
    }


}
