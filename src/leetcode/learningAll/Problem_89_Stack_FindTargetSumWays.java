package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年1月29日 上午11:10:42
*类说明
*/
public class Problem_89_Stack_FindTargetSumWays {

	public static int findTargetSumWays(int[] nums,int S) {
		int sum=0;
		for(int i=0;i<nums.length;i++) {
			sum+=nums[i];
		}
		if(sum<S||(sum+S)%2!=0) {
			return 0;
		}
		int target=(S+sum)/2;
		int[] dp=new int[target+1];
		for(int i=0;i<target+1;i++) {
			dp[i]=0;
		}
		dp[0]=1;
		for(int i=0;i<nums.length;i++) {
			for(int j=target;j>=nums[i];j--) {
				dp[j]+=dp[j-nums[i]];
			}
		}
		return dp[target];
	}

	public static void main(String[] args) {
		int[] nums= {1,1,1,1,1}; int S=3;
		System.out.println(findTargetSumWays(nums,S));
	}
}
