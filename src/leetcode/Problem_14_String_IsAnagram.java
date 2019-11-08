package leetcode;

import java.util.Arrays;

/** 
* @author nilzxq
* @version 2019年11月7日 下午7:24:34 
*类说明 
*/
public class Problem_14_String_IsAnagram {

	public static boolean isAnagram(String s,String t) {
		if(s.length()!=t.length()) {
			return false;
		}
		char[] sarray=s.toCharArray();
		char[] tarray=t.toCharArray();
		Arrays.sort(sarray);
		Arrays.sort(tarray);
		String ns=new String(sarray);
		String nt=new String(tarray);
		if(ns.equals(nt)) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		System.out.println(isAnagram(s,t));
	}
}
