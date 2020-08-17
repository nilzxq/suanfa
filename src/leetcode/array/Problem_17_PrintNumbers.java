package leetcode.array;

/**
 * @Author nilzxq
 * @Date 2020-08-17 18:56
 */
public class Problem_17_PrintNumbers {
    public int[] printNumber(int n){
        int max=9;
        for(int i=0;i<n;i++){
            max=max*10+9;
        }
        int[] res=new int[max];
        for(int i=0;i<max;i++){
            res[i]=i+1;
        }
        return res;
    }
}
