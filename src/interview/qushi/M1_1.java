package interview.qushi;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-13 9:32
 */
public class M1_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String mid=input.nextLine();
        String next=input.nextLine();
        System.out.println(change(mid,next));
    }

    private static String change(String mid, String next) {
        if(mid.length()>0){
            int len=next.length();
            if(len == 1)
                return next;
            if(len <= 0 ||len > 8)
                return "";
            char root=next.charAt(len - 1);
            int rootIndex = mid.indexOf(root);
            return next.charAt(len - 1) + change(mid.substring(0,rootIndex),next.substring(0,rootIndex)) + change(mid.substring(rootIndex+1),next.substring(rootIndex,len - 1));
        }else
            return "";
    }

}
