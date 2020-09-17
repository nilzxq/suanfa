package interview.yun;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-16 21:21
 */
public class M2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNextLine()){
            String str=sc.nextLine();
            if(str.length()>100){
                continue;
            }
           int[] max=new int[26];
           char[] arr=str.toCharArray();
           int min=Integer.MAX_VALUE;
           for(int i=0;i<arr.length;i++){
               max[arr[i]-'a']++;
               min=min>max[arr[i]-'a']?max[arr[i]-'a']:min;
           }
           for(int i=0;i<max.length;i++){
               if(max[i]==min){
                   str=str.replaceAll(String.valueOf((char)(i+97)),"");
               }
           }
            System.out.println(str);
        }
    }
}
