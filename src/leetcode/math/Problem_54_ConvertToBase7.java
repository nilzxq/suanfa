package leetcode.math;

import java.util.Stack;

/**
 * @Author nilzxq
 * @Date 2020-08-29 14:29
 */
public class Problem_54_ConvertToBase7 {
    public static void main(String[] args) {
        //System.out.println(convertToBase7(100));
        System.out.println(convertToBase3(123));
    }

    public static String convertToBase3(int num) {
        StringBuffer sb=new StringBuffer();
        Stack<Integer> stack=new Stack<>();
        while(num!=0){
            stack.push(num%3);
            num=num/3;
        }
        while(!stack.isEmpty()){
            int a=stack.pop();
            if(a==1){
                sb.append("@");
            }
            if(a==2){
                sb.append("&");
            }
            if(a==0){
                sb.append("*");
            }
        }
        return sb.toString();
    }

    public static String convertToBase7(int num) {
        String ans = "";
        if (num < 0) {
            num = 0 - num;
            ans += "-";
        };
        StringBuilder sb = new StringBuilder();
        do {
            int mod = num % 7;
            sb.append((char)('0'+mod));
            num = num / 7;
        } while (num > 0);
        ans += sb.reverse().toString();
        return ans;

    }

    
}
