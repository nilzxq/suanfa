package leetcode.learningAll;

import java.util.HashMap;
import java.util.Map;

/**
* @author nilzxq
* @version 2020年2月9日 下午5:38:59
*类说明
*/
public class Problem_100_Map_isIsomorphic {

	public static boolean isIsomorphic(String s,String t) {
		Map<Character,Character> map1=new HashMap<>();
		Map<Character,Character> map2=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			map1.put(s.charAt(i), t.charAt(i));
		}
		for(int i=0;i<t.length();i++)
			map2.put(t.charAt(i), s.charAt(i));
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)!=map2.get(t.charAt(j))||
					t.charAt(j)!=map1.get(s.charAt(j)))
				return false;

		}
		return true;
	}
	public static boolean isIsomorphic2(String s, String t) {
	    return isIsomorphicHelper(s, t) && isIsomorphicHelper(t, s);

	}
	public static boolean isIsomorphicHelper(String s,String t) {
		int n=s.length();
		HashMap<Character,Character> map=new HashMap<>();
		for(int i=0;i<n;i++) {
			char c1=s.charAt(i);
			char c2=t.charAt(i);
			if(map.containsKey(c1)) {
				if(map.get(c1)!=c2) {
					return false;
				}
			}else
				map.put(c1,c2);
		}
		return true;
	}


	public static void main(String[] args) {
		String s = "egg", t = "add";
		System.out.println(isIsomorphic(s,t));
		System.out.println(isIsomorphic2(s,t));
	}
}
