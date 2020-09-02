package leetcode.bit;

/**
 * @Author nilzxq
 * @Date 2020-09-02 6:30
 */
public class Problem_65_Add {
    public int add(int a,int b){
        while(b!=0){
            int c=(a&b)<<1;
            a=b;
            b=c;
        }
        return a;
    }
}
