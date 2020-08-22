package interview;

import java.util.*;

/**
 * @Author nilzxq
 * @Date 2020-08-22 19:32
 */
public class yuanfudao {
    private static TreeNode root;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeNode node = new TreeNode();
        int[] arr = new int[n];
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }
        //构建二叉树
        root = buildTree(queue);
        //dfs
        List<Integer> list = dfs(root);
        System.out.println(list.toArray());
    }

    public static TreeNode buildTree(Queue<Integer> queue) {
        while (queue.isEmpty()) {
            return root;
        }
        root.left = buildTree(queue);
        root.right = buildTree(queue);
        return root;
    }

    public static List<Integer> dfs(TreeNode node) {
        List<Integer> res = new ArrayList<>();
        if (node == null) {
            return res;
        }
        res.add(node.val);
        dfs(node.left);
        return res;
    }

    //dp
    public int helper2() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            arr[i][m]=arr[i][0];
        }
        //特殊的最后一列和第一列连着
        //非特殊情况
        //dp以当前位置为矩阵的右下角矩阵的和
        int[][] dp = new int[n][m+1];
        int max=Integer.MIN_VALUE;
        dp[0][0] = arr[0][0];
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(arr[i][0], arr[i][0] + dp[i - 1][0]);
            if(dp[i][0]>max){
                max=dp[i][0];
            }
        }
        for (int j = 1; j < m+1; j++) {
            dp[0][j] = Math.max(arr[0][j], dp[0][j - 1] + arr[0][j]);
            if(dp[0][j]>max){
                max=dp[0][j];
            }

        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m+1;j++){
                //上左对角都加上
                //自己本身
                //只加左
                //只加右
                dp[i][j]=Math.max(Math.max(dp[i-1][j]+dp[i][j]+dp[i-1][j-1]+arr[i][j],
                        dp[i-1][j]+arr[i][j]),dp[i][j-1]+arr[i][j]);
                if(dp[i][j]>max){
                    max=dp[i][j];
                }
            }
        }
        return max;
    }
}
