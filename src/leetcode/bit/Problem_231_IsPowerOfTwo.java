package leetcode.bit;

/**
 * @Author nilzxq
 * @Date 2020-08-10 15:45
 */
public class Problem_231_IsPowerOfTwo {
    /**
     * 二的幂
     * @param n
     * @return
     */
    public static boolean isPowerOfTwo(int n){
        return (n>0)&&(n&(n-1))==0;
    }

    /**
     * 特殊用例0 不处理好的话会很麻烦
     * @param n
     * @return
     */
    public static boolean isPowerOfTwo1(int n){
        if(n==0){
            return false;
        }
        if(n==1){
            return true;
        }
        if(n==2){
            return true;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            n/=2;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }
}
