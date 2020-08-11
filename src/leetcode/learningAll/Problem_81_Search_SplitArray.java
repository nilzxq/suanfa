package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年1月21日 下午6:54:46
*类说明
*/
public class Problem_81_Search_SplitArray {

	public static int splitArray(int[] nums,int m) {
		long ans=0;
		long L=0,R=1;
		for(int i=0;i<nums.length;i++) {
			R+=nums[i];
		}
		while(L<R) {
			long mid=(L+R)/2;
			if(guess(mid,nums,m)) {
				ans=mid;
				R=mid;
			}else {
				L=mid+1;
			}
		}
		return (int)ans;
	}

	public static boolean guess(long mid,int[] nums,long m) {
		long sum=0;
		for(int i=0;i<nums.length;i++) {
			if(sum+nums[i]>mid) {
				--m;
				sum=nums[i];
				if(sum>mid)
					return false;
				}else {
					sum+=nums[i];
				}
			}
			return m>0;
		}

	public static void main(String[] args) {
		int[] nums= {7,2,5,10,8};
		int m=2;
		System.out.println(splitArray(nums,m));
	}
	}

