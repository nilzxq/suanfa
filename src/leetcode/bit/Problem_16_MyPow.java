package leetcode.bit;

/**
 * @Author nilzxq
 * @Date 2020-08-10 17:35
 */
public class Problem_16_MyPow {
// int n =>long n
    //Java 代码中 int32 变量 n [-2147483648, 2147483647]n∈[−2147483648,2147483647] ，
    // 因此当 n = -2147483648n=−2147483648 时执行 n = -nn=−n 会因越界而赋值出错。
    // 解决方法是将 n 存入 long 变量 N

    public static double myPow(double x,int n){
        if(x==0){
            return 0;
        }
        if(x==1||n==0){
            return 1;
        }
        long N=n;
        double res=dfs(x,N);
        if(n<0){
            return 1.0/res;
        }else{
            return res;
        }
    }

    public static double dfs(double x,long n){
        if(n==1){
            return x;
        }else{
            double tmp=dfs(x,n/2);
            if(n%2==0){
                return tmp*tmp;
            }else{
                return tmp*tmp*x;
            }
        }

    }

    /**
     * 快速幂
     */

    public static double myPow1(double x,int n) {
        if (x == 1 || n == 0) {
            return 1;
        }
        long temp = n;
        if (n < 0) {
            //temp=-n不可以 为什么？
            temp = -temp;
            x = 1.0 / x;
        }
        double ans = 1.0;
        while (temp != 0) {
            //奇数次幂
            if ((temp & 1)==1) {
                ans *= x;
            }
            //自己平方
            x*=x;
            temp>>=1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.00000,10));
    }

}
