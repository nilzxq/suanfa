package leetcode.string;

/**
 * @Author nilzxq
 * @Date 2020-08-20 19:19
 */
public class Problem_1143_LongestCommonSubsequence {
    public int longestCommonSubsequence(String text1,String text2){
        char[] arr1=text1.toCharArray();
        char[] arr2=text2.toCharArray();
        int length1= arr1.length;
        int length2=arr2.length;
        int[][] dp=new int[length1+1][length2+1];
        for(int i=1;i<=length1;i++){
            for(int j=1;j<=length2;j++){
                //这边找到了一个LCS的元素，继续向前
                if(arr1[i-1]==arr2[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    //谁能让LCS最长，就听谁的
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[length1][length2];
    }
}
