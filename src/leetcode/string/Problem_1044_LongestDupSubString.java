package leetcode.string;

import java.util.Arrays;

/**
 * 最长重复子串 （可重叠，后缀+前缀【内存占用过多】）
 * @Author nilzxq
 * @Date 2020-09-10 11:31
 */
public class Problem_1044_LongestDupSubString {
    public String longestDupSubstring(String S){
        int len=S.length();
        String result=" ";
        int maxLen=0;
        if(len<=1){
            return "";
        }
        String[] strs=new String[len];
        for(int i=0;i<len;i++){
            //存放S的后缀字符串
            strs[i]=S.substring(i,len);
        }
        //进行排序
        Arrays.sort(strs);
        for(int i=0;i<len-1;i++){
            //两个相邻字符串的最长公共前缀
            int tmp=lenTwoStr(strs[i],strs[i+1]);
            if(tmp>maxLen){
                maxLen=tmp;
                result=strs[i].substring(0,maxLen);
            }
        }
        return result;
    }

    private int lenTwoStr(String str1, String str2) {
        if(str1.length()==0||str2.length()==0){
            return 0;
        }
        int i=0;
        while(i<str1.length()&&i<str2.length()&&str1.charAt(i)==str2.charAt(i)){
            i++;
        }
        return i;
    }
}
