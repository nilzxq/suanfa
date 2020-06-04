package leetcode;

public class Problem_68_Tree_LowestCommonAncestor {

    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        while(root!=null){
            if(root.val<p.val&&root.val<q.val){
                root=root.right;
            }else if(root.val>p.val&&root.val>q.val){
                root=root.left;
            }else break;
        }
        return root;
    }

    public static void main(String[] args) {
        Problem_68_Tree_LowestCommonAncestor lca=new Problem_68_Tree_LowestCommonAncestor();
        TreeNode node=new TreeNode(4);
        node.left=new TreeNode(1);
        node.right=new TreeNode(6);
        node.left.left=new TreeNode(0);
        node.left.right=new TreeNode(2);
        node.left.right.right=new TreeNode(3);
        node.right.left=new TreeNode(5);
        node.right.right=new TreeNode(7);
        node.right.right.right=new TreeNode(8);
        System.out.println(lca.lowestCommonAncestor(node,node.left.right.right,node.left));
    }
}
