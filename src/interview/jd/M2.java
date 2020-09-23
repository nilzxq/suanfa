package interview.jd;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-17 20:25
 */
public class M2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int t=0;t<num;t++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            boolean[][] mark=new boolean[n][m];
            char[][] grid=new char[n][m];
            sc.nextLine();
            for(int i=0;i<n;i++){
                String str=sc.nextLine();
                for(int j=0;j<m;j++){
                   grid[i][j]=str.charAt(j);
                }
            }
            int begini=0;
            int beginj=0;
            int endi=0;
            int endj=0;
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(grid[i][j]=='S'){
                        begini=i;
                        beginj=j;
                    }
                    if(grid[i][j]=='E'){
                        endi=i;
                        endj=j;
                    }
                }
            }
            boolean res=helper(begini,beginj,endi,endj,m,n,mark,grid);
            System.out.println(res==true?"YES":"NO");
        }
    }

    private static boolean helper(int begini, int beginj, int endi, int endj, int m, int n, boolean[][] mark, char[][] grid) {
    if(begini==endi&&beginj==endj){
        return true;
    }
    if(begini<0||begini>=n||beginj<0||beginj>=m||mark[begini][beginj]==true||grid[begini][beginj]=='#'){
        return false;
    }
    mark[begini][beginj]=true;
    return helper(begini-1,beginj,endi,endj,m,n,mark,grid)||
            helper(begini+1,beginj,endi,endj,m,n,mark,grid)||
            helper(begini,beginj-1,endi,endj,m,n,mark,grid)||
            helper(begini,beginj+1,endi,endj,m,n,mark,grid);
    }
}
