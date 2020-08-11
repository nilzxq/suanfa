package leetcode.learningAll;

import java.util.HashSet;

/**
* @author nilzxq
* @version 2019年11月1日 下午6:38:35
*类说明
*/
public class Problem_10_Array_IsValidSudoku {

	public  static boolean isValidSudoku(char[][] board) {
		for(int i=0;i<9;i++) {
			HashSet<Character> lin=new HashSet<>();
			HashSet<Character> col=new HashSet<>();
			HashSet<Character> table=new HashSet<>();
			for(int j=0;j<9;j++) {
				if('.'!=board[i][j]&&!lin.add(board[i][j])) {
					return false;
				}
				if('.'!=board[j][i]&&!col.add(board[j][i])) {
					return false;
				}
				int m=i/3*3+j/3;
				int n=i%3*3+j%3;
				if('.'!=board[m][n]&&!table.add(board[m][n])) {
					return false;
				}
			}

		}
		return true;
	}

	public static void main(String[] args) {
		char[][] board= {{'5','3','.','.','7','.','.','.','.'},
				{'6','.','.','1','9','5','.','.','.'},
				  {'.','9','8','.','.','.','.','6','.'},
				  {'8','.','.','.','6','.','.','.','3'},
				  {'4','.','.','8','.','3','.','.','1'},
				  {'7','.','.','.','2','.','.','.','6'},
				  {'.','6','.','.','.','.','2','8','.'},
				  {'.','.','.','4','1','9','.','.','5'},
				  {'.','.','.','.','8','.','.','7','9'}};
		System.out.println(isValidSudoku(board));
	}
}
