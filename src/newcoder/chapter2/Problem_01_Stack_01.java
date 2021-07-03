package newcoder.chapter2;

import java.util.Stack;

/**
 * @Author nilzxq
 * @Date 2021-06-29 8:59
 */
public class Problem_01_Stack_01 {
    public static int getAndRemoveLastElement(Stack<Integer> stack){
        int result=stack.pop();//弹出并移除
        if(stack.isEmpty()){
            return result;
        }else{
            int last=getAndRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
    }

    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int i=getAndRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }

    public static void main(String[] args) {
        Stack<Integer> test=new Stack<>();
        test.push(1);
        test.push(2);
        test.push(3);
        test.push(4);
        test.push(5);
        reverse(test);
        while(!test.isEmpty()){
            System.out.print(test.pop()+" ");
        }
    }
}
