package leetcode;

public class Problem_68_Tree_LowestCommonAncestor2 {
    /**
     * 递归
     * 如果p和q分别是root的左右节点，那么root就是我们要找的最近公共祖先
     * 如果p和q都是root的左节点，那么返回lowestCommonAncestor(root.left,p,q)
     * 如果p和q都是root的右节点，那么返回lowestCommonAncestor(root.right,p,q)
     * 作者：yuanninesuns
     * 链接：https://leetcode-cn.com/problems/er-cha-shu-de-zui-jin-gong-gong-zu-xian-lcof/solution/jian-dan-yi-dong-xiang-jie-ru-xia-by-yuanninesuns/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     * @param root
     * @param p
     * @param q
     * @return
     */
    public TreeNode lowestCommonAncestor(TreeNode root,TreeNode p,TreeNode q){
        if(root==null||root==q||root==p){
            return root;
        }
        TreeNode leftNode=lowestCommonAncestor(root.left,p,q);
        TreeNode rightNode=lowestCommonAncestor(root.right,p,q);
        if(leftNode==null){
            return rightNode;
        }
        if(rightNode==null){
            return leftNode;
        }
        return root;
    }

    public static void main(String[] args) {
        Problem_68_Tree_LowestCommonAncestor2 lca=new Problem_68_Tree_LowestCommonAncestor2();
        TreeNode node=new TreeNode(4);
        node.left=new TreeNode(1);
        node.right=new TreeNode(6);
        node.left.left=new TreeNode(0);
        node.left.right=new TreeNode(2);
        node.left.right.right=new TreeNode(3);
        node.right.left=new TreeNode(5);
        node.right.right=new TreeNode(7);
        node.right.right.right=new TreeNode(8);
        TreeNode res=lca.lowestCommonAncestor(node,node.left.right.right,node.left);
        System.out.println(res.val);
    }
}
