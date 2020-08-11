package leetcode.learningAll;
/**
* @author nilzxq
* @version 2019年11月9日 下午3:11:24
*类说明
*/
public class Problem_16_String_MyAtoi {

	public static int myAtoi(String str) {
		if(str.length()==0) {
			return 0;
		}
		long num=0;
		int flag=1;
		int index=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				if(index==0) {
					continue;
				}
				else break;
			}else if(str.charAt(i)=='+'&&index==0) {
				index=1;
				continue;
			}else if(str.charAt(i)=='-') {
				if(index==0) {
					index=1;
					flag=-1;
					continue;
				}else {
					break;
				}
			}else if(str.charAt(i)<'0'||str.charAt(i)>'9') {
				if(index==0) {
					return 0;
				}else {
					index=1;
					break;
				}
			}else {
				num=num*10+str.charAt(i)-'0';
				index=1;
			}
			if(num*flag>Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;
			}
			if(num*flag<Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;
			}
		}
		return (int)num*flag;
	}

	public static void main(String[] args) {
		String str1= "4193 with words";
		String str2="   -42";
		System.out.println(myAtoi(str1));
		System.out.println(myAtoi(str2));
	}
}
