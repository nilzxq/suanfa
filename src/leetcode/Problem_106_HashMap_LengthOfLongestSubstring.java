package leetcode;

import java.util.LinkedList;

/** 
* @author nilzxq
* @version 2020年2月15日 下午5:14:15 
*类说明 
*/
public class Problem_106_HashMap_LengthOfLongestSubstring {
	
	public static int lengthOfLongestSubstring(String s) {
        int sum=0;
        LinkedList<Character> temp=new LinkedList<>();
        for(int i=0;i<s.length();i++) {
        	Character c=s.charAt(i);
        	if(!temp.contains(c)) {
        		temp.add(c);
        		sum=sum<temp.size()?temp.size():sum;
        	}else {
        		int index=temp.indexOf(c);
        		for(int j=0;j<=index;j++) {
        			temp.remove();
        		}
        		temp.add(c);
        	}
        }
        return sum;
    }
	
	public static void main(String[] args) {
		String s= "aab";
		System.out.println(lengthOfLongestSubstring(s));
	}
}
