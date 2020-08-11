package leetcode.learningAll;
/**
* @author nilzxq
* @version 2020年5月27日 上午6:44:01
*类说明
*/
public class Problem_05_String_LongestPalindrome {

	public String longestPalindrome(String s) {
		int length=s.length();
		if(length<2) {
			return s;
		}
		int maxLength=1;
		int begin=0;
		char[] charArray=s.toCharArray();
		for(int i=0;i<length-1;i++) {
			for(int j=i+1;j<length;j++) {
				if(j-i+1>maxLength&&isPalindrome(charArray,i,j)) {
					maxLength=j-i+1;
					begin=i;
				}
			}
		}
		return s.substring(begin,begin+maxLength);
	}

	private boolean isPalindrome(char[] charArray, int left, int right) {
		while(left<right) {
			if(charArray[left]!=charArray[right]) {
				return false;
			}
			left++;
			right--;
		}
		return true;

	}

	public String longestPalindrome1(String s) {
		int length=s.length();
		if(length<2) {
			return s;
		}
		boolean[][] dp=new boolean[length][length];
		for(int i=0;i<length;i++) {
			dp[i][i]=true;
		}

		int maxLength=1;
		int begin=0;
		char[] charArray=s.toCharArray();

		for(int j=1;j<length;j++) {
			for(int i=0;i<j;i++) {
				if(charArray[i]!=charArray[j]) {
					dp[i][j]=false;
				}else {
					if(j-i<3) {
						dp[i][j]=true;
					}else {
						dp[i][j]=dp[i+1][j-1];
					}
				}
				if(dp[i][j]&&j-i+1>maxLength) {
					maxLength=j-i+1;
					begin=i;
				}
			}
		}
		return s.substring(begin,begin+maxLength);
	}

	public static void main(String[] args) {
		Problem_05_String_LongestPalindrome pali=new Problem_05_String_LongestPalindrome();
		String s="babad";
		System.out.println(pali.longestPalindrome(s));
		System.out.println(pali.longestPalindrome1(s));
	}
}
