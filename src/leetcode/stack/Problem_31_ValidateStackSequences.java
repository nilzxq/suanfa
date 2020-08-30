package leetcode.stack;

import java.util.Stack;

/**
 * @Author nilzxq
 * @Date 2020-08-30 9:23
 */
public class Problem_31_ValidateStackSequences {
    public static boolean validateStackSequences(int[] pushed,int[] popped){
        Stack<Integer> stack=new Stack<>();
        int i=0;
        for(int p:pushed){
            stack.push(p);
            while(!stack.isEmpty() && stack.peek()==popped[i]){
               stack.pop();
                i++;
            }

        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        int[] pushed={1,2,3,4,5};
        int[] poped={4,5,3,2,1};
        validateStackSequences(pushed,poped);
    }
}
