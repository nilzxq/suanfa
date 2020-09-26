package interview.wuba;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-14 20:44
 */
public class M1 {
    //岛屿数量
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
//        char[][] cha=new char[m][n];
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(helper(arr,m,n));
    }

    public static int helper(int[][] arr,int m,int n){
        if(m==0||n==0){
            return 0;
        }
        boolean[][] visited=new boolean[m][n];
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1&&!visited[i][j]){
                    dfs(arr,visited,i,j);
                    count++;
                }
            }
        }
        return count;
    }

    private static void dfs(int[][] arr, boolean[][] visited, int x, int y) {
        if(x<0||x>=arr.length){
            return;
        }
        if(y<0||y>=arr[0].length){
            return;
        }
        if(arr[x][y]!=1||visited[x][y]){
            return;
        }
        visited[x][y]=true;
        dfs(arr,visited,x+1,y);
        dfs(arr,visited,x-1,y);
        dfs(arr,visited,x,y-1);
        dfs(arr,visited,x,y+1);
    }




}
