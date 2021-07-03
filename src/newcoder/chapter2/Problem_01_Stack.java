package newcoder.chapter2;

import java.util.Stack;

/**
 * @Author nilzxq
 * @Date 2021-01-14 15:59
 */
public class Problem_01_Stack {

    public static void reverse(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int i=getRemoveLastElement(stack);
        reverse(stack);
        stack.push(i);
    }
    //栈底元素移除，其它元素不变,结合图片更好理解
    public static int getRemoveLastElement(Stack<Integer> stack){
        int result=stack.pop();
        if(stack.isEmpty()){
            return result;
        }else{
            int last=getRemoveLastElement(stack);
            stack.push(result);
            return last;
        }
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
