package leetcode.array;

/**
 * @Author nilzxq
 * @Date 2020-09-22 16:58
 */
public class Problem_560_SubarraySum {
    public static void main(String[] args) {
        int[] nums={1,1,1};
        System.out.println(subarraySum(nums,2));
    }

    //利用前缀和
    public static int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int[] sum=new int[n+1];
        sum[0]=0;
        for(int i=0;i<n;i++){
            sum[i+1]=nums[i]+sum[i];
        }
        int ans=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                if(sum[i]-sum[j]==k){
                    ans++;
                }
            }
        }
       return ans;

    }
}
