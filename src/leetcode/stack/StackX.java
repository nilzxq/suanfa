package leetcode.stack;

/**
 * 利用栈后进先出的特性实现单词逆序
 * @Author nilzxq
 * @Date 2020-06-30 9:33
 */
public class StackX {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackX(int max){
        maxSize=max;
        stackArray=new char[max];
        top=-1;
    }

    public void push(char cha){
        stackArray[++top]=cha;
    }

    public char pop(){
        return stackArray[top--];
    }

    public char peek(){
        return stackArray[top];
    }

    public boolean isEmpty(){
        return (top==-1);
    }
}
