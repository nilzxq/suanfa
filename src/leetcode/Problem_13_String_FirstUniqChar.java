package leetcode;
/** 
* @author nilzxq
* @version 2019年11月6日 下午7:27:47 
*类说明 
*/
public class Problem_13_String_FirstUniqChar {

	//用数组存放每个字符出现的次数
	public static int firstUniqChar(String s) {
		int[] nums=new int[256];
		
		for(int i=0;i<s.length();i++) {
			nums[s.charAt(i)]++;
		}
		for(int i=0;i<s.length();i++) {
			if(nums[s.charAt(i)]==1) {
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		String s1="leetcode";
		String s2="loveleetcode";
		System.out.println(firstUniqChar(s1));
		System.out.println(firstUniqChar(s2));
	}
}
