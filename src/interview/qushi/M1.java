package interview.qushi;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-09-12 19:56
 */
public class M1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String mid=sc.nextLine();
            String pos=sc.nextLine();
            System.out.println(helper(mid,pos));
        }

    private static String helper(String mid, String pos) {
            if(mid.length()>0) {
                int len = pos.length();
                if (len == 1) {
                    return pos;
                }
                if (len <= 0 || len > 8) {
                    return "";
                }
                char root = pos.charAt(len - 1);
                int index = mid.indexOf(root);
                return pos.charAt(len - 1) + helper(mid.substring(0, index), pos.substring(0, index)) +
                        helper(mid.substring(index + 1), pos.substring(index, len - 1));
            }else{
                return "";
            }
    }


}
