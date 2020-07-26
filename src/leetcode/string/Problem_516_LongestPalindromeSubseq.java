package leetcode.string;

/**
 * @Author nilzxq
 * @Date 2020-07-26 21:47
 */
public class Problem_516_LongestPalindromeSubseq {
    public static void main(String[] args) {
        String s="bbbab";
        System.out.println(longestPalindromeSubseq(s));
    }
    public static int longestPalindromeSubseq(String s){
        int len=s.length();
        if(len<2){
            return len;
        }
        char[] charArray=s.toCharArray();
        int[][] dp=new int[len][len];
        for(int i=0;i<len;i++){
            dp[i][i]=1;
        }
        for(int i=len-1;i>=0;i--){
            for(int j=i+1;j<len;j++){
                if(charArray[i]==charArray[j]){
                    dp[i][j]=dp[i+1][j-1]+2;
                }else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][len-1];
    }
}
