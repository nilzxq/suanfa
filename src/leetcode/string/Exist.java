package leetcode.string;

/**
 * @Author nilzxq
 * @Date 2020-07-03 22:53
 */
public class Exist {
    public boolean exist(char[][] board, String word) {
        char[] words=word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(dfs(board,words,i,j,0))
                    return true;
            }
        }
        return false;

    }

    private boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if(i>=board.length||i<0||j>=board.length||j<0||board[i][j]!=word[k]){
            return false;
        }
        if(k==word.length-1) return true;
        char tmp=board[i][j];
        board[i][j]='/';
        boolean res=dfs(board,word,i+1,j,k+1)||dfs(board,word,i-1,j,k+1)
                ||dfs(board,word,i,j+1,k+1)||dfs(board,word,i,j-1,k+1);
        board[i][j]=tmp;
        return res;
    }

    public static void main(String[] args) {
        Exist exist=new Exist();
        char[][] board={{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
        String word="abfb";
        System.out.println(exist.exist(board,word));
    }
}
