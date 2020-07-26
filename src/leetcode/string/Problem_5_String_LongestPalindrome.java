package leetcode.string;

/**
 * @Author nilzxq
 * @Date 2020-07-26 17:32
 */
public class Problem_5_String_LongestPalindrome {
    public static void main(String[] args) {
        String str= "babad";
        //System.out.println(longestPalindrome(str));
        System.out.println(longestPalindrome2(str));
    }

    public static String longestPalindrome(String s){
        int max=0;
       String res=null;
        for(int i=0;i<s.length();i++){
            for(int j=s.length();j>0;j--) {
                if(j>i){
                    String temp=s.substring(i, j);

                    //System.out.println(temp);
                    if(isPalindrome(temp)){
                        //System.out.println(temp+"===========");
                        if(max<temp.length()){
                            max=temp.length();
                            res=temp;
                        }
                    }
                }
            }
        }
        return res;
    }

    public static boolean isPalindrome(String s){
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }


    /**
     * 动态规划
     * @param s
     * @return
     */
    public static String longestPalindrome1(String s){
        int length=s.length();
        if(length<2){
            return s;
        }
        int maxLen=1;
        int begin=0;

        //dp[i][j]表示s[i,...,j]是否是回文串 左闭右闭
        boolean[][] dp=new boolean[length][length];
        for(int i=0;i<length;i++){
            //对角线的值为真
            dp[i][i]=true;
        }
        char[] charArray=s.toCharArray();
        //注意：一列一列填 先升序填列 再升序填行 且只填上半部分 因为i<j
        for(int j=1;j<length;j++){
            for(int i=0;i<j;i++){
                if(charArray[i]!=charArray[j]){
                    dp[i][j]=false;
                }else {
                    //j-1-(i+1)+1<2 整理得 j-i<3 《=》j-i+1<4 即s[i...j]长度为2或者3时，不用检查子串是否回文
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        //取决于中间的结果，也就是左下角的值
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
                    //只要dp[i][j]==true成立，就表示子串s[i...j]是回文，此时记录回文长度和起始位置
                if(dp[i][j]&&j-i+1>maxLen){
                        maxLen=j-i+1;
                        begin=i;
                    }
                }
        }
        return s.substring(begin,begin+maxLen);
    }

    /**
     * 中心扩散
     * @param s
     * @return
     */
    public static String longestPalindrome2(String s){
        int len=s.length();
        if(len<2){
            return s;
        }
        int maxLen=1;
        int begin=0;
        char[] charArray=s.toCharArray();
        //len-1没必要扩展了
        for(int i=0;i<len-1;i++){
            //奇数
            int oddLen=expandArroundCenter(charArray,i,i);
            //偶数
            int evenLen=expandArroundCenter(charArray,i,i+1);
            int curMaxLen=Math.max(oddLen,evenLen);
            //System.out.println(curMaxLen);
            //记录长度和起始下标
            if(curMaxLen>maxLen){
                maxLen=curMaxLen;
                //这一步要在纸上画图发现规律
                begin=i-(maxLen-1)/2;
               // System.out.println(begin+"--------");
            }
        }
        return s.substring(begin,begin+maxLen);
    }

    /**
     *
     * @param charArray 原始字符串的字符数组
     * @param left 起始左边界（可以取到）
     * @param right 起始右边界（可以取到）
     * @return 回文串的长度
     */
    private static int expandArroundCenter(char[] charArray, int left, int right) {
        //当left=right的时候，回文中心是一个字符，回文串的长度是奇数
        //当right=left+1的时候，此时回文中心两个字符，回文串的长度是偶数
        int len=charArray.length;
        int i=left;
        int j=right;
        //System.out.println("left"+i);
        //System.out.println("right"+j);
        //往左右扩散
        while(i>=0&&j<len){
            if(charArray[i]==charArray[j]){
                i--;
                j++;
            }else{
                break;
            }
        }
        //跳出while循环时，s.charAt(i)!=s.charAt(j)
        //回文串的长度是 j-i+1-2=j-i+1
        return j-i-1;
    }

}
