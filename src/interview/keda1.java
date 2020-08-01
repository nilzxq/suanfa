package interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Author nilzxq
 * @Date 2020-07-31 14:30
 */
public class keda1 {
    /**
     * 第一行为5个数字，分别表示为1元，五元，10元，50元，100元纸币的数量
     * 第二行为要支付的金额k
     * 输出最少需要张数 如：5
     * 动态规划
     * @param args
     */
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int a,b,c,d,e;
//        for(int i=0;i<5;i++){
//            a=scanner.nextInt();
//            b=scanner.nextInt();
//            c=scanner.nextInt();
//            d=scanner.nextInt();
//            e=scanner.nextInt();
//        }
//        scanner.nextLine();
//        int sum;
//        scanner.nextInt();
//        int[] coins={2};
//        int amount=11;
//        System.out.println(coinChange1(0,coins,amount));
        coinChange4();
    }

    public static int coinChange(Integer[] coins,int amount){
        Comparator comp=new MyComparator();
        Arrays.sort(coins,comp);
        for(int i=0;i<coins.length;i++){
            if(amount/coins[i]==0&&amount>=coins[i]){
                int res=amount/coins[i];
                return res;
            }
        }
        return 0;
    }

    public static int coinChange1(int idxCoin,int[] coins,int amount){
        if(amount==0){
            return 0;
        }
        if(idxCoin<coins.length&&amount>0){
            int maxNumber=amount/coins[idxCoin];
            int min=Integer.MAX_VALUE;
            for(int x=0;x<=maxNumber;x++){
                int res=coinChange1(idxCoin+1,coins,amount-x*maxNumber);
                if(res!=-1){
                    min=Math.min(min,res+x);
                }
            }
            return (min==Integer.MAX_VALUE?-1:min);
        }
        return -1;
    }


//    public static int coinChange2(int[] coins,int amount){
//        //自底向上的动态规划
//        if(coins.length==0){
//            return -1;
//        }
//        //memo[n]的值：表示的凑成总金额为n所需的最少的硬币个数
//        int[] memo=new int[amount+1];
//        memo[0]=0;
//        for(int i=0;i<=amount;i++){
//            int min=Integer.MAX_VALUE;
//            for(int j=0;j<coins.length;j++){
//                if(i-coins[i]>=0){
//
//                }
//            }
//        }
//    }

    int ans = Integer.MAX_VALUE;

    public int coinChange3(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        // 将int型数组包装成Integer型数组，便于使用JavaAPI进行排序
        Integer[] ib = IntStream.of(coins).boxed().collect(Collectors.toList()).toArray(new Integer[0]);
        Arrays.sort(ib, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        // dfs进行更新操作
        dfs(ib, amount, 0, 0);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    private void dfs(Integer[] coins, int amount, int c_index, int count) {
        if (amount == 0) {
            ans = Math.min(ans, count);
            return;
        }
        if (c_index == coins.length){
            return;
        }
        // 一次走多行
        for (int i = amount / coins[c_index]; i >= 0 && i + count < ans; i--) {
            dfs(coins, amount - (i * coins[c_index]), c_index + 1, count + i);
        }
    }

    /**
     * 暴力分析
     * 简述题目：用1元，2元，5元，换成20元。一共有多少种换法。每一种纸币数量不限。
     */
    public static void coinChange4(){
        int num=0;
        for(int i=0;i<=20;i++){
            for(int j=0;j<=10;j++){
                for(int k=0;k<=4;k++){
                    int sum=0;
                    sum=i+j*2+k*5;
                    if(sum==20){
                        num++;
                        System.out.println("1元"+i+" "+"2元"+j+" "+"5元"+k);
                    }
                }
            }
        }

    }

    public static class MyComparator implements Comparator<Integer>{

        @Override
        public int compare(Integer o1, Integer o2) {
            /**
             * 如果o1小于o2，我们就返回正值，如果o1大于o2我们就返回负值，
             *  这样颠倒一下，就可以实现降序排序了,反之即可自定义升序排序了
             */
            return o2-o1;
        }
    }
}
