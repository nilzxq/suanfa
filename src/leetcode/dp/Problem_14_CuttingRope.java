package leetcode.dp;

/**
 * @Author nilzxq
 * @Date 2020-08-10 6:49
 *
 * 剪绳子 14-1/14-2
 */
public class Problem_14_CuttingRope {

    public static int cuttingRope(int n){
        if(n<=3){
            return n-1;
        }
        int num=n/3;
        int temp=n%3;
        if(temp==0){
            return (int)Math.pow(3,num);
        }
        if(temp==1){
            return (int)Math.pow(3,num-1)*4;
        }
            return (int)Math.pow(3,num)*2;
    }

    /**
     * DP解法
     */

    public static int cuttingRope1(int n){
        //dp[n]长度为n的绳子的最大值，也就是题目要求的值
        int[] dp=new int[n+1];
        dp[0]=dp[1]=1;
        //从n>=2开始
        for(int i=2;i<=n;i++){
            //赋初值为剪为两段，1和i-1
           dp[i]=i-1;
           //剪为大于1的段
            for(int j=2;j<i;j++){
                //两种情况
                //1.剪为j之后的线段接着剪
                dp[i]=Math.max(dp[i],dp[i-j]*j);
                //2.剪为j和i-j
                dp[i]=Math.max(dp[i],(i-j)*j);
            }
        }
        return dp[n];
    }


    /**
     * 升级
     */
    public static int cuttingRope2(int n){
        if(n<4){
            return n-1;
        }
        int mod=1000000007;
        long res=1;
        while(n>4){
            res*=3;
            res%=mod;
            n-=3;
        }
        res*=n;
        res%=mod;
        return (int)res;
    }

    public static void main(String[] args) {
        System.out.println(cuttingRope2(4));
    }
}
