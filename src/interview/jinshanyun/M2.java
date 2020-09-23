package interview.jinshanyun;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-23 21:05
 */
public class M2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<5){
            System.out.println(0);
        }
        int ans=0;
        for(int i=5;i<=n;i++){
            int temp=i;
            while(temp!=0){
                if(temp%10==5){
                    ans++;
                }
                temp=temp/10;
            }
        }
        System.out.println(ans);
    }
}
