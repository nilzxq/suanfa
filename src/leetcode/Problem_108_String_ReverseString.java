package leetcode;
/** 
* @author nilzxq
* @version 2020年4月19日 下午8:20:16 
*类说明 
*/
public class Problem_108_String_ReverseString {

	public static void reverseString(char[] s) {
		int left=0,right=s.length-1;
		while(left<right) {
			char tmp=s[left];
			s[left++]=s[right];
			s[right--]=tmp;
		}
	}
	
	public static void main(String[] args) {
		char[] s= {'h','e','l','l','o'};
		reverseString(s);
		System.out.println(s);
	}
}
