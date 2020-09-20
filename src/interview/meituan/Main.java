package interview.meituan;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-20 11:29
 */
public class Main {
    private static int score;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int p=sc.nextInt();
        int q=sc.nextInt();
        sc.nextLine();
        char[][] g=new char[n][m];
        for(int i=0;i<n;i++){
            String str=sc.nextLine();
            for(int j=0;j<m;j++){
                g[i][j]=str.charAt(j);
            }
        }
        String trace=sc.nextLine();
        char[] tcha=trace.toCharArray();
        int bi=0,bj=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(g[i][j]=='S'){
                    bi=i;
                    bj=j;
                }
            }
        }
        score=0;
        helper(bi,bj,tcha,0,n,m,g,p,q);
        System.out.println(score);
    }

    public static void helper(int i,int j,char[] tcha,int index,int n,int m,char[][] g,int p,int q){
        if(g[i][j]=='O'){
            score+=p;
            g[i][j]='+';
        }else if(g[i][j]=='X'){
            score-=q;
            g[i][j]='+';
        }

        if(index==tcha.length){
            return;
        }
        char temp=tcha[index];
        if(temp=='W'){
            if(helper1(i-1,j,n,m,g)){
                i--;
            }
        }else if(temp=='A'){
            if(helper1(i,j-1,n,m,g)){
                j--;
            }
        }else if(temp=='S'){
            if(helper1(i+1,j,n,m,g)){
                i++;
            }
        }else if(temp=='D'){
            if(helper1(i,j+1,n,m,g)){
                j++;
            }
        }
        helper(i,j,tcha,index+1,n,m,g,p,q);
    }

    public static boolean helper1(int i,int j,int n,int m,char[][] g){
        if(i<0||i>=n||j<0||j>=m){
            return false;
        }
        if(g[i][j]=='#'){
            return false;
        }
        return true;
    }
}
