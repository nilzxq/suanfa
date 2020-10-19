package interview.huawei;

import java.util.Scanner;

/**
 * @Author nilzxq
 * @Date 2020-10-14 17:49
 */
public class Huanwei {
//    @Email
//    private int email;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        if(str.matches("[0-1]*")){
            System.out.println(str);
        }
    }

    public static void helper(){

    }
}
