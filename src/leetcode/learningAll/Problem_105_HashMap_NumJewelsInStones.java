package leetcode.learningAll;

import java.util.HashSet;
import java.util.Set;

/**
* @author nilzxq
* @version 2020年2月14日 下午5:19:03
*类说明
*/
public class Problem_105_HashMap_NumJewelsInStones {

	public static int numJewelsInStones(String J, String S) {
        int index=0;
        for(int i=0;i<J.length();i++) {
        	for(int j=0;j<S.length();j++) {
        		if(J.charAt(i)==S.charAt(j))
        			index++;
        	}
        }
        return index;
    }

	public static int numJewelsInStones2(String J, String S) {
		Set<Character> Jset=new HashSet<>();
		for(char j:J.toCharArray())
			Jset.add(j);
		int ans=0;
		for(char s:S.toCharArray())
			if(Jset.contains(s))
				ans++;
		return ans;
	}

	public static void main(String[] args) {
		String  J = "aA", S = "aAAbbbb";
		System.out.println(numJewelsInStones(J,S));
		System.out.println(numJewelsInStones2(J,S));
	}
}
