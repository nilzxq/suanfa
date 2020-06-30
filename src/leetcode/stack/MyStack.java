package leetcode.stack;

/**
 * @Author nilzxq
 * @Date 2020-06-30 8:59
 */
public class MyStack {
    private int[] array;
    private int top;
    private int maxSize;

    public MyStack(int size){
        maxSize=size;
        array=new int[size];
        //空栈
        top=-1;
    }

    //压入数据
    public void push(int value){
        if(top<maxSize-1){
            array[++top]=value;
        }
    }

    //弹出栈顶数据
    public int pop(){
        return array[top--];
    }

    //访问栈顶数据
    public int peek(){
            return array[top];
    }

    //判断栈是否为空
    public boolean isEmpty(){
        return (top==-1);
    }

    //判断栈是否满了
    public boolean isFull(){
        return (top==maxSize-1);
    }

    public static void main(String[] args) {
        MyStack stack=new MyStack(3);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
