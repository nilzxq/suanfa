package leetcode.dp;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @Author nilzxq
 * @Date 2020-08-09 6:47
 */
public class Problem_66_Flower {

    public static String solution(int value, int[] a) {
        //变量
        int[] b = new int[a.length];
        for(int i=0;i<b.length;i++){
            b[i]=a[i];
        }

        Arrays.sort(a);
        if (value < a[0]) {
            return "-1";
        }
        //求出最大位数之后看能组成相同位数的最大值
        int bits = value / a[0];
        int index = 0;

        int min = 0;
        for (int i = 0; i < bits; i++) {
            if(b[i]==a[0]){
                min = (i+1) + min * 10;
            }

        }
        int sum = 0;
        for (int i = a.length - 1; i >= 0; i--) {
            if (value != 0 && value >= a[i]) {
                while (bits != 0) {
                    sum = a[i] + sum * 10;
                    bits--;
                }
                if (sum > min) {
                    min = sum;
                }
                value -= a[i];
            }
        }
        String res = min + " ";
        return res;
    }

    public static String solution1(int value, int[] a) {
        int min = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= value) {
                min = a[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {9, 11, 1, 12, 5, 8, 9, 10, 6};
        System.out.println(solution(2,nums));
    }
}
