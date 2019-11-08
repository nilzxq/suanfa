package leetcode;
/** 
* @author nilzxq
* @version 2019年11月8日 下午6:56:41 
*类说明 
*/
public class Problem_15_String_isPalindrome {

	public static boolean isPalindrome(String s) {
		if(s==null||s.length()==0) {
			return true;
		}
		s=s.toLowerCase();
		StringBuilder result=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if((s.charAt(i)>='a'&&s.charAt(i)<='z')||s.charAt(i)>='0'&&s.charAt(i)<='9') {
				result.append(s.charAt(i));
			}
		}
		if(result.length()==0) {
			return true;
		}
		int start=0;
		int end=result.length()-1;
		while(start<end) {
			if(result.charAt(start)!=result.charAt(end)) {
				return false;
			}else {
				start++;
				end--;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s="A man, a plan, a canal: Panama";
		System.out.println(isPalindrome(s));
	}
}
