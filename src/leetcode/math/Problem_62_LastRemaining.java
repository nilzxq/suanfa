package leetcode.math;

/**
 * 约瑟夫环
 * @Author nilzxq
 * @Date 2020-08-30 8:25
 */
public class Problem_62_LastRemaining {
    public int lastRemaining(int n,int m){
        //旧下标 0，1，2，... m-1,m,......n-1;
        //新下标 0，1，2，....m-1（删掉），0，1....n-1
        //新下标与旧下标 差了m -m,-m+1,-m+2,.....m,m+1,.....
        if(n==1){
            return 0;
        }
        return (lastRemaining(n-1,m)+m)%n;
    }
}
