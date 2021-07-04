package newcoder.chapter2;

import java.util.Scanner;
import java.util.Stack;

/**
 * @Author nilzxq
 * @Date 2021-07-04 11:28
 */
public class Problem_04_MountainsAndFlames {

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        while(in.hasNextInt()){
            int size=in.nextInt();
            int[] arr=new int[size];
            for(int i=0;i<size;i++){
                arr[i]=in.nextInt();
            }
            System.out.println(communications(arr));
        }
    }
    //环形求下一个下标
    public static int nextIndex(int size,int i){
        return i<(size-1)?(i+1):0;
    }

    //cn2==n(n-1)/2
    public static long getInternalSum(int n){
        return n==1L?0L:(long)n*(long)(n-1)/2L;
    }

    //有重复元素，记录次数
    public static class Pair{
        public int value;
        public int times;

        public Pair(int value){
            this.value=value;
            this.times=1;
        }
    }

    public static long communications(int[] arr){
        if(arr==null||arr.length<2){
            return 0;
        }
        int size=arr.length;
        int maxIndex=0;
        for(int i=0;i<size;i++){
            maxIndex=arr[maxIndex]<arr[i]?i:maxIndex;
        }
        int value=arr[maxIndex];
        int index=nextIndex(size,maxIndex);
        long res=0L;
        Stack<Pair> stack=new Stack<>();
        //先把最大值压入栈底
        stack.push(new Pair(value));
        //下一个元素下标不等于最大值下标就继续循环
        while(index!=maxIndex){
            value=arr[index];
            while(!stack.isEmpty()&&stack.peek().value<value){
                int times=stack.pop().times;
                res+=getInternalSum(times)+times*2;
            }
            if(!stack.isEmpty()&&stack.peek().value==value){
                stack.peek().times++;
            }else{
                stack.push(new Pair(value));
            }
            index=nextIndex(size,index);
        }
        while(!stack.isEmpty()){
            int times=stack.pop().times;
            res+=getInternalSum(times);
            if(!stack.isEmpty()){
                res+=times;
                //弹出一个之后，栈中剩余的不止一个，代表弹出的这个位置处于栈中 >=3
                if(stack.size()>1){
                    res+=times;
                }else{
                    //判断最后剩余的元素是不是同一个位置的，是同一个位置则res不需要再加一次times，
                    // 否则需要再加一次times
                    res+=stack.peek().times>1?times:0;
                }
            }
        }
        return res;
    }
}
