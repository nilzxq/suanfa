package leetcode.string;

import java.util.Stack;

/**
 * @Author nilzxq
 * @Date 2020-08-07 20:43
 */
public class Problem_1190_ReverseParentheses {
    public static String reverseParentheses(String s){
        StringBuilder sb=new StringBuilder();
        char[] arr=s.toCharArray();
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='('){
                stack.push(i);
            }else if(arr[i]==')'){
                reverse(arr,stack.pop()+1,i-1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=')'&&arr[i]!='('){
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }

    public static void reverse(char[] arr,int left,int right){
        while(right>left){
            char tmp=arr[left];
            arr[left]=arr[right];
            arr[right]=tmp;
            right--;
            left++;
        }
    }

    public static void main(String[] args) {
        String s="(abcd)";
        System.out.println(reverseParentheses(s));
    }
}
