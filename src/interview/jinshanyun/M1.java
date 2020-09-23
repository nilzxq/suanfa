package interview.jinshanyun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * 首先按照从上到下、从左到右的顺序输入一棵满二叉树中每一个结点对应的权重，例如输入1、1、2表示二叉树的根结点的权重为1，它的左、右两个子节点的权重分别为1和2。
 *
 * 然后判断该满二叉树中是否存在这样的非叶子结点：它的左子树上所有结点的权重之和等于右子树上所有结点的权重之和。
 *
 * 现在给你一棵满二叉树的所有结点的权重，请编写一个程序，寻找是否存在满足要求的非叶子结点，如果存在输出“Yes”，否则输出“No”。
 *
 * 多组输入。
 *
 * 第1行输入一个正整数T表示测试数据的数量。(T<=100)
 *
 * 接下来T行对应T组输入，每组输入数据占一行，该行包含n个正整数（n满足2^k-1），两两之间用空格隔开，1<n<=1000。
 *
 *
 * 对于每组输入数据，如果能够找到满足要求的非叶子结点（左子树上所有结点的权重之和等于右子树上所有结点的权重之和），输出“Yes”，否则输出“No”。
 *
 * 3
 * 1 2 2 1 2 1 2
 * 1 2 2 1 3 2 2
 * 1 2 2 1 2 1 3
 *
 * Yes
 * Yes
 * No
 * @Author nilzxq
 * @Date 2020-09-23 20:53
 */
public class M1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();

        for(int i=0;i<T;i++){
            String str=sc.nextLine();
            String[] strs=str.split(" ");
            int[] arr=new int[strs.length];
            for(int j=0;j<strs.length;j++){
                arr[i]=Integer.valueOf(strs[j]);

            }
            int n=strs.length;
            int level=0;
            while(n!=0){
                n=n/2;
                level++;
            }
            //找到左右子树的叶子节点 然后判断是否相同
            for(int k=level-1;k>=0;k--){

            }
            System.out.println("Yes");
        }

        //System.out.println("YES");
    }

//    public static boolean helper(int[] arr){
//
//    }
}
