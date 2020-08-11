package interview;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-08-11 19:01
 */
public class beike {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        while (in.hasNextInt()) {// 注意，如果输入是多个测试用例，请通过while循环处理多个测试用例
//
//        }
//        int n = in.nextInt();
//        String s=in.next();
//        System.out.println(helper1(s.toCharArray(),n));
        //Scanner in = new Scanner(System.in);
//        while (in.hasNextInt()){
//            int num = in.nextInt();
//            int n=0,m=0;
//            for(int i=0;i<num;i++){
//                n=in.nextInt();
//                m=in.nextInt();
//            }
//            System.out.println(helper2(n,m));
//        }

        int num = in.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=in.nextInt();
        }
        System.out.print(helper3(arr,num));
    }

    //替换字母变成回文串
    public static int helper1(char[] arr,int n){
        if(n==1){
            return 1;
        }
        int count=0;
        for(int i=0;i<n/2;i++){
            if(arr[i]!=arr[n-i-1]){
                count++;
            }
        }
        return count;
    }

    //格子染色
    //每种颜色染色的格子数是相同的
    //相邻格子染不同的颜色
    //所有格子必须染色
    public static int helper2(int n,int m){
        if(n==m){
            return n;
        }
        //动态规划
        int[][] dp=new int[m][n];

        return n>m?n:m;
    }

    //或的
    //连续的子序列
    public static int helper3(int[] arr,int n){
        int max=0;
        int res=0;
        int count=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                res=0;
                for(int k=i;k<=j;k++){
                    res=res|arr[i];
                    if(res>=max){
                        count=(j-i)==0?1:(Math.min(count,j-i+1));
                        max=res;
                    }
                }
            }
        }
        return count;
    }

    public static int helper4(int n){
        for(int i=2;i<=Math.pow(n,0.5);i++){
            if(n%i==0){
                return i;
            }
        }
        return n;
    }

    //转为DP
    public static int helper5(int[] arr,int n) {
        int[] temp=new int[n];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        Arrays.sort(temp);
        //dp含义 用来统计以当前位置结尾的最大值
        int[] dp=new int[n];
        dp[0]=temp[n-1];
        int res=0;
        int max=Integer.MIN_VALUE;
        for(int i=1;i<n;i++){
            res=res^arr[i];
            if(res>arr[i]||res>=max){
                max=res;
                dp[i]=Math.min(dp[i],arr[i]^dp[i-1]);
            }

        }
        return 0;
    }

}
