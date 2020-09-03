package leetcode.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author nilzxq
 * @Date 2020-09-03 10:33
 */
public class Problem_48_LengthOfLongestSubstring {
    //哈希表+双指针
    public int lengthOfLongestSubstring(String s) {
        int res=0;
        Set<Character> set=new HashSet<>();
        for(int l=0,r=0;r<s.length();r++){
            char c=s.charAt(r);
            while(set.contains(c)){
                set.remove(s.charAt(l++));
            }
            set.add(c);
            res=Math.max(res,r-l+1);
        }
    return res;
    }
}
