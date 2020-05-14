package leetcode;
/** 
* @author nilzxq
* @version 2020年5月14日 下午11:31:46 
*类说明 
*/
public class Problem_11_MaxArea {

	public static int maxArea(int[] height) {
		int length=height.length;
		int left=0,right=length-1;
		int ans=0;
		while(left<right) {
			ans=Math.max(ans,(right-left)*Math.min(height[right], height[left]));
			if(height[left]>height[right]) right--;
			else left++;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] height= {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
}
