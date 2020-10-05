package leetcode.tree;

import sun.reflect.generics.tree.Tree;

/**
 * @Author nilzxq
 * @Date 2020-10-05 19:34
 */
public class Problem_654_ConstructMaximumBinaryTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public TreeNode constructMaximumBinaryTree(int[] nums){
        return build(nums,0,nums.length-1);
    }

    //将nums[low,...high]构造成符合条件的树，返回根节点
    TreeNode build(int[] nums,int low,int high){
        if(low>high){
            return null;
        }
        //找到数组中的最大值和对应的索引
        int index=-1,maxValue=Integer.MIN_VALUE;
        for(int i=low;i<=high;i++){
            if(maxValue<nums[i]){
                index=i;
                maxValue=nums[i];
            }
        }
        TreeNode root=new TreeNode(maxValue);
        root.left=build(nums,low,index-1);
        root.right=build(nums,index+1,high);
        return root;
    }
}
