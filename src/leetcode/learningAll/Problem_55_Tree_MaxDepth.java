package leetcode.learningAll;

/**
 * @Author nilzxq
 * @Date 2020-06-09 22:31
 */
public class Problem_55_Tree_MaxDepth {

    public int maxDepth(TreeNode root){
        if(root == null) return 0;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        Problem_55_Tree_MaxDepth md=new Problem_55_Tree_MaxDepth();
        TreeNode node=new TreeNode(4);
        node.left=new TreeNode(1);
        node.right=new TreeNode(6);
        node.left.left=new TreeNode(0);
        node.left.right=new TreeNode(2);
        node.left.right.right=new TreeNode(3);
        node.right.left=new TreeNode(5);
        node.right.right=new TreeNode(7);
        node.right.right.right=new TreeNode(8);
        System.out.println(md.maxDepth(node));
    }
}
