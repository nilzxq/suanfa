package bu;

import java.util.Scanner;

/** 
* @author nilzxq
* @version 2018年10月25日 下午7:09:24 
* 类说明 
*/
public class LCSubsequence {

	public static int getdp1(int[] arr) {
		int[] dp=new int[arr.length];
		int maxLen=1;
		for(int i=0;i<arr.length;i++) {
			dp[i]=1;
			
			for(int j=0;j<i;j++) {
				if(arr[i]>arr[j]) {
					dp[i]=Math.max(dp[i], dp[j]+1);
					maxLen=Math.max(dp[i], maxLen);
				}
			}
		}
		return maxLen;
	}
	
	public static int getdp2(int[] arr) {
		int[] dp=new int[arr.length];
		int[] ends=new int[arr.length];
		ends[0]=arr[0];
		dp[0]=1;
		int right=0;
		int l=0;
		int r=0;
		int m=0;
		int maxLen=1;
		for(int i=0;i<arr.length;i++) {
			l=0;
			r=right;
			while(l<=r) {
				m=(l+r)/2;
				if(arr[i]>ends[m]) {
					l=m+1;
				}else {
					r=m-1;
				}
			}
			right=Math.max(right, l);
			ends[l]=arr[i];
			dp[i]=l+1;
			maxLen=Math.max(maxLen, dp[i]);
		}
		return maxLen;
	}
	
//	public static int[] generateLIS(int[] arr,int[] dp) {
//		int len=0;
//		int index=0;
//		for(int i=0;i<dp.length;i++) {
//			if(dp[i]>len) {
//				len=dp[i];//最大值	
//				index=i;//最大值的位置
//			}
//		}
//		int[] lis=new int[len];
//		lis[--len]=arr[index];
//		for(int i=index;i>=0;i--) {
//			if(arr[i]<arr[index]&&dp[i]==dp[index]-1) {
//				lis[--len]=arr[i];
//				index=i;
//			}
//		}
//		return lis;
//	}
//	
//	public static int[] lis1(int[] arr) {
//		if(arr==null||arr.length==0) {
//			return null;
//		}
//		int[] dp=getdp1(arr);
//		return generateLIS(arr, dp);
//	}
//	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int k=sc.nextInt();
		
		while(k>0) {
			int size=sc.nextInt();
			
			int[] arr=new int[size];
			for(int i=0;i<size;i++) {
				arr[i]=sc.nextInt();	
			}
			System.out.print(getdp2(arr));
			k--;
		}
		
//		for(int i=0;i<lis1(arr).length;i++)
//		System.out.print(lis1(arr)[i]+" ");
		
	}
}
