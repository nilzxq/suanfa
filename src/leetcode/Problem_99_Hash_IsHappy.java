package leetcode;

import java.util.HashSet;
import java.util.Set;

/** 
* @author nilzxq
* @version 2020年2月8日 下午4:03:29 
*类说明 
*/
public class Problem_99_Hash_IsHappy {

	public static boolean isHappy(int n) {
		Set<Integer> set=new HashSet<>();
		while(true) {
			int sum=0;
			while(n>0) {
				sum+=(n%10)*(n%10);
				n/=10;
			}
			if(sum==1) {
				return true;
			}else if(set.contains(sum)) {
				return false;
			}else {
				set.add(sum);
				n=sum;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(isHappy(19));
	}
}
