package interview.jd;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 201003abc2020输出：2020
 * @Author nilzxq
 * @Date 2020-09-17 19:55
 */
public class M1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        str.replace("."," ");
        str.replace(","," ");
        String[] s=str.split("\\s+");
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length;i++){
            boolean flag=(s[i].length()==5&&(s[i].charAt(4)==','||s[i].charAt(4)=='.'))||s[i].length()==4;
            if(flag&&s[i].compareTo("1000")>=0&&s[i].compareTo("3999")<=0){
                sb.append(s[i].substring(0,4)+" ");
            }
        }
        ArrayList<Integer> arr=new  ArrayList<>();
        System.out.println(sb.toString().trim());
    }
}
