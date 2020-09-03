package leetcode.dp;

/**
 * 最长回文子串
 * 中心扩展法
 * @Author nilzxq
 * @Date 2020-09-03 17:43
 */
public class Problem_05_LongestPalindrome {
    public String longestPalindrome(String s){
        //边界问题
        if(s.length()<2){
            return s;
        }
        String res=" ";
        for(int i=0;i<s.length();i++){
            //以s[i]为中心的最长回文子串
            String s1=palindrome(s,i,i);
            //以s[i]和s[i+1]为中心的最长回文子串
            String s2=palindrome(s,i,i+1);
            //res=longest(s1,s2,res)
            res=res.length()>s1.length()?res:s1;
            res=res.length()>s2.length()?res:s2;
        }
        return res;
    }

    public String palindrome(String s,int l,int r){
        //防止索引越界
        while(l>=0&&r<s.length()&&s.charAt(l)==s.charAt(r)){
            //向两边展开
            l--;
            r++;
        }

        return s.substring(l+1,r);
    }
}
