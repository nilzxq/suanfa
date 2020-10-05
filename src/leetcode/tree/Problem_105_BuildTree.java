package leetcode.tree;

/**
 * @Author nilzxq
 * @Date 2020-10-05 19:47
 */
public class Problem_105_BuildTree {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            val=x;
        }
    }
    public TreeNode buildTree(int[] preorder,int[] inorder){
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }

    TreeNode build(int[] preorder,int preStart,int preEnd,int[] inorder,int inStart,int inEnd){
        //root节点对应的值就是前序遍历数组的第一个元素
        if(preStart>preEnd){
            return null;
        }
        int rootVal=preorder[preStart];
        int index=0;
        for(int i=inStart;i<=inEnd;i++){
            if(inorder[i]==rootVal){
                index=i;
                break;
            }
        }
        int leftSize=index-inStart;
        TreeNode root=new TreeNode(rootVal);
        //递归构造左右子树
        root.left=build(preorder,preStart+1,preStart+leftSize,inorder,inStart,index-1);
        root.right=build(preorder,preStart+leftSize+1,preEnd,inorder,index+1,inEnd);
        return root;
    }
}
