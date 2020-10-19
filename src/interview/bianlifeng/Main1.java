package interview.bianlifeng;

import java.util.ArrayList;

/**
 * @Author nilzxq
 * @Date 2020-10-19 19:08
 */
public class Main1 {
    public static void main(String[] args) {
        System.out.println(2);
    }

    static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }

    //tree 二维数组描述的树结构，结构为：
    // [[父节点, 子节点], [父节点, 子节点], ... [父节点, 子节点]]
    //[[1,2],[1,3],[2,4],[2,5],[4,8],[4,9],[3,6],[3,7]],2,8
    //2
    public static TreeNode helper(TreeNode root, TreeNode node1, TreeNode node2){
        if(root==null||root==node1||root==node2){
            return root;
        }
        TreeNode left=helper(root.left,node1,node2);
        TreeNode right=helper(root.right,node1,node2);
        if((left==node1&&right==node2)||left==node2&&right==node1){
            return root;
        }
        return left==null?right:left;
    }

    public static int getLength(TreeNode root,TreeNode node1,TreeNode node2){
        ArrayList<TreeNode> list1=new ArrayList<>();
        ArrayList<TreeNode> list2=new ArrayList<>();
        TreeNode anc=helper(root,node1,node2);
        int l1=getPath(anc,node1,list1);
        int l2=getPath(anc,node2,list2);
        return (l1+l2);
    }

    private static int getPath(TreeNode root, TreeNode node, ArrayList<TreeNode> list) {
//        if(root==node){
//            return true;
//        }
        return 0;
    }
}
