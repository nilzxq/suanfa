package leetcode;
/** 
* @author nilzxq
* @version 2020年5月3日 上午8:46:16 
*类说明 
*/
public class Problem_1011_BinarySearch_ShipWithinDays {

	public static int shipWithDays(int[] weights,int D) {
		int max=0,sum=0;
		for(int i=0;i<weights.length;i++) {
			sum+=weights[i];
			max=Math.max(max,weights[i]);
		}
		int left=max;
		int right=sum;
		while(left<right) {
			int mid=(left+right)>>>1;
			int day=1;
			int total=0;
			for(int i=0;i<weights.length;i++) {
				total+=weights[i];
				if(total>mid) {
					day++;
					total=weights[i];
				}
			}
			if(day>D) {
				left=mid+1;
			}else {
				right=mid;
			}
		}
		return left;
	}
	
	public static int shipWithDays1(int[] weights,int D) {
		int low=0,high=Integer.MAX_VALUE;
		while(low<high) {
			int mid=low+(high-low)/2;
			if(canShip(weights,D,mid)) {
				high=mid;
			}else {
				low=mid+1;
			}
		}
		return low;
	}
	
	private static boolean canShip(int[] weights,int D,int K) {
		int cur=K;
		for(int weight:weights) {
			if(weight>K) return false;
			if(cur<weight) {
				cur=K;
				D--;
			}
			cur-=weight;
		}
		return D>0;
	}
	
	public static void main(String[] args) {
		int[] weights= {1,2,3,4,5,6,7,8,9,10};
		int D=5;
		System.out.println(shipWithDays(weights,D));
		System.out.println(shipWithDays1(weights,D));
	}
}
