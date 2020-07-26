package leetcode.string;

import java.util.HashSet;

/**
 *
 * @Author nilzxq
 * @Date 2020-07-26 16:45
 */
public class Problem_409_LongestPalindrome {
    public static void main(String[] args) {
        String s="abccccdd";
        System.out.println(longestPalindrome(s));
        System.out.println(longestPalindrome1(s));
    }
    public static int longestPalindrome(String s){
        char[] cha=s.toCharArray();
        HashSet<Character> hashSet=new HashSet<>();
        int count=0;
        for(int i=0;i<cha.length;i++){
            if(hashSet.contains(cha[i])){
                count++;
                hashSet.remove(cha[i]);
            }else {
                hashSet.add(cha[i]);
            }
        }
        return hashSet.isEmpty()?count*2:count*2+1;
    }

    public static int longestPalindrome1(String s){
        int count=0;
        int[] nums=new int[128];
        for(char cha:s.toCharArray()){
            nums[cha]++;
        }
        for(int num:nums){
            count+=num/2*2;
            //保证当有单数的字符存在时 结果仅仅加一
            if(count%2==0&&num%2==1){
                count++;
            }
        }
        return count;
    }
}
