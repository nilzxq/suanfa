package leetcode.tree;

/**
 * 二叉搜索树的后序遍历序列
 * 递归
 * @Author nilzxq
 * @Date 2020-08-28 10:16
 */
public class Problem_33_VerifyPostorder {
    public static boolean verifyPostorder(int[] postorder){
        return recur(postorder,0,postorder.length-1);
    }

    public static boolean recur(int[] postorder,int i,int j){
        if(i>=j){
            return true;
        }
        int p=i;
        while(postorder[p]<postorder[j]){
            p++;
        }
       int m=p;
        while(postorder[p]>postorder[j]){
            p++;
        }
        return p==j&&recur(postorder,i,m-1)&&recur(postorder,m,j-1);
    }
}
