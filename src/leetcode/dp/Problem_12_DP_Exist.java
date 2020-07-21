package leetcode.dp;

import org.junit.Test;

/**
 * @Author nilzxq
 * @Date 2020-07-19 22:57
 */
public class Problem_12_DP_Exist {
    public static void main(String[] args) {
        Solution s=new Solution();
        char[][] board={{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
        String word="bccej";
        System.out.println(s.exist(board,word));
    }


}

class Solution{
    public boolean exist(char[][] board,String word){
        //char[] words=word.toCharArray(); 更快些
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,word,i,j,0))
                    return true;
            }
        }
        return false;
    }

    boolean dfs(char[][] board,String word,int i,int j,int k){
        /**
         * 1.返回false
         * 行 列 越界
         * 当前矩阵元素与目标字符不符
         * 当前矩阵元素已被访问过
         *
         * 2.返回true
         * 字符串word已经全部匹配，即k=len(word)-1
         */
        if(i>=board.length||i<0||j<0||j>=board[0].length||board[i][j]!=word.charAt(k)) return false;
        if(k==word.length()-1) return true;
        char tmp=board[i][j];
        board[i][j]='/';
        boolean res=dfs(board,word,i+1,j,k+1)||dfs(board,word,i-1,j,k+1)||
                dfs(board,word,i,j-1,k+1)||dfs(board,word,i,j+1,k+1);
        board[i][j]=tmp;
        return res;
    }
}
