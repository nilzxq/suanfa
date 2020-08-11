package leetcode.bit;

/**
 * @Author nilzxq
 * @Date 2020-08-10 11:27
 */
public class Problem_15_HammingWeight {
    public static int hammingWeight(int n){
        int res=0;
        while(n!=0){
            res++;
            n=n&(n-1);
        }
        return res;
    }

    public static int hammingWeight1(int n){
        int res=0;
       while(n!=0){
           res+=n&1;
           n>>>=1;
       }
       return res;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight1(00000000000000000000000000001011));
    }
}
