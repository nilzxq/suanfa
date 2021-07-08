package newcoder.chapter6;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2021-07-08 10:11
 *
 * 交错01串
 */
public class Problem_03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int max=1;
        int count=1;
        for(int i=1;i<str.length();i++){
            count++;
            if(str.charAt(i)==str.charAt(i-1)){
                count=1;
            }
            max=Math.max(count,max);
        }
        System.out.println(max);
        sc.close();
    }
}
