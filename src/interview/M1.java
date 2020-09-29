package interview;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @Author nilzxq
 * @Date 2020-09-21 18:00
 */
public class M1 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        while(in.hasNextLine()){
//
//        }
//        in.next();
//        String str=in.nextLine();
//        str.replaceAll(","," ");
//        str.replaceAll(":"," ");
//        //根据空格进行一个划分
//       String[] strs=str.split(" ");
//
//        HashMap<String,String> map=new HashMap<>();
//        for(int i=0;i<strs.length-1;i=i+2){
//            map.put(strs[i],strs[i+1]);
//        }
////        map.put("1","张三");
////        map.put("2","李四");
////        for(int i=0;i<map.size();i++){
////            System.out.println(map.get(i)+":"+map.keySet());
////        }
//
//        for(String s:map.keySet()){
//            System.out.println(map.get(s)+":");
//        }
////        System.out.println("Hello World!");
//        final StringBuffer sb = new StringBuffer("123");
//        System.out.println(sb.hashCode());
//        sb.append("45");
//        System.out.println(sb.hashCode());
//        //sb = new StringBuffer();
//        System.out.println(sb.hashCode());
//
//
//       String a = "123";
//        System.out.println(a.hashCode());
//        a=a+"45";
//        System.out.println(a.hashCode());

        for(int i=0;i<=Integer.MAX_VALUE;i++){
            if(i+1<i){
                System.out.println(i);
            }
        }
    }
}
