package leetcode.array;

/**
 * @Author nilzxq
 * @Date 2020-07-27 20:57
 */
public class Problem_16_MyPow {
    public static void main(String[] args) {
        double num=2.00000;
        int n=10;
        System.out.println(myPow(num,n));
    }
    public static double myPow(double x, int n) {
        double result=1.0;
        for(int i=0;i<Math.abs(n);i++){
            result*=x;
        }
        if(n>=0){
            return result;
        }else{
            return 1/result;
        }
    }
}
