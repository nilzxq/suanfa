package leetcode.array;

/**
 * @Author nilzxq
 * @Date 2020-07-27 17:46
 */
public class Problem_10_NumWays {
    public static void main(String[] args) {
        System.out.println(numWays(7));
    }
    public static int numWays(int n){
        if(n==0||n==1||n==2){
            return n;
        }
        int sum=0;
        for(int i=3;i<=n;i++){
            sum=numWays(n-1)+numWays(n-2);
            //System.out.println(sum);
        }
        return sum;
    }
}
