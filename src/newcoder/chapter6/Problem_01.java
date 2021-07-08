package newcoder.chapter6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author nilzxq
 * @Date 2021-07-07 16:48
 */
public class Problem_01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Set<Character> set=new HashSet<>();
        //统计颜色的种类
        int count=0;
        for(char c: s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                count++;
            }
        }
        if(count>2){
            System.out.println(0);
        }else if(count==2){
            System.out.println(2);
        }else{
            System.out.println(count);
        }
        sc.close();
    }
}
