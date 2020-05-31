package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Problem_Tree_BalanceBST {
    public TreeNode balanceBST(TreeNode root){
        List<Integer> sortList=new ArrayList<>();
        //中序遍历构造有序链表
        inOrder(root,sortList);
        //有序链表构造平衡二叉树
        return buildTree(sortList,0,sortList.size()-1);
    }

    private void inOrder(TreeNode node, List<Integer> sortList) {
        if(node!=null){
            inOrder(node.left,sortList);
            sortList.add(node.val);
            inOrder(node.right,sortList);
        }
    }

    //有序链表构造平衡二叉树
    private TreeNode buildTree(List<Integer> sortList, int start, int end) {
        if(start>end){
            return null;
        }
        //中间节点为root
        int mid=start+(end-start>>1);
        TreeNode root=new TreeNode(sortList.get(mid));
        //递归构造左右子树
        root.left=buildTree(sortList,start,mid-1);
        root.right=buildTree(sortList,mid+1,end);
        //返回root
        return root;
    }

    // for test -- print tree
    public static void printTree(TreeNode head) {
        System.out.println("Binary Tree:");
        printInOrder(head, 0, "H", 17);
        System.out.println();
    }

    public static void printInOrder(TreeNode head, int height, String to, int len) {
        if (head == null) {
            return;
        }
        printInOrder(head.right, height + 1, "v", len);
        String val = to + head.val + to;
        int lenM = val.length();
        int lenL = (len - lenM) / 2;
        int lenR = len - lenM - lenL;
        val = getSpace(lenL) + val + getSpace(lenR);
        System.out.println(getSpace(height * len) + val);
        printInOrder(head.left, height + 1, "^", len);
    }

    public static String getSpace(int num) {
        String space = " ";
        StringBuffer buf = new StringBuffer("");
        for (int i = 0; i < num; i++) {
            buf.append(space);
        }
        return buf.toString();
    }

    public static void main(String[] args) {
        Problem_Tree_BalanceBST bt=new Problem_Tree_BalanceBST();
        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(2);
        root.right.right=new TreeNode(3);
        root.right.right.right=new TreeNode(4);
        TreeNode bt1=bt.balanceBST(root);
        printTree(bt1);
    }

}
