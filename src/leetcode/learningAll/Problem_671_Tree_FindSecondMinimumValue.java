package leetcode.learningAll;

/**
 * @Author nilzxq
 * @Date 2020-06-07 22:31
 */
public class Problem_671_Tree_FindSecondMinimumValue {
    public int findSecondMinimumValue(TreeNode root){
        if(root==null||root.left==null||root.right==null) return -1;
        int left=root.left.val;
        int right=root.right.val;
        if(left==root.val){
            left=findSecondMinimumValue(root.left);
        }
        if(right==root.val){
            right=findSecondMinimumValue(root.right);
        }
        if(left!=-1&&right!=-1){
            return Math.min(left,right);
        }
        if(left!=-1){
            return left;
        }else{
            return right;
        }
    }

    public static void main(String[] args) {
        Problem_671_Tree_FindSecondMinimumValue fmv=new Problem_671_Tree_FindSecondMinimumValue();
        TreeNode node=new TreeNode(2);
        node.left=new TreeNode(2);
        node.right=new TreeNode(2);
        System.out.println(fmv.findSecondMinimumValue(node));
    }
}
