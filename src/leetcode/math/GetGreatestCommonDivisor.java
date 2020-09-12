package leetcode.math;

/**
 * @Author nilzxq
 * @Date 2020-09-12 16:27
 */
public class GetGreatestCommonDivisor {
    //暴力枚举
    public static int getGreatestCommonDivisor(int a,int b){
        int big=a>b?a:b;
        int small=a<b?a:b;
        if(big%small==0){
            return small;
        }
        for(int i=small/2;i>1;i--){
            if(small%i==0&&big%i==0){
                return i;
            }
        }
        return 1;
    }

    //辗转相除法 欧几里得算法
    //两个正整数a和b(a>b) 它们的最大公约数等于a除以b的余数c和b之间的最大公约数
    public static int getGreatestCommonDivisor1(int a,int b){
        int big=a>b?a:b;
        int small=a<b?a:b;
        if(big%small==0){
            return small;
        }
        return getGreatestCommonDivisor(big%small,small);
    }

    //更相减损术
    //两个正整数a和b(a>b),它们的最大公约数等于a-b的差值c和较小数b的最大公约数
    public static int getGreatestCommonDivisor2(int a,int b){
        if(a==b){
            return a;
        }
        int big=a>b?a:b;
        int small=a<b?a:b;
        return getGreatestCommonDivisor(big-small,small);
    }

    public static int gcd(int a,int b){
        if(a==b){
            return a;
        }
        if((a&1)==0&&(b&1)==0){
            return gcd(a>>1,b>>1)<<1;
        }else if((a&1)==0&&(b&1)!=0){
            return gcd(a>>1,b);
        }else if((a&1)!=0&&(b&1)==0){
            return gcd(a,b>>1);
        }else{
            int big=a>b?a:b;
            int small=a<b?a:b;
            return gcd(big-small,small);
        }
    }
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,5));
        System.out.println(getGreatestCommonDivisor(100,80));
        System.out.println(getGreatestCommonDivisor(27,14));

        System.out.println(getGreatestCommonDivisor1(25,5));
        System.out.println(getGreatestCommonDivisor1(100,80));
        System.out.println(getGreatestCommonDivisor1(27,14));

        System.out.println(getGreatestCommonDivisor2(25,5));
        System.out.println(getGreatestCommonDivisor2(100,80));
        System.out.println(getGreatestCommonDivisor2(27,14));
    }
}
