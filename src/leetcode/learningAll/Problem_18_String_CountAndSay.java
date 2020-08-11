package leetcode.learningAll;
/**
* @author nilzxq
* @version 2019年11月12日 下午4:19:25
*类说明
*/
public class Problem_18_String_CountAndSay {

	public static String countAndSay(int n) {
		if(n==1) {
			return "1";
		}
		String origin=countAndSay(n-1);
		StringBuilder res=new StringBuilder();
		int len=origin.length();
		int count=1;
		for(int i=0;i<len;i++) {
			if(i==len-1) {
				res.append(count);
				res.append(origin.charAt(i));
				break;
			}
			if(origin.charAt(i)==origin.charAt(i+1)) {
				count++;
				continue;
			}else{
				res.append(count);
				res.append(origin.charAt(i));
				count=1;
			}
		}
		return res.toString();
	}

	public static void main(String[] args) {
		int n=5;
		System.out.println(countAndSay(n));
	}
}
