package interview.jd;

/**
 * @Author nilzxq
 * @Date 2020-09-23 16:28
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int k = 0; k < T; k++){
            int n = sc.nextInt();
            int m = sc.nextInt();
            boolean[][] marked = new boolean[n][m];
            char[][] grid = new char[n][m];
            sc.nextLine();
            for(int i = 0; i < n; i++){
                String s = sc.nextLine();
                for(int j = 0; j < m; j++){
                    grid[i][j] = s.charAt(j);
                }
            }
            int begini = 0;
            int beginj = 0;
            int endi = 0;
            int endj = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    if(grid[i][j] == 'S'){
                        begini = i;
                        beginj = j;
                    }
                    if(grid[i][j] == 'E'){
                        endi = i;
                        endj = j;
                    }
                }
            }

            boolean res = true;
            if(begini == endi && beginj == endj){
                res = true;
            }else{
                res = dfs(begini, beginj, endi, endj, m, n, marked, grid);
            }
            System.out.println(res == true ? "YES" : "NO");
        }
    }

    public static boolean dfs(int i, int j, int endi, int endj, int m, int n, boolean[][] marked, char[][] grid){
        if(i == endi && j == endj){
            return true;
        }
        if(i < 0 || i >= n || j < 0 || j >= m || marked[i][j] == true || grid[i][j] == '#'){
            return false;
        }
        marked[i][j] = true;
        return dfs(i-1,j, endi, endj,  m, n, marked, grid) || dfs(i+1,j,  endi, endj, m, n, marked, grid) || dfs(i,j-1, endi, endj, m, n, marked, grid) || dfs(i, j+1,  endi, endj, m, n, marked, grid);
    }
}
