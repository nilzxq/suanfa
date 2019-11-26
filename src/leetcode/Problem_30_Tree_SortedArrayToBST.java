package leetcode;

/** 
* @author nilzxq
* @version 2019年11月26日 下午7:55:00 
*类说明 
*/
public class Problem_30_Tree_SortedArrayToBST {
	
	public static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x){
			val=x;
		}
	}

     public static TreeNode sortedArrayToBST(int[] nums) {
        if(nums==null||nums.length==0) {
        	return null;
        }
        return getTree(nums,0,nums.length-1);
    }
     
     public static TreeNode getTree(int[] nums,int l,int r) {
    	 if(l<=r) {
    		 int mid=(l+r)/2;
    		 TreeNode node=new TreeNode(nums[mid]);
    		 node.left=getTree(nums,l,mid-1);
    		 node.right=getTree(nums,mid+1,r);
    		 return node;
    	 }else {
    		 return null;
    	 }
     }
     
     public static void main(String[] args) {
    	 int[] nums= {-10,-3,0,5,9};
    	 System.out.println(sortedArrayToBST(nums));
	}
}
