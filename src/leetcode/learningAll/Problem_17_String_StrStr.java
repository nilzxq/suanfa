package leetcode.learningAll;
/**
* @author nilzxq
* @version 2019年11月11日 下午7:10:14
*类说明
*/
public class Problem_17_String_StrStr {

	public static int strStr1(String haystack,String needle) {
		int i=0;
		int j=0;
		int flag=0;
		if(needle.length()==0) {
			return 0;
		}
		while(i<haystack.length()&&j<needle.length()) {
			if(haystack.charAt(i)==needle.charAt(j)) {
				i++;
				j++;
				flag++;
			}else {
				j=0;
				i=i-flag+1;
				flag=0;
			}

		if(j==needle.length()&&flag==needle.length()) {
			return i-needle.length();
		}
	}

	return -1;
	}

	public static int strStr2(String haystack,String needle) {
		return haystack.indexOf(needle);
	}

	public static void main(String[] args) {
	String haystack = "hello";
	String needle = "ll";
	System.out.println(strStr1(haystack,needle));
	System.out.println(strStr2(haystack,needle));
	}
}
