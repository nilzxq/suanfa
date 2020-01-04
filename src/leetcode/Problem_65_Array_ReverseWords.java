package leetcode;
/** 
* @author nilzxq
* @version 2020年1月4日 下午4:25:08 
*类说明 
*/
public class Problem_65_Array_ReverseWords {

	public static String reverseWords(String s) {
		if(s.equals("")) {
			return "";
		}
		char[] arr=s.toCharArray();
		int n=arr.length;
		if(n<=1) {
			return null;
		}
		int l=0;
		int r=0;
		int i=0;
		while(i<n) {
			for(;i<n;i++) {
				if(arr[i]!=' ') {
					l=i;
					break;
				}else {
					i++;
				}
			}
			while(i<n) {
				if(i==n-1) {
					r=n-1;
					reverseString(arr,l,r);
					i++;
					break;
				}
				if(arr[i]==' ') {
					r=i-1;
					reverseString(arr,l,r);
					i++;
					break;
				}else {
					i++;
				}
			}
		}
		return new String(arr);
	}
	
	public static void reverseString(char[]s,int l,int r) {
		int n=s.length;
		if(n<=1) {
			return;
		}
		while(l<r) {
			char temp=s[l];
			s[l]=s[r];
			s[r]=temp;
			l++;
			r--;
		}
	}
	
	public static void main(String[] args) {
		String s="Let's take LeetCode contest";
		System.out.println(reverseWords(s));
	}
}
