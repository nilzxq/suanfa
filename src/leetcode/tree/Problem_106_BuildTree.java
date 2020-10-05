package leetcode.tree;

/**
 * 从中序与后序遍历序列构造二叉树
 * @Author nilzxq
 * @Date 2020-10-05 20:21
 */
public class Problem_106_BuildTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }

    public TreeNode buildTree(int[] inorder,int[] postorder){
        return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }

    TreeNode build(int[] inorder,int inStart,int inEnd,int[] postorder,int postStart,int postEnd){
        if(inStart>inEnd){
            return null;
        }
        //root节点对应的值就是后序遍历数组的最后一个元素
        int rootVal=postorder[postEnd];
        int index=0;
        for(int i=inStart;i<=inEnd;i++){
            if(rootVal==inorder[i]){
                index=i;
                break;
            }
        }
        int leftSize=index-inStart;
        TreeNode root=new TreeNode(rootVal);
        root.left=build(inorder,inStart,index-1,postorder,postStart,postStart+leftSize-1);
        root.right=build(inorder,index+1,inEnd,postorder,postStart+leftSize,postEnd-1);
        return root;
    }
}
