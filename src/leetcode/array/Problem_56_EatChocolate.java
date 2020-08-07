package leetcode.array;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author nilzxq
 * @Date 2020-08-07 16:16
 */
public class Problem_56_EatChocolate {
    public static long solution(long n, long k, int[][] nums) {
        Arrays.sort(nums, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0]){
                    return o1[1]-o2[1];
                }else{
                    return o1[0]-o2[0];
                }
            }
        });
        long sum=0;
        for(int i=0;i<n&&k!=0;i++){
            if(k<=nums[i][1]){
                return sum+=k*nums[0][i];
            }else {
                sum += nums[i][1] * nums[0][i];
                k -= nums[i][1];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        long n=2,k=5;
        int[][] nums={{4,5},{2,4}};
       System.out.println(solution(n,k,nums));
    }
}
