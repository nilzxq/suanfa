package interview.yidong;

import java.util.Scanner;

/**
 * 某次商务活动中，主办方为到场嘉宾准备了盲盒并在嘉宾入场时进行分发，每人仅限一份。
 * 但是，根据主办方的规则，任何两位嘉宾每次见面都要交换一次盲盒。
 * 本次商务活动分为y个场次，每场活动的人数为x。请编程计算盲盒被交换的总次数。
 * @Author nilzxq
 * @Date 2020-10-18 19:27
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            int n=sc.nextInt();
            int res=n*(n-1)/2;
            System.out.println(res);
        }
    }
}
