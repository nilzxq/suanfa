package leetcode.string;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-07-26 22:08
 */
public class IsValid {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();
        System.out.println(isValid(s));
        scanner.close();
    }
    public static int isValid(String s){
        int num=0;
        int max=0;
        char[] cha=s.toCharArray();
        for(int i=0;i<s.length();i++){
            if(cha[i]=='('){
                num++;
            }else{
                num--;
            }
            max=Math.max(num,max);
        }
        return max;
    }
}
