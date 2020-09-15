package interview.xiaomi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-15 19:56
 */
public class M2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Map<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char cha=str.charAt(i);
            if(map.get(cha)==null){
                map.put(cha,i);
                sb.append(cha);
            }
        }
        System.out.println(sb.toString());
    }
}
